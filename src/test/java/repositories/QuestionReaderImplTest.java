package repositories;

import domain.Question;
import org.junit.jupiter.api.Assertions;

import java.util.List;

class QuestionReaderImplTest {


    @org.junit.jupiter.api.Test
    void getQuestions() {
        QuestionReader questionReader = new QuestionReaderImpl();
        questionReader.setFileName("src/main/resources/questions.csv");
        List<Question> questions = questionReader.getQuestions();
        Assertions.assertEquals(5, questions.size());
    }
}