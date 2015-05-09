package Chapter1;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

import static junit.framework.Assert.*;

public class Exercise1 {

    @Test
    public void test(){
        Integer[] array = new Integer[]{1, 8, 4, 6, 5, 2};
        final long threadId = Thread.currentThread().getId();
        CopyOnWriteArraySet<Long> threads = new CopyOnWriteArraySet();

        Arrays.sort(array, (i1, i2) -> {
            threads.add(threadId);
            return i1.compareTo(i2);
        });

        assertEquals(threadId, threads.toArray()[0]);

        threads.clear();

        Arrays.parallelSort(array, (i1, i2) -> {
            threads.add(threadId);
            return i1.compareTo(i2);
        });

        assertEquals(threadId, threads.toArray()[0]);


    }
}
