package lesson2.springBoot.application.starturl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartUrl {
//    @Autowired
    @Value("${mynum}")
    public int state;
    @GetMapping
    public String start() {
        return " Hello world";
    }
    @GetMapping(value = "/state")
    public int qwe(){
        return state;
    }
}
