package day_9;

public class HouseWithBuilder {

    private String color = "White";
    private String topRoof = "Red";
    public int windows = 4;
    public int mainDoors = 1;

    // method chain

    protected HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.topRoof = builder.topRoof;
        this.windows = builder.windows;
        this.mainDoors = builder.mainDoors;
    }

    // READ-ONLY

    public String getColor() {
        return color;
    }

    public String getTopRoof() {
        return topRoof;
    }

    public int getWindows() {
        return windows;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    // Inner class
    public static class Builder {
        private String color = "White";
        private String topRoof = "Red";
        public int windows = 4;
        public int mainDoors = 1;

        // WRITE ONLY
        public void setColor(String color) {
            this.color = color;
        }

        public void setTopRoof(String topRoof) {
            this.topRoof = topRoof;
        }

        public void setWindows(int windows) {
            this.windows = windows;
        }

        public void setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
        }

        public HouseWithBuilder build() {
            // What is "this" in this case?
            return new HouseWithBuilder(this);
        }
    }

}
