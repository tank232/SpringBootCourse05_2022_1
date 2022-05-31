package repositories;


import domain.Question;

import java.util.List;

public interface QuestionReader {
    List<Question> getQuestions();
    void setFileName(String fileName);
}
