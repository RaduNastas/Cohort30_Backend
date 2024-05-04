import appServices.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //appServices.Application app = (appServices.Application) context.getBean("app");
        Application app = context.getBean("app", Application.class);
        //((ConfigurableApplicationContext)context).close();

        app.setId(1);
        app.setName("App1");
        System.out.println("Id: " + app.getId());
        System.out.println("Name: " + app.getName());
        //  System.out.println(app.getOneService().getServiceName());

           /*  Service[] services = app.getServices();
       for(Service service : services)
           System.out.println(service.getServiceName());

      */



        // Autowiring

        System.out.println(app.getOneService().getServiceName());
    }
}
