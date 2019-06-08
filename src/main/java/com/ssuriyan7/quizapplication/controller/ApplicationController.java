package com.ssuriyan7.quizapplication.controller;

import com.ssuriyan7.quizapplication.entity.Option;
import com.ssuriyan7.quizapplication.entity.Question;
import com.ssuriyan7.quizapplication.entity.Quiz;
import com.ssuriyan7.quizapplication.repository.OptionRepository;
import com.ssuriyan7.quizapplication.repository.QuestionRepository;
import com.ssuriyan7.quizapplication.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://10.160.205.33:4200", maxAge = 3600)
public class ApplicationController {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @PostMapping("/insertQuiz")
    public Quiz insertQuiz(@RequestBody String quizName) {
        return quizRepository.save(new Quiz(quizName));
    }

    @GetMapping("/getQuizes")
    public List<Quiz> getQuizes(){
        return quizRepository.findAll();
    }

    @PostMapping("/insertQuestion")
    public Question insertQuestion(@RequestBody Question question) {
        return questionRepository.save(new Question(question.getQuestionText(), question.getQuiz()));
    }

    @GetMapping("/getQuestions")
    public List<QuestionOutput> getQuestions(@RequestParam("quizid") String quizid) {
        List<Question> questions =  questionRepository.findByQuizId(Integer.parseInt(quizid));

        for (int i = 0; i < questions.size(); i++) {
            List<Option> options = optionRepository.findByQuestionId(questions.get(i).getId());
            questions.get(i).setOptions(options);
            //System.out.println(questions.get(i).getOptions());
        }
        List<QuestionOutput> questionOutputs = new ArrayList<QuestionOutput>();
        for(int i = 0; i < questions.size(); i++) {
            List<OptionOutput> optionOutput = new ArrayList<OptionOutput>();
            List<Option> tempOptions = questions.get(i).getOptions();
            for (int j = 0; j < tempOptions.size();j++) {
                optionOutput.add(new OptionOutput(tempOptions.get(j).getId(),tempOptions.get(j).getOptionText(),tempOptions.get(j).isCorrect(),tempOptions.get(j).getQuestion().getId(),false));
            }
            System.out.println(optionOutput);
            QuestionOutput questionOutput = new QuestionOutput(questions.get(i).getId(),questions.get(i).getQuestionText(),questions.get(i).getQuiz().getId(),optionOutput, questions.size());
            questionOutputs.add(questionOutput);
        }
        return questionOutputs;
    }

    @PostMapping("/insertOption")
    public void insertOption(@RequestBody Option[] options) {
        for (int i = 0; i < options.length; i++) {
            optionRepository.save(new Option(options[i].getOptionText(),options[i].isCorrect(),options[i].getQuestion()));
        }
    }
}
