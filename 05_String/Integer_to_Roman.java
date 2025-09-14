import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class Integer_to_Roman {

    public static void main(String[] args) {
        String roman = intToRoman(1994); // MCMXCIV

        System.out.println(roman);

        String roman2 = intToRoman2(1994); // MCMXCIV

        System.out.println(roman2);

    }

    private static String intToRoman(int num) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        List<String> mapKey = new ArrayList<>(map.keySet());
        StringBuilder str = new StringBuilder("");
        if (num != 0) {
            for (int i = mapKey.size() - 1; i >= 0; i--) {
                int times = num / map.get(mapKey.get(i));
                if (times == 0) {
                    continue;
                } else {
                    for (int k = 0; k < times; k++) {
                        str.append(mapKey.get(i));
                    }
                }
                num = num % map.get(mapKey.get(i));
            }
        }
        return str.toString();
    }

    private static String intToRoman2(int num) {
        String[] SYMBOLS = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] VALUES = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                str.append(SYMBOLS[i]);
                num -= VALUES[i];
            }
        }
        return str.toString();
    }

}
