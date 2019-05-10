package com.example.android.unittesting;

import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SignUpHelperTest {

    @InjectMocks
    private SignUpHelper helper;

    @Mock
    private MainActivity activity;

    @Mock
    private Validator validator;

    @Mock
    private EditText firstName, lastName, email, password;

    @Test
    public void shouldContainFirstNameErrorMsgWhenUsernameIsNotValid() {

        helper.onSignUpClicked();
        assertThat(firstName.getError().toString(), equalTo("Please Enter At Least 3 Character As First Name"));
    }
}