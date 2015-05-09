package Chapter1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Exercise2 {

    @Test
    public void test(){

        File file = new File(".");
        File[] files;

        files = file.listFiles(pathname -> pathname.isDirectory());
        assertFalse(Arrays.asList(files).isEmpty());

        files = file.listFiles(File::isDirectory);
        assertFalse(Arrays.asList(files).isEmpty());

    }

}
