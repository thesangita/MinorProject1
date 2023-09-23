package com.travel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReligionDto extends DestinationsDto {

    @Size(max = 30, message = "Max. limit is 30")
    @NotNull(message = "Religion type is required")
    private String religionType;

    // Getter for 'religionType'
    public String getReligionType() {
        return religionType;
    }

    // Setter for 'religionType'
    public void setReligionType(String religionType) {
        this.religionType = religionType;
    }
}
