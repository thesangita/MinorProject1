package com.travel.dto;

public class MountainDto extends DestinationsDto {

    private double height;
    private double distance;
    private int accessibility;

    // Getter for 'height'
    public double getHeight() {
        return height;
    }

    // Setter for 'height'
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for 'distance'
    public double getDistance() {
        return distance;
    }

    // Setter for 'distance'
    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Getter for 'accessibility'
    public int getAccessibility() {
        return accessibility;
    }

    // Setter for 'accessibility'
    public void setAccessibility(int accessibility) {
        this.accessibility = accessibility;
    }
}
