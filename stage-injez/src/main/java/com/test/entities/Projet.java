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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import org.hibernate.FetchMode;
//import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class Projet implements Serializable {
	/*
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", updatable = false, nullable = false)
	@Id
	private Integer Id;
    
	private String Reference_Projet ;
    //private String CODE_STADE;
    //private String Code_Type_Prj;
    private String Intitule_Prj;
    private String Desc_Prj;
   	private Date Date_Deb;
	private Date Date_Fin ;
	private Date Date_Fin_A;
	
	private String Ref_Bud;
	
	private String Maitre_Oeuvre ;
	
	
	private String Maitre_Ouvrage ;
	
	
	private Integer Tri;
	
	
	private Integer Unite_Po_Phy ;
	
	
	private Integer Unite_Po_Fin;
	
	private Integer Unite_S_Fin;
	
	
	private Integer Unite_S_Phy;
	
	
	private Integer Unite_Pm;
	
	private String Obs;
	
	
	private Integer Niv_Zone;
	
	
	private Integer  Flag_Planif_Phy ;
	
	
	private Integer Flag_Planif_Fin;
	
	private Integer Niv_Plan_Fin_Init;
	
	private Integer Niv_Plan_Phy_Init ;
	
	private Integer Niv_Po_Fin ;
	
	private Integer Niv_Po_Phy ;
	
	private Integer Niv_Suiv_Fin ;
	
	private Integer Niv_Suiv_Phy ;
	
	private Integer Niv_Pdl_Fin;
	
	private Integer Niv_Pdl_Phy ;
	
	private Integer Unite_Pdl_Phy ;
	
	private Integer Unite_Pdl_Fin ;
	
	private Integer Unite_Init_Phy ;
	
	private Integer Unite_Init_Fin;
	
	private Date Date_Act_Mt_Tre;
	private Date Date_Act_Mt_Tot ;
	
	private String Code_Dev ;

	private Integer Taux_Ref;

	private Integer  Flag_Ppinit ;
    
	private Integer Flag_Pppdp;
    
	private Integer Flag_Pppta;
   
	private Integer Flag_Sp ;
    

	private Integer Flag_Pfinit ;
    
 
	private Integer Flag_Pfpdp ;

   	private Integer Flag_Pfpta ;
    
	private Integer Flag_Saf;
    
	private String Reference_Programme;
    
	private Integer Niveau ;
    
	private Integer Unite_Planif_Ao ;
    
	private Integer Unite_Planif_Marche;
    
	private Integer Flag_Planif_Ao ;

	private Integer Flag_Planif_Marche;
    
	//private Integer ID_STRUCTURE;

	private Integer Trii;
    
	private Integer Unite_Planif_Act_Indv ;
    private Integer Flag_Planif_Act_Indv ;
    
    
	private Date Date_Env_Deleg;
	
	private String Maitre_Ouvrage_Deleg ;
	
	private Integer Flag_Mstr ;
	
	private Integer Flag_Deleg ;

	private String Intitule_Projet_Ar;

	
	private String Desc_Prj_Ar;
	

	private String Maitre_Oeuvrage_Ar;
	
	private String Maitre_Ouvrage_Ar;

	private String Ref_Budjet_Ar ;

	private Integer Cout_Prj ;
	
	private Integer Cout_Prj_A;
	
	private Integer Cout_Tr;
	
	private Integer Cout_Tr_A;
	
	private Integer Cout_Prj_Ml ;
	
	private Integer Cout_Prj_Ml_A;
	
	private Date Date_Saisie;
	
	private Date Date_Maj ;
	
	private String Sous_Secteur;
	
	private Integer Id_Str_Secteur ;
	
	private String Obs_Ar;
	
	private Integer  Flag_Decision;
    
	private Integer F_Delete;
    
	private Integer Flag_En_Difficulte;
    
	/*******************Structure**********************************************/
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="Id_Structure")
	    private Structure structure;
	 @JsonIgnore
	 public Structure getStructure() {
			return structure;
		}

		public void setStructure(Structure structure) {
			this.structure = structure;
		}
		/*******************typeProjet**********************************************/
		 @ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumn(name="Code_Type_Prj")
		    private Type_Projet typeprojet;
		 @JsonIgnore
		 
		 
			public Type_Projet getTypeprojet() {
				return typeprojet;
			}

			public void setTypeprojet(Type_Projet typeprojet) {
				this.typeprojet = typeprojet;
			}
	
	
		/*******************stadeprojet**********************************************/
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="CodeStade")
	   private STADE_PROJET stadeprojet;

	

	@JsonIgnore
	public STADE_PROJET getStadeprojet() {
		return stadeprojet;
	}

	public void setStadeprojet(STADE_PROJET stadeprojet) {
		this.stadeprojet = stadeprojet;
	}
		
	/*****CONSTRAINT "FK_PROJET___PJT_ACTIVITE" FOREIGN KEY ("Id_projet")*////////
		@LazyCollection(LazyCollectionOption.FALSE)
		@OneToMany(mappedBy="Id",cascade = CascadeType.ALL)
	  private Collection<Activite> activite;
		
		@JsonIgnore
		public Collection<Activite> getActivite() {
		return activite;
	}

	public void setActivite(Collection<Activite> activite) {
		this.activite = activite;
	}


		/*
	 * 
	 */
	

	  
	  

	 



		/*		
 * 
 * 
 */
		@LazyCollection(LazyCollectionOption.FALSE)
		@OneToMany(mappedBy="Id",cascade = CascadeType.ALL)
		  private Collection<FE> fe;
		
		@JsonIgnore	
		public Collection<FE> getFe() {
			return fe;
		}

		public void setFe(Collection<FE> fe) {
			this.fe = fe;
		}

				
 /* 
  * 
  * 
  *  */
		@LazyCollection(LazyCollectionOption.FALSE)
		@OneToMany(mappedBy="Id",cascade = CascadeType.ALL)
		   private Collection<ZONE> zone;
		
	

		@JsonIgnore
	public Collection<ZONE> getZone() {
			return zone;
		}

		public void setZone(Collection<ZONE> zone) {
			this.zone = zone;
		}

		
/*******CONSTRAINT "FK_PROJET_PROFIL_PROJET_1" FOREIGN KEY ("Id_PROJET")REFERENCES "PROJET" ("Id_PROJET") ENABLE,*/

		@LazyCollection(LazyCollectionOption.FALSE)
		@OneToMany(mappedBy="Id",cascade = CascadeType.ALL)
	  private Collection<Profil_Projet> profilprojet;
	  
	  
/*******CONSTRAINT "fk Projet,profilprojet" FOREIGN KEY ("code Reference_Projet")REFERENCES "Projet" ("Reference_Projet") ENABLE,*/


		@OneToMany(mappedBy="projet",cascade = CascadeType.ALL)
	  private Collection<Profil_Projet> profilproject;

	  
	//constructor
    public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
       
		/**
		 * @param id
		 * @param reference_Projet
		 * @param code_Type_Prj
		 * @param intitule_Prj
		 * @param desc_Prj
		 * @param date_Deb
		 * @param date_Fin
		 * @param date_Fin_A
		 * @param ref_Bud
		 * @param maitre_Oeuvre
		 * @param maitre_Ouvrage
		 * @param tri
		 * @param unite_Po_Phy
		 * @param unite_Po_Fin
		 * @param unite_S_Fin
		 * @param unite_S_Phy
		 * @param unite_Pm
		 * @param obs
		 * @param niv_Zone
		 * @param flag_Planif_Phy
		 * @param flag_Planif_Fin
		 * @param niv_Plan_Fin_Init
		 * @param niv_Plan_Phy_Init
		 * @param niv_Po_Fin
		 * @param niv_Po_Phy
		 * @param niv_Suiv_Fin
		 * @param niv_Suiv_Phy
		 * @param niv_Pdl_Fin
		 * @param niv_Pdl_Phy
		 * @param unite_Pdl_Phy
		 * @param unite_Pdl_Fin
		 * @param unite_Init_Phy
		 * @param unite_Init_Fin
		 * @param date_Act_Mt_Tre
		 * @param date_Act_Mt_Tot
		 * @param code_Dev
		 * @param taux_Ref
		 * @param flag_Ppinit
		 * @param flag_Pppdp
		 * @param flag_Pppta
		 * @param flag_Sp
		 * @param flag_Pfinit
		 * @param flag_Pfpdp
		 * @param flag_Pfpta
		 * @param flag_Saf
		 * @param reference_Programme
		 * @param niveau
		 * @param unite_Planif_Ao
		 * @param unite_Planif_Marche
		 * @param flag_Planif_Ao
		 * @param flag_Planif_Marche
		 * @param trii
		 * @param unite_Planif_Act_Indv
		 * @param flag_Planif_Act_Indv
		 * @param date_Env_Deleg
		 * @param maitre_Ouvrage_Deleg
		 * @param flag_Mstr
		 * @param flag_Deleg
		 * @param intitule_Projet_Ar
		 * @param desc_Prj_Ar
		 * @param maitre_Oeuvrage_Ar
		 * @param maitre_Ouvrage_Ar
		 * @param ref_Budjet_Ar
		 * @param cout_Prj
		 * @param cout_Prj_A
		 * @param cout_Tr
		 * @param cout_Tr_A
		 * @param cout_Prj_Ml
		 * @param cout_Prj_Ml_A
		 * @param date_Saisie
		 * @param date_Maj
		 * @param sous_Secteur
		 * @param id_Str_Secteur
		 * @param obs_Ar
		 * @param flag_Decision
		 * @param f_Delete
		 * @param flag_En_Difficulte
		 */
		public Projet(Integer id,String reference_Projet, String intitule_Prj,
				String desc_Prj, Date date_Deb, Date date_Fin, Date date_Fin_A, String ref_Bud, String maitre_Oeuvre,
				String maitre_Ouvrage, Integer tri, Integer unite_Po_Phy, Integer unite_Po_Fin, Integer unite_S_Fin,
				Integer unite_S_Phy, Integer unite_Pm, String obs, Integer niv_Zone, Integer flag_Planif_Phy,
				Integer flag_Planif_Fin, Integer niv_Plan_Fin_Init, Integer niv_Plan_Phy_Init, Integer niv_Po_Fin,
				Integer niv_Po_Phy, Integer niv_Suiv_Fin, Integer niv_Suiv_Phy, Integer niv_Pdl_Fin,
				Integer niv_Pdl_Phy, Integer unite_Pdl_Phy, Integer unite_Pdl_Fin, Integer unite_Init_Phy,
				Integer unite_Init_Fin, Date date_Act_Mt_Tre, Date date_Act_Mt_Tot, String code_Dev, Integer taux_Ref,
				Integer flag_Ppinit, Integer flag_Pppdp, Integer flag_Pppta, Integer flag_Sp, Integer flag_Pfinit,
				Integer flag_Pfpdp, Integer flag_Pfpta, Integer flag_Saf, String reference_Programme, Integer niveau,
				Integer unite_Planif_Ao, Integer unite_Planif_Marche, Integer flag_Planif_Ao,
				Integer flag_Planif_Marche, Integer trii, Integer unite_Planif_Act_Indv, Integer flag_Planif_Act_Indv,
				Date date_Env_Deleg, String maitre_Ouvrage_Deleg, Integer flag_Mstr, Integer flag_Deleg,
				String intitule_Projet_Ar, String desc_Prj_Ar, String maitre_Oeuvrage_Ar, String maitre_Ouvrage_Ar,
				String ref_Budjet_Ar, Integer cout_Prj, Integer cout_Prj_A, Integer cout_Tr, Integer cout_Tr_A,
				Integer cout_Prj_Ml, Integer cout_Prj_Ml_A, Date date_Saisie, Date date_Maj, String sous_Secteur,
				Integer id_Str_Secteur, String obs_Ar, Integer flag_Decision, Integer f_Delete,
				Integer flag_En_Difficulte) {
			super();
			Id = id;
			Reference_Projet = reference_Projet;
			
			Intitule_Prj = intitule_Prj;
			Desc_Prj = desc_Prj;
			Date_Deb = date_Deb;
			Date_Fin = date_Fin;
			Date_Fin_A = date_Fin_A;
			Ref_Bud = ref_Bud;
			Maitre_Oeuvre = maitre_Oeuvre;
			Maitre_Ouvrage = maitre_Ouvrage;
			Tri = tri;
			Unite_Po_Phy = unite_Po_Phy;
			Unite_Po_Fin = unite_Po_Fin;
			Unite_S_Fin = unite_S_Fin;
			Unite_S_Phy = unite_S_Phy;
			Unite_Pm = unite_Pm;
			Obs = obs;
			Niv_Zone = niv_Zone;
			Flag_Planif_Phy = flag_Planif_Phy;
			Flag_Planif_Fin = flag_Planif_Fin;
			Niv_Plan_Fin_Init = niv_Plan_Fin_Init;
			Niv_Plan_Phy_Init = niv_Plan_Phy_Init;
			Niv_Po_Fin = niv_Po_Fin;
			Niv_Po_Phy = niv_Po_Phy;
			Niv_Suiv_Fin = niv_Suiv_Fin;
			Niv_Suiv_Phy = niv_Suiv_Phy;
			Niv_Pdl_Fin = niv_Pdl_Fin;
			Niv_Pdl_Phy = niv_Pdl_Phy;
			Unite_Pdl_Phy = unite_Pdl_Phy;
			Unite_Pdl_Fin = unite_Pdl_Fin;
			Unite_Init_Phy = unite_Init_Phy;
			Unite_Init_Fin = unite_Init_Fin;
			Date_Act_Mt_Tre = date_Act_Mt_Tre;
			Date_Act_Mt_Tot = date_Act_Mt_Tot;
			Code_Dev = code_Dev;
			Taux_Ref = taux_Ref;
			Flag_Ppinit = flag_Ppinit;
			Flag_Pppdp = flag_Pppdp;
			Flag_Pppta = flag_Pppta;
			Flag_Sp = flag_Sp;
			Flag_Pfinit = flag_Pfinit;
			Flag_Pfpdp = flag_Pfpdp;
			Flag_Pfpta = flag_Pfpta;
			Flag_Saf = flag_Saf;
			Reference_Programme = reference_Programme;
			Niveau = niveau;
			Unite_Planif_Ao = unite_Planif_Ao;
			Unite_Planif_Marche = unite_Planif_Marche;
			Flag_Planif_Ao = flag_Planif_Ao;
			Flag_Planif_Marche = flag_Planif_Marche;
			Trii = trii;
			Unite_Planif_Act_Indv = unite_Planif_Act_Indv;
			Flag_Planif_Act_Indv = flag_Planif_Act_Indv;
			Date_Env_Deleg = date_Env_Deleg;
			Maitre_Ouvrage_Deleg = maitre_Ouvrage_Deleg;
			Flag_Mstr = flag_Mstr;
			Flag_Deleg = flag_Deleg;
			Intitule_Projet_Ar = intitule_Projet_Ar;
			Desc_Prj_Ar = desc_Prj_Ar;
			Maitre_Oeuvrage_Ar = maitre_Oeuvrage_Ar;
			Maitre_Ouvrage_Ar = maitre_Ouvrage_Ar;
			Ref_Budjet_Ar = ref_Budjet_Ar;
			Cout_Prj = cout_Prj;
			Cout_Prj_A = cout_Prj_A;
			Cout_Tr = cout_Tr;
			Cout_Tr_A = cout_Tr_A;
			Cout_Prj_Ml = cout_Prj_Ml;
			Cout_Prj_Ml_A = cout_Prj_Ml_A;
			Date_Saisie = date_Saisie;
			Date_Maj = date_Maj;
			Sous_Secteur = sous_Secteur;
			Id_Str_Secteur = id_Str_Secteur;
			Obs_Ar = obs_Ar;
			Flag_Decision = flag_Decision;
			F_Delete = f_Delete;
			Flag_En_Difficulte = flag_En_Difficulte;
		}





		


		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getReference_Projet() {
			return Reference_Projet;
		}

		public void setReference_Projet(String reference_Projet) {
			Reference_Projet = reference_Projet;
		}


		public String getIntitule_Prj() {
			return Intitule_Prj;
		}

		public void setIntitule_Prj(String intitule_Prj) {
			Intitule_Prj = intitule_Prj;
		}

		public String getDesc_Prj() {
			return Desc_Prj;
		}

		public void setDesc_Prj(String desc_Prj) {
			Desc_Prj = desc_Prj;
		}

		public Date getDate_Deb() {
			return Date_Deb;
		}

		public void setDate_Deb(Date date_Deb) {
			Date_Deb = date_Deb;
		}

		public Date getDate_Fin() {
			return Date_Fin;
		}

		public void setDate_Fin(Date date_Fin) {
			Date_Fin = date_Fin;
		}

		public Date getDate_Fin_A() {
			return Date_Fin_A;
		}

		public void setDate_Fin_A(Date date_Fin_A) {
			Date_Fin_A = date_Fin_A;
		}

		public String getRef_Bud() {
			return Ref_Bud;
		}

		public void setRef_Bud(String ref_Bud) {
			Ref_Bud = ref_Bud;
		}

		public String getMaitre_Oeuvre() {
			return Maitre_Oeuvre;
		}

		public void setMaitre_Oeuvre(String maitre_Oeuvre) {
			Maitre_Oeuvre = maitre_Oeuvre;
		}

		public String getMaitre_Ouvrage() {
			return Maitre_Ouvrage;
		}

		public void setMaitre_Ouvrage(String maitre_Ouvrage) {
			Maitre_Ouvrage = maitre_Ouvrage;
		}

		public Integer getTri() {
			return Tri;
		}

		public void setTri(Integer tri) {
			Tri = tri;
		}

		public Integer getUnite_Po_Phy() {
			return Unite_Po_Phy;
		}

		public void setUnite_Po_Phy(Integer unite_Po_Phy) {
			Unite_Po_Phy = unite_Po_Phy;
		}

		public Integer getUnite_Po_Fin() {
			return Unite_Po_Fin;
		}

		public void setUnite_Po_Fin(Integer unite_Po_Fin) {
			Unite_Po_Fin = unite_Po_Fin;
		}

		public Integer getUnite_S_Fin() {
			return Unite_S_Fin;
		}

		public void setUnite_S_Fin(Integer unite_S_Fin) {
			Unite_S_Fin = unite_S_Fin;
		}

		public Integer getUnite_S_Phy() {
			return Unite_S_Phy;
		}

		public void setUnite_S_Phy(Integer unite_S_Phy) {
			Unite_S_Phy = unite_S_Phy;
		}

		public Integer getUnite_Pm() {
			return Unite_Pm;
		}

		public void setUnite_Pm(Integer unite_Pm) {
			Unite_Pm = unite_Pm;
		}

		public String getObs() {
			return Obs;
		}

		public void setObs(String obs) {
			Obs = obs;
		}

		public Integer getNiv_Zone() {
			return Niv_Zone;
		}

		public void setNiv_Zone(Integer niv_Zone) {
			Niv_Zone = niv_Zone;
		}

		public Integer getFlag_Planif_Phy() {
			return Flag_Planif_Phy;
		}

		public void setFlag_Planif_Phy(Integer flag_Planif_Phy) {
			Flag_Planif_Phy = flag_Planif_Phy;
		}

		public Integer getFlag_Planif_Fin() {
			return Flag_Planif_Fin;
		}

		public void setFlag_Planif_Fin(Integer flag_Planif_Fin) {
			Flag_Planif_Fin = flag_Planif_Fin;
		}

		public Integer getNiv_Plan_Fin_Init() {
			return Niv_Plan_Fin_Init;
		}

		public void setNiv_Plan_Fin_Init(Integer niv_Plan_Fin_Init) {
			Niv_Plan_Fin_Init = niv_Plan_Fin_Init;
		}

		public Integer getNiv_Plan_Phy_Init() {
			return Niv_Plan_Phy_Init;
		}

		public void setNiv_Plan_Phy_Init(Integer niv_Plan_Phy_Init) {
			Niv_Plan_Phy_Init = niv_Plan_Phy_Init;
		}

		public Integer getNiv_Po_Fin() {
			return Niv_Po_Fin;
		}

		public void setNiv_Po_Fin(Integer niv_Po_Fin) {
			Niv_Po_Fin = niv_Po_Fin;
		}

		public Integer getNiv_Po_Phy() {
			return Niv_Po_Phy;
		}

		public void setNiv_Po_Phy(Integer niv_Po_Phy) {
			Niv_Po_Phy = niv_Po_Phy;
		}

		public Integer getNiv_Suiv_Fin() {
			return Niv_Suiv_Fin;
		}

		public void setNiv_Suiv_Fin(Integer niv_Suiv_Fin) {
			Niv_Suiv_Fin = niv_Suiv_Fin;
		}

		public Integer getNiv_Suiv_Phy() {
			return Niv_Suiv_Phy;
		}

		public void setNiv_Suiv_Phy(Integer niv_Suiv_Phy) {
			Niv_Suiv_Phy = niv_Suiv_Phy;
		}

		public Integer getNiv_Pdl_Fin() {
			return Niv_Pdl_Fin;
		}

		public void setNiv_Pdl_Fin(Integer niv_Pdl_Fin) {
			Niv_Pdl_Fin = niv_Pdl_Fin;
		}

		public Integer getNiv_Pdl_Phy() {
			return Niv_Pdl_Phy;
		}

		public void setNiv_Pdl_Phy(Integer niv_Pdl_Phy) {
			Niv_Pdl_Phy = niv_Pdl_Phy;
		}

		public Integer getUnite_Pdl_Phy() {
			return Unite_Pdl_Phy;
		}

		public void setUnite_Pdl_Phy(Integer unite_Pdl_Phy) {
			Unite_Pdl_Phy = unite_Pdl_Phy;
		}

		public Integer getUnite_Pdl_Fin() {
			return Unite_Pdl_Fin;
		}

		public void setUnite_Pdl_Fin(Integer unite_Pdl_Fin) {
			Unite_Pdl_Fin = unite_Pdl_Fin;
		}

		public Integer getUnite_Init_Phy() {
			return Unite_Init_Phy;
		}

		public void setUnite_Init_Phy(Integer unite_Init_Phy) {
			Unite_Init_Phy = unite_Init_Phy;
		}

		public Integer getUnite_Init_Fin() {
			return Unite_Init_Fin;
		}

		public void setUnite_Init_Fin(Integer unite_Init_Fin) {
			Unite_Init_Fin = unite_Init_Fin;
		}

		public Date getDate_Act_Mt_Tre() {
			return Date_Act_Mt_Tre;
		}

		public void setDate_Act_Mt_Tre(Date date_Act_Mt_Tre) {
			Date_Act_Mt_Tre = date_Act_Mt_Tre;
		}

		public Date getDate_Act_Mt_Tot() {
			return Date_Act_Mt_Tot;
		}

		public void setDate_Act_Mt_Tot(Date date_Act_Mt_Tot) {
			Date_Act_Mt_Tot = date_Act_Mt_Tot;
		}

		public String getCode_Dev() {
			return Code_Dev;
		}

		public void setCode_Dev(String code_Dev) {
			Code_Dev = code_Dev;
		}

		public Integer getTaux_Ref() {
			return Taux_Ref;
		}

		public void setTaux_Ref(Integer taux_Ref) {
			Taux_Ref = taux_Ref;
		}

		public Integer getFlag_Ppinit() {
			return Flag_Ppinit;
		}

		public void setFlag_Ppinit(Integer flag_Ppinit) {
			Flag_Ppinit = flag_Ppinit;
		}

		public Integer getFlag_Pppdp() {
			return Flag_Pppdp;
		}

		public void setFlag_Pppdp(Integer flag_Pppdp) {
			Flag_Pppdp = flag_Pppdp;
		}

		public Integer getFlag_Pppta() {
			return Flag_Pppta;
		}

		public void setFlag_Pppta(Integer flag_Pppta) {
			Flag_Pppta = flag_Pppta;
		}

		public Integer getFlag_Sp() {
			return Flag_Sp;
		}

		public void setFlag_Sp(Integer flag_Sp) {
			Flag_Sp = flag_Sp;
		}

		public Integer getFlag_Pfinit() {
			return Flag_Pfinit;
		}

		public void setFlag_Pfinit(Integer flag_Pfinit) {
			Flag_Pfinit = flag_Pfinit;
		}

		public Integer getFlag_Pfpdp() {
			return Flag_Pfpdp;
		}

		public void setFlag_Pfpdp(Integer flag_Pfpdp) {
			Flag_Pfpdp = flag_Pfpdp;
		}

		public Integer getFlag_Pfpta() {
			return Flag_Pfpta;
		}

		public void setFlag_Pfpta(Integer flag_Pfpta) {
			Flag_Pfpta = flag_Pfpta;
		}

		public Integer getFlag_Saf() {
			return Flag_Saf;
		}

		public void setFlag_Saf(Integer flag_Saf) {
			Flag_Saf = flag_Saf;
		}

		public String getReference_Programme() {
			return Reference_Programme;
		}

		public void setReference_Programme(String reference_Programme) {
			Reference_Programme = reference_Programme;
		}

		public Integer getNiveau() {
			return Niveau;
		}

		public void setNiveau(Integer niveau) {
			Niveau = niveau;
		}

		public Integer getUnite_Planif_Ao() {
			return Unite_Planif_Ao;
		}

		public void setUnite_Planif_Ao(Integer unite_Planif_Ao) {
			Unite_Planif_Ao = unite_Planif_Ao;
		}

		public Integer getUnite_Planif_Marche() {
			return Unite_Planif_Marche;
		}

		public void setUnite_Planif_Marche(Integer unite_Planif_Marche) {
			Unite_Planif_Marche = unite_Planif_Marche;
		}

		public Integer getFlag_Planif_Ao() {
			return Flag_Planif_Ao;
		}

		public void setFlag_Planif_Ao(Integer flag_Planif_Ao) {
			Flag_Planif_Ao = flag_Planif_Ao;
		}

		public Integer getFlag_Planif_Marche() {
			return Flag_Planif_Marche;
		}

		public void setFlag_Planif_Marche(Integer flag_Planif_Marche) {
			Flag_Planif_Marche = flag_Planif_Marche;
		}

		public Integer getTrii() {
			return Trii;
		}

		public void setTrii(Integer trii) {
			Trii = trii;
		}

		public Integer getUnite_Planif_Act_Indv() {
			return Unite_Planif_Act_Indv;
		}

		public void setUnite_Planif_Act_Indv(Integer unite_Planif_Act_Indv) {
			Unite_Planif_Act_Indv = unite_Planif_Act_Indv;
		}

		public Integer getFlag_Planif_Act_Indv() {
			return Flag_Planif_Act_Indv;
		}

		public void setFlag_Planif_Act_Indv(Integer flag_Planif_Act_Indv) {
			Flag_Planif_Act_Indv = flag_Planif_Act_Indv;
		}

		public Date getDate_Env_Deleg() {
			return Date_Env_Deleg;
		}

		public void setDate_Env_Deleg(Date date_Env_Deleg) {
			Date_Env_Deleg = date_Env_Deleg;
		}

		public String getMaitre_Ouvrage_Deleg() {
			return Maitre_Ouvrage_Deleg;
		}

		public void setMaitre_Ouvrage_Deleg(String maitre_Ouvrage_Deleg) {
			Maitre_Ouvrage_Deleg = maitre_Ouvrage_Deleg;
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

		public String getIntitule_Projet_Ar() {
			return Intitule_Projet_Ar;
		}

		public void setIntitule_Projet_Ar(String intitule_Projet_Ar) {
			Intitule_Projet_Ar = intitule_Projet_Ar;
		}

		public String getDesc_Prj_Ar() {
			return Desc_Prj_Ar;
		}

		public void setDesc_Prj_Ar(String desc_Prj_Ar) {
			Desc_Prj_Ar = desc_Prj_Ar;
		}

		public String getMaitre_Oeuvrage_Ar() {
			return Maitre_Oeuvrage_Ar;
		}

		public void setMaitre_Oeuvrage_Ar(String maitre_Oeuvrage_Ar) {
			Maitre_Oeuvrage_Ar = maitre_Oeuvrage_Ar;
		}

		public String getMaitre_Ouvrage_Ar() {
			return Maitre_Ouvrage_Ar;
		}

		public void setMaitre_Ouvrage_Ar(String maitre_Ouvrage_Ar) {
			Maitre_Ouvrage_Ar = maitre_Ouvrage_Ar;
		}

		public String getRef_Budjet_Ar() {
			return Ref_Budjet_Ar;
		}

		public void setRef_Budjet_Ar(String ref_Budjet_Ar) {
			Ref_Budjet_Ar = ref_Budjet_Ar;
		}

		public Integer getCout_Prj() {
			return Cout_Prj;
		}

		public void setCout_Prj(Integer cout_Prj) {
			Cout_Prj = cout_Prj;
		}

		public Integer getCout_Prj_A() {
			return Cout_Prj_A;
		}

		public void setCout_Prj_A(Integer cout_Prj_A) {
			Cout_Prj_A = cout_Prj_A;
		}

		public Integer getCout_Tr() {
			return Cout_Tr;
		}

		public void setCout_Tr(Integer cout_Tr) {
			Cout_Tr = cout_Tr;
		}

		public Integer getCout_Tr_A() {
			return Cout_Tr_A;
		}

		public void setCout_Tr_A(Integer cout_Tr_A) {
			Cout_Tr_A = cout_Tr_A;
		}

		public Integer getCout_Prj_Ml() {
			return Cout_Prj_Ml;
		}

		public void setCout_Prj_Ml(Integer cout_Prj_Ml) {
			Cout_Prj_Ml = cout_Prj_Ml;
		}

		public Integer getCout_Prj_Ml_A() {
			return Cout_Prj_Ml_A;
		}

		public void setCout_Prj_Ml_A(Integer cout_Prj_Ml_A) {
			Cout_Prj_Ml_A = cout_Prj_Ml_A;
		}

		public Date getDate_Saisie() {
			return Date_Saisie;
		}

		public void setDate_Saisie(Date date_Saisie) {
			Date_Saisie = date_Saisie;
		}

		public Date getDate_Maj() {
			return Date_Maj;
		}

		public void setDate_Maj(Date date_Maj) {
			Date_Maj = date_Maj;
		}

		public String getSous_Secteur() {
			return Sous_Secteur;
		}

		public void setSous_Secteur(String sous_Secteur) {
			Sous_Secteur = sous_Secteur;
		}

		public Integer getId_Str_Secteur() {
			return Id_Str_Secteur;
		}

		public void setId_Str_Secteur(Integer id_Str_Secteur) {
			Id_Str_Secteur = id_Str_Secteur;
		}

		public String getObs_Ar() {
			return Obs_Ar;
		}

		public void setObs_Ar(String obs_Ar) {
			Obs_Ar = obs_Ar;
		}

		public Integer getFlag_Decision() {
			return Flag_Decision;
		}

		public void setFlag_Decision(Integer flag_Decision) {
			Flag_Decision = flag_Decision;
		}

		public Integer getF_Delete() {
			return F_Delete;
		}

		public void setF_Delete(Integer f_Delete) {
			F_Delete = f_Delete;
		}

		public Integer getFlag_En_Difficulte() {
			return Flag_En_Difficulte;
		}

		public void setFlag_En_Difficulte(Integer flag_En_Difficulte) {
			Flag_En_Difficulte = flag_En_Difficulte;
		}
	
	   // @ManyToMany(mappedBy = "projets")
	    //private Set<Activite> acitivites = new HashSet<>();




}
