import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/11/23 0023 19:05
 */

@RestController
@EnableAutoConfiguration
public class Example extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Example.class);
    }

    @RequestMapping(value = "/")
    String home() {
        return "Hello World From Tomcat!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
