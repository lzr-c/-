public interface Food {
    String name();

    void effect(RatCar car);
}

class Carrot implements Food {
    @Override
    public String name() {
        return "胡蘿蔔";
    }

    @Override
    public void effect(RatCar car) {
        if (car instanceof GarbageTruck) {
            car.velocity += 4;
            System.out.println("垃圾車正在吃紅蘿蔔！");
        } else if (car instanceof Ambulance) {
            car.velocity += 2;
            System.out.println("救護車正在吃紅蘿蔔！");
        } else if (car instanceof PoliceCar) {
            car.velocity += 5;
            System.out.println("警車正在吃紅蘿蔔！");
        }
    }
}

class Lettuce implements Food {
    @Override
    public String name() {
        return "生菜";
    }

    @Override
    public void effect(RatCar car) {
        if (car instanceof GarbageTruck) {

            System.out.println("垃圾車正在吃生菜！");
        } else if (car instanceof Ambulance) {
            System.out.println("救護車正在吃生菜！");
        } else if (car instanceof PoliceCar) {
            System.out.println("警車正在吃生菜！");
        }
    }
}