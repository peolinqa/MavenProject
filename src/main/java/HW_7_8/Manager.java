package HW_7_8;

public class Manager extends BaseEmployee implements IManager {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double BaseSalary, int numberOfSubordinates) {
        super(name, age, gender, BaseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public double getBonusCoefficient() {
        return Manager.BONUS_COEFFICIENT;
    }

    private double getBonusMultiplier() {
        return 1.0 + getBonusCoefficient() * numberOfSubordinates;
    }

//    public double getSalary() {
//        if (getNumberOfSubordinates() == 0) {
//            return super.getBaseSalary(); //это тоже самое, что return getBaseSalary();
//        } else
//            return super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * SALARY_COEFFICIENT);//добавили к 100 ноль, чтобы получить double
//    }

    @Override
    public double getSalary() {
        return (double) (getBaseSalary() * getBonusMultiplier());
    }

    public double getSalary(Month[] MONTHS_ARRAY) {
        return (double) (getSalary(MONTHS_ARRAY, this.getBaseSalary()) * getBonusMultiplier());
    }


}



