package Chapter1;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise4 {

    @Test
    public void test(){
        File file = new File(".");
        System.out.println("Before sorting");
        Arrays.asList(file.listFiles()).stream().forEach(System.out::println);
        File[] files = file.listFiles();

        Arrays.sort(files, (o1,o2) -> {
                if(o1.isDirectory() && !o2.isDirectory()){
                    return -1;
                }else if(!o1.isDirectory() && o2.isDirectory()){
                    return 1;
                }else{
                    return o1.getName().toLowerCase().compareTo(o1.getName().toLowerCase());
                }
            }
        );

        System.out.println("After sorting");
        Arrays.asList(files).stream().forEach(System.out::println);

    }
}
