import javax.lang.model.element.NestingKind;

// TODO: Make TODO list

public class Unicorn implements Domesticatable, Drivable, Tradable{
    private int max_speed;

    public Unicorn() {this.max_speed = 100000; // Set this.max_speed to 100000
    }@Override
    public String sound() {return "Magical Noises"; // Return "Magical Noises"
    }@Override
    public void upgradeSpeed() {max_speed += 1; // Add one to max_speed
    }@Override
    public void downgradeSpeed() {this.max_speed -= 1; // Add one to max_speed
    }

    /** A getter for max_speed
     * @return max_speed
     */
    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }



    @Override
    public int getPrice() // Returns an Int
    {
        return 100000;
    }




    @Override
    public String toString() // Returns a string
    {
        String id = super.toString();
        return id + " (Max speed: " + this.max_speed +")";
    }
}
