package adapter;

public class PrintV1BannerV1 extends Banner implements PrintV1 {

    public PrintV1BannerV1(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
