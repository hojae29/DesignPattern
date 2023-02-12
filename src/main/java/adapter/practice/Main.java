package adapter.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIo f = new FileProperties();

        String path = "src/main/java/adapter/practice/";

        try {
            f.readFromFile(path + "file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile(path + "newfile.txt");
            System.out.println("newfile.txt is created.");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
