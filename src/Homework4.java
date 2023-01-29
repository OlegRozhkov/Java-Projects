import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Homework4 {
    
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String str = "";
        try {
            // FileWriter writer = new FileWriter("HW4.sql");
            // writer.append("Hello");
            // writer.flush();

            FileReader reader = new FileReader("HW4.sql");
            while (reader.ready()) {
                str += (char)reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] strings = str.split("\n");
        for (int i = 0; i < strings.length; i++) {
            String[] tmp = strings[i].split(" ");
            family.add(tmp[0]+" ");
            name.add(tmp[1].substring(0, 1)+ ".");
            soname.add(tmp[2].substring(0, 1)+ "." + " ");
            age.add(Integer.parseInt(tmp[3]));
            gender.add(tmp[4].equals("Ж")?true:false);
            index.add(i);

            System.out.println(tmp[0] + " " + tmp[1].charAt(0) + "." + tmp[2].charAt(0) + "." + " " + tmp[3] + " " + tmp[4]);
        }

        ArrayList<String> tmp = new ArrayList<>(name);

        Collections.sort(tmp);

        for (int i = 0; i < tmp.size(); i++) {
            int j = name.indexOf(tmp.get(i));
            index.set(i, j);
        }

        index.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                return o2-o1;
        }        
        });

        for (int i = 0; i < index.size(); i++) {
            System.out.print(family.get(i)+" ");
            System.out.print(name.get(index.get(i))+" ");
            System.out.print(soname.get(i)+" ");
            System.out.print(age.get(i).toString()+" ");
            System.out.print((gender.get(i) ? "M" : "Ж"));
            System.out.println();

        }

    }
}
