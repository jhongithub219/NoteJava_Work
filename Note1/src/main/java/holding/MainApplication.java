package holding;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication.run(MainApplication.class,args);
        System.out.println("Running");
    }
}
