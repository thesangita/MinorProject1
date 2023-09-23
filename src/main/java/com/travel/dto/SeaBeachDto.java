package com.travel.dto;

import javax.validation.constraints.Size;

public class SeaBeachDto extends DestinationsDto {

    private boolean coralOrNot;

    @Size(max = 100, message = "Max. limit is 100")
    private String waveStrength;

    // Getter for 'coralOrNot'
    public boolean isCoralOrNot() {
        return coralOrNot;
    }

    // Setter for 'coralOrNot'
    public void setCoralOrNot(boolean coralOrNot) {
        this.coralOrNot = coralOrNot;
    }

    // Getter for 'waveStrength'
    public String getWaveStrength() {
        return waveStrength;
    }

    // Setter for 'waveStrength'
    public void setWaveStrength(String waveStrength) {
        this.waveStrength = waveStrength;
    }
}
