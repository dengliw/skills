package 阿里模拟;
/*就不能再摘比这棵树结的桃子少的树上的桃子。那么小猴子最多能摘到几颗桃子呢？
举例说明，比如有5棵树，分别结了10，4，5，12，8颗桃子，
那么小猴子最多能摘3颗桃子，来自于结了4，5，8颗桃子的桃树。*/
import java.util.*;
public class Main {
/** 请完成下面这个函数，实现题目要求的功能 **/
/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
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


