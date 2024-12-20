package strategy.textformatter;

public class BoldTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "**" + text + "**";
    }
}