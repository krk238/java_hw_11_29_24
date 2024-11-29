package binary.hws;

public class Laptop {
    private String os;
    private double price;
    private int rating;
    private String processor;
    private int ram;
    private int screenSizeArea;

    public String switchON() {
        return "Computer is now ON!";
    }

    public String switchOff() {
        return "Computer is now OFF";
    }

    public void openApp(String appName) {
        System.out.println("Opening: " + appName);
    }

    public void closeApp(String appName) {
        System.out.println("Closing: " + appName);
    }
}
