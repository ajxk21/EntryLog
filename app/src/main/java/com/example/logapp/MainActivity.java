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

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pass);

        p1=(AppCompatButton)findViewById(R.id.logb);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUsername=ed1.getText().toString();
                String getPassword=ed2.getText().toString();
                if(getUsername.equals("admin")&&getPassword.equals("12345"))
                {

                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(), log.class);
                    startActivity(i);
                }

                else {
                    Toast.makeText(getApplicationContext(), "Invalid Credential", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}