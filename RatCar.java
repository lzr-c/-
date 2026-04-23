import java.util.ArrayList;
import java.util.List;

public abstract class RatCar implements Rat, Car {
    protected String name;
    protected final int initialVelocity;
    protected double velocity;
    protected double currentPosition;
    protected List<String> stomachC = new ArrayList<>();

    public RatCar(String name, int initialVelocity) {
        this.name = name;
        this.initialVelocity = initialVelocity;
        this.velocity = initialVelocity;
        this.currentPosition = 0;
    }

    @Override
    public void move(int seconds) {
        this.currentPosition += this.velocity * seconds;
    }

    @Override
    public double getPosition() {
        return this.currentPosition;
    }

    @Override
    public double getVelocity() {
        return this.velocity;
    }

    @Override
    public void reset() {
        this.velocity = this.initialVelocity;
    }

    @Override
    public void eat(String food) {
        stomachC.add(food);
        if (food.equals("紅蘿蔔")) {
            effect();
        }
        if (stomachC.size() > 5) {
            pupu();
        }
    }

    @Override
    public void pupu() {
        System.out.println(name + " 棒賽！拉出" + stomachC);
        stomachC.clear();
        reset();
    }

    protected abstract void effect();
}