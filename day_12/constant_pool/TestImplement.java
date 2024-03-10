package day_12.constant_pool;

public class TestImplement implements UrlSlug {

    public static void main(String[] args) {
        TestImplement testUrl = new TestImplement();
        testUrl.printQaUrl();
        testUrl.printStagingUrl();

        System.out.println(testUrl.getUrl(QA_ENV));
    }

    public void printQaUrl() {
        System.out.println(QA_ENV);
    }

    public void printStagingUrl() {
        System.out.println(STAGING_ENV);
    }


}
