package com.jimboidin.chapter10;
import java.io.*;


/*
    Try This 10-1

    Compare two files

    To use this program, specify the names of the
    files to be compared on the command line.

    java CompFile FIRST.TXT SECOND.TXT
 */

public class CompFiles {
    public static void main(String[] args){
        args = new String[]{"FIRST.TXT", "src/com/jimboidin/chapter10/THIRD.TXT"};
        int  i=0, j=0;
        File file = new File("name");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(file.getAbsolutePath());

        if (args.length != 2){
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }


        // Compare the files
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])){

            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j) System.out.println("Files differ");
            else System.out.println("Files are the same");
        }
        catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }



    }
}
