package day_12.constant_pool;

public class TestWithoutImplement {

    public static void main(String[] args) {
        TestWithoutImplement test = new TestWithoutImplement();

        test.printQaUrl();
        test.printStagingUrl();

        //Create an anonymous class to use the Interface
        UrlSlug testUrl = new UrlSlug() {
            @Override
            public String getUrl(String url) {
                return UrlSlug.super.getUrl(url);
            }
        };

        System.out.println(testUrl.getUrl(UrlSlug.STAGING_ENV));

    }

    public void printQaUrl() {
        System.out.println(UrlSlug.QA_ENV);
    }

    public void printStagingUrl() {
        System.out.println(UrlSlug.STAGING_ENV);
    }
}
