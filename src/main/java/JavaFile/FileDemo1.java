package JavaFile;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

    public static void main(String[] args) {
            // Define the file with the full path
            File f = new File("D:/appium/JavaPrograms/src/test/java/output.txt");

            // Check if the file exists
            if (!f.exists()) {
                try {
                    // If the file doesn't exist, create it
                    boolean created = f.createNewFile();
                    if (created) {
                        System.out.println("File created: " + f.getAbsolutePath());
                    } else {
                        System.out.println("File could not be created.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while creating the file: " + e.getMessage());
                }
            } else {
                System.out.println("File exists: " + f.getAbsolutePath());
            }
        }
    }


