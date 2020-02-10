package com.performance.evaluate.HRMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class UserCredential {

    @Id
    private long userCredentialsID;

    @Email
    private String userName;

    @NotNull
    private String password;

    public long getUserCredantialsID() {
        return userCredentialsID;
    }

    public void setUserCredantialsID(long userCredantialsID) {
        this.userCredentialsID = userCredantialsID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
