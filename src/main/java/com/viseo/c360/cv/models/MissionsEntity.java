package com.viseo.c360.cv.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class MissionsEntity extends AbEnty{

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

    @Column
    @ManyToOne
    private ClientsEntity clientId;

    @Column
    @ManyToOne
    private TypeMissionEntity typeMissionId;

    @Column
    @ManyToMany
    private List <SkillsEntity> skillsId;


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

    public TypeMissionEntity getTypeMissionId() {
        return typeMissionId;
    }

    public void setTypeMissionId(TypeMissionEntity typeMissionId) {
        this.typeMissionId = typeMissionId;
    }

    public List<SkillsEntity> getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(List<SkillsEntity> skillsId) {
        this.skillsId = skillsId;
    }

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsersEntity> users) {
        this.users = users;
    }
}
