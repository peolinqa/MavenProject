package HW_7_8;

public final class Worker extends BaseEmployee implements IEmployee {
    public Worker(String name, int age, char gender, double BaseSalary) {
        super(name, age, gender, BaseSalary);
    }

    public final double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }


}

