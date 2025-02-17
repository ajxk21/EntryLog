package com.example.logapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class log extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.adno);
        ed3=(EditText)findViewById(R.id.sysno);
        ed4=(EditText)findViewById(R.id.dpt);


        p1=(AppCompatButton)findViewById(R.id.addb);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String getAdno=ed2.getText().toString();
                String getSysno=ed3.getText().toString();
                String getDept=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),"Log Added Successfully",Toast.LENGTH_SHORT).show();
            }
        });
        p2=(AppCompatButton) findViewById(R.id.logout);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Logged Out",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}