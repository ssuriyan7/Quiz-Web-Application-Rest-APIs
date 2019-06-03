package com.ssuriyan7.quizapplication.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "options")
public class Option implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "optionId")
    private int id;

    @Column(name = "optionText")
    private String optionText;

    @Column(name = "correct")
    private boolean correct;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "questionId", referencedColumnName = "questionId", nullable = false)
    private Question question;

    @Column(name = "selected")
    @Transient
    private boolean selected;

    public Option() {
    }

    public Option(String optionText, boolean correct, Question question) {
        this.optionText = optionText;
        this.correct = correct;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", optionText='" + optionText + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                '}';
    }
}
