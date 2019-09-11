package com.test.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
//@IdClass(Profil_Projet.class)
public class Profil_Projet implements Serializable{
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_Projet", updatable = false, nullable = false)
	@Id
	   private Integer Id_Projet ;
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_Profil", updatable = false, nullable = false)
	@Id
	   private Integer Id_Profil ;
	
	
	
	 private Integer Acces_Complet ; 
	 private  Integer Acces_Consult ; 

	 
/*******CONSTRAINT "FK_PROJET_PROFIL_PROJET_1" FOREIGN KEY ("Id_PROJET")REFERENCES "PROJET" ("Id_PROJET") ENABLE,*/
		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="Id_Projet",referencedColumnName = "Id")
	    private Projet Id;	 
		
/*******CONSTRAINT "fk Projet,profilprojet" FOREIGN KEY ("code Reference_Projet")REFERENCES "Projet" ("Reference_Projet") ENABLE,*/

	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="Reference_Projet")
		    private Projet projet;

/*******constrainte utilisateur et profil_projet,*/
		
		 @ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumns({
			  @JoinColumn(name = "Login"),
			  @JoinColumn(name = "Cod_App")
			})
		   private Utilisateur utilisateur;
		 
/*******CONSTRAINT "FK_activite,profilprojet" FOREIGN KEY ("Code_Activite")REFERENCES "Activite" ("Code_Activite") ENABLE,*/

		 //@ManyToOne(targetEntity = Activite.class, fetch = FetchType.LAZY)
		 //@JoinColumn(name = "Code_Activite", referencedColumnName = "Code_Activite", nullable = false)
		
	//	 private Activite activite;
	

}
