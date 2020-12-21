package com.ecole221.gestion_immo.model;

import javax.persistence.*;

@Entity
public class Bien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private boolean deleted;
    private String description;
    private String libelle;
    private boolean etat;
    private String photo;
    @JoinColumn(name = "type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Type type;

    public Bien(Long id, String code, boolean deleted, String description, String libelle, boolean etat, String photo) {
        this.id = id;
        this.code = code;
        this.deleted = deleted;
        this.description = description;
        this.libelle = libelle;
        this.etat = etat;
        this.photo = photo;
    }

    public Bien() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
