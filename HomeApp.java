public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        homeInterface.turnOnAll();
        System.out.println();
        homeInterface.turnOffAll();

    }
}
