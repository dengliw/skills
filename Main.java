package ����ģ��;
/*�Ͳ�����ժ���������������ٵ����ϵ����ӡ���ôС���������ժ�����������أ�
����˵����������5�������ֱ����10��4��5��12��8�����ӣ�
��ôС���������ժ3�����ӣ������ڽ���4��5��8�����ӵ�������*/
import java.util.*;
public class Main {
/** ������������������ʵ����ĿҪ��Ĺ��� **/
/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
    static int pick(int[] peaches) {
        
        int i = 0;
        int j = 0;
        int k = 1;
        int t = 1;
        int n = 0;
        for ( i = 0; i< peaches.length; i++)
        {
        	n = peaches [ i ];
            if(t < k)
               t = k;
               k = 1;
           for(j = i + 1; j < peaches.length; j++)
           {    
           if(n < peaches[ j ])
               k++;
           n = peaches[ j ];
           }
            
           
        }
    
    return t;
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


