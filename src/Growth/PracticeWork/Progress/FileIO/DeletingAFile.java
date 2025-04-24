package Growth.PracticeWork.Progress.FileIO;

import java.io.File;

public class DeletingAFile {
    public static void main(String[] args) {
        File f = new File("Bakchod");

        if (f.delete()) {
            System.out.println("Bakchodi Khatam File " + f.getName() + " Deleted");
        } else {
            System.out.println("Bakchodi Nhi RUk Payi");
        }

    }


}
