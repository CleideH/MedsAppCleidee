package br.ufop.cleide;

import android.content.Intent;
import android.icu.util.ValueIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void call(View view){

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }

    public void medicines(View view){

        Intent it = new Intent(this,MedicinesList.class);
        startActivity(it);

    }

    public void profile(View view){

        Intent it = new Intent(this,ProfileEdit.class);
        startActivity(it);

    }

    public void doctors(View view){

        Intent it = new Intent(this,DoctorList.class);
        startActivity(it);

    }


}
