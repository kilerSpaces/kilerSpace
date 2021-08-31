package com.myList.domain;

public class User {
    private Integer id;
    private String username;
    private String passeord;
    private String sex;

    public User() {
    }

    public User(Integer id, String username, String passeord, String sex) {
        this.id = id;
        this.username = username;
        this.passeord = passeord;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passeord='" + passeord + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasseord() {
        return passeord;
    }

    public void setPasseord(String passeord) {
        this.passeord = passeord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
