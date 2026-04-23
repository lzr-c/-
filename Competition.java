import java.util.HashMap;
import java.util.Map;

public class Competition {
    public static void main(String[] args) {
        Map<RatCar, Double> distanceMap = new HashMap<>() {
            {
                put(new PoliceCar("警車"), 0.0);
                put(new GarbageTruck("垃圾車"), 0.0);
                put(new Ambulance("救護車"), 0.0);
            }
        };

        double end = 4000;
        int time = 0;

        while (distanceMap.values().stream().allMatch(d -> d < end)) {
            if (time > 0 && time % 10 == 0) {
                checkFood(distanceMap);
            }
            for (RatCar ratCar : distanceMap.keySet()) {
                ratCar.move(1);
                distanceMap.put(ratCar, ratCar.getPosition());
            }
            time++;
        }

        System.out.println("比賽結束！");
        for (RatCar ratCar : distanceMap.keySet()) {
            System.out.println(ratCar.name + "跑了 " + distanceMap.get(ratCar) + " 公尺");
        }
    }

    public static void checkFood(Map<RatCar, Double> distanceMap) {
        double maxPosition = distanceMap.values().stream().max(Double::compare).get();
        double minPosition = distanceMap.values().stream().min(Double::compare).get();
        for (RatCar ratCar : distanceMap.keySet()) {
            if (distanceMap.get(ratCar) == maxPosition) {
                ratCar.eat("生菜");
            }
            if (distanceMap.get(ratCar) == minPosition) {
                ratCar.eat("紅蘿蔔");
            }
        }
    }
}
