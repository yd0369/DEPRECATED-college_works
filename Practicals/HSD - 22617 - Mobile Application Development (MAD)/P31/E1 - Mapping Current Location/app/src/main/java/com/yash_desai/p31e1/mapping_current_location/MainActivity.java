package com.yash_desai.p31e1.mapping_current_location;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback,LocationListener {
    static Double Longitude;
    static Double Latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Longitude = 0d;
        Latitude = 0d;
        if(Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},100);
        }
        else {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 0, this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng CURRLOC = new LatLng(Latitude, Longitude);
        googleMap.addMarker(new MarkerOptions().position(CURRLOC).title("You are Here"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CURRLOC,15));
        googleMap.setMapType(4);
    }

    @Override
    public void onLocationChanged(Location location) {
        Longitude = location.getLongitude();
        Latitude = location.getLatitude();

        ((TextView) findViewById(R.id.currloc)).setText("Longitude : " + Longitude
        +"\nLatitude : " + Latitude
        +"\nProvider : " + location.getProvider());
        Toast.makeText(this.getApplicationContext(),"Longitude : " + Longitude
                +"\nLatitude : " + Latitude
                +"\nProvider : " + location.getProvider(),Toast.LENGTH_SHORT);
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maiew)).getMapAsync(MainActivity.this);
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