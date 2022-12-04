package com.example.lab6_1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.lab6_1.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_maps);
// Obtain the SupportMapFragment and get notified when the map i ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.map); mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) { mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng mongol = new LatLng(46.5275431, 94.8525224);
        mMap.addMarker(new MarkerOptions().position(mongol).title("Mongolia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mongol)); }
}