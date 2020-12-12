package com.ngoding.android.kulinerindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class PersonalProfile extends AppCompatActivity{

    ProfileData profile = new ProfileData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personal_profile);

        TextView namaP = findViewById(R.id.namaP);
        TextView emailP = findViewById(R.id.email);

        namaP.setText(profile.nama());
        emailP.setText(profile.email());
    }
}