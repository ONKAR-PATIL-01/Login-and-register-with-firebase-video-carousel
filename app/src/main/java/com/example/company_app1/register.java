package com.example.company_app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    EditText t21,t22,t23,t24;
    Button b21,b22;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t21=findViewById(R.id.t21);
        t22=findViewById(R.id.t22);
        t23=findViewById(R.id.t23);
        t24=findViewById(R.id.t24);
        b21=findViewById(R.id.b21);
        b22=findViewById(R.id.b22);
        mAuth = FirebaseAuth.getInstance();
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=t23.getText().toString().trim();
                String pass=t24.getText().toString().trim();

              mAuth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {
                      Toast.makeText(register.this,"New User Added",Toast.LENGTH_LONG).show();
                  }
              });
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this,MainActivity.class));
            }
        });

    }

}