package strategy.textformatter;

public class ItalicTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "_" + text + "_";
    }
}