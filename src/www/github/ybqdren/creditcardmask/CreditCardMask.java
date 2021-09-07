package www.github.ybqdren.creditcardmask;

import java.util.Arrays;

/**
 * Wen(Joan) Zhao <withzhaowen@126.com>
 * 2021/9/7
 */
public class CreditCardMask {
    public static void main(String[] args) {
        String s1 = maskify("4556364607935616"); // should return "############5616"
        System.out.println(s1);
        String s2 = maskify("64607935616");      // should return "#######5616"
        System.out.println(s2);
        String s3 = maskify("1");
        System.out.println(s3);// should return "1"
        String s4 = maskify("");
        System.out.println(s4);// should return ""

        // "What was the name of your first pet?"
        String s5 = maskify("Skippy");
        System.out.println(s5);// should return "##ippy"
        String s6 = maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
        System.out.println(s6);
    }

    public static String maskify(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for(int i = chars.length-1 ; i>=0 ; i--){
            if(i < chars.length-4 ){
                chars[i] = '#';
            }
            result = chars[i]+result;
        }

        return result;

    }
}
