package com.example.android.unittesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements SignupView {

    private Button signUp;
    private EditText firstName, lastName, email, password;
    private RegistirationService registiration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signUp = findViewById(R.id.signup);

        registiration = new RegistirationService(this, new SignupService());

        signUp.setOnClickListener(onSignupBtnClickListener());
    }

    private View.OnClickListener onSignupBtnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registiration.onSignupClicked();
            }
        };
    }

    @Override
    public String getfirstname() {
        return firstName.getText().toString();
    }

    @Override
    public void showFirstnameErrorMsg(int msgId) {
        firstName.setError(getString(msgId));
    }
}
