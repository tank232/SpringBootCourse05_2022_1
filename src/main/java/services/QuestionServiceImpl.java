package services;

import repositories.QuestionReader;

public class QuestionServiceImpl implements QuestionService {

    private QuestionReader reader;
    private QuestionPrinter printer;

    public QuestionServiceImpl(QuestionReader reader, QuestionPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void printQuestion() {
        var testSuite = reader.getQuestions();
        printer.getQuestions(testSuite);
    }
}
