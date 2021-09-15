package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    @RequestMapping(path="/test", method = RequestMethod.GET)
    public String test() {

        return "Suh";
    }

    @RequestMapping(path="/hotels", method = RequestMethod.GET)
    public List<Hotel> getAllHotels() {

        List<Hotel> hotelList = hotelDao.list();
        return hotelList;
    }

    @RequestMapping(path="/hotels/{id}", method = RequestMethod.GET)
    public Hotel getSingleHotel(int id) {

        Hotel hotel = hotelDao.get(id);
        return hotel;
    }



}
