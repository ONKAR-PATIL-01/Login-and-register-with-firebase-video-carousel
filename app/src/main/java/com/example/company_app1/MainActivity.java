package com.example.company_app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText t11,t12;
    Button b1;
    TextView t13;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        b1=findViewById(R.id.b1);
        t13=findViewById(R.id.t13);
        mAuth = FirebaseAuth.getInstance();
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,register.class));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail1=t11.getText().toString().trim();
                String pass1=t12.getText().toString().trim();
             mAuth.signInWithEmailAndPassword(mail1,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                 @Override
                 public void onComplete(@NonNull Task<AuthResult> task) {
                     if(task.isSuccessful()){
                         Toast.makeText(MainActivity.this,"login Successful",Toast.LENGTH_SHORT).show();
                         startActivity(new Intent(MainActivity.this,Dashboard.class));

                 }
                     else
                     {
                         Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                     }
                 }
             });
            }
        });
    }
}