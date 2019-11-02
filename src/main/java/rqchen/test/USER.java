package rqchen.test;

import java.util.Date;

public class USER {
    private int USER_ID;
    private String USER_MAIL;
    private String USER_NAME;
    private Date USER_BIRTH;
    private int USER_SEX;
    private int USER_PASSWORD;
    private int ROLE;

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_MAIL() {
        return USER_MAIL;
    }

    public void setUSER_MAIL(String USER_MAIL) {
        this.USER_MAIL = USER_MAIL;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public int getUSER_SEX() {
        return USER_SEX;
    }

    public void setUSER_SEX(int USER_SEX) {
        this.USER_SEX = USER_SEX;
    }

    public int getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(int USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public int getROLE() {
        return ROLE;
    }

    public void setROLE(int ROLE) {
        this.ROLE = ROLE;
    }

    public Date getUSER_BIRTH() {
        return USER_BIRTH;
    }

    public void setUSER_BIRTH(Date USER_BIRTH) {
        this.USER_BIRTH = USER_BIRTH;
    }

    @Override
    public String toString() {
        return "USER{" +
                "USER_ID=" + USER_ID +
                ", USER_MAIL='" + USER_MAIL + '\'' +
                ", USER_NAME='" + USER_NAME + '\'' +
                ", USER_BIRTH=" + USER_BIRTH +
                ", USER_SEX=" + USER_SEX +
                ", USER_PASSWORD=" + USER_PASSWORD +
                ", ROLE=" + ROLE +
                '}';
    }
}
