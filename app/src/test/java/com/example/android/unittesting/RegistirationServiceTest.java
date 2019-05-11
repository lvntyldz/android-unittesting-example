package com.example.android.unittesting;

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

    @Test
    public void shouldShowInvalidUsernameMsgWhenUsernameIsEmpty() {

        when(view.getfirstname()).thenReturn("");

        registiration.onSignupClicked();

        verify(view).showFirstnameErrorMsg(R.string.invalid_firstname_msg);
    }
}