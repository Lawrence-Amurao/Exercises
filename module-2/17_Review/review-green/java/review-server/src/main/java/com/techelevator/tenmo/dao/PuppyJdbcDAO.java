package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Puppy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


public class PuppyJdbcDAO implements PuppyDAO {

    private JdbcTemplate template;

    public PuppyJdbcDAO(DataSource datasource) {
        template = new JdbcTemplate(datasource);
    }

    @Override
    public List<Puppy> getPuppies() {
        String sqlGetAllPuppies = "SELECT * FROM puppies";
        List<Puppy> puppyList = new ArrayList<Puppy>();
        SqlRowSet result = template.queryForRowSet(sqlGetAllPuppies);

        while (result.next()) {

            int id = result.getInt("id");
            String name = result.getString("name");
            int weight = result.getInt("weight");
            String gender = result.getString("gender");
            boolean paperTrained = result.getBoolean("paper_trained");

            Puppy puppy = new Puppy(id, name, weight, gender, paperTrained);
            puppyList.add(puppy);

        }

        return puppyList;
    }

    @Override
    public Puppy getPuppy(int id) {

        return null;
    }

    @Override
    public void savePuppy(Puppy puppyToSave) {

    }

    @Override
    public void editPuppy(Puppy puppyToSave) {

    }

    @Override
    public void removePuppy(int id) {

    }

}