package lesson2;


import java.text.ParseException;

public class ArParsSum {

    private static final int ARR_SIZE = 4;

    private static void checkArr (String[][] check) throws MyArraySizeException {
        if(check.length!=ARR_SIZE){
            throw new MyArraySizeException("Число строк не равно 4");
        }else{
            for (int i = 0; i < check.length; i++) {
                if(check[i].length!=ARR_SIZE) {
                    throw new MyArraySizeException("Число элементов в строке №"+(i+1)+" не равно 4");
                }
            }
        }
    }

    private static int[][] parseArr(String[][] check) throws MyArrayDataException{
        int[][] parsed = new int[ARR_SIZE][ARR_SIZE];
        for (int i = 0; i <ARR_SIZE ; i++) {
            for (int j = 0; j <ARR_SIZE ; j++) {
                try {
                   parsed [i][j]=Integer.parseInt(check[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Не удалось перевести в число элемент:",i,j);
                }

            }

        }
        return parsed;
    }

    public static int arrSum(String[][] check){
        checkArr(check);
        int[][] parsed = parseArr(check);
        int sum=0;
        for (int i = 0; i <ARR_SIZE ; i++) {
            for (int j = 0; j <ARR_SIZE ; j++) {
                sum+=parsed[i][j];
            }

        }
        return sum;

    }
}
