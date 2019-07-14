package com.test.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class STADE_PROJET {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODE_STADE", updatable = false, nullable = false)
	
	private String CODE_STADE;
	private String DES;
	private Integer FLAG_EN_CONTINUATION;
	private Integer FLAG_EN_DIFFICULTE;
	private String DES_AR;
	
	
	

	
	@OneToMany(mappedBy = "stadeID", cascade = CascadeType.ALL)
    private Collection<Projet> projets;
	
	
	
	
	
	
	public Collection<Projet> getProjects() {
		return projets;
	}

	public void setProjects(Collection<Projet> projets) {
		this.projets = projets;
	}

	public STADE_PROJET() {
		super();
	}
	
	/**
	 * @param cODE_STADE
	 * @param dES
	 * @param fLAG_EN_CONTINUATION
	 * @param fLAG_EN_DIFFICULTE
	 * @param dES_AR
	 */
	public STADE_PROJET(String cODE_STADE, String dES, Integer fLAG_EN_CONTINUATION, Integer fLAG_EN_DIFFICULTE,
			String dES_AR) {
		super();
		CODE_STADE = cODE_STADE;
		DES = dES;
		FLAG_EN_CONTINUATION = fLAG_EN_CONTINUATION;
		FLAG_EN_DIFFICULTE = fLAG_EN_DIFFICULTE;
		DES_AR = dES_AR;
	}

	public String getCODE_STADE() {
		return CODE_STADE;
	}

	public void setCODE_STADE(String cODE_STADE) {
		CODE_STADE = cODE_STADE;
	}

	public String getDES() {
		return DES;
	}

	public void setDES(String dES) {
		DES = dES;
	}

	public Integer getFLAG_EN_CONTINUATION() {
		return FLAG_EN_CONTINUATION;
	}

	public void setFLAG_EN_CONTINUATION(Integer fLAG_EN_CONTINUATION) {
		FLAG_EN_CONTINUATION = fLAG_EN_CONTINUATION;
	}

	public Integer getFLAG_EN_DIFFICULTE() {
		return FLAG_EN_DIFFICULTE;
	}

	public void setFLAG_EN_DIFFICULTE(Integer fLAG_EN_DIFFICULTE) {
		FLAG_EN_DIFFICULTE = fLAG_EN_DIFFICULTE;
	}

	public String getDES_AR() {
		return DES_AR;
	}

	public void setDES_AR(String dES_AR) {
		DES_AR = dES_AR;
	}
	
	
}
