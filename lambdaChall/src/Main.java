import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(List.of(
           "MaRk","BArBaRa","KeVIN","DoNNa","DaYMon","KaYaK"
        ));
        nameList.replaceAll(s -> s.toUpperCase());
        nameList.forEach(s -> System.out.println(s));

        nameList.replaceAll(t -> {
            Random random = new Random();
            char initial = (char)(random.nextInt(26)+'a');
            for (int i = 0; i < nameList.size(); i++) {
                System.out.println(nameList.get(i) + " " + initial) ;
            }

            return t;
        });

        System.out.println("-".repeat(30));
        nameList.replaceAll(w -> {
            String lastName = "";
            String fullName = "";
            for(int i=w.length()-1 ;i>=0; i--){
                lastName += nameList.get(i) +" " + w.charAt(i);


            }
            return lastName;
        });

        nameList.forEach(w -> System.out.println(w));

    }
}