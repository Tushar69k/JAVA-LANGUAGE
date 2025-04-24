package Exam.Done.FileIO;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;

import java.io.*;
import java.util.Scanner;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        // Creating File
        File f = new File("FileMission");
        f.createNewFile();

        // Writing in File
        FileWriter fw = new FileWriter("FileMission");
        fw.write("\t\t\t\tVande Matram\n\n\n\nWelcome Commander ! Are you Sure you are Ready for Mission...\n\n\n If you're Sure than We will meet Soon...");
        fw.close();

        // Reading File
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
