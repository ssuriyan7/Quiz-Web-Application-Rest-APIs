package com.ssuriyan7.quizapplication.controller;

class OptionOutput {
    int optionId;
    String optionText;
    boolean correct;
    int questionId;
    boolean selected;

    public OptionOutput(int optionId, String optionText, boolean correct,int questionId, boolean selected) {
        this.optionId = optionId;
        this.optionText = optionText;
        this.correct = correct;
        this.questionId = questionId;
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "OptionOutput{" +
                "optionId=" + optionId +
                ", optionText='" + optionText + '\'' +
                ", correct=" + correct +
                ", questionId=" + questionId +
                ", selected=" + selected +
                '}';
    }

    public boolean isSelected() {
        return selected;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public OptionOutput() {
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
