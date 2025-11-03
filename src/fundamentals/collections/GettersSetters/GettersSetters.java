package GettersSetters;

public class GettersSetters {
    public static void main(String[] args){
        // help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Audi", "Black", 65000);

        car.setColor("blue");
        car.setPrice(-100);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }
}
