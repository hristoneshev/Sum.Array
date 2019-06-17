public class Main {

    public static void main(String[] args) {

        int [] array = {3,8,4,11,24,9,54,12};
        int SUM = array [0];
        for (int i=1; i<array.length; i++) {
            SUM += array[i];
        }
        System.out.println("SUM= " + SUM);
    }
}
