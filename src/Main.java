// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bicycle forward = new Bicycle("Forward");
        Car bmw = new Car("BMW x5");
        Car saab = new Car("Saab 98");
        Truck scania = new Truck("Scania");
        Truck volvo = new Truck("Volvo", 8);

        Transport[] transports = {
                forward,
                bmw,
                saab,
                scania,
                volvo
        };

        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports) {
            serviceStation.check(transport);
        }
    }
}