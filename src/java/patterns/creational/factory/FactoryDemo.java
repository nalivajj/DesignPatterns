package patterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.Blog);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.Shop);
        System.out.println(website.getPages());
    }
}
