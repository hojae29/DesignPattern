package adapter;

public class PrintV1BannerV2 extends PrintV2 {

    private Banner banner;

    public PrintV1BannerV2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
