package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {

		String sql = "Select department_id, name from department WHERE department_id = ?";
		Department dept = null;

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		if (results.next()) {
			long resultId = results.getLong("department_id");
			String resultName = results.getString("name");

			dept = new Department(resultId, resultName);
		}


		return dept;
	}

	@Override
	public List<Department> getAllDepartments() {

		String sql = "select department_id, name from department;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Department> departments = new ArrayList<>();

		while(results.next()) {

			long id = results.getLong("department_id");
			String name = results.getString("name");


			Department dept = new Department(id, name);
			departments.add(dept);

		}


		return departments;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String updateDept = "UPDATE department SET name = ? WHERE department_id = ?";
		jdbcTemplate.update(updateDept, updatedDepartment.getName(), updatedDepartment.getId());

	}

}
