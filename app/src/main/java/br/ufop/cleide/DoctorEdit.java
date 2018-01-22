package br.ufop.cleide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DoctorEdit extends Activity {
    /*
    private DatabaseReference firebase;
    private FirebaseUser user;
    private ValueEventListener valueEventListener;
     */

    private int position = 0;
    private Doctor doctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_edit);

        /*
        Intent it = getIntent();
        Bundle params = it.getExtras();

        //carrega dados do banco

        user = FirebaseAuth.getInstance().getCurrentUser();

        EditText name = findViewById(R.id.editText);
        name.setText(doctor.getName());
        EditText specialty = findViewById(R.id.editText2);
        specialty.setText(doctor.getSpecialty());
        EditText phone = findViewById(R.id.editText3);
        phone.setText(doctor.getPhone());
*/

    }
    public void confirm(View view){

        TextView tvCrm = findViewById(R.id.crm);
        int crm = Integer.parseInt(tvCrm.getText().toString());
        TextView tvName = findViewById(R.id.editName);
        String name = tvName.toString();
        EditText edtSpecialty = findViewById(R.id.editText2);
        String specialty = edtSpecialty.toString();
        EditText edtPhone =  findViewById(R.id.editText3);
        String phone = edtPhone.toString();

        doctor = new Doctor(crm,name,specialty,phone);
        //salvar no bancode dados
        //editDoctor(doctor);

        finish();
    }

    /*
      private boolean editDoctor(Doctor doctor){
        try {
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("doctors");
            //firebase.push().setValue(doctor);
            firebase.child("" + doctor.getId()).setValue(doctor);
            String id = firebase.getKey();
            Toast.makeText(this, "Doctor edited successfully!", Toast.LENGTH_LONG).show();
            return true;

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

     */

    public void delete(View view){

       //deleteDoctor(doctor);
        finish();
    }

    /*
    private boolean deleteStudent(Doctor doctor){
        try {
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("doctors");
            //firebase.push().setValue(doctor);
            firebase.child("" + doctor.getId()).removeValue();
            String id = firebase.getKey();
            return true;

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

     */


}
