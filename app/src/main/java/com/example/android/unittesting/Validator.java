package com.example.android.unittesting;

import android.widget.EditText;

public class Validator {

    public boolean isValidEmail(EditText d) {
        return d.length() >= 4;
    }

    public boolean isValidFirstName(EditText d) {
        return d.length() >= 3;
    }

    public boolean isValidLasrName(EditText d) {
        return d.length() >= 2;
    }

    public boolean isValidPassword(EditText d) {
        return d.length() >= 1;
    }

}
