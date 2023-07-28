package Address;

public class HomeAddress implements Address {
    private String city;
    private String district;

    public HomeAddress(String city, String district) {
        this.city = city;
        this.district = district;
    }

    @Override
    public void showAddressInfo() {
        System.out.println("Ev Adresi: " + city + ", " + district);
    }
}
