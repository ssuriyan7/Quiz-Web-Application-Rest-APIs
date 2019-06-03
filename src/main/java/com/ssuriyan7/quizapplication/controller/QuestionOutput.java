package com.ssuriyan7.quizapplication.controller;

import java.util.List;

class QuestionOutput {
    int questionId;
    String questionText;
    int quizId;
    List<OptionOutput> options;

    public QuestionOutput() {
    }

    public QuestionOutput(int questionId, String questionText, int quizId, List<OptionOutput> options) {
        this.questionId = questionId;
        this.quizId = quizId;
        this.questionText = questionText;
        this.options = options;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<OptionOutput> getOptions() {
        return options;
    }

    public void setOptions(List<OptionOutput> options) {
        this.options = options;
    }
}
