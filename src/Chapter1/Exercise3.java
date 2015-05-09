package Chapter1;

import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

public class Exercise3 {

    @Test
    public void test(){
        File file = new File(".");
        String extension = "iml";

        File[] files = listFiles(file, extension);
        List<File> fileList = Arrays.asList(files);

        fileList.stream().forEach(System.out::println);

        String retrievedFileName = fileList.get(0).getName();
        assertEquals(extension, retrievedFileName.substring(retrievedFileName.indexOf(".") + 1));
    }

    private File [] listFiles(File directory, String extenstion){
        return directory.listFiles((dir, name) -> name.endsWith(extenstion));
    }

}
