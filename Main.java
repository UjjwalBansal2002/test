// class Person {
//     public void occupation() {
//         System.out.println("Undefined occupation");
//     }
// }

// class Employee extends Person {
//     @Override
//     public void occupation() {
//         System.out.println("Employee");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Person person = new Person();
//         Employee employee = new Employee();

//         person.occupation(); // Output: Undefined occupation
//         employee.occupation(); // Output: Employee
//     }
// }

// Base class
class Base {
    private int baseValue;


    public Base(int baseValue) {
        this.baseValue = baseValue;
        System.out.println("Base class constructor called with baseValue: " + baseValue);
    }
}


class Derived extends Base {
    private int derivedValue;

    // Parameterized constructor
    public Derived(int baseValue, int derivedValue) {
        super(baseValue);
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with derivedValue: " + derivedValue);
    }
}

public class Main {
    public static void main(String[] args) {

        Derived derivedObj = new Derived(10, 20);
    }
}