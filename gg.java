package ����ģ��;
/*�Ͳ�����ժ���������������ٵ����ϵ����ӡ���ôС���������ժ�����������أ�
����˵����������5�������ֱ����10��4��5��12��8�����ӣ�
��ôС���������ժ3�����ӣ������ڽ���4��5��8�����ӵ�������*/
import java.util.*;
public class gg {
/** ������������������ʵ����ĿҪ��Ĺ��� **/
/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
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


