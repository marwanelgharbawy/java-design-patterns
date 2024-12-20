package strategy;

import strategy.textformatter.*;

public class TestTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setFormatter(new BoldTextFormatter());
        editor.displayText("Testing text in bold formatter");

        editor.setFormatter(new ItalicTextFormatter());
        editor.displayText("Testing text in italic formatter");
    }
}