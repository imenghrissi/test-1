package com.test.entities;

import java.util.Collection;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Structure {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID; 
    private String CODE; 
    private String DES; 
    private Integer ID_STR_MERE;
    private String PORT_SMTP; 
    private String SERVEUR_SMTP; 
    private Integer NIVEAU; 
    private Integer TYPE_COOP; 
    private String DES_AR; 
    private String ABREVIATION; 
    private Integer FLAG_CENTRAL; 
    private Integer FLAG_SAISIE_PROG_CENTRAL; 
    private String CODE_ZONE;
    
    
    
    @OneToMany(mappedBy = "structID", cascade = CascadeType.ALL)
    private Collection<Projet> projects;
    
    
    
	/*
	 * @OneToMany(mappedBy="structure") private Collection<Projet> projet;
	 */
	
	
	
	public Collection<Projet> getProjects() {
		return projects;
	}
	public void setProjects(Set<Projet> projects) {
		this.projects = projects;
	}
	public Structure() {
		super();
	}
	/**
	 * @param iD
	 * @param cODE
	 * @param dES
	 * @param iD_STR_MERE
	 * @param pORT_SMTP
	 * @param sERVEUR_SMTP
	 * @param nIVEAU
	 * @param tYPE_COOP
	 * @param dES_AR
	 * @param aBREVIATION
	 * @param fLAG_CENTRAL
	 * @param fLAG_SAISIE_PROG_CENTRAL
	 * @param cODE_ZONE
	 */
	public Structure(Integer iD, String cODE, String dES, Integer iD_STR_MERE, String pORT_SMTP, String sERVEUR_SMTP,
			Integer nIVEAU, Integer tYPE_COOP, String dES_AR, String aBREVIATION, Integer fLAG_CENTRAL,
			Integer fLAG_SAISIE_PROG_CENTRAL, String cODE_ZONE) {
		super();
		ID = iD;
		CODE = cODE;
		DES = dES;
		ID_STR_MERE = iD_STR_MERE;
		PORT_SMTP = pORT_SMTP;
		SERVEUR_SMTP = sERVEUR_SMTP;
		NIVEAU = nIVEAU;
		TYPE_COOP = tYPE_COOP;
		DES_AR = dES_AR;
		ABREVIATION = aBREVIATION;
		FLAG_CENTRAL = fLAG_CENTRAL;
		FLAG_SAISIE_PROG_CENTRAL = fLAG_SAISIE_PROG_CENTRAL;
		CODE_ZONE = cODE_ZONE;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getDES() {
		return DES;
	}
	public void setDES(String dES) {
		DES = dES;
	}
	public Integer getID_STR_MERE() {
		return ID_STR_MERE;
	}
	public void setID_STR_MERE(Integer iD_STR_MERE) {
		ID_STR_MERE = iD_STR_MERE;
	}
	public String getPORT_SMTP() {
		return PORT_SMTP;
	}
	public void setPORT_SMTP(String pORT_SMTP) {
		PORT_SMTP = pORT_SMTP;
	}
	public String getSERVEUR_SMTP() {
		return SERVEUR_SMTP;
	}
	public void setSERVEUR_SMTP(String sERVEUR_SMTP) {
		SERVEUR_SMTP = sERVEUR_SMTP;
	}
	public Integer getNIVEAU() {
		return NIVEAU;
	}
	public void setNIVEAU(Integer nIVEAU) {
		NIVEAU = nIVEAU;
	}
	public Integer getTYPE_COOP() {
		return TYPE_COOP;
	}
	public void setTYPE_COOP(Integer tYPE_COOP) {
		TYPE_COOP = tYPE_COOP;
	}
	public String getDES_AR() {
		return DES_AR;
	}
	public void setDES_AR(String dES_AR) {
		DES_AR = dES_AR;
	}
	public String getABREVIATION() {
		return ABREVIATION;
	}
	public void setABREVIATION(String aBREVIATION) {
		ABREVIATION = aBREVIATION;
	}
	public Integer getFLAG_CENTRAL() {
		return FLAG_CENTRAL;
	}
	public void setFLAG_CENTRAL(Integer fLAG_CENTRAL) {
		FLAG_CENTRAL = fLAG_CENTRAL;
	}
	public Integer getFLAG_SAISIE_PROG_CENTRAL() {
		return FLAG_SAISIE_PROG_CENTRAL;
	}
	public void setFLAG_SAISIE_PROG_CENTRAL(Integer fLAG_SAISIE_PROG_CENTRAL) {
		FLAG_SAISIE_PROG_CENTRAL = fLAG_SAISIE_PROG_CENTRAL;
	}
	public String getCODE_ZONE() {
		return CODE_ZONE;
	}
	public void setCODE_ZONE(String cODE_ZONE) {
		CODE_ZONE = cODE_ZONE;
	} 

	
	
	
	/*
	 * @JsonIgnore
	 * 
	 * @XmlTransient public Collection<Projet> getProjet() { return projet; } public
	 * void setProjet(Collection<Projet> projet) { this.projet = projet; }
	 */
	}
