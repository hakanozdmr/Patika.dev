import java.util.*;
class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    public void login(String email, String password) throws InvalidAuthenticationException {
        if (getUser().getEmail().equals(email) && getUser().getPassword().equals(password)) {
            setAuthenticationStatus(AuthenticationStatus.SUCCESS);
            getUser().setLastLoginDate(new Date());
        } else {
            throw new InvalidAuthenticationException();
        }
    }
}
