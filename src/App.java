import java.util.Arrays;
import java.util.Random;

public class App{

    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        int b = Integer.toBinaryString(i).length();
        int cnt = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%b == 0) cnt++;
        }

        int[] a1 = new int[cnt];
        cnt = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%b == 0) a1[cnt++] = j;
        }

        int[] a2 = new int[cnt];
        cnt = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%b == 0) a2[cnt++] = j;
        }


        System.out.println(i);
        System.out.println(b);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
