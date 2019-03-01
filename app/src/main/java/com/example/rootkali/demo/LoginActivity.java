package com.example.rootkali.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button Login;
    EditText Name, Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login = findViewById(R.id.login);
        Name= findViewById(R.id.uname);
        Pass = findViewById(R.id.pass);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate(Name.getText().toString(),Pass.getText().toString());
                Name.setText("");
                Pass.setText("");
            }
        });
    }
    private void Validate(String Username,String Password){
        if(Username.equals("") && Password.equals("")){
            Toast.makeText(this, "Please Fill all field", Toast.LENGTH_LONG).show();
            return;
        }
        if(Username.equals("Masoud") && (Password.equals("12345"))){
            startActivity(new Intent(LoginActivity.this,Login1Activity.class));
            Toast.makeText(this, "Welcome"+" "+Username+" ", Toast.LENGTH_LONG).show();
        }else if (!(Username.equals("Masoud") && (Password.equals("12345")))){
            Toast.makeText(this, "Username or Password is incorrect.Try again", Toast.LENGTH_LONG).show();
            return;
        }
    }


}
