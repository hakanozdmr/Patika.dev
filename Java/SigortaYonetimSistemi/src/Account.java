import Insurance.Insurance;

import java.util.*;
abstract class Account {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.user = user;
        authenticationStatus = AuthenticationStatus.FAIL;
        insurances = new ArrayList<>();
    }

    public abstract void login(String email, String password) throws InvalidAuthenticationException;

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }

    public User getUser() {
        return user;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void showUserInfo() {
        user.showUserInfo();
    }

    protected void setAuthenticationStatus(AuthenticationStatus status) {
        authenticationStatus = status;
    }
}
