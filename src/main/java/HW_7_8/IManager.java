package HW_7_8;

// В интерфейсы обычно выносится то, что не связано с наследованием

public interface IManager {
    int SALARY_COEFFICIENT_DIRECTOR = 9;
    int SALARY_COEFFICIENT = 3;
    int BONUS_COEFFICIENT = 1;

    public int getNumberOfSubordinates();

    public void setNumberOfSubordinates(int numberOfSubordinates);

    public double getSalary();

    public double getSalary(Month[] arr);
}
// Override в интерфейсе быть не должно