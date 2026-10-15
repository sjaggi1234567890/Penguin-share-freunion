package freunion.com.freunion;
import freunion.com.freunion.User;
import freunion.com.freunion.repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// for testinng
@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(repository userRepository) {
        return args -> {
            if (userRepository.findByUsername("sumit").isEmpty()) {
                User user = new User();
                user.setUuid(101L);
                user.setUsername("sumit");
                user.setMobile(9876543210L);
                user.setEmail("sumit@freunion.com");

                userRepository.save(user);
                System.out.println("succesfully entered to database ");
            } else {
                System.out.println(">>> Unsuccesful as data might already exist");
            }
        };
    }
}
