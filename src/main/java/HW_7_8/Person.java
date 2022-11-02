package HW_7_8;

import java.time.Year;

public class Person {
    /**
     * Задача №7
     * Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод -
     * getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Ms. ” если женский.
     * <p>
     * Задача №8
     * В классе Person добавьте поле yearOfBirth (год рождения) и сделайте это поле неизменяемым которое можно задать
     * только через конструктор.
     * Удалите поле age из конструкторов и удалите setter метод для этого поля.
     * Измените getter для поля age чтобы он возвращал возраст как целое количество лет
     * <p>
     * подсказка как найти текущий год (попробуйте сначала найти сами) подсказку видно если выделить текст
     * следующей строки :
     */

    private String name;
    private int age;
    private char sex;
    private int yearOfBirth;
    private double salary;
    private double baseSalary;
    private double dailySalary;

    public Person(String name, int age, char sex, int yearOfBirth,
                  double salary, double baseSalary, double dailySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.baseSalary = baseSalary;
        this.dailySalary = dailySalary;
    }

    public Person(String jack, char m, int sex) {
    }

    public String getName() {

        if (this.sex == 'M') {
            return "Mr. " + name;
        } else if (this.sex == 'F') {
            return "Ms. " + name;
        } else {
            return name;
        }
        //        switch (this.sex) {
//            case 'M':
//                return "Mr. " + name;
//                break;
//            case 'F':
//                return "Ms. " + name;
//                break;
//            default:
//                return name;
//        }

//        return switch (this.sex) {
//            case 'M' -> "Mr. " + name;
//            case 'F' -> "Ms. " + name;
//            default -> name;
//        };
    }


    public char getSex() {
        return sex;
    }

//    public void setSex(char sex) {
//        this.sex = sex;
//    }

    public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

//    public void setAge(int age) {
//        if (age < 0 || age > 130) {
//        }
//        this.age = age;
//    }}


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

//    public double getTotalSalary(Month[] monthArray) {
//
////        double totalSalary = 0;
////        for (int i = 0; i < monthArray.length; i++) {
////            totalSalary = totalSalary + monthArray.ge() * getDailySalary();
////        }
////        return totalSalary;
////    }
//}
}


