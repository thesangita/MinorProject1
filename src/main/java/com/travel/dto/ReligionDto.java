package com.travel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReligionDto extends DestinationsDto {

    @Size(max = 20, message = "Max. limit is 20")
    @NotNull(message = "Religion type is required")
    private String religionType;
}
