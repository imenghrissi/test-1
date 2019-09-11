package com.test.entities;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Structure {
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer Id_Structure; 
    private String Code; 
    private String Des; 
    private Integer Id_Str_Mere;
    private String Port_Smtp; 
    private String Serveur_Smtp; 
    private Integer Niveau; 
    private Integer Type_Coop; 
    private String Des_Ar; 
    private String Abreviation; 
    private Integer Flag_Central; 
    private Integer Flag_Saisie_Prog_Central; 
    private String Code_Zone;

    
    @OneToMany(mappedBy = "structure", cascade = CascadeType.ALL)
    private Collection<Projet> projet;
 
    @JsonIgnore
public Collection<Projet> getProjet() {
		return projet;
	}

	public void setProjet(Collection<Projet> projet) {
		this.projet = projet;
	}


	/*fk=activite,structure*/
	@OneToMany(fetch = FetchType.EAGER,mappedBy="Id_Structure",cascade = CascadeType.ALL)
	  private Collection<Activite> activite;

	@JsonIgnore
	public Collection<Activite> getActivite() {
		return activite;
	}

	public void setActivite(Collection<Activite> activite) {
		this.activite = activite;
	}

/*
 * utilisateur,structure
 */
	 @OneToMany(mappedBy = "structure", cascade = CascadeType.ALL)
	    private Collection<Utilisateur> utilisateur;
	public Structure() {
		super();
	}
	


	/**
	 * @param id_Structure
	 * @param code
	 * @param des
	 * @param id_Str_Mere
	 * @param port_Smtp
	 * @param serveur_Smtp
	 * @param niveau
	 * @param type_Coop
	 * @param des_Ar
	 * @param abreviation
	 * @param flag_Central
	 * @param flag_Saisie_Prog_Central
	 * @param code_Zone
	 */
	public Structure(Integer id_Structure, String code, String des, Integer id_Str_Mere, String port_Smtp,
			String serveur_Smtp, Integer niveau, Integer type_Coop, String des_Ar, String abreviation,
			Integer flag_Central, Integer flag_Saisie_Prog_Central, String code_Zone) {
		super();
		Id_Structure = id_Structure;
		Code = code;
		Des = des;
		Id_Str_Mere = id_Str_Mere;
		Port_Smtp = port_Smtp;
		Serveur_Smtp = serveur_Smtp;
		Niveau = niveau;
		Type_Coop = type_Coop;
		Des_Ar = des_Ar;
		Abreviation = abreviation;
		Flag_Central = flag_Central;
		Flag_Saisie_Prog_Central = flag_Saisie_Prog_Central;
		Code_Zone = code_Zone;
	}



	public Integer getId_Structure() {
		return Id_Structure;
	}


	public void setId_Structure(Integer id_Structure) {
		Id_Structure = id_Structure;
	}


	public String getCode() {
		return Code;
	}


	public void setCode(String code) {
		Code = code;
	}


	public String getDes() {
		return Des;
	}


	public void setDes(String des) {
		Des = des;
	}


	public Integer getId_Str_Mere() {
		return Id_Str_Mere;
	}


	public void setId_Str_Mere(Integer id_Str_Mere) {
		Id_Str_Mere = id_Str_Mere;
	}


	public String getPort_Smtp() {
		return Port_Smtp;
	}


	public void setPort_Smtp(String port_Smtp) {
		Port_Smtp = port_Smtp;
	}


	public String getServeur_Smtp() {
		return Serveur_Smtp;
	}


	public void setServeur_Smtp(String serveur_Smtp) {
		Serveur_Smtp = serveur_Smtp;
	}


	public Integer getNiveau() {
		return Niveau;
	}


	public void setNiveau(Integer niveau) {
		Niveau = niveau;
	}


	public Integer getType_Coop() {
		return Type_Coop;
	}


	public void setType_Coop(Integer type_Coop) {
		Type_Coop = type_Coop;
	}


	public String getDes_Ar() {
		return Des_Ar;
	}


	public void setDes_Ar(String des_Ar) {
		Des_Ar = des_Ar;
	}


	public String getAbreviation() {
		return Abreviation;
	}


	public void setAbreviation(String abreviation) {
		Abreviation = abreviation;
	}


	public Integer getFlag_Central() {
		return Flag_Central;
	}


	public void setFlag_Central(Integer flag_Central) {
		Flag_Central = flag_Central;
	}


	public Integer getFlag_Saisie_Prog_Central() {
		return Flag_Saisie_Prog_Central;
	}


	public void setFlag_Saisie_Prog_Central(Integer flag_Saisie_Prog_Central) {
		Flag_Saisie_Prog_Central = flag_Saisie_Prog_Central;
	}


	public String getCode_Zone() {
		return Code_Zone;
	}


	public void setCode_Zone(String code_Zone) {
		Code_Zone = code_Zone;
	}
	
	
	
	
	/*
	 * @JsonIgnore
	 * 
	 * @XmlTransient public Collection<Projet> getProjet() { return projet; } public
	 * void setProjet(Collection<Projet> projet) { this.projet = projet; }
	 */
	}
