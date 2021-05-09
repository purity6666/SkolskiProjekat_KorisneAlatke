package com.example.skolskiprojekat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.IntArrayEvaluator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KonvertorActivity extends AppCompatActivity {

    private EditText editText;
    private Button convertButton;
    private Button tBtn;
    private TextView bTV;
    private TextView oTV;
    private TextView hTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konvertor);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pretvaranje brojeva");

        //dugmad
        convertButton = findViewById(R.id.prevedi_btn);
        tBtn = findViewById(R.id.tBtn);

        //unos
        editText = findViewById(R.id.editTextNumber);

        //ispis
        bTV = findViewById(R.id.binarno_tv);
        oTV = findViewById(R.id.oktalno_tv);
        hTV = findViewById(R.id.heksadecimalno_tv);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int broj = Integer.parseInt(editText.getText().toString());

                bTV.setText("Binarno: " + Integer.toBinaryString(broj));
                oTV.setText("Oktalno: " + Integer.toOctalString(broj));
                hTV.setText("Heksadecimalno: " + Integer.toHexString(broj));
            }
        });

        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.skolaprogramiranja.rs/prebacivanje-iz-dekadnog-u-binarni-oktalni-i-heksadecimalni-brojevni-sistem/")));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
