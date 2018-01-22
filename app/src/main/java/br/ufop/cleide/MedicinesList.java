package br.ufop.cleide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MedicinesList extends AppCompatActivity {

   /*
    private ArrayList<Medicines> medicines;
      private Medicines adapter;
    private ListView listView;
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines_list);

        View fabMed = findViewById(R.id.fabMedicines);
        fabMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MedicinesList.this, "Funcionou", Toast.LENGTH_SHORT).show();
                //Intent it = new Intent(this,MedicinesAdd.class);

            }
        });

        /*
        user = FirebaseAuth.getInstance().getCurrentUser();

         medicines= new ArrayList<>();
        listView = findViewById(R.id.listMedicines);
        adapter = new MedicinesAdapter(this, medicines);
        listView.setAdapter(adapter);

        firebase = FirebaseDatabase.getInstance().getReference().child("user").child(user.getUid().toString()).child("medicines");

        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                medicines.clear();
                for (DataSnapshot data : dataSnapshot.getChildren()){
                    Medicines newMedicine = data.getValue(Medicines.class);
                    medicines.add(newMedicine);
                }
                //Log.d("CSI436", "valueEventListener Students: " + students);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Medicines medicine = (Medicines) adapter.getItem(i);
                Toast.makeText(MedicinesList.this, "Medicine selected: " + medicine.getName(), Toast.LENGTH_SHORT).show();

                //Call StudentEdit activity passing info about the selected student
                Intent it = new Intent(MedicinesList.this, MedicinesEdit.class);
                it.putExtra("position", i);
                it.putExtra("medicine", (Parcelable) medicine);
                startActivity(it);
            }
        });
         */
    }

    @Override
    //carregar lista de médicos
    protected void onResume() {
        super.onResume();

    }
    /*
    @Override
    protected void onStop() {
        super.onStop();
        firebase.removeEventListener(valueEventListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        firebase.addValueEventListener(valueEventListener);
    }
     */



}
