package Exam.Done.Serialization.Serializationn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {

        User u = new User();

        u.name = "Tushar";
        u.password = "69696969";


        FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(u);
        out.close();
        fileout.close();

        System.out.println("Object Info Saved :)");
    }
}
