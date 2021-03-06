package com.techelevator.dao;

import com.techelevator.model.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCCityDAO implements CityDAO{

    private JdbcTemplate jdbcTemplate;

    public JDBCCityDAO(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public City getCity(long cityId) {

        City city = null;
        String sql = "SELECT city_id, city_name, state_abbreviation, population, area " +
                "From city WHERE city_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cityId);

        if (results.next()) {
            city = mapRowToCity(results);

        }



        return city;
    }

    private City mapRowToCity(SqlRowSet rowSet) {
        City city = new City();
        city.setCityId(rowSet.getLong("city_id"));
        city.setCityName(rowSet.getString("city_name"));
        city.setStateAbbreviation(rowSet.getString("state_abbreviation"));
        city.setPopulation(rowSet.getLong("population"));
        city.setArea(rowSet.getDouble("area"));
        return city;
    }

    @Override
    public List<City> getCitiesByState(String stateAbbreviation) {

        List<City> cities = new ArrayList<>();
        String sql = "SELECT city_id, city_name, state_abbreviation, population, area " +
                "From city " +
                "WHERE state_abbreviation = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while (results.next()) {
            City city = mapRowToCity(results);
            cities.add(city);
        }

        return cities;
    }

    @Override
    public City createCity(City city) {

        String sql = "INSERT INTO city (city_name, state_abbreviation, population, area) " +
                "VALUES (?, ?, ?, ?) RETURNING city_id;";
        Long newId = jdbcTemplate.queryForObject(sql, Long.class,
                city.getCityName(), city.getStateAbbreviation(), city.getPopulation(), city.getArea());

        return getCity(newId);

    }

    @Override
    public void updateCity(City city) {

    }

    @Override
    public void deleteCity(long cityId) {

    }
}
