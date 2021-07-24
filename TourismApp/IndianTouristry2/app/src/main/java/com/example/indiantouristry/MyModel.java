package com.example.indiantouristry;

public class MyModel {
    String img,name,mail,phone;

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public MyModel() {
    }

    public MyModel(String img, String name, String mail,  String phone) {
        this.img = img;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }
}
