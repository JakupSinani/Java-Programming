package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Jakup";
        user.password = "123456";

        FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object info saved! ");
    }
}
