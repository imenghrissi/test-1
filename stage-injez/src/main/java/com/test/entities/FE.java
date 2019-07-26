package com.test.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@IdClass(FE.class)
@Entity
public class FE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_projet", updatable = false, nullable = false)
	public Integer Id_projet ; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Code_Fe", updatable = false, nullable = false)
	public String Code_Fe;
	
	public String Code_Bf; 
	public String Code_Dev; 
	public String Des_Fe;  
	public Integer Nature;
	public String Loi;
	public Date Dt_Loi;
	public Integer Mt_Devise;
	public Float Taux_Ref; 
	public Integer Mt_Devise_Act;
	public Date Dt_Act; 
	public Integer Commission;
	public Integer Taux_Interet; 
	public String Delai_Grace; 
	public Integer Duree_Remb;
	public Date Dt_Sig_Pret;
	public Date Dt_Ent_Vig; 
	public Date Dt_Der_Eng;
	public Date Dt_Cloture; 
	public Date Dt_Der_Pai;
	public Date Dt_Cloture_Act;
	public Date Dt_Der_Eng_Act; 
	public Date Dt_Der_Paie_Act; 
	public String Obs;
	public Integer Flag_Bf_Prog;
	public String Des_Ar;
	public String Loi_Ar;
	public Integer Mt_Locale;
	public Integer Mt_Locale_Act;
	public Integer Mt_Disp;
	public String Obs_Ar;
/*
* 	 CONSTRAINT "FE_FK2" FOREIGN KEY ("id_PROJET") REFERENCES "PROJET" ("id_PROJET") ENABLE, 
*/
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="Id_project"/*,referencedColumnName="Id_projet"*/)
    private Projet Id;
	
	@JsonIgnore
	
	
	public Projet getId() { return Id; }
	 
	public void setId(Projet id) { Id = id; }
	

	public FE() {
		
	}
	
	
	/**
	 * @param id_projet
	 * @param code_Fe
	 * @param code_Bf
	 * @param code_Dev
	 * @param des_Fe
	 * @param nature
	 * @param loi
	 * @param dt_Loi
	 * @param mt_Devise
	 * @param taux_Ref
	 * @param mt_Devise_Act
	 * @param dt_Act
	 * @param commission
	 * @param taux_Interet
	 * @param delai_Grace
	 * @param duree_Remb
	 * @param dt_Sig_Pret
	 * @param dt_Ent_Vig
	 * @param dt_Der_Eng
	 * @param dt_Cloture
	 * @param dt_Der_Pai
	 * @param dt_Cloture_Act
	 * @param dt_Der_Eng_Act
	 * @param dt_Der_Paie_Act
	 * @param obs
	 * @param flag_Bf_Prog
	 * @param des_Ar
	 * @param loi_Ar
	 * @param mt_Locale
	 * @param mt_Locale_Act
	 * @param mt_Disp
	 * @param obs_Ar
	 */
	/*
	 * public FE(Integer id_projet, String code_Fe, String code_Bf, String code_Dev,
	 * String des_Fe, Integer nature, String loi, Date dt_Loi, Integer mt_Devise,
	 * Float taux_Ref, Integer mt_Devise_Act, Date dt_Act, Integer commission,
	 * Integer taux_Interet, String delai_Grace, Integer duree_Remb, Date
	 * dt_Sig_Pret, Date dt_Ent_Vig, Date dt_Der_Eng, Date dt_Cloture, Date
	 * dt_Der_Pai, Date dt_Cloture_Act, Date dt_Der_Eng_Act, Date dt_Der_Paie_Act,
	 * String obs, Integer flag_Bf_Prog, String des_Ar, String loi_Ar, Integer
	 * mt_Locale, Integer mt_Locale_Act, Integer mt_Disp, String obs_Ar) { super();
	 * Id_projet = id_projet; Code_Fe = code_Fe; Code_Bf = code_Bf; Code_Dev =
	 * code_Dev; Des_Fe = des_Fe; Nature = nature; Loi = loi; Dt_Loi = dt_Loi;
	 * Mt_Devise = mt_Devise; Taux_Ref = taux_Ref; Mt_Devise_Act = mt_Devise_Act;
	 * Dt_Act = dt_Act; Commission = commission; Taux_Interet = taux_Interet;
	 * Delai_Grace = delai_Grace; Duree_Remb = duree_Remb; Dt_Sig_Pret =
	 * dt_Sig_Pret; Dt_Ent_Vig = dt_Ent_Vig; Dt_Der_Eng = dt_Der_Eng; Dt_Cloture =
	 * dt_Cloture; Dt_Der_Pai = dt_Der_Pai; Dt_Cloture_Act = dt_Cloture_Act;
	 * Dt_Der_Eng_Act = dt_Der_Eng_Act; Dt_Der_Paie_Act = dt_Der_Paie_Act; Obs =
	 * obs; Flag_Bf_Prog = flag_Bf_Prog; Des_Ar = des_Ar; Loi_Ar = loi_Ar; Mt_Locale
	 * = mt_Locale; Mt_Locale_Act = mt_Locale_Act; Mt_Disp = mt_Disp; Obs_Ar =
	 * obs_Ar; }
	 * 
	 * public Integer getId_projet() { return Id_projet; }
	 * 
	 * public void setId_projet(Integer id_projet) { Id_projet = id_projet; }
	 * 
	 * public String getCode_Fe() { return Code_Fe; }
	 * 
	 * public void setCode_Fe(String code_Fe) { Code_Fe = code_Fe; }
	 * 
	 * public String getCode_Bf() { return Code_Bf; }
	 * 
	 * public void setCode_Bf(String code_Bf) { Code_Bf = code_Bf; }
	 * 
	 * public String getCode_Dev() { return Code_Dev; }
	 * 
	 * public void setCode_Dev(String code_Dev) { Code_Dev = code_Dev; }
	 * 
	 * public String getDes_Fe() { return Des_Fe; }
	 * 
	 * public void setDes_Fe(String des_Fe) { Des_Fe = des_Fe; }
	 * 
	 * public Integer getNature() { return Nature; }
	 * 
	 * public void setNature(Integer nature) { Nature = nature; }
	 * 
	 * public String getLoi() { return Loi; }
	 * 
	 * public void setLoi(String loi) { Loi = loi; }
	 * 
	 * public Date getDt_Loi() { return Dt_Loi; }
	 * 
	 * public void setDt_Loi(Date dt_Loi) { Dt_Loi = dt_Loi; }
	 * 
	 * public Integer getMt_Devise() { return Mt_Devise; }
	 * 
	 * public void setMt_Devise(Integer mt_Devise) { Mt_Devise = mt_Devise; }
	 * 
	 * public Float getTaux_Ref() { return Taux_Ref; }
	 * 
	 * public void setTaux_Ref(Float taux_Ref) { Taux_Ref = taux_Ref; }
	 * 
	 * public Integer getMt_Devise_Act() { return Mt_Devise_Act; }
	 * 
	 * public void setMt_Devise_Act(Integer mt_Devise_Act) { Mt_Devise_Act =
	 * mt_Devise_Act; }
	 * 
	 * public Date getDt_Act() { return Dt_Act; }
	 * 
	 * public void setDt_Act(Date dt_Act) { Dt_Act = dt_Act; }
	 * 
	 * public Integer getCommission() { return Commission; }
	 * 
	 * public void setCommission(Integer commission) { Commission = commission; }
	 * 
	 * public Integer getTaux_Interet() { return Taux_Interet; }
	 * 
	 * public void setTaux_Interet(Integer taux_Interet) { Taux_Interet =
	 * taux_Interet; }
	 * 
	 * public String getDelai_Grace() { return Delai_Grace; }
	 * 
	 * public void setDelai_Grace(String delai_Grace) { Delai_Grace = delai_Grace; }
	 * 
	 * public Integer getDuree_Remb() { return Duree_Remb; }
	 * 
	 * public void setDuree_Remb(Integer duree_Remb) { Duree_Remb = duree_Remb; }
	 * 
	 * public Date getDt_Sig_Pret() { return Dt_Sig_Pret; }
	 * 
	 * public void setDt_Sig_Pret(Date dt_Sig_Pret) { Dt_Sig_Pret = dt_Sig_Pret; }
	 * 
	 * public Date getDt_Ent_Vig() { return Dt_Ent_Vig; }
	 * 
	 * public void setDt_Ent_Vig(Date dt_Ent_Vig) { Dt_Ent_Vig = dt_Ent_Vig; }
	 * 
	 * public Date getDt_Der_Eng() { return Dt_Der_Eng; }
	 * 
	 * public void setDt_Der_Eng(Date dt_Der_Eng) { Dt_Der_Eng = dt_Der_Eng; }
	 * 
	 * public Date getDt_Cloture() { return Dt_Cloture; }
	 * 
	 * public void setDt_Cloture(Date dt_Cloture) { Dt_Cloture = dt_Cloture; }
	 * 
	 * public Date getDt_Der_Pai() { return Dt_Der_Pai; }
	 * 
	 * public void setDt_Der_Pai(Date dt_Der_Pai) { Dt_Der_Pai = dt_Der_Pai; }
	 * 
	 * public Date getDt_Cloture_Act() { return Dt_Cloture_Act; }
	 * 
	 * public void setDt_Cloture_Act(Date dt_Cloture_Act) { Dt_Cloture_Act =
	 * dt_Cloture_Act; }
	 * 
	 * public Date getDt_Der_Eng_Act() { return Dt_Der_Eng_Act; }
	 * 
	 * public void setDt_Der_Eng_Act(Date dt_Der_Eng_Act) { Dt_Der_Eng_Act =
	 * dt_Der_Eng_Act; }
	 * 
	 * public Date getDt_Der_Paie_Act() { return Dt_Der_Paie_Act; }
	 * 
	 * public void setDt_Der_Paie_Act(Date dt_Der_Paie_Act) { Dt_Der_Paie_Act =
	 * dt_Der_Paie_Act; }
	 * 
	 * public String getObs() { return Obs; }
	 * 
	 * public void setObs(String obs) { Obs = obs; }
	 * 
	 * public Integer getFlag_Bf_Prog() { return Flag_Bf_Prog; }
	 * 
	 * public void setFlag_Bf_Prog(Integer flag_Bf_Prog) { Flag_Bf_Prog =
	 * flag_Bf_Prog; }
	 * 
	 * public String getDes_Ar() { return Des_Ar; }
	 * 
	 * public void setDes_Ar(String des_Ar) { Des_Ar = des_Ar; }
	 * 
	 * public String getLoi_Ar() { return Loi_Ar; }
	 * 
	 * public void setLoi_Ar(String loi_Ar) { Loi_Ar = loi_Ar; }
	 * 
	 * public Integer getMt_Locale() { return Mt_Locale; }
	 * 
	 * public void setMt_Locale(Integer mt_Locale) { Mt_Locale = mt_Locale; }
	 * 
	 * public Integer getMt_Locale_Act() { return Mt_Locale_Act; }
	 * 
	 * public void setMt_Locale_Act(Integer mt_Locale_Act) { Mt_Locale_Act =
	 * mt_Locale_Act; }
	 * 
	 * public Integer getMt_Disp() { return Mt_Disp; }
	 * 
	 * public void setMt_Disp(Integer mt_Disp) { Mt_Disp = mt_Disp; }
	 * 
	 * public String getObs_Ar() { return Obs_Ar; }
	 * 
	 * public void setObs_Ar(String obs_Ar) { Obs_Ar = obs_Ar; }
	 */

	
	
}
