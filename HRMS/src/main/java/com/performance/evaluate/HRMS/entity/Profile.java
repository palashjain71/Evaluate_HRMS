package com.performance.evaluate.HRMS.entity;

import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.*;
@Entity
public class Profile {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String profileId;

    @ColumnTransformer(read = "UPPER(profileName)")
    private String profileName;
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
