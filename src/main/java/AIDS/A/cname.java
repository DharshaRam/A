package AIDS.A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cname {

    @GetMapping("/")
    public String getMethodName() {
        return "Hello World";
    }
}