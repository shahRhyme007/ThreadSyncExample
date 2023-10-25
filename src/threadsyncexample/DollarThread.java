
package threadsyncexample;

import java.util.Random;

public class DollarThread implements Runnable
{
    private final String name; 
    
    public DollarThread(String taskName)
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
                    System.out.printf("$"); 

                    Thread.sleep(rn.nextInt(50));
                }
                //System.out.println();
            }
            
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        //System.out.printf("%s is done sleeping", name); 
    }
    
}
