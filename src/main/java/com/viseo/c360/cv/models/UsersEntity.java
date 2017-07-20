package com.viseo.c360.cv.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table
public class UsersEntity extends AbEnty {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Date date_birth;

    @Column
    private String mail;

    @Column
    private String login;

    @Column
    private String hobbies;

    @Column
    private int telephone;

    @Column
    private String password;

    @Column
    @ManyToMany
    private List <LanguagesEntity> languages;

    @Column
    @ManyToMany
    private List <MissionsEntity> missions;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LanguagesEntity> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesEntity> languages) {
        this.languages = languages;
    }

    public List<MissionsEntity> getMissions() {
        return missions;
    }

    public void setMissions(List<MissionsEntity> missions) {
        this.missions = missions;
    }
}