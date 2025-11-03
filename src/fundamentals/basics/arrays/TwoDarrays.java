public class TwoDarrays {
    public static void main(String[] args){
        //2D array = An array where each element is an array. useful for storing a matrix of data.

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] veggies = {"potatoes", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//
//        String[][] groceries = {
//                {"apple", "orange", "banana"},
//                {"potatoes", "onion", "carrot"},
//                meats
//        };
//
//        groceries[0][0] = "lemon";
//        groceries[1][0] = "lime";
//        groceries[2][1] = "eggs"; //to modify you need to list both indices
//
//
//        for(String[] foods: groceries){
//            for(String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }


        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };


        for(char[] row: telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
