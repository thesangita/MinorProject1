package com.travel.dto;

import com.travel.entity.StateAndUT;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DestinationsDto {

    private int destId;

    @NotBlank(message = "Destination name is required")
    @Size(max = 50, message = "Max. limit is 50")
    private String destName;

    @NotBlank(message = "Image name is required")
    @Size(max = 55, message = "Max. limit is 55")
    private String imageName;

    @NotBlank(message = "Image location is required")
    @Size(max = 100, message = "Max. limit is 100")
    private String imageLocation;

    @NotBlank(message = "Image description is required")
    @Size(max = 150, message = "Max. limit is 150")
    private String imageDescription;

    @NotBlank(message = "Destination type is required")
    @Size(max = 50, message = "Max. limit is 50")
    private String destType;

    private float popularityScore;

    @NotNull(message = "State/UT information is required")
    private StateAndUT stateAndUT;

    // Getters and setters for all fields

    public int getDestId() {
        return destId;
    }

    public void setDestId(int destId) {
        this.destId = destId;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getDestType() {
        return destType;
    }

    public void setDestType(String destType) {
        this.destType = destType;
    }

    public float getPopularityScore() {
        return popularityScore;
    }

    public void setPopularityScore(float popularityScore) {
        this.popularityScore = popularityScore;
    }

    public StateAndUT getStateAndUT() {
        return stateAndUT;
    }

    public void setStateAndUT(StateAndUT stateAndUT) {
        this.stateAndUT = stateAndUT;
    }
}
