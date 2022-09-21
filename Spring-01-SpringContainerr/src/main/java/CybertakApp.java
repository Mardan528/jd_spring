import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertakApp {

    public static void main(String[] args) {


        //BeanFactory container=new ClassPathXmlApplicationContext("config.xml");

        // do same thing
        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor= (Mentor) container.getBean("fullTimeMentor");
        // this way no need to down casting
        Mentor mentor2=container.getBean("partTimeMentor",Mentor.class);
       // Mentor mentor2= (Mentor) container.getBean("partTimeMentor");

        mentor.createAccount();
        mentor2.createAccount();


    }
}
