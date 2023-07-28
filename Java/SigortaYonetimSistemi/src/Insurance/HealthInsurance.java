package Insurance;

import java.util.*;
public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, double premium, Date startDate, Date endDate) {
        super(name, premium, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Sağlık sigortası primini hesaplamak için gerekli işlemleri burada yapın.
        return getPremium();
    }
}
