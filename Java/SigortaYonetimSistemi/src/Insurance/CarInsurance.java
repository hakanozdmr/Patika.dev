package Insurance;

import java.util.*;
public class CarInsurance extends Insurance {
    public CarInsurance(String name, double premium, Date startDate, Date endDate) {
        super(name, premium, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Otomobil sigortası primini hesaplamak için gerekli işlemleri burada yapın.
        return getPremium();
    }
}
