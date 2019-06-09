package com.ssuriyan7.quizapplication.repository;

import com.ssuriyan7.quizapplication.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result,Integer> {
    List<Result> findByQuizId(int quizId);
}