package threadsyncexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSyncExample 
{
    public static void main(String[] args) 
    {
        DollarThread task1 = new DollarThread("task1"); 
        DollarThread task2 = new DollarThread("task2"); 
        DollarThread task3 = new DollarThread("task3"); //these are my runnable objects 
        AsteriskThread task4 = new AsteriskThread("task4"); 
        AsteriskThread task5 = new AsteriskThread("task5"); 
        AsteriskThread task6 = new AsteriskThread("task6"); 
        
        ExecutorService executorService = Executors.newCachedThreadPool(); 
        //System.out.println(executorService);
        
        //System.out.printf("starting executor \n"); 

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.execute(task6);
        
        executorService.shutdown();
        //System.out.printf("task started, main ends\n"); 
    }
    
}
