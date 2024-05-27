package com.example.client_user;

public class User {
    private int id;
    private String name;
    private String email;
    private String prodi;
    private String fakultas;
    public User(String name, String email, String prodi, String fakultas) {
        this.name = name;
        this.email = email;
        this.prodi = prodi;
        this.fakultas = fakultas; }

    public int getId() {  return id;    }

    public String getName() { return name;    }

    public String getEmail() { return email;    }
    public String getProdi() { return prodi;    }
    public String getFakultas() { return fakultas; }
}
