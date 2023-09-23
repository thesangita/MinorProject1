package com.travel.dto;

import javax.validation.constraints.Size;

public class HeritageDto extends DestinationsDto {

    @Size(max = 10, message = "Max. limit is 10")
    private String ageOfSite;

    // Getter for 'ageOfSite'
    public String getAgeOfSite() {
        return ageOfSite;
    }

    // Setter for 'ageOfSite'
    public void setAgeOfSite(String ageOfSite) {
        this.ageOfSite = ageOfSite;
    }
}
