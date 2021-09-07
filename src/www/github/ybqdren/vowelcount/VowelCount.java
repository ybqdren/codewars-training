package www.github.ybqdren.vowelcount;

/**
 * Wen(Joan) Zhao <withzhaowen@126.com>
 * 2021/9/6
 */
public class VowelCount {

    public static void main(String[] args) {
        int count = getCount("I love you. a e i o u");
        System.out.println(count);
    }


    public static int getCount(String str){
        int vowelsCount = 0;

        // a，e，i，o，u
        char[] letters = str.toCharArray();
        for(int i=0 ; i<letters.length ; i++){
            if(32 == letters[i]){ continue; }
            if(isMatch(letters[i])){ vowelsCount += 1; }
        }

        return vowelsCount;
    }

    public static boolean isMatch(char c){
        Boolean result = false;
        if(97 == c || 101 == c || 105 == c || 111 == c || 117 == c){
            result = true;
        }
        return result;
    }
}
