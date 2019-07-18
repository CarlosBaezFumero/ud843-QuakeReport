package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView magnitudeTextView = convertView.findViewById(R.id.magnitude_tv);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        if (currentEarthquake != null) {
            magnitudeTextView.setText(currentEarthquake.getMagnitude());
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView locationTextView = convertView.findViewById(R.id.location_tv);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        if (currentEarthquake != null) {
            locationTextView.setText(currentEarthquake.getLocation());
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView dateTextView = convertView.findViewById(R.id.date_tv);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        if (currentEarthquake != null) {
            dateTextView.setText(currentEarthquake.getDate());
        }

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }

}

