package br.ufop.cleide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MedicinesEdit extends AppCompatActivity {
    /*
    private DatabaseReference firebase;
    private FirebaseUser user;
    private ValueEventListener valueEventListener;
     */

    private  Medicines medicine;
    private int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines_edit);

        Intent it = getIntent();
        Bundle params = it.getExtras();
        position = (int)params.get("medicines");
        medicine = (Medicines) params.get("medicine");

        /*
        TextView tvName  = findViewById(R.id.nameMed);
        String name = tvName.toString();
        TextView tvDosage =  findViewById(R.id.dosage);
        String dosage = tvDosage.toString();
        TextView tvDuration = findViewById(R.id.duration);
        String duration = tvDuration.toString();
        TextView tvIndication = findViewById(R.id.indications);
        String indication = tvIndication.toString();
        */


    }

    public void confirm(View view){

        TextView tvName  = findViewById(R.id.nameMed);
        String name = tvName.toString();
        TextView tvDosage =  findViewById(R.id.dosage);
        String dosage = tvDosage.toString();
        TextView tvDuration = findViewById(R.id.duration);
        String duration = tvDuration.toString();
        TextView tvIndication = findViewById(R.id.indications);
        String indication = tvIndication.toString();

        medicine = new Medicines(name,dosage,duration,indication);

        //editMedicine(medicine);
        finish();

    }

    /*
    private boolean editMedicine(Medicines medicine){

        try{
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("medicines");
            //firebase.push().setValue(medicine);
            firebase.child("" + medicine.getId()).setValue(medicine);
            String id = firebase.getKey();
            Toast.makeText(this, "Medicine edited successfully!", Toast.LENGTH_LONG).show();
            return true;


        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
     */


    public void delete(View view){

        //deleteMedicine(medicine);
        finish();
    }
    /*
    private boolean deleteMedicine(Medicines medicine){
        try {
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("medicines");
            //firebase.push().setValue(medicine);
            firebase.child("" + medicine.getId()).removeValue();
            String id = firebase.getKey();
            return true;

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }*/
}
