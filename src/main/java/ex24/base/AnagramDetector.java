package ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String w1, String w2){

        char[] array_w1 = w1.toLowerCase().toCharArray();
        char[] array_w2 = w2.toLowerCase().toCharArray();

        Arrays.sort(array_w1);
        Arrays.sort(array_w2);

        if(w1.length() != w2.length()){
            return false;
        }

        for(int i = 0; i < w1.length(); i++ ){
            if(array_w1[i] != array_w2[i]){
                return false;
            }
        }

        return true;
    }
}
