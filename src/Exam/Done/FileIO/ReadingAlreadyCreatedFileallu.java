package Exam.Done.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingAlreadyCreatedFileallu {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("allu");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            System.out.println(st);
        }
        sc.close();

    }
}
