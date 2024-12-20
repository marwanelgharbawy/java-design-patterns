package builder.meal;

public class Shawerma {
    private String core;
    private String sauce;
    private String extra;

    public void setCore(String core) {
        this.core = core;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Shawerma:\n" +
                "core: " + core +
                ", sauce: " + sauce +
                ", extra: " + extra;
    }
}
