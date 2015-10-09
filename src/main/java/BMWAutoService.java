import javax.inject.Named;

/**
 * Created by sangdn on 10/9/15.
 */
//@Named("bmwAutoService")
public class BMWAutoService implements AutoService {
    public void getService() {
        System.out.println("You chose BMW auto service");
    }
}
