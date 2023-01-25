public class Entry {

    static String s1 = "Hello";
    static String s2 = "Hello";
    public static void main(String[] args){
        
        CharSequence seq = "Hello";
        boolean bool = s1.contains(seq);
        System.out.println(bool);
    
        boolean sqFound = s1.contains("x");
        System.out.println(sqFound);
    }

}

