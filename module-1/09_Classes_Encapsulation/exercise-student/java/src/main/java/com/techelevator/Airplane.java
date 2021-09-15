package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
    public int availableFirstClassSeats(int i) {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int availableCoachSeats(int i) {
        return totalCoachSeats - bookedCoachSeats;

    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats(totalFirstClassSeats - bookedFirstClassSeats);
    }

    public int getAvailableCoachSeats() {
        return availableCoachSeats(totalCoachSeats - bookedCoachSeats);
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass) {
            if (totalNumberOfSeats <= availableFirstClassSeats(totalFirstClassSeats - bookedFirstClassSeats)) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        } else if (totalNumberOfSeats <= availableCoachSeats(totalCoachSeats - bookedCoachSeats)) {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        }
        return false;
    }

}
