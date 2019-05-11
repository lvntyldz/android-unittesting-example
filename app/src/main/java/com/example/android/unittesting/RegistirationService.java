package com.example.android.unittesting;

class RegistirationService {

    private SignupView view;

    public RegistirationService(SignupView view) {
        this.view = view;
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

        if (firstname.equals(lastname)) {
            view.showSignupResultMsg(R.string.signup_completed_success_msg);
            return;
        }
        view.showSignupResultMsg(R.string.signup_failed_msg);
    }
}
