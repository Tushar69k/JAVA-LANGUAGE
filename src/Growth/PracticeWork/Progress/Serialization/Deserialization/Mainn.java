package Growth.PracticeWork.Progress.Serialization.Deserialization;

import java.io.*;

public class Mainn {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Userr ua = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\TUSHAR\\JAVA LANGUAGE\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ua = (Userr) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Name of User is : " + ua.name);
        System.out.println("Password is : " + ua.password);
        ua.Hello();
    }


}
