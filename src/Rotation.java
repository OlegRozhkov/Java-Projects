public class Rotation {

    static String s1 = "AACCC";
    static String s2 = "CCCAA";

    static boolean searchRotations(String s1, String s2){
        return (s1.length() == s2.length()) &&
               ((s1 + s1).indexOf(s2) != -1);
    }

    public static void main (String[] args){

        if (searchRotations(s1, s2))
            System.out.println("Строки являются вращением друг друга");
        else
            System.out.println("Строки не являются вращением друг друга");
    }

}

