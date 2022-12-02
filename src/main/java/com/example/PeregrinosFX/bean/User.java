package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", updatable = false, nullable = false)
    private long idUser;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerfil")
    private Perfil perfil;

    @Column(name ="user_Name")
    private String userName;

    @Column(name = "password")
    private String password;


    public User() {

    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "perfil=" + perfil +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", id=" + idUser +
                '}';
    }

}
