import Address.Address;

import java.util.*;
class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList<Address> addresses;
    private Date lastLoginDate;

    public User(String firstName, String lastName, String email, String password, String occupation, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUserInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Meslek: " + occupation);
        System.out.println("Yaş: " + age);
        System.out.println("Son Giriş Tarihi: " + lastLoginDate);

        if (!addresses.isEmpty()) {
            System.out.println("Adresler:");
            for (Address address : addresses) {
                address.showAddressInfo();
            }
        }
    }
}

