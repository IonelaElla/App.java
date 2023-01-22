package ro.siit.gad.session8;

import java.io.*;

public class BankEmulator {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("jamesB", "goldeEye123@", "1234432156789876", "367", "6512");

        try {
            ObjectOutputStream storage = new ObjectOutputStream(new FileOutputStream("data" + File.separator + "storage.data"));
            storage.writeObject(userInfo);
            System.out.println(userInfo);

            ObjectInputStream storageReader = new ObjectInputStream(new FileInputStream("data" + File.separator + "storage.data"));
            UserInfo userInfoRead = (UserInfo) storageReader.readObject();
            System.out.println(userInfoRead);
            System.out.println(File.separator);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
