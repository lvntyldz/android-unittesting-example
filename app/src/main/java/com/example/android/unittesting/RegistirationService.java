package com.example.android.unittesting;

class RegistirationService {

    private SignupView view;
    private SignupService service;

    public RegistirationService(SignupView view, SignupService service) {
        this.view = view;
        this.service = service;
    }

    public void onSignupClicked() {

        String firstname = view.getfirstname();
        if (firstname.length() < 1) {
            view.showFirstnameErrorMsg(R.string.invalid_firstname_msg);
        }

    }
}
