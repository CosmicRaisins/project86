public class Exhaust extends SimpleMod {

    private final int soundModifier;
    private final int horsePowerGain;
    private final MatType material;

    public Exhaust(int price, String name, int soundModifier, int horsePowerGain, MatType material) {
        super(price, name);
        this.material = material;
        this.soundModifier = soundModifier;
        this.horsePowerGain = horsePowerGain;
    }

    public Exhaust(int price, String name, int soundModifier, int horsePowerGain) {
        this(price, name, soundModifier, horsePowerGain, MatType.UNKNOWN);
    }
}
