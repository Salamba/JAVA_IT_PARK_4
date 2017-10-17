package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Parser parser = Parser.builder()
            .ConclusionNumber(new conclusionNumber())
            .ConclusionSpace(new conclusionSpace())
            .ConclusionText(new conclusionText())
            .build();
	parser.eventAddText("Salamba, xyli. How are you?");
    }
}
