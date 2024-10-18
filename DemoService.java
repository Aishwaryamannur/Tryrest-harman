import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {


    @Autowired
    RestTemplate restTemplate;

    @CircuitBreaker
    public String hell(){
        return restTemplate.getForObject("http://get.values",String.class);

    }
}
