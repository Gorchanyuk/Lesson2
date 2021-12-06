package lesson2.springBoot.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController_2 {
    private List<String> valueList = new ArrayList<String>();

    @GetMapping("/value")
    public List<String> getValueList() {
        return valueList;
    }

    @PostMapping("/value")
    public List<String> addToValueList(@RequestParam(value = "name", defaultValue = "DefaultName") String nameValue) {
        valueList.add(nameValue);
        return valueList;
    }

    @DeleteMapping("/value")
    public List<String> deleteFromValueList(@RequestParam(value = "name", defaultValue = "DefaultName") String nameValue) {
        if(!valueList.contains((nameValue))){
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Данное значение не найдено");
        }
        valueList.remove(nameValue);
        return valueList;
    }

//    @GetMapping
//    public String getRequestHeader(@RequestHeader(value = "x-custom-header", defaultValue = "Default Header Name") String customHeader){
//        return customHeader;
//    }

    @GetMapping
    public ResponseEntity<String> getRequestHeader(@RequestHeader(value = "x-custom-header", defaultValue = "Default Header Name") String customHeader){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(customHeader);
    }
}
