package com.techelevator.projects.dao;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(Long projectId) {


		String sql = "Select * From project WHERE project_id = ?";
		Project proj = null;

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if (results.next()) {
			long resultId = results.getLong("project_id");
			String resultName = results.getString("name");
			Date fromDate = results.getDate("from_date");
			Date toDate = results.getDate("to_date");
			LocalDate fDate = null;
			if (fromDate != null) {
				fDate = fromDate.toLocalDate();
			}
			LocalDate tDate = null;
			if (toDate != null) {
				tDate = toDate.toLocalDate();
			}

			proj = new Project(resultId, resultName, fDate, tDate);
		}


		return proj;

	}

	@Override
	public List<Project> getAllProjects() {

		String sql = "select * From project";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Project> projects = new ArrayList<>();


		while(results.next()) {

			long id = results.getLong("project_id");
			String name = results.getString("name");
			Date fromDate = results.getDate("from_date");
			Date toDate = results.getDate("to_date");
			LocalDate fDate = null;
			if (fromDate != null) {
				fDate = fromDate.toLocalDate();
			}
			LocalDate tDate = null;
			if (toDate != null) {
				tDate = toDate.toLocalDate();
			}


			Project proj = new Project(id, name, fDate, tDate);
			projects.add(proj);
		}

		return projects;
	}

	@Override
	public Project createProject(Project newProject) {

		String addProject = "INSERT INTO project(project_id, name, from_date, to_date) " +
				"VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(addProject, newProject.getId(), newProject.getName(), newProject.getFromDate(), newProject.getToDate());

		return newProject;
	}

	@Override
	public void deleteProject(Long projectId) {

		String deleteProjEmp = "DELETE FROM project_employee WHERE project_id = ?";
		jdbcTemplate.update(deleteProjEmp, projectId);

		String deleteProject = "DELETE FROM project WHERE project_id = ?";
		jdbcTemplate.update(deleteProject, projectId);

	}
	

}
