/**
 * represent a Simple mod
 */
public abstract class SimpleMod implements Mod {
    private final int price;
    private final String name;

    /**
     * constructs a SimpleMod object.
     * @param price the price of the mod
     * @param name the name of the mod
     */
    public SimpleMod(int price, String name) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negati.");
        }
        this.name = name;
    }

    /**
     * gets the price of the mod.
     * @return the price of the mod as an int
     */
    public int getPrice() {
        return price;
    }

    /**
     * gets the name of the mod.
     * @return the name of the mod as a String
     */
    public String getName() {
        return name;
    }
}
