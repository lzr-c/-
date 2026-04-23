public class Ambulance extends RatCar {
    public Ambulance(String name) {
        super(name, 11);
    }

    @Override
    protected void effect() {
        this.velocity += 2;
    }
}