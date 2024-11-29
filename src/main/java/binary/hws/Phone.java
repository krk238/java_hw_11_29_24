package binary.hws;

public class Phone {
    private int screenSize;
    private int batteryLife;
    private int memorySize;
    private String color;
    private double price;
    private String model;
    private int ram;
    private String brand;
    private String camera;

    public void calling() {
        System.out.println("Calling");
    }

    public String texting(String textNow) {
        return textNow;
    }

    public void playMusic() {
        System.out.println("Playing this song");
    }

    public String playVideo() {
        return "Playing video";
    }

    public void chargePhone() {
        System.out.println("Charging Phone");
    }

    public void turnOff() {
        System.out.println("Turning Off");
    }

    public void turnOn() {
        System.out.println("Turning On");
    }

    public int volumeUp(int volumeLevel) {
        return volumeLevel;
    }

    public int volumeDown(int volumeDown) {
        return volumeDown;
    }
}
