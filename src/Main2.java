import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {
    public static Double cenaBrutto(Double cena) {
        return cena*1.23;
    }
    public static void main(String[] args) {

        HashMap<String, Double> Owoce = new HashMap<String, Double>();
        Owoce.put("Mango", (double) 9);
        Owoce.put("Kokos", (double) 12);
        Owoce.put("Limonka", (double) 2);
        System.out.println(Owoce);
        List<String> nazwyOwoców = new ArrayList<>();
                nazwyOwoców.add("Mango");
                nazwyOwoców.add("Kokos");
                nazwyOwoców.add("Limonka");
      Double cenaSumaryczna = 0.0;
      for(Integer i =0; i<3; i++) {
          cenaSumaryczna += cenaBrutto(Owoce.get(nazwyOwoców.get(i)));
      }
    System.out.println("Cena twoich zakupów to: " +cenaSumaryczna.toString());
    }
}
