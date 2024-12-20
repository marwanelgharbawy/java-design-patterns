package strategy.textformatter;

public class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void displayText(String text) {
        System.out.println(formatter.format(text));
    }
}