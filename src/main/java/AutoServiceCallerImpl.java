import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by sangdn on 10/9/15.
 */
public class AutoServiceCallerImpl implements AutoServiceCaller{

    @Inject
    private AutoService bmwAutoService;



    @Inject
    private AutoService fordAutoService;

    public AutoServiceCallerImpl() {
    }

    public void callAutoService() {
        // get bmw's auto service
        bmwAutoService.getService();

        // get ford's auto service
        fordAutoService.getService();

    }
}

