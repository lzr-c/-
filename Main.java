import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RatCar> cars = new ArrayList<>();
        cars.add(new PoliceCar("警車"));
        cars.add(new GarbageTruck("垃圾車"));
        cars.add(new Ambulance("救護車"));

        Competition competition = new Competition(cars);
        competition.start();
    }
}
