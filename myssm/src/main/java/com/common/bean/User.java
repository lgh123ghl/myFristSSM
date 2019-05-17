package com.common.bean;
import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    private int userid;

    private String login_name;

    private String login_pwd;


    public User() {

    }


    public User(int userid, String login_name, String login_pwd) {
        super();
        this.userid = userid;
        this.login_name = login_name;
        this.login_pwd = login_pwd;
    }


    public int getUserid() {
        return userid;
    }


    public void setUserid(int userid) {
        this.userid = userid;
    }


    public String getLogin_name() {
        return login_name;
    }


    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }


    public String getLogin_pwd() {
        return login_pwd;
    }


    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }


}
