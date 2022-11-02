package HW_7_8;

public final class Director extends Manager implements IManager, IEmployee {

    public Director(String name, int age, char gender, double BaseSalary, int numberOfSubordinates) {
        super(name, age, gender, BaseSalary, numberOfSubordinates);
    }

    public static final int BONUS_COEFFICIENT = 8;


    protected double getBonusMultiplier() {
        return 1.0 + getBonusCoefficient() * getNumberOfSubordinates() / 100.0;
    }

    @Override
    public double getBonusCoefficient() {
        return Director.BONUS_COEFFICIENT;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * SALARY_COEFFICIENT_DIRECTOR);
        }
    }
}

