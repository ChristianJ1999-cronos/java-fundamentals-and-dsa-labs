public class Constructors {
    public static void main(String[] args){
        // constructor = a special method to initialize objects. You can pass arguments to a constructor and set up initial values.

        Students student1 = new Students("Cronos", 26, 3.6, true);
        Students student2 = new Students("gaea", 27, 3.2, false);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//        System.out.println(student2.isEnrolled);

        Students student3 = new Students("Zeus", 17, 2.8, true);

//        System.out.println(student3.name);
//        System.out.println(student3.age);
//        System.out.println(student3.gpa);
//        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

    }
}
