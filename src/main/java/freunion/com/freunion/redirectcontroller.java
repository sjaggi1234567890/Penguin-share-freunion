package freunion.com.freunion;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class redirectcontroller{
@GetMapping("/")
public String index(){
    return "index";
}


@GetMapping("/login")


    public String login() {
        return "login";
    }



@GetMapping("/register")

    public String register() {
        return "register";
    }

    @GetMapping("/registration")

    public String registration() {
        return "registration";
    }
@GetMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }


@GetMapping("profile")
public String profile(){
        return "profile";
    }}
