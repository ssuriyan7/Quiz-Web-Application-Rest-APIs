package com.ssuriyan7.quizapplication.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quizes")
public class Quiz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quizId")
    private int id;

    @Column(name = "quizName")
    private String quizName;

    public Quiz() {
    }

    public Quiz(String quizName) {
        this.quizName = quizName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", quizName='" + quizName + '\'' +
                '}';
    }
}
