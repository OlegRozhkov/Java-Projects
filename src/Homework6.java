import java.util.HashMap;

public class Homework6 {
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object PRESENT  = new Object();
    public static void main(String[] args) {
        add(10);
        add(14);
        add(16);
        add(22);
        add(27);

        System.out.println(getString());
        System.out.println(getkey(0));
        System.out.println(getkey(4));
    }

    private static int getkey(int num) {
        return (Integer)hashMap.keySet().toArray()[num];
    }

    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, PRESENT);
    }            
}  