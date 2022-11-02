package HW_7_8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeeUtilsTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("EmployeeUtilsTest.setUp ...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("EmployeeUtilsTest.tearDown ...");
    }

    @Test
    public void testGetManagers() {
        System.out.println("EmployeeUtilsTest.testGetManagers ...");
    }

    @Test
    public void testFindWorkerByName() {
        System.out.println("testFindWorkerByName ...");
    }

    @Test
    public void testFindWorkerBySubName() {
        System.out.println("testFindWorkerBySubName ...");
    }

    @Test
    public void testSalarySum() {
        System.out.println("testSalarySum ...");
    }

    @Test
    public void testMinSalary() {
        System.out.println("testMinSalary ...");
    }

    @Test
    public void testMaxSalary() {
        System.out.println("testMaxSalary ...");
    }

    @Test
    public void testMinNumberOfSubordinates() {
        System.out.println("testMinNumberOfSubordinates ...");
    }

    @Test
    public void testMaxNumberOfSubordinates() {
        System.out.println("testMaxNumberOfSubordinates ...");
    }
}