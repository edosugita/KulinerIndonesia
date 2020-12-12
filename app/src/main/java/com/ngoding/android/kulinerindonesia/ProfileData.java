package com.ngoding.android.kulinerindonesia;

public class ProfileData extends Profile {
    private String nama, email;

    @Override
    public String nama() {
        nama = "Edo Sugita Ibrahim";
        return nama;
    }

    @Override
    public String email() {
        email = "edosugita.es@gmail.com";
        return email;
    }
}
