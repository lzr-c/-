public class PoliceCar extends RatCar {
    public PoliceCar(String name) {
        super(name, 14);
    }

    @Override
    protected void effect() {
        this.velocity += 5;
    }
}