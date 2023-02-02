import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Homework5
 */
public class Homework5 {

    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<>();


        hm.put(0, "Иванов Иван Иванович 28 м");
        hm.put(1, "Петров Фома Петрович 32 м");
        hm.put(2, "Круглова Жанна Сергеевна 20 ж");
        hm.put(3, "Сидоров Ян Геннадиевич 42 м");
        hm.put(4, "Иванова Яна Олеговна 34 ж");


        List<Map.Entry<Integer, String>> list = new ArrayList<>(hm.entrySet());

		int cnt = 1;
		for (Map.Entry<Integer, String> entry : list) {
			String[] parts = entry.getValue().split(" ");
			String surname = parts[0];
			String init = parts[1].charAt(0) + "." + parts[2].charAt(0) + ".";
			String age = parts[3];
			String gender = parts[4];
			System.out.println(cnt + ". " + surname + " " + init + " " + age + " " + gender.toUpperCase());
			cnt++;


    }
}
}

