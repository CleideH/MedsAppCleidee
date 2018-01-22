package br.ufop.cleide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class UserAdd extends AppCompatActivity {

    private User users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_add);
    }

    //method add new user
    public void add(View view){

        TextView tvUser = findViewById(R.id.tvUser);
        String user = tvUser.toString();

        TextView tvPass = findViewById(R.id.tvPassword);
        String pass = tvPass.toString();

        TextView tvConfPass = findViewById(R.id.tvConfPass);
        String confPass = tvConfPass.toString();

        //Fazer verificação de senha

        users = new User(user,pass);
        Profile p = new Profile();


        //saved new user and profile associate the here

        tvUser.setText("");
        tvPass.setText("");
        tvConfPass.setText("");

        finish();
    }

}
