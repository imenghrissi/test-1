package com.test.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnore;

@IdClass(Activite.class)
@Entity
@Table(indexes = { @Index(name = "ACTIVITE_INDEX1", columnList = "Id_projet")})
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Activite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Code_Activite", updatable = false, nullable = false)
	public String Code_Activite ;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "Id_projet", updatable = false, nullable = false)
	  public Integer Id_projet;
	
	  public String Code_Parag;  
	  public String Act_Reference_Projet;  
	  public String Act_Code_Activite;  
	  public String Des;
	  public Integer Cout_FE;
	  public Integer Cout_Autre;
	  public Integer Flag_Niveau; 
	  public String Obs; 
	  public Integer Nbr_Fils; 
	  public String Code;
	  public Integer Nivau_Zone; 
	  public Integer Id_Racine; 
	  public Integer Cout_Fe_Ini; 
	  public Integer Cout_Autre_Ini;
	  public Integer Tre; 
	  public Integer Avan_Act; 
	  public Date Dt_Act_Tre ; 
	  public Date Dt_Act_Tot ; 
	  public Integer Ordre_Act;
	  public String Justification;
	  public Date Dat_Deb ;
	  public Date Dat_Fin ;
	  public Integer Id_Type_Decoup; 
	  public Date Dat_Deb_Act; 
	  public Date Dat_Fin_Act;
	  public Integer Flag_Action_Individuel;
	  public Integer F_Biens; 
	  public Integer F_Travaux; 
	  public Integer F_Services; 
	  public Integer Flag_Mstr;
	  public Integer Flag_Deleg; 
	  public String Des_Ar; 
	  public String Obs_Ar; 
	  public Integer Cout_Total;
	  public Integer Cout_Tr_Ini;
	  public Integer Cout_Tr ; 
	  public Integer Cout_Total_Ini ;
	  public Integer Cout_Total_Ml ;
	  public Integer Cout_Total_Ini_Ml ;
	  public Integer Poids ; 
	  public Integer Flag_Multi_Op ;
	  public Integer Flag_En_Difficulte;
	  public String Code_Param ;
	  public String Des_Param ; 
	  public String Unite; 
	  public String Des_Fe;
	 
	//public Integer Id_STRUCTURE;
	//public Integer"CODE_STADE" 
	
	
/*******CONSTRAINT "FK_PROJET___PJT_ACTIVITE" FOREIGN KEY ("id_PROJET")*/
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Id_project"/*,referencedColumnName="Id_projet"*/)
    private Projet Id;
	public Projet getId() {
	return Id;
}


public void setId(Projet id) {
	Id = id;
}
	
		
/*CONSTRAINT "FK_PJT_ACTIVITE___PJT_ACTIVITE" FOREIGN KEY ("ACT_REFERENCE_PROJET", "ACT_CODE_ACTIVITE")
	  REFERENCES "ACTIVITE" ("Id_PROJET", "CODE_ACTIVITE") ENABLE*/


	//@ManyToMany(cascade = { CascadeType.ALL })
    //@JoinTable(name = "ACTIVITE_PROJET",
      //  joinColumns = @JoinColumn(name = "ACT_REFERENCE_PROJET"),
    //    inverseJoinColumns = @JoinColumn(name = "ACT_CODE_ACTIVITE")
  //  )

//private Set<Projet> projets= new HashSet<>();


//public Collection<Projet> getProjets() {
	//	return projets;
//	}


	//public void setProjets(Collection<Projet> projets) {
		//this.projets = projets;
	    
	//}


/******constrainte fk=Id_STRUCTURE*/
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Id_Structure"/*,referencedColumnName="Id_projet"*/)
    private Structure Id_Structure;
	

	
	  public Structure getId_Structure() { return Id_Structure; }
	  
	 
	  public void setId_Structure(Structure id_Structure) { Id_Structure =
	 id_Structure; }
	


/*****constrainte fk=CODE_STADE*/
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="CodeStade"/*,referencedColumnName="Id_projet"*/)
    private STADE_PROJET CodeStade;
	
	
	
	  public STADE_PROJET getCodeStade() {
		  return CodeStade; 
		  }
	  
	  
	  public void setCodeStade(STADE_PROJET codeStade) {
		  CodeStade = codeStade; 
		  }
	 


		public Activite() {
		
	}


		/**
		 * @param code_Activite
		 * @param id_projet
		 * @param code_Parag
		 * @param act_Reference_Projet
		 * @param act_Code_Activite
		 * @param des
		 * @param cout_FE
		 * @param cout_Autre
		 * @param flag_Niveau
		 * @param obs
		 * @param nbr_Fils
		 * @param code
		 * @param nivau_Zone
		 * @param id_Racine
		 * @param cout_Fe_Ini
		 * @param cout_Autre_Ini
		 * @param tre
		 * @param avan_Act
		 * @param dt_Act_Tre
		 * @param dt_Act_Tot
		 * @param ordre_Act
		 * @param justification
		 * @param dat_Deb
		 * @param dat_Fin
		 * @param id_Type_Decoup
		 * @param dat_Deb_Act
		 * @param dat_Fin_Act
		 * @param flag_Action_Individuel
		 * @param f_Biens
		 * @param f_Travaux
		 * @param f_Services
		 * @param flag_Mstr
		 * @param flag_Deleg
		 * @param des_Ar
		 * @param obs_Ar
		 * @param cout_Total
		 * @param cout_Tr_Ini
		 * @param cout_Tr
		 * @param cout_Total_Ini
		 * @param cout_Total_Ml
		 * @param cout_Total_Ini_Ml
		 * @param poids
		 * @param flag_Multi_Op
		 * @param flag_En_Difficulte
		 * @param code_Param
		 * @param des_Param
		 * @param unite
		 * @param des_Fe
		 */
		public Activite(String code_Activite, Integer id_projet, String code_Parag, String act_Reference_Projet,
				String act_Code_Activite, String des, Integer cout_FE, Integer cout_Autre, Integer flag_Niveau,
				String obs, Integer nbr_Fils, String code, Integer nivau_Zone, Integer id_Racine, Integer cout_Fe_Ini,
				Integer cout_Autre_Ini, Integer tre, Integer avan_Act, Date dt_Act_Tre, Date dt_Act_Tot,
				Integer ordre_Act, String justification, Date dat_Deb, Date dat_Fin, Integer id_Type_Decoup,
				Date dat_Deb_Act, Date dat_Fin_Act, Integer flag_Action_Individuel, Integer f_Biens, Integer f_Travaux,
				Integer f_Services, Integer flag_Mstr, Integer flag_Deleg, String des_Ar, String obs_Ar,
				Integer cout_Total, Integer cout_Tr_Ini, Integer cout_Tr, Integer cout_Total_Ini, Integer cout_Total_Ml,
				Integer cout_Total_Ini_Ml, Integer poids, Integer flag_Multi_Op, Integer flag_En_Difficulte,
				String code_Param, String des_Param, String unite, String des_Fe) {
			super();
			Code_Activite = code_Activite;
			Id_projet = id_projet;
			Code_Parag = code_Parag;
			Act_Reference_Projet = act_Reference_Projet;
			Act_Code_Activite = act_Code_Activite;
			Des = des;
			Cout_FE = cout_FE;
			Cout_Autre = cout_Autre;
			Flag_Niveau = flag_Niveau;
			Obs = obs;
			Nbr_Fils = nbr_Fils;
			Code = code;
			Nivau_Zone = nivau_Zone;
			Id_Racine = id_Racine;
			Cout_Fe_Ini = cout_Fe_Ini;
			Cout_Autre_Ini = cout_Autre_Ini;
			Tre = tre;
			Avan_Act = avan_Act;
			Dt_Act_Tre = dt_Act_Tre;
			Dt_Act_Tot = dt_Act_Tot;
			Ordre_Act = ordre_Act;
			Justification = justification;
			Dat_Deb = dat_Deb;
			Dat_Fin = dat_Fin;
			Id_Type_Decoup = id_Type_Decoup;
			Dat_Deb_Act = dat_Deb_Act;
			Dat_Fin_Act = dat_Fin_Act;
			Flag_Action_Individuel = flag_Action_Individuel;
			F_Biens = f_Biens;
			F_Travaux = f_Travaux;
			F_Services = f_Services;
			Flag_Mstr = flag_Mstr;
			Flag_Deleg = flag_Deleg;
			Des_Ar = des_Ar;
			Obs_Ar = obs_Ar;
			Cout_Total = cout_Total;
			Cout_Tr_Ini = cout_Tr_Ini;
			Cout_Tr = cout_Tr;
			Cout_Total_Ini = cout_Total_Ini;
			Cout_Total_Ml = cout_Total_Ml;
			Cout_Total_Ini_Ml = cout_Total_Ini_Ml;
			Poids = poids;
			Flag_Multi_Op = flag_Multi_Op;
			Flag_En_Difficulte = flag_En_Difficulte;
			Code_Param = code_Param;
			Des_Param = des_Param;
			Unite = unite;
			Des_Fe = des_Fe;
		}


		public String getCode_Activite() {
			return Code_Activite;
		}


		public void setCode_Activite(String code_Activite) {
			Code_Activite = code_Activite;
		}


		public Integer getId_projet() {
			return Id_projet;
		}


		public void setId_projet(Integer id_projet) {
			Id_projet = id_projet;
		}


		public String getCode_Parag() {
			return Code_Parag;
		}


		public void setCode_Parag(String code_Parag) {
			Code_Parag = code_Parag;
		}


		public String getAct_Reference_Projet() {
			return Act_Reference_Projet;
		}


		public void setAct_Reference_Projet(String act_Reference_Projet) {
			Act_Reference_Projet = act_Reference_Projet;
		}


		public String getAct_Code_Activite() {
			return Act_Code_Activite;
		}


		public void setAct_Code_Activite(String act_Code_Activite) {
			Act_Code_Activite = act_Code_Activite;
		}


		public String getDes() {
			return Des;
		}


		public void setDes(String des) {
			Des = des;
		}


		public Integer getCout_FE() {
			return Cout_FE;
		}


		public void setCout_FE(Integer cout_FE) {
			Cout_FE = cout_FE;
		}


		public Integer getCout_Autre() {
			return Cout_Autre;
		}


		public void setCout_Autre(Integer cout_Autre) {
			Cout_Autre = cout_Autre;
		}


		public Integer getFlag_Niveau() {
			return Flag_Niveau;
		}


		public void setFlag_Niveau(Integer flag_Niveau) {
			Flag_Niveau = flag_Niveau;
		}


		public String getObs() {
			return Obs;
		}


		public void setObs(String obs) {
			Obs = obs;
		}


		public Integer getNbr_Fils() {
			return Nbr_Fils;
		}


		public void setNbr_Fils(Integer nbr_Fils) {
			Nbr_Fils = nbr_Fils;
		}


		public String getCode() {
			return Code;
		}


		public void setCode(String code) {
			Code = code;
		}


		public Integer getNivau_Zone() {
			return Nivau_Zone;
		}


		public void setNivau_Zone(Integer nivau_Zone) {
			Nivau_Zone = nivau_Zone;
		}


		public Integer getId_Racine() {
			return Id_Racine;
		}


		public void setId_Racine(Integer id_Racine) {
			Id_Racine = id_Racine;
		}


		public Integer getCout_Fe_Ini() {
			return Cout_Fe_Ini;
		}


		public void setCout_Fe_Ini(Integer cout_Fe_Ini) {
			Cout_Fe_Ini = cout_Fe_Ini;
		}


		public Integer getCout_Autre_Ini() {
			return Cout_Autre_Ini;
		}


		public void setCout_Autre_Ini(Integer cout_Autre_Ini) {
			Cout_Autre_Ini = cout_Autre_Ini;
		}


		public Integer getTre() {
			return Tre;
		}


		public void setTre(Integer tre) {
			Tre = tre;
		}


		public Integer getAvan_Act() {
			return Avan_Act;
		}


		public void setAvan_Act(Integer avan_Act) {
			Avan_Act = avan_Act;
		}


		public Date getDt_Act_Tre() {
			return Dt_Act_Tre;
		}


		public void setDt_Act_Tre(Date dt_Act_Tre) {
			Dt_Act_Tre = dt_Act_Tre;
		}


		public Date getDt_Act_Tot() {
			return Dt_Act_Tot;
		}


		public void setDt_Act_Tot(Date dt_Act_Tot) {
			Dt_Act_Tot = dt_Act_Tot;
		}


		public Integer getOrdre_Act() {
			return Ordre_Act;
		}


		public void setOrdre_Act(Integer ordre_Act) {
			Ordre_Act = ordre_Act;
		}


		public String getJustification() {
			return Justification;
		}


		public void setJustification(String justification) {
			Justification = justification;
		}


		public Date getDat_Deb() {
			return Dat_Deb;
		}


		public void setDat_Deb(Date dat_Deb) {
			Dat_Deb = dat_Deb;
		}


		public Date getDat_Fin() {
			return Dat_Fin;
		}


		public void setDat_Fin(Date dat_Fin) {
			Dat_Fin = dat_Fin;
		}


		public Integer getId_Type_Decoup() {
			return Id_Type_Decoup;
		}


		public void setId_Type_Decoup(Integer id_Type_Decoup) {
			Id_Type_Decoup = id_Type_Decoup;
		}


		public Date getDat_Deb_Act() {
			return Dat_Deb_Act;
		}


		public void setDat_Deb_Act(Date dat_Deb_Act) {
			Dat_Deb_Act = dat_Deb_Act;
		}


		public Date getDat_Fin_Act() {
			return Dat_Fin_Act;
		}


		public void setDat_Fin_Act(Date dat_Fin_Act) {
			Dat_Fin_Act = dat_Fin_Act;
		}


		public Integer getFlag_Action_Individuel() {
			return Flag_Action_Individuel;
		}


		public void setFlag_Action_Individuel(Integer flag_Action_Individuel) {
			Flag_Action_Individuel = flag_Action_Individuel;
		}


		public Integer getF_Biens() {
			return F_Biens;
		}


		public void setF_Biens(Integer f_Biens) {
			F_Biens = f_Biens;
		}


		public Integer getF_Travaux() {
			return F_Travaux;
		}


		public void setF_Travaux(Integer f_Travaux) {
			F_Travaux = f_Travaux;
		}


		public Integer getF_Services() {
			return F_Services;
		}


		public void setF_Services(Integer f_Services) {
			F_Services = f_Services;
		}


		public Integer getFlag_Mstr() {
			return Flag_Mstr;
		}


		public void setFlag_Mstr(Integer flag_Mstr) {
			Flag_Mstr = flag_Mstr;
		}


		public Integer getFlag_Deleg() {
			return Flag_Deleg;
		}


		public void setFlag_Deleg(Integer flag_Deleg) {
			Flag_Deleg = flag_Deleg;
		}


		public String getDes_Ar() {
			return Des_Ar;
		}


		public void setDes_Ar(String des_Ar) {
			Des_Ar = des_Ar;
		}


		public String getObs_Ar() {
			return Obs_Ar;
		}


		public void setObs_Ar(String obs_Ar) {
			Obs_Ar = obs_Ar;
		}


		public Integer getCout_Total() {
			return Cout_Total;
		}


		public void setCout_Total(Integer cout_Total) {
			Cout_Total = cout_Total;
		}


		public Integer getCout_Tr_Ini() {
			return Cout_Tr_Ini;
		}


		public void setCout_Tr_Ini(Integer cout_Tr_Ini) {
			Cout_Tr_Ini = cout_Tr_Ini;
		}


		public Integer getCout_Tr() {
			return Cout_Tr;
		}


		public void setCout_Tr(Integer cout_Tr) {
			Cout_Tr = cout_Tr;
		}


		public Integer getCout_Total_Ini() {
			return Cout_Total_Ini;
		}


		public void setCout_Total_Ini(Integer cout_Total_Ini) {
			Cout_Total_Ini = cout_Total_Ini;
		}


		public Integer getCout_Total_Ml() {
			return Cout_Total_Ml;
		}


		public void setCout_Total_Ml(Integer cout_Total_Ml) {
			Cout_Total_Ml = cout_Total_Ml;
		}


		public Integer getCout_Total_Ini_Ml() {
			return Cout_Total_Ini_Ml;
		}


		public void setCout_Total_Ini_Ml(Integer cout_Total_Ini_Ml) {
			Cout_Total_Ini_Ml = cout_Total_Ini_Ml;
		}


		public Integer getPoids() {
			return Poids;
		}


		public void setPoids(Integer poids) {
			Poids = poids;
		}


		public Integer getFlag_Multi_Op() {
			return Flag_Multi_Op;
		}


		public void setFlag_Multi_Op(Integer flag_Multi_Op) {
			Flag_Multi_Op = flag_Multi_Op;
		}


		public Integer getFlag_En_Difficulte() {
			return Flag_En_Difficulte;
		}


		public void setFlag_En_Difficulte(Integer flag_En_Difficulte) {
			Flag_En_Difficulte = flag_En_Difficulte;
		}


		public String getCode_Param() {
			return Code_Param;
		}


		public void setCode_Param(String code_Param) {
			Code_Param = code_Param;
		}


		public String getDes_Param() {
			return Des_Param;
		}


		public void setDes_Param(String des_Param) {
			Des_Param = des_Param;
		}


		public String getUnite() {
			return Unite;
		}


		public void setUnite(String unite) {
			Unite = unite;
		}


		public String getDes_Fe() {
			return Des_Fe;
		}


		public void setDes_Fe(String des_Fe) {
			Des_Fe = des_Fe;
		}
		



}
