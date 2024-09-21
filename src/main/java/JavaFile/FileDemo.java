package JavaFile;

import java.io.File;

public class FileDemo {

    public static void main(String[] args){

        File f = new File("output.txt");
        System.out.println(f.getAbsolutePath());
    }

}
