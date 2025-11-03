public class ArrayOfObj {
    public static void main(String[] args){

//        AutoCar car1 = new AutoCar("Audi", "Red");
//        AutoCar car2 = new AutoCar("Merc", "White");
//        AutoCar car3 = new AutoCar("Honda", "Blue");
//
//        AutoCar[] cars = {car1, car2, car3};

        AutoCar[] cars = {
                new AutoCar("Audi", "Red"),
                new AutoCar("Merc", "White"),
                new AutoCar("Honda", "Blue")
        };

//        for(int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }
//
//        System.out.println();
//
//        for(AutoCar car: cars){
//            car.drive();
//        }

        for(AutoCar car : cars){
            car.color = "black";
        }

        for(AutoCar car : cars){
            car.drive();
        }

    }
}
