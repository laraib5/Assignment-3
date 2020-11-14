package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e, p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = (EditText) findViewById(R.id.e);
        p = (EditText) findViewById(R.id.p);
        b = (Button) findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("") || p.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "PLEASE FILL THE EMPTY FIELDS!", Toast.LENGTH_LONG).show();
                }
                else {
                    String email= e.getText().toString();
                    String password= p.getText().toString();

                    Intent in= new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("keyemail",email);
                    in.putExtra("keypassword", password);
                    startActivity(in);
                }
            }
        });


    }
}