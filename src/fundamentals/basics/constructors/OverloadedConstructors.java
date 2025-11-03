public class OverloadedConstructors {
    public static void main(String[] args){
        // overloaded constructors = Allow a class to have multiple constructors with different parameter lists.
        // Enable objects to be initialized in various ways.

        User user1 = new User("Cronos");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        User user2 = new User("Zeus", "test@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        User user3 = new User("Hades", "hades@gmail.com", 27);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
