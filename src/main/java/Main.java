import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("./spring-context.xml");
        var questionService = ctx.getBean("QuestionService",services.QuestionService.class);
        questionService.printQuestion();
    }
}
