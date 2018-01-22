package br.ufop.cleide;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


public class DoctorList extends AppCompatActivity {

    /*
    private ArrayList<Doctor> doctors;
      private Medicines adapter;
    private ListView listView;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        View fabDoc = findViewById(R.id.fabDoctor);
        fabDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoctorList.this, "Funcionou", Toast.LENGTH_SHORT).show();

            }
        });

        /*
          user = FirebaseAuth.getInstance().getCurrentUser();

        doctors = new ArrayList<>();
        listView = findViewById(R.id.listDoctors);
        adapter = new DoctorAdapter(this, doctors);
        listView.setAdapter(adapter);

        firebase = FirebaseDatabase.getInstance().getReference().child("user").child(user.getUid().toString()).child("doctors");

        valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                students.clear();
                for (DataSnapshot data : dataSnapshot.getChildren()){
                    Doctor newDoctor = data.getValue(Doctor.class);
                    students.add(newDoctor);
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
                Doctor doctor = (Doctor) adapter.getItem(i);
                Toast.makeText(DoctorList.this, "Doctor selected: " + doctor.getName(), Toast.LENGTH_SHORT).show();

                //Call StudentEdit activity passing info about the selected student
                Intent it = new Intent(DoctorList.this, DoctorEdit.class);
                it.putExtra("position", i);
                it.putExtra("doctor", (Parcelable) doctor);
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

