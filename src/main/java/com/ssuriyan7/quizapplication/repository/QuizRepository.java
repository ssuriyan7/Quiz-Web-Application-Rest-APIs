package com.ssuriyan7.quizapplication.repository;

import com.ssuriyan7.quizapplication.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
