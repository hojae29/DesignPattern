package adapter;

public class Main {
    public static void main(String[] args) {
        PrintV1 p = new PrintV1BannerV1("Hello");
        p.printWeak();
        p.printStrong();
    }
}
