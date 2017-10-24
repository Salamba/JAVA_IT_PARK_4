package ru.itpark;

public class Parser implements Observable {
    private conclusionSpace ConclusionSpace;
    private conclusionNumber ConclusionNumber;
    private conclusionText ConclusionText;
    private Observer[] observers = new Observer[3];
    private int count = 0;

    public void eventAddText(String Text) {
        for (int i = 0; i < count; i++) {
            observers[i].handleEvent(Text);
        }
    }

    public static class Builder {
        private conclusionText ConclusionText;
        private conclusionNumber ConclusionNumber;
        private conclusionSpace ConclusionSpace;
        private Observer observers[];

        public Builder ConclusionText(conclusionText ConclusionText) {
            this.ConclusionText = ConclusionText;
            return this;
        }

        public Builder ConclusionNumber(conclusionNumber ConclusionNumber) {
            this.ConclusionNumber = ConclusionNumber;
            return this;
        }

        public Builder ConclusionSpace(conclusionSpace ConclusionSpace) {
            this.ConclusionSpace = ConclusionSpace;
            return this;
        }

        public Parser build() {
            return new Parser(this);
        }
    }

    private Parser(Builder builder) {
        if (builder.ConclusionText != null) {
            this.observers[count] = builder.ConclusionText;
            count++;
        }
        if (builder.ConclusionSpace != null) {
            this.observers[count] = builder.ConclusionSpace;
            count++;
        }
        if (builder.ConclusionNumber != null) {
            this.observers[count] = builder.ConclusionNumber;
            count++;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}

