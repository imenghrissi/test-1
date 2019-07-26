package com.test.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//@IdClass(Type_Projet.class)
@Entity
public class Type_Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Code_Type_Prj", updatable = false, nullable = false)

	public String Code_Type_Prj;
	public String  Des;
	public String Des_Ar;
	public String Code_Type_Prj_Pere ;
	public String Niveau;
	
	
	   @OneToMany(mappedBy = "typeprojet", cascade = CascadeType.ALL)
	    private Collection<Projet> projet;
	public Type_Projet() {
		super();
		}
	/**
	 * @param code_Type_Prj
	 * @param des
	 * @param des_Ar
	 * @param code_Type_Prj_Pere
	 * @param niveau
	 */
	public Type_Projet(String code_Type_Prj, String des, String des_Ar, String code_Type_Prj_Pere, String niveau) {
		super();
		Code_Type_Prj = code_Type_Prj;
		Des = des;
		Des_Ar = des_Ar;
		Code_Type_Prj_Pere = code_Type_Prj_Pere;
		Niveau = niveau;
	}
	public String getCode_Type_Prj() {
		return Code_Type_Prj;
	}
	public void setCode_Type_Prj(String code_Type_Prj) {
		Code_Type_Prj = code_Type_Prj;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
	public String getDes_Ar() {
		return Des_Ar;
	}
	public void setDes_Ar(String des_Ar) {
		Des_Ar = des_Ar;
	}
	public String getCode_Type_Prj_Pere() {
		return Code_Type_Prj_Pere;
	}
	public void setCode_Type_Prj_Pere(String code_Type_Prj_Pere) {
		Code_Type_Prj_Pere = code_Type_Prj_Pere;
	}
	public String getNiveau() {
		return Niveau;
	}
	public void setNiveau(String niveau) {
		Niveau = niveau;
	}
	
	
	


}
