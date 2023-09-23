package com.travel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StateAndUTDto {

    private int stateAndUtId;

    @Size(max = 50, message = "Max. limit is 50")
    @NotNull(message = "State or UT name is required")
    private String stateAndUtName;

    // Getter for 'stateAndUtId'
    public int getStateAndUtId() {
        return stateAndUtId;
    }

    // Setter for 'stateAndUtId'
    public void setStateAndUtId(int stateAndUtId) {
        this.stateAndUtId = stateAndUtId;
    }

    // Getter for 'stateAndUtName'
    public String getStateAndUtName() {
        return stateAndUtName;
    }

    // Setter for 'stateAndUtName'
    public void setStateAndUtName(String stateAndUtName) {
        this.stateAndUtName = stateAndUtName;
    }
}
