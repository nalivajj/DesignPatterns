package patterns.creational.factory;

public class Blog extends Website {
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
