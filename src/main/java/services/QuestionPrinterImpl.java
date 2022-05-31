package services;


import domain.Question;

import java.util.List;

public class QuestionPrinterImpl implements QuestionPrinter {

    public void getQuestions(List<Question> questions) {
        questions.forEach(ts -> System.out.println(ts.toString()));
    }
}
