package Insurance;

import java.util.*;
public abstract class Insurance {
    private String name;
    private double premium;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double premium, Date startDate, Date endDate) {
        this.name = name;
        this.premium = premium;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract double calculate();

    public String getName() {
        return name;
    }

    public double getPremium() {
        return premium;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}