import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        Random rnd = new Random();


        for (int i = 0; i < 20; i++) {
            l1.add(rnd.nextInt(50));
        }

        for (int i = 0; i < 20; i++) {
            l2.add(rnd.nextInt(50));
        }

        l1.forEach(h -> System.out.print(h+" "));
        System.out.println();
        l2.forEach(h -> System.out.print(h+" "));
        System.out.println();

        l1.removeAll(l2);
        l1.forEach(h -> System.out.print(h+" "));

        l2.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });

        System.out.println(l2);
        
        Collections.sort(l1);
        System.out.println(l1);
        

    }

}
        
