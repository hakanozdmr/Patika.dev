package Insurance;

import java.util.*;
public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, double premium, Date startDate, Date endDate) {
        super(name, premium, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Konut sigortası primini hesaplamak için gerekli işlemleri burada yapın.
        return getPremium();
    }
}
