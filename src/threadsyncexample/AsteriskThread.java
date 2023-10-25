
package threadsyncexample;

import java.util.Random;

public class  AsteriskThread implements Runnable
{
    private final String name; 
    
    public AsteriskThread(String taskName)
    {
        name = taskName; 
    }
    public void run()
    {
        Random rn = new Random(); 
        
        try 
        {
            synchronized (System.out) 
            {
                for (int i = 0; i < 5; i++)
                {
    //                System.out.printf("$%s$\n", Thread.currentThread().getName()); 
                    System.out.printf("*"); 
                    Thread.sleep(rn.nextInt(50));
                }
                //System.out.println();
            }
            
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }
    
}
