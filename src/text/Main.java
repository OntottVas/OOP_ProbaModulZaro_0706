package text;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> barmi = new ArrayList<>();
        barmi.add("NEM TUDOM HOGY EZ 25 KARAKTER É ADASDSDSASDADAD");

        System.out.println("Valami");

        Text.stringListChanger(barmi);

        System.out.println(barmi);

    }
}
