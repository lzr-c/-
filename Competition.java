import java.util.List;

public class Competition {
    private List<RatCar> cars;
    private double end;
    private int time;

    public Competition(List<RatCar> cars) {
        this.cars = cars;
        this.end = 4000;
        this.time = 0;
    }

    public void start() {

        System.out.println("比賽開始！");
        while (true) {
            time++;
            if (time % 10 == 0)
                checkFood();
            for (RatCar car : cars)
                car.move(1);
            if (cars.stream().anyMatch(c -> c.getPosition() >= end))
                break;
        }

        System.out.println("比賽結束！");
        for (RatCar car : cars)
            System.out.println(car.name + "跑了 " + car.getPosition() + " 公尺");
    }

    private void checkFood() {
        double maxPosition = cars.stream().mapToDouble(RatCar::getPosition).max().orElse(0);
        double minPosition = cars.stream().mapToDouble(RatCar::getPosition).min().orElse(0);

        Food lettuce = new Lettuce();
        Food carrot = new Carrot();
        System.out.println("第 " + time + " 秒，食物出現！");
        for (RatCar car : cars) {
            if (car.getPosition() == maxPosition) {
                car.eat(lettuce);
            } else if (car.getPosition() == minPosition) {
                car.eat(carrot);
            }
        }
        for (RatCar car : cars) {
            System.out.println(car.name + "當前位置：" + car.getPosition());
        }
        System.out.println("--------------------");
    }
}
