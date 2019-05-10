package com.example.android.unittesting;

import android.widget.EditText;
import android.widget.Toast;

public class SignUpHelper {

    private MainActivity activity;
    private Validator validator;
    private EditText firstName, lastName, email, password;

    public SignUpHelper(MainActivity activity, Validator validator, EditText firstName, EditText lastName, EditText email, EditText password) {
        this.activity = activity;
        this.validator = validator;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public void onSignUpClicked() {

        if (!validator.isValidFirstName(firstName)) {
            firstName.setError("Please Enter At Least 3 Character As First Name");
            return;
        }

        if (!validator.isValidLasrName(lastName)) {
            lastName.setError("Please Enter At Least 2 Character As Last Name");
            return;
        }

        if (!validator.isValidEmail(email)) {
            email.setError("Please Enter At Least 4 Character As E-Mail");
            return;
        }

        if (!validator.isValidPassword(password)) {
            password.setError("Please Enter At Least 1 Character As Password");
            return;
        }

        Toast.makeText(activity, "SignedUp successfully...", Toast.LENGTH_SHORT).show();


    }

}
