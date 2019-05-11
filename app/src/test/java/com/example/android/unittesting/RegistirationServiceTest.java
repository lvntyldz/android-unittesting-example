package com.example.android.unittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RegistirationServiceTest {

    @InjectMocks
    private RegistirationService registiration;

    @Mock
    private SignupView view;

    @Mock
    private SignupService service;

    private String firstNameTmp = "levent";
    private String lastNameTmp = "YILDIZ";
    private String emailTmp = "aa@bb.cc";
    private String passwordTmp = "12345";

    @Before
    public void setUp() throws Exception {
        when(view.getFirstname()).thenReturn(firstNameTmp);
        when(view.getLastname()).thenReturn(lastNameTmp);
        when(view.getEmail()).thenReturn(emailTmp);
        when(view.getPassword()).thenReturn(passwordTmp);
    }

    @Test
    public void shouldShowInvalidFirstnameMsgWhenFirstnameIsEmpty() {

        when(view.getFirstname()).thenReturn("");

        registiration.onSignupClicked();

        verify(view).showFirstnameErrorMsg(R.string.invalid_firstname_msg);
    }

    @Test(expected = NullPointerException.class)
    public void shouldShowInvalidFirstnameMsgWhenFirstnameIsNull() {

        when(view.getFirstname()).thenReturn(null);

        registiration.onSignupClicked();

        verify(view).showFirstnameErrorMsg(R.string.invalid_firstname_msg);
    }

    @Test
    public void shouldShowInvalidLastnameMsgWhenLastnameIsEmpty() {

        when(view.getLastname()).thenReturn("");

        registiration.onSignupClicked();

        verify(view).showLastnameErrorMsg(R.string.invalid_lastname_msg);
    }

    @Test(expected = NullPointerException.class)
    public void shouldShowInvalidLastnameMsgWhenLastnameIsNull() {

        when(view.getLastname()).thenReturn(null);

        registiration.onSignupClicked();

        verify(view).showLastnameErrorMsg(R.string.invalid_lastname_msg);
    }

    @Test
    public void shouldShowInvalidEmailMsgWhenEmailIsEmpty() {

        when(view.getEmail()).thenReturn("");

        registiration.onSignupClicked();

        verify(view).showEmailErrorMsg(R.string.invalid_email_msg);
    }

    @Test(expected = NullPointerException.class)
    public void shouldShowInvalidEmailMsgWhenEmailIsNull() {

        when(view.getEmail()).thenReturn(null);

        registiration.onSignupClicked();

        verify(view).showEmailErrorMsg(R.string.invalid_email_msg);
    }

    @Test
    public void shouldShowInvalidPasswordMsgWhenPasswordIsEmpty() {

        when(view.getPassword()).thenReturn("");

        registiration.onSignupClicked();

        verify(view).showPasswordErrorMsg(R.string.invalid_password_msg);
    }

    @Test(expected = NullPointerException.class)
    public void shouldShowInvalidPasswordMsgWhenPasswordIsNull() {

        when(view.getPassword()).thenReturn(null);

        registiration.onSignupClicked();

        verify(view).showPasswordErrorMsg(R.string.invalid_password_msg);
    }
}