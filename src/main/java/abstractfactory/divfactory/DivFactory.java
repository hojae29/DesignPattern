package abstractfactory.divfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class DivFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
