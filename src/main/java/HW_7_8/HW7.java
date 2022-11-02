package HW_7_8;

public class HW7 {
    /**Задача №1

     Необходимо создать класс Employee со следующими методами:
     getBaseSalary - получить базовую ставку
     set Base Salary
     getName - получить имя
     setName
     getSalary - получить зарплату


     Задача №2

     Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

     Необходимо создать класс Manager в который нужно добавить следующие методы:
     getNumberOfSubordinates - получить количество подчиненных
     setNumberOfSubordinates

     в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> /
     100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

     Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать
     результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
     то результат как у обычного рабочего.

     Задача №3

     Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс MonthUtils
     который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).


     Задача №4

     Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
     Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.


     Задача №5

     Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
     Все поля сделать приватными и для каждого поля добавить методы set и get.
     Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
     К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


     Задача №6

     Необходимо расширить утилитарный класс EmployeeUtils из прошлого задания следующими методами:
     поиск наименьшего количества подчиненных в массиве менеджеров
     поиск наибольшего количества подчиненных в массиве менеджеров
     поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров


     Задача №7

     https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
     https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
     https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
     https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
     https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java


     Задача №1

     Необходимо реализовать задание из Task#7 со следующими условиями:
     Employee.getSalary должен быть абстрактный
     Worker.getBaseSalary должен быть финальным
     Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
     Класс Director должен быть финальным


     Задача №2

     Необходимо реализовать задание из Task#7 со следующими условиями:
     Класс Month сделать неизменяемым (immutable)
     Статические поля с объектами месяцев должны быть финальными
     Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
     Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
     Классы Worker и Director должны быть финальными



     Задача №3

     Необходимо класс Employee заменить на интерфейс IEmployee и добавить IManager, все параметры утилитарных методов сделать типа IEmployee и IManager соответственно.


     Задача №4

     https://www.codewars.com/kata/576bb71bbbcf0951d5000044
     https://www.codewars.com/kata/56f699cd9400f5b7d8000b55
     https://www.codewars.com/kata/559590633066759614000063



     */


}