package www.github.ybqdren.findtheparityqutlier;

/**
 * Wen(Joan) Zhao <withzhaowen@126.com>
 * 2021/9/7
 */
public class FindTheParityOutlier_2 {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 0, 100, 4,  2602, 11, 36};
//        int[] arr = {160, 3, 1719, 19, 11, 13, -21};
        int[] arr = {12,1719,6};
//        int[] arr = {13,18,11};
        int result = find(arr);
        System.out.println(result);
    }

    // odd % 2 !=0
    // even % 2 == 0
   public static int find(int[] integers){
        // 1.首先先确定这是一个大部分奇数数组 还是 偶数数组
        // 2.在通过下标的遍历寻找到与这个数组格格不入的那个数字
        // 3.找到后直接返回
       boolean preParity = false;
       for(int i=0 ; i<integers.length ; i++){
           if(parity_check(integers[i]) == parity_check(integers[i+1]) ){
               preParity = parity_check(integers[i]);
           }else{
               if(i==0){
                    return parity_check(integers[0]) == parity_check(integers[2]) ? integers[1] : integers[0];
               }

               return parity_check(integers[i]) == preParity ? integers[i+1] : integers[i];
           }
       }

       return 0;
   }

    static boolean parity_check(int num){
        if(num % 2 == 0) {return true;};
        return false;
    }

}
