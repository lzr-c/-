public class GarbageTruck extends RatCar {
    public GarbageTruck(String name) {
        super(name, 8);
    }

    @Override
    protected void effect() {
        this.velocity += 4;
    }
}