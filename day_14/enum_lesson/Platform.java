package day_14.enum_lesson;

public enum Platform {

    IOS("ios", "12"),
    ANDROID("android", "34");

    private String platform;
    private String version;


    Platform(String platform, String version) {
        this.platform = platform;
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public String getVersion() {
        return version;
    }
}
