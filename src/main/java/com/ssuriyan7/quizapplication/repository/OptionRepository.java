package com.ssuriyan7.quizapplication.repository;

import com.ssuriyan7.quizapplication.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option,Integer> {
    List<Option> findByQuestionId(int questionId);
}
