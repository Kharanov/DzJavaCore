package DZ2;

public class Main {
    private static void printSum(String array[][]) {
        ArrayNorm arrayNorm = new ArrayNorm();
        try {
            arrayNorm.ArrayN(array);


        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        String[][] array1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "8", "7", "6"}, {"5", "4", "3", "2"}};
        String[][] array2 = {{"7", "3"}, {"2", "4"}, {"9", "1"}, {"5", "6"}};
        String[][] array3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "8", "z", "6"},{"9", "8", "8", "6"}};
        printSum (array1);
        printSum(array2);
        printSum(array3);



    }
}




