public class Recursion {
    public static void main(String[] args) {
    String s = "Hello world\n";
    System.out.print(s);
        
    if(s.length() > 0) {
        reverseString(s, s.length() - 1);
    }
    }
    public static void reverseString(String s, int index) {
    if(index == 0) {
        System.out.println(s.charAt(index));
            
         return;
    }
    System.out.print(s.charAt(index));
    reverseString(s, index - 1);
    }
}