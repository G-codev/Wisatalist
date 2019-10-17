package com.gustiramadhan.wisatalist;

public class Attaraction {
    int image;
    String placeName;
    String description;

    public Attaraction(int image, String placeName, String description) {
        this.image = image;
        this.placeName = placeName;
        this.description = description;
    }
    public  Attaraction(){

    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
