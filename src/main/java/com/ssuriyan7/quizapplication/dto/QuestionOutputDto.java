package com.ssuriyan7.quizapplication.dto;

import java.util.List;

public class QuestionOutputDto {
    int questionId;
    String questionText;
    int quizId;
    int count;
    List<OptionOutputDto> options;

    public QuestionOutputDto() {
    }

    public QuestionOutputDto(int questionId, String questionText, int quizId, List<OptionOutputDto> options, int count) {
        this.questionId = questionId;
        this.quizId = quizId;
        this.questionText = questionText;
        this.count = count;
        this.options = options;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public List<OptionOutputDto> getOptions() {
        return options;
    }

    public void setOptions(List<OptionOutputDto> options) {
        this.options = options;
    }
}
