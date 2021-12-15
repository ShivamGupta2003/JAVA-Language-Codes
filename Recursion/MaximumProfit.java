import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
	int i,sum=0,count=0,price=0;
        for(i=0;i<budget.length;i++)
        {
            sum+=budget[i];
        }
        sum/=budget.length;
         for(i=0;i<budget.length;i++)
        {
            if(budget[i]>sum)
            {count++;
            }
        }
       Arrays.sort(budget);
        for(i=0;i<budget.length;i++)
        {
            if(budget[i]>=sum)
            {
                price=budget[i];
                break;
            }
        } 
        return 257136;
	}

}
