package com.example.indiantouristry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StatesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);
    }

    public void andhra(View view) {
        startActivity(new Intent(StatesActivity.this,AndhraActivity.class));
        Toast.makeText(StatesActivity.this, "Andhra Pradesh", Toast.LENGTH_SHORT).show();
    }

    public void arunachal(View view) {
        startActivity(new Intent(StatesActivity.this,ArunachalActivity.class));
        Toast.makeText(StatesActivity.this, "Arunachal Pradesh", Toast.LENGTH_SHORT).show();
    }

    public void assam(View view) {
        startActivity(new Intent(StatesActivity.this,AssamActivity.class));
        Toast.makeText(StatesActivity.this, "Assam", Toast.LENGTH_SHORT).show();
    }

    public void bihar(View view) {
        startActivity(new Intent(StatesActivity.this,BiharActivity.class));
        Toast.makeText(StatesActivity.this, "Bihar", Toast.LENGTH_SHORT).show();
    }

    public void chhattisgarh(View view) {
        startActivity(new Intent(StatesActivity.this,ChattisgarhActivity.class));
        Toast.makeText(StatesActivity.this, "Chhattisgarh", Toast.LENGTH_SHORT).show();
    }

    public void goa(View view) {
        startActivity(new Intent(StatesActivity.this,GoaActivity.class));
        Toast.makeText(StatesActivity.this, "Goa", Toast.LENGTH_SHORT).show();
    }

    public void gujarat(View view) {
        startActivity(new Intent(StatesActivity.this,GujaratActivity.class));
        Toast.makeText(StatesActivity.this, "Gujarat", Toast.LENGTH_SHORT).show();
    }

    public void haryana(View view) {
        startActivity(new Intent(StatesActivity.this,HaryanaActivity.class));
        Toast.makeText(StatesActivity.this, "Haryana", Toast.LENGTH_SHORT).show();
    }

    public void himachal(View view) {
        startActivity(new Intent(StatesActivity.this,HimachalActivity.class));
        Toast.makeText(StatesActivity.this, "Himachal Pradesh", Toast.LENGTH_SHORT).show();
    }

    public void jharkhand(View view) {
        startActivity(new Intent(StatesActivity.this,JharkhandActivity.class));
        Toast.makeText(StatesActivity.this, "Jharkhand", Toast.LENGTH_SHORT).show();
    }

    public void karnataka(View view) {
        startActivity(new Intent(StatesActivity.this,KarnatakaActivity.class));
        Toast.makeText(StatesActivity.this, "Karnataka", Toast.LENGTH_SHORT).show();
    }

    public void kerala(View view) {
        startActivity(new Intent(StatesActivity.this,KeralaActivity.class));
        Toast.makeText(StatesActivity.this, "Kerala", Toast.LENGTH_SHORT).show();
    }

    public void madhya(View view) {
        startActivity(new Intent(StatesActivity.this,MadhyaActivity.class));
        Toast.makeText(StatesActivity.this, "Madhya Pradesh", Toast.LENGTH_SHORT).show();
    }

    public void maharastra(View view) {
        startActivity(new Intent(StatesActivity.this,MaharastraActivity.class));
        Toast.makeText(StatesActivity.this, "Maharastra", Toast.LENGTH_SHORT).show();
    }

    public void manipur(View view) {
        startActivity(new Intent(StatesActivity.this,ManipurActivity.class));
        Toast.makeText(StatesActivity.this, "Manipur", Toast.LENGTH_SHORT).show();
    }

    public void meghalaya(View view) {
        startActivity(new Intent(StatesActivity.this,MeghalayaActivity.class));
        Toast.makeText(StatesActivity.this, "Manipur", Toast.LENGTH_SHORT).show();
    }

    public void mizo(View view) {
        startActivity(new Intent(StatesActivity.this,MizoramActivity.class));
        Toast.makeText(StatesActivity.this, "Mizoram", Toast.LENGTH_SHORT).show();
    }

    public void nagaland(View view) {
        startActivity(new Intent(StatesActivity.this,NagalandActivity.class));
        Toast.makeText(StatesActivity.this, "Nagaland", Toast.LENGTH_SHORT).show();
    }

    public void odisha(View view) {
        startActivity(new Intent(StatesActivity.this,OdishaActivity.class));
        Toast.makeText(StatesActivity.this, "Odisha", Toast.LENGTH_SHORT).show();
    }

    public void punjab(View view) {
        startActivity(new Intent(StatesActivity.this,PunjabActivity.class));
        Toast.makeText(StatesActivity.this, "Punjab", Toast.LENGTH_SHORT).show();
    }

    public void rajasthan(View view) {
        startActivity(new Intent(StatesActivity.this,RajasthanActivity.class));
        Toast.makeText(StatesActivity.this, "Rajasthan", Toast.LENGTH_SHORT).show();
    }

    public void sikkim(View view) {
        startActivity(new Intent(StatesActivity.this,SikkimActivity.class));
        Toast.makeText(StatesActivity.this, "Sikkim", Toast.LENGTH_SHORT).show();
    }

    public void tamilnadu(View view) {
        startActivity(new Intent(StatesActivity.this,TamilnaduActivity.class));
        Toast.makeText(StatesActivity.this, "Tamil Nadu", Toast.LENGTH_SHORT).show();
    }

    public void telengana(View view) {
        startActivity(new Intent(StatesActivity.this,TelanganaActivity.class));
        Toast.makeText(StatesActivity.this, "Telengana", Toast.LENGTH_SHORT).show();
    }

    public void tripura(View view) {
        startActivity(new Intent(StatesActivity.this,TripuraActivity.class));
        Toast.makeText(StatesActivity.this, "Tripura", Toast.LENGTH_SHORT).show();
    }

    public void up(View view) {
        startActivity(new Intent(StatesActivity.this,UttarpradeshActivity.class));
        Toast.makeText(StatesActivity.this, "Uttar Pradesh", Toast.LENGTH_SHORT).show();
    }

    public void uk(View view) {
        startActivity(new Intent(StatesActivity.this,UttarkhandActivity.class));
        Toast.makeText(StatesActivity.this, "Uttarakhand", Toast.LENGTH_SHORT).show();
    }

    public void wb(View view) {
        startActivity(new Intent(StatesActivity.this,WestbengalActivity.class));
        Toast.makeText(StatesActivity.this, "West Bengal", Toast.LENGTH_SHORT).show();
    }
}