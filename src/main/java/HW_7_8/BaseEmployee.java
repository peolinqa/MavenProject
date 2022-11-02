package HW_7_8;
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.

public abstract class BaseEmployee implements IEmployee {
    private String name;
    private int age;
    private char gender;
    private double BaseSalary;

    public BaseEmployee(String name, int age, char gender, double BaseSalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.BaseSalary = BaseSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public char getGender() {
        return gender;
    }

    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public double getBaseSalary() {
        return BaseSalary;
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        this.BaseSalary = baseSalary;
    }

    @Override
    public abstract double getSalary();

    public double getSalary(Month[] monthArray, double baseSalary) {
        double days = 0;
        for (int i = 0; i < monthArray.length; i++) {
            days = days + getBaseSalary() * monthArray[i].getWorkdays();
        }
        return days;
    }
}
