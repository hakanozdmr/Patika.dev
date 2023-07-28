package Insurance;

import java.util.*;
public class TravelInsurance extends Insurance {
    public TravelInsurance(String name, double premium, Date startDate, Date endDate) {
        super(name, premium, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Seyahat sigortası primini hesaplamak için gerekli işlemleri burada yapın.
        return getPremium();
    }
}
