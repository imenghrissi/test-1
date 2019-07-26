package com.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@IdClass(Bailleur.class)
@Entity
public class Bailleur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODE_BF", updatable = false, nullable = false)

	public String Code_Bf ; 
	public String Des_Bf ; 
	public String Adresse; 
	public String  Tel ; 
	public String Fax ; 
	public String  Email ; 
	public String  Adresse1 ; 
	public String  Adresse2 ;
	public Integer  Type_Bf ;
	public String  Des_Ar ;
	public String  Adresse_Ar ;
	public String  Adresse1_Ar ;
	
	public Bailleur() {
		super();}
	/**
	 * @param code_Bf
	 * @param des_Bf
	 * @param adresse
	 * @param tel
	 * @param fax
	 * @param email
	 * @param adresse1
	 * @param adresse2
	 * @param type_Bf
	 * @param des_Ar
	 * @param adresse_Ar
	 * @param adresse1_Ar
	 */
	public Bailleur(String code_Bf, String des_Bf, String adresse, String tel, String fax, String email,
			String adresse1, String adresse2, Integer type_Bf, String des_Ar, String adresse_Ar, String adresse1_Ar) {
		super();
		Code_Bf = code_Bf;
		Des_Bf = des_Bf;
		Adresse = adresse;
		Tel = tel;
		Fax = fax;
		Email = email;
		Adresse1 = adresse1;
		Adresse2 = adresse2;
		Type_Bf = type_Bf;
		Des_Ar = des_Ar;
		Adresse_Ar = adresse_Ar;
		Adresse1_Ar = adresse1_Ar;
	}
	public String getCode_Bf() {
		return Code_Bf;
	}
	public void setCode_Bf(String code_Bf) {
		Code_Bf = code_Bf;
	}
	public String getDes_Bf() {
		return Des_Bf;
	}
	public void setDes_Bf(String des_Bf) {
		Des_Bf = des_Bf;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAdresse1() {
		return Adresse1;
	}
	public void setAdresse1(String adresse1) {
		Adresse1 = adresse1;
	}
	public String getAdresse2() {
		return Adresse2;
	}
	public void setAdresse2(String adresse2) {
		Adresse2 = adresse2;
	}
	public Integer getType_Bf() {
		return Type_Bf;
	}
	public void setType_Bf(Integer type_Bf) {
		Type_Bf = type_Bf;
	}
	public String getDes_Ar() {
		return Des_Ar;
	}
	public void setDes_Ar(String des_Ar) {
		Des_Ar = des_Ar;
	}
	public String getAdresse_Ar() {
		return Adresse_Ar;
	}
	public void setAdresse_Ar(String adresse_Ar) {
		Adresse_Ar = adresse_Ar;
	}
	public String getAdresse1_Ar() {
		return Adresse1_Ar;
	}
	public void setAdresse1_Ar(String adresse1_Ar) {
		Adresse1_Ar = adresse1_Ar;
	} 

	
	
	
}
