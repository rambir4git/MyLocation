package com.example.mylocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import java.io.IOException;
import java.util.List;


public class GetLocation implements LocationListener {
    List<Address> rGeocoded;
    Context context;
    public Location loc;
    public Address adr;
    GetLocation(Context context){this.context=context;}


    @Override
    public void onLocationChanged(Location location) {
        loc=location;
        try {
            rGeocoded= new Geocoder(context).getFromLocation(loc.getLatitude(),loc.getLongitude(),1);
            adr=rGeocoded.get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
