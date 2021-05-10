package com.example.skolskiprojekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button konvertor_btn;
    private Button nesto_btn;
    private Button eduis_btn;
    private Button tutorialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Korisne Alatke");

        //dugmad
        eduis_btn = findViewById(R.id.eduis_btn);
        eduis_btn.setOnClickListener(this);
        nesto_btn = findViewById(R.id.rc_btn);
        nesto_btn.setOnClickListener(this);
        konvertor_btn = findViewById(R.id.pretvarac_btn);
        konvertor_btn.setOnClickListener(this);
        tutorialButton = findViewById(R.id.tutorijal_btn);
        tutorialButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eduis_btn:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://eobrazovanje.skolers.org/")));
                break;
            case R.id.pretvarac_btn:
                startActivity(new Intent(this, KonvertorActivity.class));
                break;
            case R.id.rc_btn:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://edukacija.rs/matematika/osnovna-skola")));
                break;
            case R.id.tutorijal_btn:
                Toast.makeText(this, "Sajt još uvijek ne funkcioniše", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
