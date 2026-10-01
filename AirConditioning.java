public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Aircon is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Aircon is turned OFF.");
    }
}
