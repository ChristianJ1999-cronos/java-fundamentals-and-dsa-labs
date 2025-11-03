public class Static {
    public static void main(String[] args){
        // static = makes a variable or method belong to the class rather than to any specific object.
        // commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Cronos");
        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);

        Friend friend2 = new Friend("Gaea");
        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);

        Friend friend3 = new Friend("Zeus");
        System.out.println(friend3.name);
        System.out.println(Friend.numOfFriends); // actually better to use the name of the class for clarity to use the class for a static member.

        Friend.showFriends();


    }
}
