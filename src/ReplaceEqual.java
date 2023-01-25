public class ReplaceEqual {
    public static void main(String[] args){
        StringBuilder sb = compilStr(3, 56);
        System.out.println(sb);
        System.out.println(sb.toString().replaceAll("=", "равно"));
    }

    private static StringBuilder compilStr(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;

    }

        


}
