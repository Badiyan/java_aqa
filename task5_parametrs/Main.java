import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        int d = random.nextInt(100);

        int sumAB = a + b;
        int sumCD = c + d;


        System.out.printf("sumAB = %d sumCD= %d ; sumAB>sumCD - " +
                        (sumAB>sumCD),
                sumAB, sumCD);

        System.out.printf("\nsumAB = %d sumCD= %d ; sumAB>sumCD - " +
                        (sumAB++>(sumCD = sumCD-2)),
                sumAB, sumCD);

        System.out.println("\nAt least one sum is even - " +
                (sumAB % 2 == 0 || sumCD % 2 == 0));





    }

}
