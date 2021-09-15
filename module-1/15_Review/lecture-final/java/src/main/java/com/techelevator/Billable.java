package com.techelevator;

import java.util.Map;

public interface Billable {

    // returns the balanceDue
    // param is a Map called services rendered
    //  String - service name
    //  Double cost of service
    double getBalanceDue(Map<String, Double> servicesRendered);

}
