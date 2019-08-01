package com.interview.service.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "jndi_name")
    private String jndiName;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private int category;

    @Column(name = "url")
    private String url;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @Column(name = "timeout")
    private float timeout;

    @Column(name = "max_connects")
    private int maxConnects;

    @Column(name = "min_connects")
    private int minConnects;

    protected Person (){
    }

    public Person(String name, String jndiName, String description,
                  int category, String url, String nickname, String password,
                  float timeout, int maxConnects, int minConnects) {
        this.name = name;
        this.jndiName = jndiName;
        this.description = description;
        this.category = category;
        this.url = url;
        this.nickname = nickname;
        this.password = password;
        this.timeout = timeout;
        this.maxConnects = maxConnects;
        this.minConnects = minConnects;
    }

    @Override
    public String toString() {
        return String.format("Customer[userId=%d, name='%s', jndiName='%s', description='%s', category=%d, url='%s', nickname='%s', password='%s', password='%s', timeout=%.2f, maxConnects=%d, minConnects=%d]",
                userId, name, jndiName, description, category,
                url, nickname, password, timeout, maxConnects, minConnects);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getTimeout() {
        return timeout;
    }

    public void setTimeout(float timeout) {
        this.timeout = timeout;
    }

    public int getMaxConnects() {
        return maxConnects;
    }

    public void setMaxConnects(int maxConnects) {
        this.maxConnects = maxConnects;
    }

    public int getMinConnects() {
        return minConnects;
    }

    public void setMinConnects(int minConnects) {
        this.minConnects = minConnects;
    }
}
