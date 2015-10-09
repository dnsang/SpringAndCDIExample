import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sangdn on 10/9/15.
 */
public class App {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AutoServiceCaller autoServiceCaller = context.getBean("autoServiceCaller", AutoServiceCaller.class);
        autoServiceCaller.callAutoService();
    }
}
