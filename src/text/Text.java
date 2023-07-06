package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {

    public static void main(String[] args) {
        List<String> barmi = new ArrayList<>(Arrays.asList("Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
        ));

        System.out.println(barmi);

        Text.stringListChanger(barmi);

        System.out.println(barmi);

    }

    public static void stringListChanger(List<String> stringList) {
        String tmp = "";
        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).length() > 25) {
                tmp = stringList.get(i).substring(0,20) + "...";
                stringList.set(i, tmp);
            }
        }
    }

}
