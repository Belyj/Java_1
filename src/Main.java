import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Belyj on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет, Мир!");
        // Задание 1
        int celo4islennoe = 10;
        byte bait = 127;
        short korotkoe = 1;
        long dlinnoe = 1111111111111L;
        float f = 1.456f;
        double drobnoe = 1.123456789;
        char symbol = 'a';
        boolean flag = true;

        System.out.println("Результат работы метода result = " + (celo4islennoe = result(1, 2, 3, 4)));
        System.out.println("Результат работы метода summ = " + (flag = summ(celo4islennoe, celo4islennoe)));
        year();
    }

    //задание 2
    public static int result(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    //задание 3
    static boolean summ(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    //задание 4
    static void year() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        try {
            a = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int A = Integer.parseInt(a);
        if (A % 4 > 0) {
            System.out.println("В году 365 дней");
        } else if (A % 4 == 0) {
            if (A % 400 == 0) {
                System.out.println("Год високосный");
            } else if (A % 100 == 0) {
                System.out.println("В году 365 дней");
            } else System.out.println("Год високосный");
        }
    }

}
