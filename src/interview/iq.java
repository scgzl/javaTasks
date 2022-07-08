package interview;

import java.util.HashMap;
import java.util.Map;

public class iq {
    public static void main(String[] args) {

        String a = "hello how are you";
        String[] split = a.split(" ");

        HashMap<String, Map > map = new HashMap<String,Map>();


        for (int i = 0; i < split.length; i++) {
            int count = 1;
            for (int j = 0; j < split.length; j++) {
                if(split[i] ==split[j]){
                    count++;
                }

            }


        }


    }
}
