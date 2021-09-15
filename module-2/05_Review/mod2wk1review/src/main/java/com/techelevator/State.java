package com.techelevator;

public class State {

    private String stateAbbreviation;
    private String stateName;
    private long population;
    private String stateNickname;

    @Override
    public String toString() {
        String stateName = "";

        return "State: " + this.stateName + " Population: " + this.population;
    }

    public State(String stateAbbreviation, String stateName, long population, String stateNickname) {
        this.stateAbbreviation = stateAbbreviation;
        this.stateName = stateName;
        this.population = population;
        this.stateNickname = stateNickname;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public String getStateName() {
        return stateName;
    }

    public long getPopulation() {
        return population;
    }

    public String getStateNickname() {
        return stateNickname;
    }
}
