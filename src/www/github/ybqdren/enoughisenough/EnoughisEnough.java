package www.github.ybqdren.enoughisenough;

/**
 * @author Wen(Joan) Zhao
 * @version v1.0
 * @description
 * https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
 **/
public class EnoughisEnough {
    public static void main(String[] args) {
//        int[] result = deleteNth(new int[] {20,37,20,21}, 1);
        int[] result = deleteNth(new int[] {1,1,3,3,7,2,2,2,2},3);
        System.out.print("[");
        for(int r : result){
            System.out.print(r+" ");
        }
        System.out.print("]");
    }

    // 根据数字的出现次数返回多少的数字，如果存在个数小于这个出现次数的就返回全部
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
     /*   // 定义一个数组 用来确定数组中元素出现的次数
        int[] count = new int[getMax(elements)];
        int[] result = new int[elements.length];

        for(int i=0 ; i<elements.length ; i++){
            count[elements[i]] += 1;
        }

        // 对数组进行遍历
        int index = 0;
        int size = 0;
        for(int i=0 ; i<count.length ;i++){
            if(count[i] >= maxOccurrences){
                result[index++] = i;
                size ++;
            }
        }

        int[] arr = new int[size];
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = result[i];
        }

        return arr;*/
        return null;
    }


    //获取数组中的最大值
    public static int getMax(int[] elements){
        int maxValue = 0;
        for(int i=0 ; i<elements.length ; i++){
              for(int j=i+1 ; j<elements.length ; j++){
                  if(elements[j] > maxValue){
                      maxValue = elements[j];
                  }
              }
        }
        return maxValue+1;
    }
}
