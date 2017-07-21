package com.viseo.c360.cv.models.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "missions")
public class MissionsEntity extends BaseEntity {

    @Column
    @ManyToMany(mappedBy = "missions")
    private List <UsersEntity> users;

    @Column
    private String title;

    @Column
    private Date beginDate;

    @Column
    private Date endDate;

    @Column
    private String description;

    @ManyToOne
    private ClientsEntity clientId;

    @ManyToOne
    private TypeMissionsEntity typeMissions;

    @ManyToMany
    private List <SkillsEntity> skills;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClientsEntity getClientId() {
        return clientId;
    }

    public void setClientId(ClientsEntity clientId) {
        this.clientId = clientId;
    }

    public TypeMissionsEntity getTypeMissions() {
        return typeMissions;
    }

    public void setTypeMissions(TypeMissionsEntity typeMissions) {
        this.typeMissions = typeMissions;
    }

    public List<SkillsEntity> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillsEntity> skills) {
        this.skills = skills;
    }

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsersEntity> users) {
        this.users = users;
    }
}
