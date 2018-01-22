package br.ufop.cleide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoctorAdd extends AppCompatActivity {

    private Doctor doctor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_add);
    }


    public void add(View view){


        TextView tvCrm = findViewById(R.id.crm);
        int crm = Integer.parseInt(tvCrm.getText().toString());
        TextView tvName = findViewById(R.id.name);
        String name = tvName.toString();
        TextView tvSpecialty = findViewById(R.id.specialty);
        String specialty = tvSpecialty.toString();
        TextView tvPhone = findViewById(R.id.phone);
        String phone = tvPhone.toString();


        doctor = new Doctor(crm,name,specialty,phone);
        //adiciona doctor ao banco de dados

        tvCrm.setText("");
        tvName.setText("");
        tvPhone.setText("");
        tvSpecialty.setText("");
    }

}

