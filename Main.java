package ����ģ��;
/*�Ͳ�����ժ���������������ٵ����ϵ����ӡ���ôС���������ժ�����������أ�
����˵����������5�������ֱ����10��4��5��12��8�����ӣ�
��ôС���������ժ3�����ӣ������ڽ���4��5��8�����ӵ�������*/
import java.util.*;
public class Main {
/** ������������������ʵ����ĿҪ��Ĺ��� **/
/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
    static int pick(int[] peaches) {
        int[] d = new int[peaches.length];
        d[0] = 1;
        int i = 0;
        int j = 0;
        int t = 0;
        for ( i = 0; i< peaches.length; i++)
        {
           for(j = 0; j < i; j++)
           	{    
        	   if(peaches [ i ] > peaches[ j ] && d[ i ] < d[ j ] + 1)
           			{
        		   		d[i] = d[j] + 1;
        		   		if( t < d[ i ])
        		   			t = d[ i ];
           			}
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


