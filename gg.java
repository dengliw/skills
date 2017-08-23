package 阿里模拟;
/*就不能再摘比这棵树结的桃子少的树上的桃子。那么小猴子最多能摘到几颗桃子呢？
举例说明，比如有5棵树，分别结了10，4，5，12，8颗桃子，
那么小猴子最多能摘3颗桃子，来自于结了4，5，8颗桃子的桃树。*/
import java.util.*;
public class gg {
/** 请完成下面这个函数，实现题目要求的功能 **/
/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int pick(int[] peaches) {
        
    	int[] dp = new int[peaches.length];
        dp[0] = 1;
        for (int i = 1; i < peaches.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {

                 if( (peaches[i]>peaches[j])){
                     if(temp<dp[j])
                     temp = dp[j];
                     }
                 }
                 dp[i] = temp+1;
            }

        int maxLength = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
            }
        }
        //System.out.println(maxLength);
        return maxLength;
    }
      public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}


