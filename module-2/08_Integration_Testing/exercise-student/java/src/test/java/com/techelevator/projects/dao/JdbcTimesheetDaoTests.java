package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.*;

import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends EmployeeProjectsDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private Timesheet testTimesheet;
    
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @After
    public void rollback() throws SQLException {
        dataSource.getConnection().rollback();
    }

    @AfterClass
    public static void closeDataSource() throws SQLException {
        dataSource.destroy();
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {

        Timesheet timesheet = sut.getTimesheet(1L);
        Assert.assertNotNull("getTimesheet returned null", timesheet);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = sut.getTimesheet(2L);
        Assert.assertNotNull("getTimesheet returned null", timesheet);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);

        timesheet = sut.getTimesheet(4L);
        Assert.assertNotNull("getTimesheet returned null", timesheet);
        assertTimesheetsMatch(TIMESHEET_4, timesheet);

    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {

        Timesheet timesheet = sut.getTimesheet(5L);
        Assert.assertNull("getTimesheet failed to return null for id not in database", timesheet);

        timesheet = sut.getTimesheet(500L);
        Assert.assertNull("getTimesheet failed to return null for id not in database", timesheet);

    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {

        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1L);
        Assert.assertEquals("getTimesheetsByEmployeeId returned wrong number of timesheets",
                2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));

        timesheets = sut.getTimesheetsByEmployeeId(2L);
        Assert.assertEquals("getTimesheetsByEmployeeId returned wrong number of timesheets",
                2, timesheets.size());

        timesheets = sut.getTimesheetsByEmployeeId(99L);
        Assert.assertEquals("getTimesheetsByEmployeeId returned timesheets for employee id not in database",
                0, timesheets.size());


    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {

        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(TIMESHEET_1.getProjectId());

        Assert.assertEquals("getTimesheetsByProjectId failed to return all timesheets for project", 3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));

        timesheets = sut.getTimesheetsByProjectId(TIMESHEET_4.getProjectId());

        Assert.assertEquals("getTimesheetsByProjectId failed to return all timesheets for project", 1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));


    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {

        Timesheet createTimesheet = sut.createTimesheet(TIMESHEET_3);

        Assert.assertNotNull("createTimesheet returned null", createTimesheet);

        long newId = createTimesheet.getTimesheetId();
        Assert.assertTrue("createTimesheet failed to return a project with an id", newId > 0);

        TIMESHEET_3.setTimesheetId(newId);
        assertTimesheetsMatch(TIMESHEET_3, createTimesheet);
    }


    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {

        Timesheet createTimesheet = sut.createTimesheet(TIMESHEET_3);

        Assert.assertNotNull("can't test if created timesheet has correct values until createTimesheet is working", createTimesheet);

        long newId = createTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createTimesheet, retrievedTimesheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {

        Timesheet timesheet = sut.getTimesheet(4L);
        Assert.assertNotNull("can't test updateTimesheet until getTimesheet is working", timesheet);
        timesheet.setDescription("Test");

        sut.updateTimesheet(timesheet);

        Timesheet updatedTS = sut.getTimesheet(4L);
        Assert.assertEquals("updateTimesheet failed to change description in database", "Test", updatedTS.getDescription());

        Timesheet timesheet2 = sut.getTimesheet(4L);
        Assert.assertNotNull("can't test updateTimesheet until getTimesheet is working", timesheet2);
        timesheet2.setHoursWorked(3.0);

        sut.updateTimesheet(timesheet2);

        Timesheet updatedTS2 = sut.getTimesheet(4L);
        Assert.assertEquals(3.0 , updatedTS2.getHoursWorked(), 0.001);

        Timesheet timesheet3 = sut.getTimesheet(4L);
        Assert.assertNotNull("can't test updateTimesheet until getTimesheet is working", timesheet3);
        timesheet3.setBillable(true);

        sut.updateTimesheet(timesheet3);

        Timesheet updatedTS3 = sut.getTimesheet(4L);
        Assert.assertTrue(updatedTS3.isBillable());


    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {

        sut.deleteTimesheet(1L);

        Timesheet timesheet = sut.getTimesheet(1L);
        Assert.assertNull("deleteProject failed to remove project from database", timesheet);

        List<Timesheet> timesheets = sut.getAllTimesheets();
        Assert.assertEquals("deleteProject left too many projects in database", 3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(0));
    }



    @Test
    public void getBillableHours_returns_correct_total() {

        double billable = sut.getBillableHours(1L, 1L);
        Assert.assertEquals(2.5, billable, 0.001);

        double billable2 = sut.getBillableHours(2L, 2L);
        Assert.assertEquals(0, billable2, 0.001);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
