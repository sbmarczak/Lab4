// Klasa TestCar
public class TestCar {
    public static void main(String[] args) {
        // Tworzenie obiektów klasy Car
        Car car1 = new Car("Opel", "Zafira", 2006, 4, 1.9, 6800);
        Car car2 = new Car("Alfa", "Romeo", 2019, 4, 2.2, 10300);
        Car car3 = new Car("Chevrolet", "Captiva", 2021, 2, 2.0, 24900);

        // Tworzenie tablicy obiektów klasy Car
        Car[] cars = {car1, car2, car3};

        // Iteracja przez tablicę i wyświetlanie informacji o każdym samochodzie
        for (Car car : cars) {
            car.wyswietlInformacje();
            System.out.println("---");
        }
    }
}
