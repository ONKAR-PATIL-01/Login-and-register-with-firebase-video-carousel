package com.example.company_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class reward extends AppCompatActivity {
TextView t112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        t112=findViewById(R.id.textView2);
        final int[] a = {Integer.parseInt(t112.getText().toString())};
        t112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a[0] += 50;
            }
        });
        t112.setText(String.valueOf(a[0]));
    }

}