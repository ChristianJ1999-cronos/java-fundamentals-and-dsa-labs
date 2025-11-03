package Super;

public class Super {
    public static void main(String[] args){
        // SUPER = Refers to the parent class (subclass <- superclass)
        //    used in constructors and method overriding
        //    calls the parent constructor to initialize attributes

        Person person = new Person("Hulk", "Smash");
        person.showName();
        Student student = new Student("Cronos", "Time", 3.6);
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();

        Employee employee = new Employee("Tony", "Stark", 10000);
        employee.showName();
        employee.showSalary();
    }
}
