package services;


import domain.Question;

import java.util.List;

public interface QuestionPrinter {
    void getQuestions(List<Question> questions);
}
