package entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual(){
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = (getAnnualIncome() < 20000) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;

        basicTax -= getHealthExpenditures() * 0.5;

        if (basicTax < 0.0) {
            return 0.0;
        } else {
            return basicTax;
        }
    }
}
