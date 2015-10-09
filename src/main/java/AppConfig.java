import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;

/**
 * Created by sangdn on 10/9/15.
 */
@Configuration
public class AppConfig {

    @Bean
    public BMWAutoService bmwAutoService(){
        return new BMWAutoService();
    }

    @Bean
    public FordAutoService fordAutoService(){
        return new FordAutoService();
    }

    @Bean( name = "autoServiceCaller")
    public  AutoServiceCaller autoServiceCaller(){
        return new AutoServiceCallerImpl();
    }

}
