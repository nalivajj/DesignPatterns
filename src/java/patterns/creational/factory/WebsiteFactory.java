package patterns.creational.factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case Blog: {
                return new Blog();
            }
            case Shop: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
