public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Lights are turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are turned OFF.");
    }
}
