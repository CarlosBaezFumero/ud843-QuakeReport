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
    private Long mTimeInMiliseconds;

    Earthquake(String Magnitude, String Location, Long timeInMiliseconds) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMiliseconds = timeInMiliseconds;
    }

    String getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    long getTimeInMiliseconds() {
        return mTimeInMiliseconds;
    }

}
