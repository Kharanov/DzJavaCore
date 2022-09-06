package DZ2;

public class ArrayNorm {
    public void ArrayN(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int sizeA = 4;
        int sizeB = 4;
        int sum = 0;
        if (array.length != sizeA) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != sizeB) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array.length; j++) {
                int element;
                try {
                    element = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Oshibka dannuh v elemente " + i + "," + j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        System.out.println(sum);
    }

}
