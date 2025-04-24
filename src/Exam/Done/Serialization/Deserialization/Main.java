package Exam.Done.Serialization.Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User ua = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\TUSHAR\\JAVA LANGUAGE\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ua = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Name of User is : " + ua.name);
        System.out.println("Password is : " + ua.password);
        ua.Hello();
    }


}
