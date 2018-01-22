package br.ufop.cleide;

import android.Manifest;
import android.app.ListActivity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Call extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);

        //setListAdapter(new DoctorAdapter(this,));
    }
}
