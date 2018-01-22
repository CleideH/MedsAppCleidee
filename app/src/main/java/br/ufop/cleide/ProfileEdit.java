package br.ufop.cleide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class ProfileEdit extends AppCompatActivity {

      /*
    private DatabaseReference firebase;
    private FirebaseUser user;
    private ValueEventListener valueEventListener;
     */

    private int position = 0;
    private Profile profile;
    //RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        /*
         Intent it = getIntent();
         Bundle params = it.getExtras();
         profile = (Profile)params.get("profile");

        user = FirebaseAuth.getInstance().getCurrentUser();

         */
        EditText edName = findViewById(R.id.editName);
        edName.setText(profile.getName());
        EditText edDtBithd = findViewById(R.id.editDtBirh);
        edDtBithd.setText((CharSequence) profile.getDtbirth());
        EditText edBloodTp = findViewById(R.id.editBloodType);
        edBloodTp.setText(profile.getBloodType());
        EditText edBloodPrs = findViewById(R.id.editBloodPres);
        edBloodPrs.setText(profile.getBloodPressure());
        EditText edHeart = findViewById(R.id.editHeartBts);
        edHeart.setText(profile.getHeartBeats());
        EditText edVacTkn = findViewById(R.id.editVacTkn);
        edVacTkn.setText((CharSequence) profile.getVaccinesTaken());
        EditText edAllergies = findViewById(R.id.editAlrg);
        edAllergies.setText(profile.getAllergies());
        EditText edWeight = findViewById(R.id.editWeight);
        edWeight.setText(profile.getWeight());
        EditText edHeight = findViewById(R.id.editHeight);
        edHeight.setText(profile.getHeight());


    }

    public void confirm (View view){

        TextView tvName = findViewById(R.id.textName);
        String name = tvName.toString();
        TextView tvDtBirth = findViewById(R.id.textDtBirth);
        String dtBirth = tvDtBirth.toString();
        TextView tvBloodtp = findViewById(R.id.BloodType);
        String bloodTp = tvBloodtp.toString();
        TextView tvBloodPrs = findViewById(R.id.textBloodPres);
        String bloodPrss = tvBloodPrs.toString();
        TextView tvheartBts = findViewById(R.id.textHeartBts);
        int heartBts = Integer.parseInt(tvheartBts.getText().toString());
        TextView tvVaccines = findViewById(R.id.textVacTkn);
        String vaccines = tvVaccines.toString();
        TextView tvAllergies = findViewById(R.id.textAlrg);
        String allergies = tvAllergies.toString();
        TextView tvWeight = findViewById(R.id.textWeight);
        String weight = tvWeight.toString();
        TextView tvHeight = findViewById(R.id.textHeight);
        String height = tvHeight.toString();
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        String gender;
        if(R.id.radioButtonMale == rg.getCheckedRadioButtonId()) {
            Toast.makeText(this, "Radio button Male selected", Toast.LENGTH_SHORT).show();
            gender = "Male";
        }
        else {
            Toast.makeText(this, "Radio button Female selected", Toast.LENGTH_SHORT).show();
            gender ="Female";
        }
        TextView tvPrevSrg = findViewById(R.id.textPrvSurgs);
        String prvSrg = tvPrevSrg.toString();
        TextView tvDiseases = findViewById(R.id.textDiseases);
        String diseases = tvDiseases.toString();

        Profile newProf = new Profile(name,dtBirth,bloodTp,bloodPrss,vaccines,allergies,heartBts,weight,height,gender,prvSrg,diseases);
        //editProfile(newProf);

        finish();

    }
   /*
    private boolean editProfile(Profile profile){
        try {
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("profiles");
            //firebase.push().setValue(profile);
            firebase.child("" + profile.getId()).setValue(profile);
            String id = firebase.getKey();
            Toast.makeText(this, "Profile edited successfully!", Toast.LENGTH_LONG).show();
            return true;

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    */
   /*
    private boolean deleteStudent(Student student){
        try {
            firebase = FirebaseDatabase.getInstance().getReference()
                    .child("user").child(user.getUid().toString()).child("students");
            //firebase.push().setValue(medicine);
            firebase.child("" + student.getId()).removeValue();
            String id = firebase.getKey();
            return true;

        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    */


    public void delete(View view){
        //deletemProfile(profile);

        finish();

    }


}
