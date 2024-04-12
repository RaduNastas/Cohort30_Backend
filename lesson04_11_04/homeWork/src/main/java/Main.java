import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Application app = (Application) context.getBean("app");
        Application app = context.getBean("app", Application.class);
        //((ConfigurableApplicationContext)context).close();

        app.setId(1);
        app.setName("App1");
        System.out.println("Id: " + app.getId());
        System.out.println("Name: " + app.getName());
    }
}
