package com.example.alunos.mapmaker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnShowLocation;
    Button btnShowOnMap;
    TextView latitudeField;
    TextView longitudeField;

    private static final int REQUEST_CODE_PERMISSION = 2;
    String mPermission = Manifest.permission .ACCESS_FINE_LOCATION;
    GPSTracker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            if (ActivityCompat .checkSelfPermission(this, mPermission)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{mPermission},
                        REQUEST_CODE_PERMISSION);
            }
            } catch (Exception e) {
                e.printStackTrace ();
            }
            btnShowLocation = (Button) findViewById(R.id.btnver);
            latitudeField = (TextView) findViewById(R.id.latdes);
            longitudeField = (TextView) findViewById(R.id.londes);

            btnShowLocation .setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick (View v){
                    gps = new GPSTracker(MainActivity.this);
                    if (gps.canGetLocation()){
                        double latitude = gps.getLatitude();
                        double longitude = gps.getLongitude();

                        latitudeField.setText(String.valueOf(latitude));
                        longitudeField.setText(String.valueOf(longitude));
                    }else{
                        latitudeField.setText("Não disponível");
                        longitudeField.setText("Não disponível");
                        gps.showSettingsAlert();
                    }
                }
            });
        btnShowOnMap = (Button) findViewById(R.id.btnm);
        btnShowOnMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent it = new Intent (MainActivity.this, MapsActivity.class);
                startActivity(it);
            }
        });

    }
}
