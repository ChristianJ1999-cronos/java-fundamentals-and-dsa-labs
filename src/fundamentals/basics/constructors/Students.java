public class Students {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Students(String name, int age, double gpa, boolean isEnrolled){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void study(){
        System.out.println(this.name + " is studying!");
    }

}
