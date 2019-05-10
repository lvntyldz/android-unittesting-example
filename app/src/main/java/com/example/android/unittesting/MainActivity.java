package com.example.android.unittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private Button signUp;
    private EditText firstName, lastName, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signUp = findViewById(R.id.signup);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (firstName.length() < 3) {
                    firstName.setError("Please Enter At Least 3 Character As First Name");
                    return;
                }

                if (lastName.length() < 3) {
                    lastName.setError("Please Enter At Least 3 Character As Last Name");
                    return;
                }

                if (email.length() < 3) {
                    email.setError("Please Enter At Least 3 Character As E-Mail");
                    return;
                }

                if (password.length() < 3) {
                    password.setError("Please Enter At Least 3 Character As Password");
                    return;
                }

                Toast.makeText(MainActivity.this,"SignedUp successfully...",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
