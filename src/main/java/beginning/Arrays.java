package beginning;

public class Arrays {
    public static void main(String[] args) {

//        int [] intArray = new int[5];
//        intArray[0] = 5;
//        intArray[1] = 6;
//        intArray[2] = 7;
        int [][] twoDArray = new int[3][3];
        twoDArray [0][0] = 1;
        twoDArray [0][1] = 2;
        twoDArray [0][2] = 3;

        twoDArray [1][0] = 4;
        twoDArray [1][1] = 5;
        twoDArray [1][2] = 6;

        twoDArray [2][0] = 7;
        twoDArray [2][1] = 8;
        twoDArray [2][2] = 9;

        for (int i = 0; i < twoDArray.length; i++) {
            System.out.println();
            for (int j = 0; j < twoDArray[i].length; j++){
                System.out.print(twoDArray[i][j]+"");

            }
        }


    }

}

