package br.ufop.cleide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MedicinesAdd extends AppCompatActivity {

    private Medicines med;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines_add);
    }

    public void add(View view){


        TextView tvName = findViewById(R.id.nameMed);
        String name = tvName.toString();
        TextView tvDosage = findViewById(R.id.dosage);
        String dosage = tvDosage.toString();
        TextView tvDuration = findViewById(R.id.duration);
        String duaration = tvDuration.toString();
        TextView tvIndication = findViewById(R.id.indications);
        String indications = tvIndication.toString();


        med = new Medicines(name,dosage,duaration,indications);

        //Adicionar ao banco de dados

        tvDosage.setText("");
        tvDuration.setText("");
        tvName.setText("");
        tvIndication.setText("");
    }
}
