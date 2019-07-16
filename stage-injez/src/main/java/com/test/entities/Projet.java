package com.test.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Projet  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	private Integer id;
    
	private String REFERENCE_PROJET ;
    private String CODE_STADE;
    private String CODE_TYPE_PRJ;
    private String INTITULE_PRJ;
    private String DESC_PRJ;
    
    
	private Date DATE_DEB;
	private Date DATE_FIN ;
	private Date DATE_FIN_A;
	
	private String REF_BUD;
	
	private String MAITRE_OEUVRE ;
	
	
	private String MAITRE_OUVRAGE ;
	
	
	private Integer TRI;
	
	
	private Integer UNITE_PO_PHY ;
	
	
	private Integer UNITE_PO_FIN;
	
	private Integer UNITE_S_FIN;
	
	
	private Integer UNITE_S_PHY;
	
	
	private Integer UNITE_PM;
	
	private String OBS;
	
	
	private Integer NIV_ZONE;
	
	
	private Integer  FLAG_PLANIF_PHY ;
	
	
	private Integer FLAG_PLANIF_FIN;
	
	private Integer NIV_PLAN_FIN_INIT;
	
	private Integer NIV_PLAN_PHY_INIT ;
	
	private Integer NIV_PO_FIN ;
	
	private Integer NIV_PO_PHY ;
	
	private Integer NIV_SUIV_FIN ;
	
	private Integer NIV_SUIV_PHY ;
	
	private Integer NIV_PDL_FIN;
	
	private Integer NIV_PDL_PHY ;
	
	private Integer UNITE_PDL_PHY ;
	
	private Integer UNITE_PDL_FIN ;
	
	private Integer UNITE_INIT_PHY ;
	
	private Integer UNITE_INIT_FIN;
	
	private Date DATE_ACT_MT_TRE;
	private Date DATE_ACT_MT_TOT ;
	
	private String CODE_DEV ;

	private Integer TAUX_REF;

	private Integer  FLAG_PPINIT ;
    
	private Integer FLAG_PPPDP;
    
	private Integer FLAG_PPPTA;
   
	private Integer FLAG_SP ;
    

	private Integer FLAG_PFINIT ;
    
 
	private Integer FLAG_PFPDP ;

   	private Integer FLAG_PFPTA ;
    
	private Integer FLAG_SAF;
    
	private String REFERENCE_PROGRAMME;
    
	private Integer NIVEAU ;
    
	private Integer UNITE_PLANIF_AO ;
    
	private Integer UNITE_PLANIF_MARCHE;
    
	private Integer FLAG_PLANIF_AO ;

	private Integer FLAG_PLANIF_MARCHE;
    
	private Integer ID_STRUCTURE;

	private Integer TRII;
    
	private Integer UNITE_PLANIF_ACT_INDV ;
    private Integer FLAG_PLANIF_ACT_INDV ;
    
    
	private Date DATE_ENV_DELEG;
	
	private String MAITRE_OUVRAGE_DELEG ;
	
	private Integer FLAG_MSTR ;
	
	private Integer FLAG_DELEG ;

	private String INTITULE_PROJET_AR;

	
	private String DESC_PRJ_AR;
	

	private String MAITRE_OEUVRE_AR;
	
	private String MAITRE_OUVRAGE_AR;

	private String REF_BUDJET_AR ;

	private Integer COUT_PRJ ;
	
	private Integer COUT_PRJ_A;
	
	private Integer COUT_TR;
	
	private Integer COUT_TR_A;
	
	private Integer COUT_PRJ_ML ;
	
	private Integer COUT_PRJ_ML_A;
	
	private Date DATE_SAISIE;
	
	private Date DATE_MAJ ;
	
	private String SOUS_SECTEUR;
	
	private Integer ID_STR_SECTEUR ;
	
	private String OBS_AR;
	
	private Integer  FLAG_DECISION;
    
	private Integer F_DELETE;
    
	private Integer FLAG_EN_DIFFICULTE;
    
	/*******************Structure**********************************************/
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn
	    //(name = "structuresid", nullable = false)
	    private Structure structuresid;
	
	 
		public Structure getStructuresid() {
			return structuresid;
		}
		public void setStructuresid(Structure structuresid) {
			this.structuresid = structuresid;
		}

		/*******************stadeprojet**********************************************/
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn
	    //(name = "stadeid", nullable = false)
	    private STADE_PROJET stadeid;
	

	 		public STADE_PROJET getStadeid() {
			return stadeid;
		}
		public void setStadeid(STADE_PROJET stadeid) {
			this.stadeid = stadeid;
		}
	//constructor
    public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet( Integer id, String REFERENCE_PROJET,
			 String CODE_STADE,  String CODE_TYPE_PRJ,
			 String INTITULE_PRJ, String DESC_PRJ, Date DATE_DEB,
			Date DATE_FIN, Date DATE_FIN_A, String REF_BUD,
			 String MAITRE_OEUVRE,  String MAITRE_OUVRAGE,
			Integer TRI, Integer UNITE_PO_PHY,
			Integer UNITE_PO_FIN,  Integer UNITE_S_FIN,
			 Integer UNITE_S_PHY,  Integer UNITE_PM,
			 String OBS, Integer NIV_ZONE,
			Integer FLAG_PLANIF_PHY,  Integer FLAG_PLANIF_FIN,
			 Integer NIV_PLAN_FIN_INIT,  Integer NIV_PLAN_PHY_INIT,
			 Integer NIV_PO_FIN,  Integer NIV_PO_PHY,
			 Integer NIV_SUIV_FIN,  Integer NIV_SUIV_PHY,
			 Integer NIV_PDL_FIN,  Integer NIV_PDL_PHY,
			 Integer UNITE_PDL_PHY,  Integer UNITE_PDL_FIN,
			 Integer UNITE_INIT_PHY,  Integer UNITE_INIT_FIN,
			Date DATE_ACT_MT_TRE, Date DATE_ACT_MT_TOT, String CODE_DEV,
			 Integer TAUX_REF,  Integer FLAG_PPINIT,
			 Integer FLAG_PPPDP,Integer FLAG_PPPTA,
			 Integer FLAG_SP,  Integer FLAG_PFINIT,
			 Integer FLAG_PFPDP, Integer FLAG_PFPTA,
			 Integer FLAG_SAF,  String REFERENCE_PROGRAMME,
			 Integer NIVEAU,  Integer UNITE_PLANIF_AO,
			 Integer UNITE_PLANIF_MARCHE,  Integer FLAG_PLANIF_AO,
			 Integer FLAG_PLANIF_MARCHE, Integer ID_STRUCTURE,
			 Integer TRII,  Integer UNITE_PLANIF_ACT_INDV,
			 Integer FLAG_PLANIF_ACT_INDV, Date DATE_ENV_DELEG,
			 String MAITRE_OUVRAGE_DELEG,  Integer FLAG_MSTR,
			 Integer FLAG_DELEG, String INTITULE_PROJET_AR,
			 String DESC_PRJ_AR,String MAITRE_OEUVRE_AR,
			 String MAITRE_OUVRAGE_AR,String REF_BUDJET_AR,
		    Integer COUT_PRJ,  Integer COUT_PRJ_A,
			Integer COUT_TR,  Integer COUT_TR_A,
			 Integer COUT_PRJ_ML,  Integer COUT_PRJ_ML_A, Date DATE_SAISIE,
			Date DATE_MAJ,  String SOUS_SECTEUR,  Integer ID_STR_SECTEUR,
			 String OBS_AR, Integer FLAG_DECISION,
			 Integer F_DELETE,  Integer FLAG_EN_DIFFICULTE) {
		super();
		this.id = id;
		this.REFERENCE_PROJET = REFERENCE_PROJET;
		this.CODE_STADE = CODE_STADE;
		this.CODE_TYPE_PRJ = CODE_TYPE_PRJ;
		this.INTITULE_PRJ = INTITULE_PRJ;
		this.DESC_PRJ = DESC_PRJ;
		this.DATE_DEB = DATE_DEB;
		this.DATE_FIN = DATE_FIN;
		this.DATE_FIN_A = DATE_FIN_A;
		this.REF_BUD = REF_BUD;
		this.MAITRE_OEUVRE = MAITRE_OEUVRE;
		this.MAITRE_OUVRAGE = MAITRE_OUVRAGE;
		this.TRI = TRI;
		this.UNITE_PO_PHY = UNITE_PO_PHY;
		this.UNITE_PO_FIN = UNITE_PO_FIN;
		this.UNITE_S_FIN = UNITE_S_FIN;
		this.UNITE_S_PHY = UNITE_S_PHY;
		this.UNITE_PM = UNITE_PM;
		this.OBS = OBS;
		this.NIV_ZONE = NIV_ZONE;
		this.FLAG_PLANIF_PHY = FLAG_PLANIF_PHY;
		this.FLAG_PLANIF_FIN = FLAG_PLANIF_FIN;
		this.NIV_PLAN_FIN_INIT = NIV_PLAN_FIN_INIT;
		this.NIV_PLAN_PHY_INIT = NIV_PLAN_PHY_INIT;
		this.NIV_PO_FIN = NIV_PO_FIN;
		this.NIV_PO_PHY = NIV_PO_PHY;
		this.NIV_SUIV_FIN = NIV_SUIV_FIN;
		this.NIV_SUIV_PHY = NIV_SUIV_PHY;
		this.NIV_PDL_FIN = NIV_PDL_FIN;
		this.NIV_PDL_PHY = NIV_PDL_PHY;
		this.UNITE_PDL_PHY = UNITE_PDL_PHY;
		this.UNITE_PDL_FIN = UNITE_PDL_FIN;
		this.UNITE_INIT_PHY = UNITE_INIT_PHY;
		this.UNITE_INIT_FIN = UNITE_INIT_FIN;
		this.DATE_ACT_MT_TRE = DATE_ACT_MT_TRE;
		this.DATE_ACT_MT_TOT = DATE_ACT_MT_TOT;
		this.CODE_DEV = CODE_DEV;
		this.TAUX_REF = TAUX_REF;
		this.FLAG_PPINIT = FLAG_PPINIT;
		this.FLAG_PPPDP = FLAG_PPPDP;
		this.FLAG_PPPTA = FLAG_PPPTA;
		this.FLAG_SP = FLAG_SP;
		this.FLAG_PFINIT = FLAG_PFINIT;
		this.FLAG_PFPDP = FLAG_PFPDP;
		this.FLAG_PFPTA = FLAG_PFPTA;
		this.FLAG_SAF = FLAG_SAF;
		this.REFERENCE_PROGRAMME = REFERENCE_PROGRAMME;
		this.NIVEAU = NIVEAU;
		this.UNITE_PLANIF_AO = UNITE_PLANIF_AO;
		this.UNITE_PLANIF_MARCHE = UNITE_PLANIF_MARCHE;
		this.FLAG_PLANIF_AO = FLAG_PLANIF_AO;
		this.FLAG_PLANIF_MARCHE = FLAG_PLANIF_MARCHE;
		this.ID_STRUCTURE = ID_STRUCTURE;
		this.TRII = TRII;
		this.UNITE_PLANIF_ACT_INDV = UNITE_PLANIF_ACT_INDV;
		this.FLAG_PLANIF_ACT_INDV = FLAG_PLANIF_ACT_INDV;
		this.DATE_ENV_DELEG = DATE_ENV_DELEG;
		this.MAITRE_OUVRAGE_DELEG = MAITRE_OUVRAGE_DELEG;
		this.FLAG_MSTR = FLAG_MSTR;
		this.FLAG_DELEG = FLAG_DELEG;
		this.INTITULE_PROJET_AR = INTITULE_PROJET_AR;
		this.DESC_PRJ_AR = DESC_PRJ_AR;
		this.MAITRE_OEUVRE_AR = MAITRE_OEUVRE_AR;
		this.MAITRE_OUVRAGE_AR = MAITRE_OUVRAGE_AR;
		this.REF_BUDJET_AR = REF_BUDJET_AR;
		this.COUT_PRJ = COUT_PRJ;
		this.COUT_PRJ_A = COUT_PRJ_A;
		this.COUT_TR = COUT_TR;
		this.COUT_TR_A = COUT_TR_A;
		this.COUT_PRJ_ML = COUT_PRJ_ML;
		this.COUT_PRJ_ML_A = COUT_PRJ_ML_A;
		this.DATE_SAISIE = DATE_SAISIE;
		this.DATE_MAJ = DATE_MAJ;
		this.SOUS_SECTEUR = SOUS_SECTEUR;
		this.ID_STR_SECTEUR = ID_STR_SECTEUR;
		this.OBS_AR = OBS_AR;
		this.FLAG_DECISION = FLAG_DECISION;
		this.F_DELETE = F_DELETE;
		this.FLAG_EN_DIFFICULTE = FLAG_EN_DIFFICULTE;
	}

    
    
    
    
    


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getREFERENCE_PROJET() {
		return REFERENCE_PROJET;
	}

	public void setREFERENCE_PROJET(String rEFERENCE_PROJET) {
		REFERENCE_PROJET = rEFERENCE_PROJET;
	}

	public String getCODE_STADE() {
		return CODE_STADE;
	}

	public void setCODE_STADE(String cODE_STADE) {
		CODE_STADE = cODE_STADE;
	}

	public String getCODE_TYPE_PRJ() {
		return CODE_TYPE_PRJ;
	}

	public void setCODE_TYPE_PRJ(String cODE_TYPE_PRJ) {
		CODE_TYPE_PRJ = cODE_TYPE_PRJ;
	}

	public String getINTITULE_PRJ() {
		return INTITULE_PRJ;
	}

	public void setINTITULE_PRJ(String iNTITULE_PRJ) {
		INTITULE_PRJ = iNTITULE_PRJ;
	}

	public String getDESC_PRJ() {
		return DESC_PRJ;
	}

	public void setDESC_PRJ(String dESC_PRJ) {
		DESC_PRJ = dESC_PRJ;
	}

	public Date getDATE_DEB() {
		return DATE_DEB;
	}

	public void setDATE_DEB(Date dATE_DEB) {
		DATE_DEB = dATE_DEB;
	}

	public Date getDATE_FIN() {
		return DATE_FIN;
	}

	public void setDATE_FIN(Date dATE_FIN) {
		DATE_FIN = dATE_FIN;
	}

	public Date getDATE_FIN_A() {
		return DATE_FIN_A;
	}

	public void setDATE_FIN_A(Date dATE_FIN_A) {
		DATE_FIN_A = dATE_FIN_A;
	}

	public String getREF_BUD() {
		return REF_BUD;
	}

	public void setREF_BUD(String rEF_BUD) {
		REF_BUD = rEF_BUD;
	}

	public String getMAITRE_OEUVRE() {
		return MAITRE_OEUVRE;
	}

	public void setMAITRE_OEUVRE(String mAITRE_OEUVRE) {
		MAITRE_OEUVRE = mAITRE_OEUVRE;
	}

	public String getMAITRE_OUVRAGE() {
		return MAITRE_OUVRAGE;
	}

	public void setMAITRE_OUVRAGE(String mAITRE_OUVRAGE) {
		MAITRE_OUVRAGE = mAITRE_OUVRAGE;
	}

	public Integer getTRI() {
		return TRI;
	}

	public void setTRI(Integer tRI) {
		TRI = tRI;
	}

	public Integer getUNITE_PO_PHY() {
		return UNITE_PO_PHY;
	}

	public void setUNITE_PO_PHY(Integer uNITE_PO_PHY) {
		UNITE_PO_PHY = uNITE_PO_PHY;
	}

	public Integer getUNITE_PO_FIN() {
		return UNITE_PO_FIN;
	}

	public void setUNITE_PO_FIN(Integer uNITE_PO_FIN) {
		UNITE_PO_FIN = uNITE_PO_FIN;
	}

	public Integer getUNITE_S_FIN() {
		return UNITE_S_FIN;
	}

	public void setUNITE_S_FIN(Integer uNITE_S_FIN) {
		UNITE_S_FIN = uNITE_S_FIN;
	}

	public Integer getUNITE_S_PHY() {
		return UNITE_S_PHY;
	}

	public void setUNITE_S_PHY(Integer uNITE_S_PHY) {
		UNITE_S_PHY = uNITE_S_PHY;
	}

	public Integer getUNITE_PM() {
		return UNITE_PM;
	}

	public void setUNITE_PM(Integer uNITE_PM) {
		UNITE_PM = uNITE_PM;
	}

	public String getOBS() {
		return OBS;
	}

	public void setOBS(String oBS) {
		OBS = oBS;
	}

	public Integer getNIV_ZONE() {
		return NIV_ZONE;
	}

	public void setNIV_ZONE(Integer nIV_ZONE) {
		NIV_ZONE = nIV_ZONE;
	}

	public Integer getFLAG_PLANIF_PHY() {
		return FLAG_PLANIF_PHY;
	}

	public void setFLAG_PLANIF_PHY(Integer fLAG_PLANIF_PHY) {
		FLAG_PLANIF_PHY = fLAG_PLANIF_PHY;
	}

	public Integer getFLAG_PLANIF_FIN() {
		return FLAG_PLANIF_FIN;
	}

	public void setFLAG_PLANIF_FIN(Integer fLAG_PLANIF_FIN) {
		FLAG_PLANIF_FIN = fLAG_PLANIF_FIN;
	}

	public Integer getNIV_PLAN_FIN_INIT() {
		return NIV_PLAN_FIN_INIT;
	}

	public void setNIV_PLAN_FIN_INIT(Integer nIV_PLAN_FIN_INIT) {
		NIV_PLAN_FIN_INIT = nIV_PLAN_FIN_INIT;
	}

	public Integer getNIV_PLAN_PHY_INIT() {
		return NIV_PLAN_PHY_INIT;
	}

	public void setNIV_PLAN_PHY_INIT(Integer nIV_PLAN_PHY_INIT) {
		NIV_PLAN_PHY_INIT = nIV_PLAN_PHY_INIT;
	}

	public Integer getNIV_PO_FIN() {
		return NIV_PO_FIN;
	}

	public void setNIV_PO_FIN(Integer nIV_PO_FIN) {
		NIV_PO_FIN = nIV_PO_FIN;
	}

	public Integer getNIV_PO_PHY() {
		return NIV_PO_PHY;
	}

	public void setNIV_PO_PHY(Integer nIV_PO_PHY) {
		NIV_PO_PHY = nIV_PO_PHY;
	}

	public Integer getNIV_SUIV_FIN() {
		return NIV_SUIV_FIN;
	}

	public void setNIV_SUIV_FIN(Integer nIV_SUIV_FIN) {
		NIV_SUIV_FIN = nIV_SUIV_FIN;
	}

	public Integer getNIV_SUIV_PHY() {
		return NIV_SUIV_PHY;
	}

	public void setNIV_SUIV_PHY(Integer nIV_SUIV_PHY) {
		NIV_SUIV_PHY = nIV_SUIV_PHY;
	}

	public Integer getNIV_PDL_FIN() {
		return NIV_PDL_FIN;
	}

	public void setNIV_PDL_FIN(Integer nIV_PDL_FIN) {
		NIV_PDL_FIN = nIV_PDL_FIN;
	}

	public Integer getNIV_PDL_PHY() {
		return NIV_PDL_PHY;
	}

	public void setNIV_PDL_PHY(Integer nIV_PDL_PHY) {
		NIV_PDL_PHY = nIV_PDL_PHY;
	}

	public Integer getUNITE_PDL_PHY() {
		return UNITE_PDL_PHY;
	}

	public void setUNITE_PDL_PHY(Integer uNITE_PDL_PHY) {
		UNITE_PDL_PHY = uNITE_PDL_PHY;
	}

	public Integer getUNITE_PDL_FIN() {
		return UNITE_PDL_FIN;
	}

	public void setUNITE_PDL_FIN(Integer uNITE_PDL_FIN) {
		UNITE_PDL_FIN = uNITE_PDL_FIN;
	}

	public Integer getUNITE_INIT_PHY() {
		return UNITE_INIT_PHY;
	}

	public void setUNITE_INIT_PHY(Integer uNITE_INIT_PHY) {
		UNITE_INIT_PHY = uNITE_INIT_PHY;
	}

	public Integer getUNITE_INIT_FIN() {
		return UNITE_INIT_FIN;
	}

	public void setUNITE_INIT_FIN(Integer uNITE_INIT_FIN) {
		UNITE_INIT_FIN = uNITE_INIT_FIN;
	}

	public Date getDATE_ACT_MT_TRE() {
		return DATE_ACT_MT_TRE;
	}

	public void setDATE_ACT_MT_TRE(Date dATE_ACT_MT_TRE) {
		DATE_ACT_MT_TRE = dATE_ACT_MT_TRE;
	}

	public Date getDATE_ACT_MT_TOT() {
		return DATE_ACT_MT_TOT;
	}

	public void setDATE_ACT_MT_TOT(Date dATE_ACT_MT_TOT) {
		DATE_ACT_MT_TOT = dATE_ACT_MT_TOT;
	}

	public String getCODE_DEV() {
		return CODE_DEV;
	}

	public void setCODE_DEV(String cODE_DEV) {
		CODE_DEV = cODE_DEV;
	}

	public Integer getTAUX_REF() {
		return TAUX_REF;
	}

	public void setTAUX_REF(Integer tAUX_REF) {
		TAUX_REF = tAUX_REF;
	}

	public Integer getFLAG_PPINIT() {
		return FLAG_PPINIT;
	}

	public void setFLAG_PPINIT(Integer fLAG_PPINIT) {
		FLAG_PPINIT = fLAG_PPINIT;
	}

	public Integer getFLAG_PPPDP() {
		return FLAG_PPPDP;
	}

	public void setFLAG_PPPDP(Integer fLAG_PPPDP) {
		FLAG_PPPDP = fLAG_PPPDP;
	}

	public Integer getFLAG_PPPTA() {
		return FLAG_PPPTA;
	}

	public void setFLAG_PPPTA(Integer fLAG_PPPTA) {
		FLAG_PPPTA = fLAG_PPPTA;
	}

	public Integer getFLAG_SP() {
		return FLAG_SP;
	}

	public void setFLAG_SP(Integer fLAG_SP) {
		FLAG_SP = fLAG_SP;
	}

	public Integer getFLAG_PFINIT() {
		return FLAG_PFINIT;
	}

	public void setFLAG_PFINIT(Integer fLAG_PFINIT) {
		FLAG_PFINIT = fLAG_PFINIT;
	}

	public Integer getFLAG_PFPDP() {
		return FLAG_PFPDP;
	}

	public void setFLAG_PFPDP(Integer fLAG_PFPDP) {
		FLAG_PFPDP = fLAG_PFPDP;
	}

	public Integer getFLAG_PFPTA() {
		return FLAG_PFPTA;
	}

	public void setFLAG_PFPTA(Integer fLAG_PFPTA) {
		FLAG_PFPTA = fLAG_PFPTA;
	}

	public Integer getFLAG_SAF() {
		return FLAG_SAF;
	}

	public void setFLAG_SAF(Integer fLAG_SAF) {
		FLAG_SAF = fLAG_SAF;
	}

	public String getREFERENCE_PROGRAMME() {
		return REFERENCE_PROGRAMME;
	}

	public void setREFERENCE_PROGRAMME(String rEFERENCE_PROGRAMME) {
		REFERENCE_PROGRAMME = rEFERENCE_PROGRAMME;
	}

	public Integer getNIVEAU() {
		return NIVEAU;
	}

	public void setNIVEAU(Integer nIVEAU) {
		NIVEAU = nIVEAU;
	}

	public Integer getUNITE_PLANIF_AO() {
		return UNITE_PLANIF_AO;
	}

	public void setUNITE_PLANIF_AO(Integer uNITE_PLANIF_AO) {
		UNITE_PLANIF_AO = uNITE_PLANIF_AO;
	}

	public Integer getUNITE_PLANIF_MARCHE() {
		return UNITE_PLANIF_MARCHE;
	}

	public void setUNITE_PLANIF_MARCHE(Integer uNITE_PLANIF_MARCHE) {
		UNITE_PLANIF_MARCHE = uNITE_PLANIF_MARCHE;
	}

	public Integer getFLAG_PLANIF_AO() {
		return FLAG_PLANIF_AO;
	}

	public void setFLAG_PLANIF_AO(Integer fLAG_PLANIF_AO) {
		FLAG_PLANIF_AO = fLAG_PLANIF_AO;
	}

	public Integer getFLAG_PLANIF_MARCHE() {
		return FLAG_PLANIF_MARCHE;
	}

	public void setFLAG_PLANIF_MARCHE(Integer fLAG_PLANIF_MARCHE) {
		FLAG_PLANIF_MARCHE = fLAG_PLANIF_MARCHE;
	}

	public Integer getID_STRUCTURE() {
		return ID_STRUCTURE;
	}

	public void setID_STRUCTURE(Integer Id_STRUCTURE) {
		ID_STRUCTURE = Id_STRUCTURE;
	}

	public Integer getTRII() {
		return TRII;
	}

	public void setTRII(Integer tRII) {
		TRII = tRII;
	}

	public Integer getUNITE_PLANIF_ACT_INDV() {
		return UNITE_PLANIF_ACT_INDV;
	}

	public void setUNITE_PLANIF_ACT_INDV(Integer uNITE_PLANIF_ACT_INDV) {
		UNITE_PLANIF_ACT_INDV = uNITE_PLANIF_ACT_INDV;
	}

	public Integer getFLAG_PLANIF_ACT_INDV() {
		return FLAG_PLANIF_ACT_INDV;
	}

	public void setFLAG_PLANIF_ACT_INDV(Integer fLAG_PLANIF_ACT_INDV) {
		FLAG_PLANIF_ACT_INDV = fLAG_PLANIF_ACT_INDV;
	}

	public Date getDATE_ENV_DELEG() {
		return DATE_ENV_DELEG;
	}

	public void setDATE_ENV_DELEG(Date dATE_ENV_DELEG) {
		DATE_ENV_DELEG = dATE_ENV_DELEG;
	}

	public String getMAITRE_OUVRAGE_DELEG() {
		return MAITRE_OUVRAGE_DELEG;
	}

	public void setMAITRE_OUVRAGE_DELEG(String mAITRE_OUVRAGE_DELEG) {
		MAITRE_OUVRAGE_DELEG = mAITRE_OUVRAGE_DELEG;
	}

	public Integer getFLAG_MSTR() {
		return FLAG_MSTR;
	}

	public void setFLAG_MSTR(Integer fLAG_MSTR) {
		FLAG_MSTR = fLAG_MSTR;
	}

	public Integer getFLAG_DELEG() {
		return FLAG_DELEG;
	}

	public void setFLAG_DELEG(Integer fLAG_DELEG) {
		FLAG_DELEG = fLAG_DELEG;
	}

	public String getINTITULE_PROJET_AR() {
		return INTITULE_PROJET_AR;
	}

	public void setINTITULE_PROJET_AR(String iNTITULE_PROJET_AR) {
		INTITULE_PROJET_AR = iNTITULE_PROJET_AR;
	}

	public String getDESC_PRJ_AR() {
		return DESC_PRJ_AR;
	}

	public void setDESC_PRJ_AR(String dESC_PRJ_AR) {
		DESC_PRJ_AR = dESC_PRJ_AR;
	}

	public String getMAITRE_OEUVRE_AR() {
		return MAITRE_OEUVRE_AR;
	}

	public void setMAITRE_OEUVRE_AR(String mAITRE_OEUVRE_AR) {
		MAITRE_OEUVRE_AR = mAITRE_OEUVRE_AR;
	}

	public String getMAITRE_OUVRAGE_AR() {
		return MAITRE_OUVRAGE_AR;
	}

	public void setMAITRE_OUVRAGE_AR(String mAITRE_OUVRAGE_AR) {
		MAITRE_OUVRAGE_AR = mAITRE_OUVRAGE_AR;
	}

	public String getREF_BUDJET_AR() {
		return REF_BUDJET_AR;
	}

	public void setREF_BUDJET_AR(String rEF_BUDJET_AR) {
		REF_BUDJET_AR = rEF_BUDJET_AR;
	}

	public Integer getCOUT_PRJ() {
		return COUT_PRJ;
	}

	public void setCOUT_PRJ(Integer cOUT_PRJ) {
		COUT_PRJ = cOUT_PRJ;
	}

	public Integer getCOUT_PRJ_A() {
		return COUT_PRJ_A;
	}

	public void setCOUT_PRJ_A(Integer cOUT_PRJ_A) {
		COUT_PRJ_A = cOUT_PRJ_A;
	}

	public Integer getCOUT_TR() {
		return COUT_TR;
	}

	public void setCOUT_TR(Integer cOUT_TR) {
		COUT_TR = cOUT_TR;
	}

	public Integer getCOUT_TR_A() {
		return COUT_TR_A;
	}

	public void setCOUT_TR_A(Integer cOUT_TR_A) {
		COUT_TR_A = cOUT_TR_A;
	}

	public Integer getCOUT_PRJ_ML() {
		return COUT_PRJ_ML;
	}

	public void setCOUT_PRJ_ML(Integer cOUT_PRJ_ML) {
		COUT_PRJ_ML = cOUT_PRJ_ML;
	}

	public Integer getCOUT_PRJ_ML_A() {
		return COUT_PRJ_ML_A;
	}

	public void setCOUT_PRJ_ML_A(Integer cOUT_PRJ_ML_A) {
		COUT_PRJ_ML_A = cOUT_PRJ_ML_A;
	}

	public Date getDATE_SAISIE() {
		return DATE_SAISIE;
	}

	public void setDATE_SAISIE(Date dATE_SAISIE) {
		DATE_SAISIE = dATE_SAISIE;
	}

	public Date getDATE_MAJ() {
		return DATE_MAJ;
	}

	public void setDATE_MAJ(Date dATE_MAJ) {
		DATE_MAJ = dATE_MAJ;
	}

	public String getSOUS_SECTEUR() {
		return SOUS_SECTEUR;
	}

	public void setSOUS_SECTEUR(String sOUS_SECTEUR) {
		SOUS_SECTEUR = sOUS_SECTEUR;
	}

	public Integer getID_STR_SECTEUR() {
		return ID_STR_SECTEUR;
	}

	public void setID_STR_SECTEUR(Integer iD_STR_SECTEUR) {
		ID_STR_SECTEUR = iD_STR_SECTEUR;
	}

	public String getOBS_AR() {
		return OBS_AR;
	}

	public void setOBS_AR(String oBS_AR) {
		OBS_AR = oBS_AR;
	}

	public Integer getFLAG_DECISION() {
		return FLAG_DECISION;
	}

	public void setFLAG_DECISION(Integer fLAG_DECISION) {
		FLAG_DECISION = fLAG_DECISION;
	}

	public Integer getF_DELETE() {
		return F_DELETE;
	}

	public void setF_DELETE(Integer f_DELETE) {
		F_DELETE = f_DELETE;
	}

	public Integer getFLAG_EN_DIFFICULTE() {
		return FLAG_EN_DIFFICULTE;
	}

	public void setFLAG_EN_DIFFICULTE(Integer fLAG_EN_DIFFICULTE) {
		FLAG_EN_DIFFICULTE = fLAG_EN_DIFFICULTE;
		}

		
    

}
