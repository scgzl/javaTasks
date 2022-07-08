package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println("romanToInt(\"MCMXCIV\") = " + romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(s.length()-1));
        //"MCMXICV"
        for (int i = s.length()-2; i >= 0; i--) {
            if(romanMap.get(s.charAt(i))<romanMap.get(s.charAt(i+1))){
                result-=romanMap.get(s.charAt(i));
            }
            else {
                result+=romanMap.get(s.charAt(i));
            }

        }

        return  result;
    }
}
