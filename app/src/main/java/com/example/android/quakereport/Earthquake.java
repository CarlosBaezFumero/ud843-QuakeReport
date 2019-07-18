package com.example.android.quakereport;

public class Earthquake {

    /*
     * Resource ID to store the magnitude of the Earthquake
     */
    private String mMagnitude;

    /*
     * Resource ID to store the magnitude of the Earthquake
     */
    private String mLocation;

    /*
     * Resource ID to store the magnitude of the Earthquake
     */
    private String mDate;

    public Earthquake(String Magnitude, String Location, String Date) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }


}
