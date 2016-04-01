/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oketeam.oke.persistence.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findById_facebook", query = "SELECT u FROM User u WHERE u.id_facebook = :id_facebook"),
    @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name"),
    @NamedQuery(name = "User.findByFirst_name", query = "SELECT u FROM User u WHERE u.first_name = :first_name"),
    @NamedQuery(name = "User.findByLast_name", query = "SELECT u FROM User u WHERE u.last_name = :last_name"),
    @NamedQuery(name = "User.findByGender", query = "SELECT u FROM User u WHERE u.gender = :gender"),
    @NamedQuery(name = "User.findByLink", query = "SELECT u FROM User u WHERE u.link = :link"),
    @NamedQuery(name = "User.findByPicture", query = "SELECT u FROM User u WHERE u.picture = :picture"),
    @NamedQuery(name = "User.findByLocale", query = "SELECT u FROM User u WHERE u.locale = :locale"),
    @NamedQuery(name = "User.findByVerified", query = "SELECT u FROM User u WHERE u.verified = :verified"),
    @NamedQuery(name = "User.findByTimezone", query = "SELECT u FROM User u WHERE u.timezone = :timezone"),
    @NamedQuery(name = "User.findByAge_range", query = "SELECT u FROM User u WHERE u.age_range = :age_range"),
    @NamedQuery(name = "User.findByBirthday", query = "SELECT u FROM User u WHERE u.birthday = :birthday"),
    @NamedQuery(name = "User.findByVictories", query = "SELECT u FROM User u WHERE u.victories = :victories"),
    @NamedQuery(name = "User.findByDefeats", query = "SELECT u FROM User u WHERE u.defeats = :defeats")})
public class User implements Serializable {
	private static final long serialVersionUID = 42773729872080785L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 29)
    @Column(name = "id_facebook")
    private String id_facebook;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "first_name")
    private String first_name;
    @Size(max = 45)
    @Column(name = "last_name")
    private String last_name;
    @Size(max = 5)
    @Column(name = "gender")
    private String gender;
    @Size(max = 60)
    @Column(name = "link")
    private String link;
    @Size(max = 225)
    @Column(name = "picture")
    private String picture;
    @Size(max = 5)
    @Column(name = "locale")
    private String locale;
    @Column(name = "verified")
    private boolean verified;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "timezone")
    private Float timezone;
    @Column(name = "age_range")
    private Short age_range;
    @Size(max = 10)
    @Column(name = "birthday")
    private String birthday;
    @Column(name = "victories")
    private Integer victories;
    @Column(name = "defeats")
    private Integer defeats;
    @OneToMany(mappedBy = "user1", fetch = FetchType.EAGER)
    private List<Friend> friendList;
    @OneToMany(mappedBy = "user2", fetch = FetchType.EAGER)
    private List<Friend> friendList1;
    @OneToMany(mappedBy = "winner", fetch = FetchType.EAGER)
    private List<Match> matchList;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getId_facebook() {
        return id_facebook;
    }

    public void setId_facebook(String id_facebook) {
        this.id_facebook = id_facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean getVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Float getTimezone() {
        return timezone;
    }

    public void setTimezone(Float timezone) {
        this.timezone = timezone;
    }

    public Short getAge_range() {
        return age_range;
    }

    public void setAge_range(Short age_range) {
        this.age_range = age_range;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getVictories() {
        return victories;
    }

    public void setVictories(Integer victories) {
        this.victories = victories;
    }

    public Integer getDefeats() {
        return defeats;
    }

    public void setDefeats(Integer defeats) {
        this.defeats = defeats;
    }

    public List<Friend> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
    }

    public List<Friend> getFriendList1() {
        return friendList1;
    }

    public void setFriendList1(List<Friend> friendList1) {
        this.friendList1 = friendList1;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oketeam.oke.persistence.entity.User[ id=" + id + " ]";
    }
    
}
