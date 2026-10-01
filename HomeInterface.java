public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService aircon;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.aircon = new AirConditioning();
    }

    public void turnOnAll() {
        System.out.println("Turning ON ALL Home Services");
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning OFF ALL Home Services");
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}
