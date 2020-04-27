package ru.netology.domain;

public class GeoLocation {
    private String type;  // location type
    private String coordinates;  //  location coordinates
    private PlaceLocation place;  // place description

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PlaceLocation getPlace() {
        return place;
    }

    public void setPlace(PlaceLocation place) {
        this.place = place;
    }
}
