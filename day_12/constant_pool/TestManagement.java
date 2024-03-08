package day_12.constant_pool;

public class TestManagement implements UrlSlug {

    public void testSomething() {
        System.out.println(QA_ENV);
        System.out.println(UrlSlug.STAGING_ENV);

        System.out.println(getQaEnv());

    }

    public static void main(String[] args) {
        new TestManagement().testSomething();
    }

}
