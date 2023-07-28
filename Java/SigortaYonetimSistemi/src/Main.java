import Address.*;
import Insurance.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Örnek kullanıcı oluşturuyoruz.
        User user = new User("John", "Doe", "john.doe@example.com", "password123", "Software Engineer", 30);

        // Kullanıcının adreslerini oluşturuyoruz.
        Address homeAddress = new HomeAddress("New York", "Manhattan");
        Address businessAddress = new BusinessAddress("San Francisco", "ABC Company");

        // Kullanıcının adreslerini ekliyoruz.
        AddressManager.addAddress(user, homeAddress);
        AddressManager.addAddress(user, businessAddress);

        // Bireysel müşteri hesabı oluşturuyoruz.
        Account individualAccount = new Individual(user);

        try {
            // Bireysel müşteri hesabı ile giriş yapıyoruz.
            individualAccount.login("john.doe@example.com", "password123");

            // Kullanıcı bilgilerini gösteriyoruz.
            individualAccount.showUserInfo();

        } catch (InvalidAuthenticationException e) {
            System.out.println("Hatalı giriş!");
        }

        // Seyahat sigortası oluşturuyoruz.
        Insurance travelInsurance = new TravelInsurance("Seyahat Sigortası", 150.0,
                new Date(), new Date(System.currentTimeMillis() + 86400000));

        // Bireysel müşteriye sigorta ekliyoruz.
        individualAccount.addInsurance(travelInsurance);

        // Bireysel müşterinin sigortalarını listeliyoruz.
        ArrayList<Insurance> individualInsurances = individualAccount.getInsurances();
        System.out.println("\nBireysel Müşteri Sigortaları:");
        for (Insurance insurance : individualInsurances) {
            System.out.println("Sigorta Adı: " + insurance.getName());
            System.out.println("Prim: " + insurance.getPremium());
            System.out.println("Başlangıç Tarihi: " + insurance.getStartDate());
            System.out.println("Bitiş Tarihi: " + insurance.getEndDate());
            System.out.println("------------------------");
        }
    }
}