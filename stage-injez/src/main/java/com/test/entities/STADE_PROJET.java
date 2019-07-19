package com.test.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class STADE_PROJET {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Code_Stade", updatable = false, nullable = false)
	
	private String Code_Stade;
	private String Des;
	private Integer Flag_En_Continuation;
	private Integer Flag_En_Difficulte;
	private String Des_Ar;

    @OneToMany(mappedBy = "CodeStade", cascade = CascadeType.ALL)
    private Collection<Projet> projects;
	
	
    @JsonIgnore
    public Collection<Projet> getProjects() {
		return projects;
	}

	public void setProjects(Collection<Projet> projects) {
		this.projects = projects;
	}

	/*fk=activite,stadeprojet*/
	@OneToMany(fetch = FetchType.EAGER,mappedBy="CodeStade",cascade = CascadeType.ALL)
	  private Collection<Activite> activite;

	@JsonIgnore
	public Collection<Activite> getActivite() {
		return activite;
	}

	public void setActivite(Collection<Activite> activite) {
		this.activite = activite;
	}



	public STADE_PROJET() {
		super();
	}
    
    

	/**
	 * @param code_Stade
	 * @param des
	 * @param flag_En_Continuation
	 * @param flag_En_Difficulte
	 * @param des_Ar
	 */
	public STADE_PROJET(String code_Stade, String des, Integer flag_En_Continuation, Integer flag_En_Difficulte,
			String des_Ar) {
		super();
		Code_Stade = code_Stade;
		Des = des;
		Flag_En_Continuation = flag_En_Continuation;
		Flag_En_Difficulte = flag_En_Difficulte;
		Des_Ar = des_Ar;
	}



	public String getCode_Stade() {
		return Code_Stade;
	}

	public void setCode_Stade(String code_Stade) {
		Code_Stade = code_Stade;
	}

	public String getDes() {
		return Des;
	}

	public void setDes(String des) {
		Des = des;
	}

	public Integer getFlag_En_Continuation() {
		return Flag_En_Continuation;
	}

	public void setFlag_En_Continuation(Integer flag_En_Continuation) {
		Flag_En_Continuation = flag_En_Continuation;
	}

	public Integer getFlag_En_Difficulte() {
		return Flag_En_Difficulte;
	}

	public void setFlag_En_Difficulte(Integer flag_En_Difficulte) {
		Flag_En_Difficulte = flag_En_Difficulte;
	}

	public String getDes_Ar() {
		return Des_Ar;
	}

	public void setDes_Ar(String des_Ar) {
		Des_Ar = des_Ar;
	}
	
    
		
	
}
