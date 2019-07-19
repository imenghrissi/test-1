package com.test.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Embeddable
@IdClass(ZONE.class)
@Entity()
public class ZONE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Code_Zone", updatable = false, nullable = false)
	public String Code_Zone ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_projet", updatable = false, nullable = false)
	public Integer Id_projet ;

	public String Zon_Code_Zone; 
	public Integer Id_Bassin; 
	public String Des;
	public String Type;
	public Integer Niveau;
	public Integer Nbr_Fils;
	public Integer Surface;
	public String Be;
	public Integer Nbbenif;
	public Date Dt_Epc; 
	public String Obs;
	public String Id_Racine; 
	public String Code;
	public Date Dt_Paf; 
	public Integer Dt_Deb;
	public Integer Dt_Fin; 
	public Integer Flag_Pdp;
	public String Be_Epc;
	public String Be_Paf; 
	public Integer Zone_Op; 
	public Integer Ordre; 
	public Integer Surface_Tot; 
	public Integer Nbr_Famille; 
	public Integer  Nbr_Famille_Tot;
	public Integer Population;
	public String Code_Ins;
	public Integer Cout_Zone;
	public Integer Cout_Zone_A ;
	public Integer Paie ; 
	public Integer Paie_;
	public String Code_Ville; 
	public String Des_Ar;
	
	/*
	CONSTRAINT "FK_PROJET__PJT_ZONE" FOREIGN KEY ("id_PROJET")
	REFERENCES "PROJET" ("REFERENCE_PROJET") ENABLE, 
	*/
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="Id_project"/*,referencedColumnName="Id_projet"*/)
    private Projet Id_project;
	
	@JsonIgnore
		public Projet getId_project() {
		return Id_project;
	}

	public void setId_project(Projet id_project) {
		Id_project = id_project;
	}

		public ZONE() {
			
		}

		/**
		 * @param code_Zone
		 * @param id_projet
		 * @param zon_Code_Zone
		 * @param id_Bassin
		 * @param des
		 * @param type
		 * @param niveau
		 * @param nbr_Fils
		 * @param surface
		 * @param be
		 * @param nbbenif
		 * @param dt_Epc
		 * @param obs
		 * @param id_Racine
		 * @param code
		 * @param dt_Paf
		 * @param dt_Deb
		 * @param dt_Fin
		 * @param flag_Pdp
		 * @param be_Epc
		 * @param be_Paf
		 * @param zone_Op
		 * @param ordre
		 * @param surface_Tot
		 * @param nbr_Famille
		 * @param nbr_Famille_Tot
		 * @param population
		 * @param code_Ins
		 * @param cout_Zone
		 * @param cout_Zone_A
		 * @param paie
		 * @param paie_
		 * @param code_Ville
		 * @param des_Ar
		 */
		public ZONE(String code_Zone, Integer id_projet, String zon_Code_Zone, Integer id_Bassin, String des,
				String type, Integer niveau, Integer nbr_Fils, Integer surface, String be, Integer nbbenif, Date dt_Epc,
				String obs, String id_Racine, String code, Date dt_Paf, Integer dt_Deb, Integer dt_Fin,
				Integer flag_Pdp, String be_Epc, String be_Paf, Integer zone_Op, Integer ordre, Integer surface_Tot,
				Integer nbr_Famille, Integer nbr_Famille_Tot, Integer population, String code_Ins, Integer cout_Zone,
				Integer cout_Zone_A, Integer paie, Integer paie_, String code_Ville, String des_Ar) {
			super();
			Code_Zone = code_Zone;
			Id_projet = id_projet;
			Zon_Code_Zone = zon_Code_Zone;
			Id_Bassin = id_Bassin;
			Des = des;
			Type = type;
			Niveau = niveau;
			Nbr_Fils = nbr_Fils;
			Surface = surface;
			Be = be;
			Nbbenif = nbbenif;
			Dt_Epc = dt_Epc;
			Obs = obs;
			Id_Racine = id_Racine;
			Code = code;
			Dt_Paf = dt_Paf;
			Dt_Deb = dt_Deb;
			Dt_Fin = dt_Fin;
			Flag_Pdp = flag_Pdp;
			Be_Epc = be_Epc;
			Be_Paf = be_Paf;
			Zone_Op = zone_Op;
			Ordre = ordre;
			Surface_Tot = surface_Tot;
			Nbr_Famille = nbr_Famille;
			Nbr_Famille_Tot = nbr_Famille_Tot;
			Population = population;
			Code_Ins = code_Ins;
			Cout_Zone = cout_Zone;
			Cout_Zone_A = cout_Zone_A;
			Paie = paie;
			Paie_ = paie_;
			Code_Ville = code_Ville;
			Des_Ar = des_Ar;
		}

		public String getCode_Zone() {
			return Code_Zone;
		}

		public void setCode_Zone(String code_Zone) {
			Code_Zone = code_Zone;
		}

		public Integer getId_projet() {
			return Id_projet;
		}

		public void setId_projet(Integer id_projet) {
			Id_projet = id_projet;
		}

		public String getZon_Code_Zone() {
			return Zon_Code_Zone;
		}

		public void setZon_Code_Zone(String zon_Code_Zone) {
			Zon_Code_Zone = zon_Code_Zone;
		}

		public Integer getId_Bassin() {
			return Id_Bassin;
		}

		public void setId_Bassin(Integer id_Bassin) {
			Id_Bassin = id_Bassin;
		}

		public String getDes() {
			return Des;
		}

		public void setDes(String des) {
			Des = des;
		}

		public String getType() {
			return Type;
		}

		public void setType(String type) {
			Type = type;
		}

		public Integer getNiveau() {
			return Niveau;
		}

		public void setNiveau(Integer niveau) {
			Niveau = niveau;
		}

		public Integer getNbr_Fils() {
			return Nbr_Fils;
		}

		public void setNbr_Fils(Integer nbr_Fils) {
			Nbr_Fils = nbr_Fils;
		}

		public Integer getSurface() {
			return Surface;
		}

		public void setSurface(Integer surface) {
			Surface = surface;
		}

		public String getBe() {
			return Be;
		}

		public void setBe(String be) {
			Be = be;
		}

		public Integer getNbbenif() {
			return Nbbenif;
		}

		public void setNbbenif(Integer nbbenif) {
			Nbbenif = nbbenif;
		}

		public Date getDt_Epc() {
			return Dt_Epc;
		}

		public void setDt_Epc(Date dt_Epc) {
			Dt_Epc = dt_Epc;
		}

		public String getObs() {
			return Obs;
		}

		public void setObs(String obs) {
			Obs = obs;
		}

		public String getId_Racine() {
			return Id_Racine;
		}

		public void setId_Racine(String id_Racine) {
			Id_Racine = id_Racine;
		}

		public String getCode() {
			return Code;
		}

		public void setCode(String code) {
			Code = code;
		}

		public Date getDt_Paf() {
			return Dt_Paf;
		}

		public void setDt_Paf(Date dt_Paf) {
			Dt_Paf = dt_Paf;
		}

		public Integer getDt_Deb() {
			return Dt_Deb;
		}

		public void setDt_Deb(Integer dt_Deb) {
			Dt_Deb = dt_Deb;
		}

		public Integer getDt_Fin() {
			return Dt_Fin;
		}

		public void setDt_Fin(Integer dt_Fin) {
			Dt_Fin = dt_Fin;
		}

		public Integer getFlag_Pdp() {
			return Flag_Pdp;
		}

		public void setFlag_Pdp(Integer flag_Pdp) {
			Flag_Pdp = flag_Pdp;
		}

		public String getBe_Epc() {
			return Be_Epc;
		}

		public void setBe_Epc(String be_Epc) {
			Be_Epc = be_Epc;
		}

		public String getBe_Paf() {
			return Be_Paf;
		}

		public void setBe_Paf(String be_Paf) {
			Be_Paf = be_Paf;
		}

		public Integer getZone_Op() {
			return Zone_Op;
		}

		public void setZone_Op(Integer zone_Op) {
			Zone_Op = zone_Op;
		}

		public Integer getOrdre() {
			return Ordre;
		}

		public void setOrdre(Integer ordre) {
			Ordre = ordre;
		}

		public Integer getSurface_Tot() {
			return Surface_Tot;
		}

		public void setSurface_Tot(Integer surface_Tot) {
			Surface_Tot = surface_Tot;
		}

		public Integer getNbr_Famille() {
			return Nbr_Famille;
		}

		public void setNbr_Famille(Integer nbr_Famille) {
			Nbr_Famille = nbr_Famille;
		}

		public Integer getNbr_Famille_Tot() {
			return Nbr_Famille_Tot;
		}

		public void setNbr_Famille_Tot(Integer nbr_Famille_Tot) {
			Nbr_Famille_Tot = nbr_Famille_Tot;
		}

		public Integer getPopulation() {
			return Population;
		}

		public void setPopulation(Integer population) {
			Population = population;
		}

		public String getCode_Ins() {
			return Code_Ins;
		}

		public void setCode_Ins(String code_Ins) {
			Code_Ins = code_Ins;
		}

		public Integer getCout_Zone() {
			return Cout_Zone;
		}

		public void setCout_Zone(Integer cout_Zone) {
			Cout_Zone = cout_Zone;
		}

		public Integer getCout_Zone_A() {
			return Cout_Zone_A;
		}

		public void setCout_Zone_A(Integer cout_Zone_A) {
			Cout_Zone_A = cout_Zone_A;
		}

		public Integer getPaie() {
			return Paie;
		}

		public void setPaie(Integer paie) {
			Paie = paie;
		}

		public Integer getPaie_() {
			return Paie_;
		}

		public void setPaie_(Integer paie_) {
			Paie_ = paie_;
		}

		public String getCode_Ville() {
			return Code_Ville;
		}

		public void setCode_Ville(String code_Ville) {
			Code_Ville = code_Ville;
		}

		public String getDes_Ar() {
			return Des_Ar;
		}

		public void setDes_Ar(String des_Ar) {
			Des_Ar = des_Ar;
		}
		
	

	

}
