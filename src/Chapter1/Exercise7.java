package Chapter1;

import org.junit.Test;


public class Exercise7 {

    @Test
    public void test(){
        new Thread(andThen(
                () -> System.out.println("r1"),
                () -> System.out.println("r2")
        )).start();
    }

    public static Runnable andThen(Runnable r1, Runnable r2){
        return () -> {
                r1.run();
                r2.run();
            };
    }
}
