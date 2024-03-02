package day_9;

public class HouseWithBuilder_MethodChains {

    private String color = "White";
    private String topRoof = "Red";
    private int windows = 4;
    private int mainDoors = 1;

    //Create constructor from myself
    //Constructor ko cho bên ngoài gọi
    protected HouseWithBuilder_MethodChains(Builder builder) {
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
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setTopRoof(String topRoof) {
            this.topRoof = topRoof;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        // return outer class
        public HouseWithBuilder_MethodChains build() {
            // What is "this" in this case?
            //this: refer to object will be created in the future
            // from class Builder
            return new HouseWithBuilder_MethodChains(this);
        }
    }

}
