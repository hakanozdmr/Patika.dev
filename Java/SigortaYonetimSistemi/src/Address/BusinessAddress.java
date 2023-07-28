package Address;

public class BusinessAddress implements Address {
    private String city;
    private String company;

    public BusinessAddress(String city, String company) {
        this.city = city;
        this.company = company;
    }

    @Override
    public void showAddressInfo() {
        System.out.println("İş Adresi: " + city + ", " + company);
    }
}
