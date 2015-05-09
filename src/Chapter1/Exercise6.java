package Chapter1;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise6 {

    @Test
    public void test(){
        new Thread(uncheck( () ->{
            System.out.println("hello");
            Thread.sleep(1000);
        })).start();

//        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Future future = executorService.submit(uncheck( () -> {
//            System.out.println("hello 2");
//            Thread.sleep(1000);
//        }));

    }

//    public static Callable<Void> uncheck(Callable<Void> runner){
//        return () ->{
//            try {
//                runner.call();
//            } catch (Exception e) {
//            }
//        };
//    }

    public static Runnable uncheck(RunnableEx runner){
        return () ->{
            try {
                runner.run();
            } catch (Exception e) {
            }
        };
    }

    @FunctionalInterface
    public interface RunnableEx{
        public void run() throws Exception;
    }

}
