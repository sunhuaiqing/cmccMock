package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String userName;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String passWord;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, String> getDatainfo() {
        return datainfo;
    }

    public void setDatainfo(Map<String, String> datainfo) {
        this.datainfo = datainfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;
    private Map<String, String> datainfo = new HashMap<>();
}
