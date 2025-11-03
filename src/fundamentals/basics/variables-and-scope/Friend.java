public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    //if your working with a static attribute you do not need to use this
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends!");
    }
}
