package www.github.ybqdren.regexvalidatepincode;

/**
 * @author Wen(Joan) Zhao
 * @version v1.0
 * @description
 **/
public class RegexValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin("12345"));
    }

    public static boolean validatePin(String pin) {
        char[] chars = pin.toCharArray();
        if(!(chars.length == 4 || chars.length == 6)){ return false; }

        for(int i=0 ; i<chars.length ; i++){
            if(!Character.isDigit(chars[i])){ return false; }
        }

        return true;
    }
}
