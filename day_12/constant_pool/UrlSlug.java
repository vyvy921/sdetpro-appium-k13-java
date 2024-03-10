package day_12.constant_pool;

public interface UrlSlug {

    String QA_ENV = "qa.com";
    String STAGING_ENV = "staging.com";

    String BASE_URL = "sdetpro/";

    default String getUrl(String url) {

        return BASE_URL.concat(url);
    }

}
