package com.example.android.unittesting;

class RegistirationService {

    private SignupView view;
    private SignupService service;

    public RegistirationService(SignupView view, SignupService service) {
        this.view = view;
        this.service = service;
    }

    public void onSignupClicked() {

        String firstname = view.getFirstname();
        String lastname = view.getLastname();
        String email = view.getEmail();
        String password = view.getPassword();

        if (firstname.length() < 1) {
            view.showFirstnameErrorMsg(R.string.invalid_firstname_msg);
            return;
        }

        if (lastname.length() < 1) {
            view.showLastnameErrorMsg(R.string.invalid_lastname_msg);
            return;
        }

        if (email.length() < 1) {
            view.showEmailErrorMsg(R.string.invalid_email_msg);
            return;
        }

        if (password.length() < 1) {
            view.showPasswordErrorMsg(R.string.invalid_password_msg);
            return;
        }
    }
}
