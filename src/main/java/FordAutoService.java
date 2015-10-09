import javax.inject.Named;

/**
 * Created by sangdn on 10/9/15.
 */

//@Named("fordAutoService")
public class FordAutoService implements AutoService {
    public void getService() {
        System.out.println("You chose Ford auto service");
    }
}
