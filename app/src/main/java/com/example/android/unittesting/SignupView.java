package com.example.android.unittesting;

interface SignupView {
    String getFirstname();

    String getLastname();

    String getEmail();

    String getPassword();

    void showFirstnameErrorMsg(int msgId);

    void showLastnameErrorMsg(int msgId);

    void showEmailErrorMsg(int msgId);

    void showPasswordErrorMsg(int msgId);

    void showSignupResultMsg(int msgId);
}
