package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /**
         * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
         */
        private String formatDate(Date dateObject) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
            return dateFormat.format(dateObject);
        }

        /**
         * Return the formatted date string (i.e. "4:30 PM") from a Date object.
         */
        private String formatTime(Date dateObject) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
            return timeFormat.format(dateObject);
        }

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView magnitudeView = convertView.findViewById(R.id.magnitude);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        if (currentEarthquake != null) {
            magnitudeView.setText(currentEarthquake.getMagnitude());
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView locationView = convertView.findViewById(R.id.location);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        if (currentEarthquake != null) {
            locationView.setText(currentEarthquake.getLocation());
        }

        // Create a new Date object from the time in milliseconds of the earthquake
        assert currentEarthquake != null;
        Date dateObject = new Date(currentEarthquake.getTimeInMiliseconds());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView dateView = convertView.findViewById(R.id.date);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        String formattedDate = formatDate(dateObject);
        dateView.setText(currentEarthquake.getDate());
        }

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }

}

