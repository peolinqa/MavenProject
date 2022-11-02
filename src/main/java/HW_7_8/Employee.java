package HW_7_8;

/**
 * Задача №3
 * Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и полем зарплата.
 * Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого
 * был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
 */

public class Employee {
    private double baseSalary;
    private String name;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return baseSalary;
    }

//    @Override
//    public double getSalary() {
//        return 12000 + super.getSalary();
//    }
}
