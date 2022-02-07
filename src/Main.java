import lesson1.*;
import lesson2.*;
public class Main {
    public static void main(String[] args) {

        String[][] testCase1 = new String[][] {
                {"1","1","2","2"},
                {"2","3","4","5"},
                {"2","1","4","4"},
                {"1","12","8","2"}};

        try{
            System.out.println(ArParsSum.arrSum(testCase1));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Срока: "+e.getRow()+". Ряд: "+e.getColumn());
        }
/////////////////////////////////////////////////////////////////////////////////////////
        String[][] testCase2 = new String[][] {
                {"1","1","2","2"},
                {"2","3","4","5"},
                {"2","1","4","4"}};

        try{
            System.out.println(ArParsSum.arrSum(testCase2));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Срока: "+e.getRow()+". Ряд: "+e.getColumn());
        }
//////////////////////////////////////////////////////////////////////////////////////////
        String[][] testCase3 = new String[][] {
                {"1","1","2","2"},
                {"2","3","4","5","3"},
                {"2","1","4","4"},
                {"1","12","8","2"}};

        try{
            System.out.println(ArParsSum.arrSum(testCase3));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Срока: "+e.getRow()+". Ряд: "+e.getColumn());
        }
///////////////////////////////////////////////////////////////////////////////////////////
        String[][] testCase4 = new String[][] {
                {"1","1","2","2"},
                {"2","3","Обана!","5"},
                {"2","1","4","4"},
                {"1","12","8","2"}};

        try{
            System.out.println(ArParsSum.arrSum(testCase4));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.err.println("Срока: "+(e.getRow()+1)+". Ряд: "+(e.getColumn()+1));
        }

    }




}
