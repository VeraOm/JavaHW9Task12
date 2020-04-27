package ru.netology.domain;

import java.util.Date;

public class PlaceLocation {
    private long id;  // place ID (if available)
    private String title;  // place title (if available)
    private int latitude; // geographical latitude
    private int longitude; // geographical longitude
    private Date created; // date when the place has been created (if available)
    private String iconUrl;  // URL of icon image
    private String country;  // country name
    private String city;  // city name
    private int type;  // checkin type
    private long groupId;  // community ID
    private String groupPhotoUrl;  //  URL of the community preview image
    private int checkins;  // checkins number
    private Date updated;  //  time of the last checkin in Unixtime
    private long address;  // address

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
