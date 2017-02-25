package com.bignerdranch.admin.myapplication;

/**
 * Created by admin on 2017/2/21.
 */

public class Card {
    private String name;
    private String account;



    private String password;
    private String time;
    private String note;



    public Card(String name,String account,String password){
        this.name=name;
        this.password=password;
        this.account=account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
