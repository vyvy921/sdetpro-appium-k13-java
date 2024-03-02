package day_9;

public class House_MethodChains {

    private String color;
    private String roofTop;
    private int windows;
    private int mainDoors;

    public House_MethodChains() {
    }

    public House_MethodChains setColor(String color) {
        this.color = color;
        return this;
    }

    public House_MethodChains setRoofTop(String roofTop) {
        this.roofTop = roofTop;
        return this;
    }

    public House_MethodChains setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public House_MethodChains setMainDoors(int mainDoors) {
        this.mainDoors = mainDoors;
        return this;
    }

    @Override
    public String toString() {
        return "House_MethodChains{" +
                "color='" + color + '\'' +
                ", roofTop='" + roofTop + '\'' +
                ", windows=" + windows +
                ", mainDoors=" + mainDoors +
                '}';
    }

    public static void main(String[] args) {
        House_MethodChains house = new House_MethodChains();
        house
                .setColor("Blue")
                .setMainDoors(2)
                .setRoofTop("Violet")
                .setWindows(8);

        System.out.println(house);
    }

}
