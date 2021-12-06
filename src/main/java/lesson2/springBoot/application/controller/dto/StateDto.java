package lesson2.springBoot.application.controller.dto;

import java.util.List;

public class StateDto {
    private String value_1;
    private String value_2;
    private List<String> stringList;

    public StateDto(List<String> stringList) {
        this.stringList = stringList;
    }

    public StateDto(String value_1, String value_2) {
        this.value_1 = value_1;
        this.value_2 = value_2;

    }

    public StateDto() {
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public String getValue_1() {
        return value_1;
    }

    public void setValue_1(String value) {
        this.value_1 = value;
    }

    public String getValue_2() {
        return value_2;
    }

    public void setValue_2(String value_2) {
        this.value_2 = value_2;
    }
}
