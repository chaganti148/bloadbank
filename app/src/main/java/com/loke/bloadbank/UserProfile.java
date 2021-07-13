package com.loke.bloadbank;

public class UserProfile {
    public String userAge;
    public String userEmail;
    public String userName;
    public String phone;
    public String sp;

    public UserProfile() {
    }

    public UserProfile(String userAge, String userEmail, String userName, String sp, String phone) {
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userName = userName;
        this.phone = phone;
        this.sp= sp;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }
}