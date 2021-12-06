package lesson2.springBoot.application.controller;

import lesson2.springBoot.application.controller.dto.StateDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private String state_1 = "Empty";
    private String state_2 = "Empty2";



    @PostMapping("/state")
    public void state(@RequestBody StateDto request) {
        state_1 = request.getValue_1();
        state_2 = request.getValue_2();
    }

    @GetMapping("/state")
    public String state() {
        return state_1 + " " + state_2;
    }

}
