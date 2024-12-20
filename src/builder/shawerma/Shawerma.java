package builder.shawerma;

public class Shawerma {
    private String meat;
    private String sauce;
    private String extra;

    public void setMeat(String meat) {
        this.meat = meat;
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
                "meat: " + meat +
                ", sauce: " + sauce +
                ", extra: " + extra;
    }
}
