package com.travel.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.travel.entity.Destinations;

public class ForestDto  extends Destinations {

    @NotBlank(message = "Forest type is required")
    @Size(max = 10, message = "Max. limit is 10")
    private String forestType;

    // Getters and setters for the additional field

    public String getForestType() {
        return forestType;
    }

    public void setForestType(String forestType) {
        this.forestType = forestType;
    }
}
