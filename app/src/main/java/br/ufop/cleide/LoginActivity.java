package br.ufop.cleide;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void loginOnClick(View view){

        EditText editUser = findViewById(R.id.user);
        String user = editUser.getText().toString();

        /*
        Adicionar balão informando que o usuário já existe!!!
        */
        EditText editPass = findViewById(R.id.password);
        String pass = editPass.getText().toString();

        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }
    public void newAccount(View view){


        Intent i = new Intent(this,UserAdd.class);
        startActivity(i);

    }

}