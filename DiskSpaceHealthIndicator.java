import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DiskSpaceHealthIndicator implements HealthIndicator {

    public Health health(){

    }
}
