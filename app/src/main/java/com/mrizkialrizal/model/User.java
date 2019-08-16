package com.mrizkialrizal.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
/*
Nim  : 10116301
Nama : Muhammad Rizki Alrizal
Kelas: IF 7
Waktu: 15/08/19
*/

public class User extends RealmObject {
    @PrimaryKey
    private int id;
    private String name;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
