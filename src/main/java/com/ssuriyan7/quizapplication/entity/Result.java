package com.ssuriyan7.quizapplication.entity;

import javax.persistence.*;

@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "score")
    private int score;

    @ManyToOne
    private Quiz quiz;

    public Result() {
    }

    public Result(String userName, int score, Quiz quiz) {
        this.userName = userName;
        this.score = score;
        this.quiz = quiz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", score=" + score +
                ", quiz=" + quiz +
                '}';
    }
}