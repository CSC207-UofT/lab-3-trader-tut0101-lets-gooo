public class SpaceShuttle implements Tradable, Drivable {
    private int maxSpeed;

    public SpaceShuttle() {
        this.maxSpeed = 28000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 100;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 100;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSped;
    }

    @Override
    public int getPrice() {
        return 170000000;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
}
