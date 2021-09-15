package com.techelevator.projects.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<Employee>();
		String allEmployees = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(allEmployees);

		while (results.next()) {

			long empId = results.getLong("employee_Id");
			long deptId = results.getLong("department_Id");
			String firstName = results.getString("first_name");
			String lastName = results.getString("last_name");
			Date birthday =  results.getDate("birth_date");
			Date hireDay = results.getDate("hire_date");
			LocalDate bDay = birthday.toLocalDate();
			LocalDate hDay = hireDay.toLocalDate();

			Employee emp = new Employee(empId, deptId, firstName, lastName, bDay, hDay);
			employees.add(emp);


		}


		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		List<Employee> employee = new ArrayList<>();
		String searchEmp = "";
		lastNameSearch = "%" + lastNameSearch + "%";
		firstNameSearch ="%" + firstNameSearch + "%";

		SqlRowSet results;


		searchEmp = "SELECT * FROM employee WHERE UPPER(first_name) LIKE UPPER(?) AND UPPER(last_name) LIKE UPPER(?)";
		results = jdbcTemplate.queryForRowSet(searchEmp, firstNameSearch, lastNameSearch);

		while (results.next()) {

			long empId = results.getLong("employee_Id");
			long deptId = results.getLong("department_Id");
			String firstName = results.getString("first_name");
			String lastName = results.getString("last_name");
			Date birthday =  results.getDate("birth_date");
			Date hireDay = results.getDate("hire_date");
			LocalDate bDay = birthday.toLocalDate();
			LocalDate hDay = hireDay.toLocalDate();

			Employee emp = new Employee(empId, deptId, firstName, lastName, bDay, hDay);
			employee.add(emp);

		}


		return employee;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {

		String empProjId = "SELECT * FROM employee JOIN project_employee ON employee.employee_id " +
				"= project_employee.employee_id WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(empProjId, projectId);
		List<Employee> employees = new ArrayList<>();

		while (results.next()) {
			long empId = results.getLong("employee_Id");
			long deptId = results.getLong("department_Id");
			String firstName = results.getString("first_name");
			String lastName = results.getString("last_name");
			Date birthday =  results.getDate("birth_date");
			Date hireDay = results.getDate("hire_date");
			LocalDate bDay = birthday.toLocalDate();
			LocalDate hDay = hireDay.toLocalDate();

			Employee emp = new Employee(empId, deptId, firstName, lastName, bDay, hDay);
			employees.add(emp);
		}


		return employees;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {


		String addEmpProj = "INSERT INTO project_employee(project_Id, employee_Id) VALUES(?, ?)";
		jdbcTemplate.update(addEmpProj, projectId, employeeId);

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {

		String removeEmpProj = "DELETE FROM project_employee WHERE employee_id = ? and project_id = ?";
		jdbcTemplate.update(removeEmpProj, employeeId, projectId);

	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {

		String empWOProj = "SELECT DISTINCT employee.* FROM employee LEFT OUTER JOIN project_employee " +
				"ON employee.employee_id = project_employee.employee_id LEFT OUTER JOIN project " +
				"ON project_employee.project_id = project.project_Id WHERE project.project_Id IS NULL";
		SqlRowSet results = jdbcTemplate.queryForRowSet(empWOProj);
		List<Employee> employees = new ArrayList<>();

		while (results.next()) {

			long empId = results.getLong("employee_Id");
			long deptId = results.getLong("department_Id");
			String firstName = results.getString("first_name");
			String lastName = results.getString("last_name");
			Date birthday =  results.getDate("birth_date");
			Date hireDay = results.getDate("hire_date");
			LocalDate bDay = birthday.toLocalDate();
			LocalDate hDay = hireDay.toLocalDate();

			Employee emp = new Employee(empId, deptId, firstName, lastName, bDay, hDay);
			employees.add(emp);
		}

		return employees;
	}


}
