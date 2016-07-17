import java.util.*;
 
public class prb9084 {
         
    public static void main(String[] args)
    {
        int t;
        int n;
        int amount;
        int[] coin;
        int[] result;
        int[] answer;
        Scanner sc = new Scanner(System.in);
         
        t = sc.nextInt();
        answer = new int[t];
        for(int i=0; i<t; i++)
        {           
            n = sc.nextInt();
            coin = new int[n];
            for(int j=0; j<n; j++)
                coin[j] = sc.nextInt();
             
            amount = sc.nextInt();
            result = new int[amount+1];
            result[0] = 1;
             
            for(int j=0; j<n; j++)
            {
                for(int k=coin[j]; k<=amount; k++)
                {
                    result[k]+=result[k-coin[j]];
                    answer[i] = result[k];
                }
            }
        }       
         
        for(int i=0; i<t; i++)
            System.out.println(answer[i]);
    }
}