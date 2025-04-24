//Not Done
package Growth.NotDone;

import java.io.*;

public class File {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please provide a filename as a command-line argument.");
            return;
        }

        String filename = args[0];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter(filename);

        System.out.println("Enter text (type 'stop' to finish):");

        String line;
        while (!(line = br.readLine()).equalsIgnoreCase("stop")) {
            fw.write(line + "\n");
        }

        fw.close();
        System.out.println("Data written to file: " + filename);
    }
}



