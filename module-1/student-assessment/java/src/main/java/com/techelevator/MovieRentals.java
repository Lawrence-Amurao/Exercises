package com.techelevator;
import java.math.BigDecimal;
import java.math.RoundingMode;

class MovieRental {
    private String title;
    private String format;
    private boolean isPremium;
    private BigDecimal rentalPrice;
    public MovieRental(String title, String format, boolean isPremium) {
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;
        this.rentalPrice = this.calculatedRentalPrice();
    }
    private BigDecimal calculatedRentalPrice() {
        BigDecimal price = BigDecimal.ZERO;
        if (format.equals("VHS")) {
            price = price.add(new BigDecimal(0.99));
        } else if (format.equals("DVD")) {
            price = price.add(new BigDecimal(1.99));
        } else if (format.equals("Blu-ray")) {
            price = price.add(new BigDecimal(2.99));
        }
        if (this.isPremium) {
            price = price.add(new BigDecimal(1.00));
        }
        return price;
    }
    public BigDecimal determineLateFee(int daysLate) {

        BigDecimal lateFee = BigDecimal.ZERO;

        if (daysLate >=3) {
            lateFee = new BigDecimal(19.99);
        } else if (daysLate ==2) {
            lateFee = new BigDecimal(3.99);
        } else if (daysLate ==1) {
            lateFee = new BigDecimal(1.99);
        }

        return lateFee.setScale(2, RoundingMode.HALF_UP);
    }
    public String toString() {
        return "MOVIE -{" + this.title + "}- " + "{" + this.format + "} " + "{$" +this.rentalPrice.setScale(2, RoundingMode.HALF_UP) + "}";
    }
    public String getTitle() {
        return title;
    }
    public String getFormat() {
        return format;
    }
    public boolean isPremium() {
        return isPremium;
    }
    public BigDecimal getRentalPrice() {
        return this.rentalPrice.setScale(2, RoundingMode.HALF_UP);
    }
}