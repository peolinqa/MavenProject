package HW_7_8;

public class EmployeeUtils {

    public static IManager[] managers = {
            new Manager("Alex", 33, 'M', 150, 12),
            new Manager("Mila", 38, 'F', 175, 15),
            new Manager("Lola", 44, 'F', 225, 24),
            new Manager("Ryan", 49, 'M', 300, 55),
    };

    public static IManager[] getManagers() {
        return managers;
    }

    // поиск сотрудника в массиве по его имени
    public static Worker findWorkerByName(Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }
        }
        return null;
    }

    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Worker findWorkerBySubName(Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }

    // подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double salarySum(Worker[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum = sum + workers[i].getBaseSalary();
        }
        return sum;
    }

    // подсчет наименьшей зарплаты в массиве
    public static double minSalary(Worker[] workers) {
        double min = 0;
        for (int i = 0; i < workers.length; i++) {
            min = Math.min(min, workers[i].getBaseSalary());
        }
        return min;
    }

    // подсчет наибольшей зарплаты в массиве
    public static double maxSalary(Worker[] workers) {
        double max = 0;
        for (int i = 0; i < workers.length; i++) {
            max = Math.max(max, workers[i].getBaseSalary());
        }
        return max;
    }

    // поиск наименьшего количества подчиненных в массиве менеджеров
    public static IManager minNumberOfSubordinates(IManager[] managers) {
        IManager min = null;
        for (int i = 0; i < managers.length; i++) {
            if (min == null || min.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                min = managers[i];
            }
        }
        return min;
    }

    // Там где мы используем тип, мы используем интерфейс, где мы создаем инстанс, мы используем класс, который имплементируем

    // поиск наибольшего количества подчиненных в массиве менеджеров
    public static IManager maxNumberOfSubordinates(IManager[] managers) {
        IManager max = null;
        for (int i = 0; i < managers.length; i++) {
            if (max == null || max.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max;
    }

    // поиск наибольшего и наименьшего количества подчиненных в массиве менеджеров
//    public static IManager minMaxNumberOfSubordinates(IManager[] managers) {
//
//        int minSub = managers[0].getNumberOfSubordinates();
//        int maxSub = managers[0].getNumberOfSubordinates();
//
//        for (int i = 0; i < managers.length; i++) {
//            if (managers[i].getNumberOfSubordinates() < minSub) {
//                minSub = managers[i].getNumberOfSubordinates();
//            }
//            return minSub;
//
//            if (managers[i].getNumberOfSubordinates() > maxSub) {
//                maxSub = managers[i].getNumberOfSubordinates();
//            }
//            return maxSub;
//        }
//
//    }

    // поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    // поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
}
