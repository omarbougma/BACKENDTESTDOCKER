package com.projecttypea.typea.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class NouveauMontant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private int newmTitre;
    private int newmFraisInscription;
    private int newmHebergement;
    private int newMontant;

    @JsonBackReference(value = "newMontantMS")
    @OneToOne
    private MissionStage missionstage;

    @JsonBackReference(value = "newMontantM")
    @OneToOne
    private Manifestation manifestation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNewmTitre() {
        return newmTitre;
    }

    public void setNewmTitre(int newmTitre) {
        this.newmTitre = newmTitre;
    }

    public int getNewmFraisInscription() {
        return newmFraisInscription;
    }

    public void setNewmFraisInscription(int newmFraisInscription) {
        this.newmFraisInscription = newmFraisInscription;
    }

    public int getNewmHebergement() {
        return newmHebergement;
    }

    public void setNewmHebergement(int newmHebergement) {
        this.newmHebergement = newmHebergement;
    }

    public int getNewMontant() {
        return newMontant;
    }

    public void setNewMontant(int newMontant) {
        this.newMontant = newMontant;
    }

    public MissionStage getmStage() {
        return missionstage;
    }

    public void setmStage(MissionStage mStage) {
        this.missionstage = mStage;
    }

    public Manifestation getManifestation() {
        return manifestation;
    }

    public void setManifestation(Manifestation manif) {
        this.manifestation = manif;
    }

    public NouveauMontant() {
    }

}