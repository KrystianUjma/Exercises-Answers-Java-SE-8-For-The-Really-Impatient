package Chapter1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

    @Test
    public void run(){
        String[] names = { "Peter", "Paul", "Mary" };
        List<Runnable> runners = new ArrayList<>();
        for (String name : names)
            runners.add(() -> System.out.println(name));
//        for (int i = 0; i < names.length; i++) {
//  Can't print i because i is not effectively final - it changes in every iteration of loop
//        runners.add(() -> System.out.println(i));


        runners.stream().forEach(Runnable::run);
        }



    }

