package day_9;

public class HouseWithBuilder {

    private String color = "White";
    private String topRoof = "Red";
    private int windows = 4;
    private int mainDoors = 1;

    //Create constructor from myself
    //Constructor ko cho bên ngoài gọi
    protected HouseWithBuilder(Builder builder) {
        this.color = builder.color;
        this.topRoof = builder.topRoof;
        this.windows = builder.windows;
        this.mainDoors = builder.mainDoors;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "color='" + color + '\'' +
                ", topRoof='" + topRoof + '\'' +
                ", windows=" + windows +
                ", mainDoors=" + mainDoors +
                '}';
    }

    // method chain

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
    // sinh ra object, mà object đó chỉ có ý nghĩa khi được tạo ra bên trong 1 object khác
    // 1 object sinh ra để phục cho 1 đối tượng riêng biệt
    // là 1 object dùng chung => static
    public static class Builder {
        private String color = "White";
        private String topRoof = "Red";
        private int windows = 4;
        private int mainDoors = 1;

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

        // return outer class
        public HouseWithBuilder build() {
            // What is "this" in this case?
            //this: refer to object will be created in the future
            // from class Builder
            return new HouseWithBuilder(this);
        }
    }

}
