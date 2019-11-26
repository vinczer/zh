package com.demo.hm.domain;

public class NeptunUser {

    private int id;
    private String nid;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public NeptunUser(int id, String nid, String token) {
        this.id = id;
        this.nid = nid;
        this.token = token;
    }

    @Override
    public String toString() {
        return "NeptunUser{" +
                "id=" + id +
                ", nid=" + nid +
                ", token='" + token + '\'' +
                '}';
    }
}
