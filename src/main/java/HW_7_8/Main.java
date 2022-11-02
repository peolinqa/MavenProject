package HW_7_8;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 'M', 1990);
        Person mary = new Person("Mary", 'F', 1996);

        System.out.println(String.format("name: %s, sex: %s, age: %d", jack.getName(), jack.getSex(), jack.getAge()));
        System.out.println(String.format("name: %s, sex: %s, age: %d", mary.getName(), mary.getSex(), mary.getAge()));
        System.out.println("_______________________________________________________________");

        // подсчет зарплатного бюджета для всех сотрудников в массиве
        Worker worker = new Worker("Sergey", 35, 'M', 1000);
        Manager manager = new Manager("Anna", 35, 'F', 2300, 20);
        Director director = new Director("Petr", 26, 'M', 1200, 12);

        System.out.println("__подсчет зарплатного бюджета для всех сотрудников в массиве__");
        System.out.println("worker " + worker.getBaseSalary());
        System.out.println("manager " + manager.getBaseSalary());
        System.out.println("director " + director.getBaseSalary());

//        // поиск сотрудника в массиве по его имени
//        Worker[] workers = {worker, manager, director};
//        System.out.println("__поиск сотрудника в массиве по его имени__");
//        System.out.println();

        // подсчет зп зп неск. месяцев

        BaseEmployee employee1 = new BaseEmployee("Sergey", 30, 'M', 1000) {
            @Override
            public double getSalary() {
                return 0;
            }
        };
        Month[] months = {
                new Month("January", 31, 22),
                new Month("February", 28, 21)
        };

//        System.out.println("__подсчет зп зп неск. месяцев__");
//        System.out.println(employee1.getSalary(months));


        // подсчет зарплатного бюджета для всех сотрудников в массиве
//
//        Worker worker1 = manager;
//        Worker worker2 = director;

//        Worker[] workers1 = {worker, manager, director};
//        Worker[] workers2 = {worker, worker1, worker2};

        System.out.println("__подсчет зарплатного бюджета для всех сотрудников в массиве__");
//        System.out.println(worker.getSalary());
//        System.out.println(worker1.getSalary());
//
//        System.out.println(EmployeeUtils.salarySum(workers));
//        System.out.println(EmployeeUtils.salarySum(workers2));

        // поиск наименьшего количества подчиненных в массиве менеджеров

        Manager[] managers = {manager, director};
        System.out.println("__поиск наименьшего количества подчиненных в массиве менеджеров__");

        //System.out.println(EmployeeUtils.minNumberOfSubordinates(managers).getName());
    }
}
