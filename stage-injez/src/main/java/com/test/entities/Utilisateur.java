package com.test.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Embeddable
//@IdClass(Utilisateur.class)
@Entity
@Table(name = "utilisateur", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "Login"
            }),
            @UniqueConstraint(columnNames = {
                "Mail"
            })
    })

public class Utilisateur implements Serializable{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Login", updatable = false, nullable = false)
	public String Login;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cod_App", updatable = false, nullable = false)
	private String Cod_App; 
	
	private String Password;
	private String Nom_Prenom; 
	private String Obs ; 
	private Integer F_Admin;
	private Integer F_Actif ;
	private String Mail ; 
	private Integer F_Super_User; 
	private Integer  F_Eligible ; 
	//private Integer Id_Structure ;
	private Integer F_Admin_Central; 
	private Integer Flag_Site ; 
	private Integer Id_Site ;
	private String  Password_Mail_Smtp ; 
	private String User_Mail_Smtp; 
	private Integer  F_Admin_Ministere ; 
	private Integer  F_Admin_Structure;
	private Integer F_Biens ; 
	private Integer   F_Services ; 
	private Integer F_Travaux ; 
	private Integer  F_User_Cons; 
	private Integer F_Connect ; 
	private Integer Flag_Pass ; 
    private Date DATE_Init_Pass ;
	private Integer  F_User ; 
	private String N_Cin ; 
	private String Code_Op; 
	private String Nom_Prenom_Ar ;
	 private String Obs_Ar; 
     private Date Date_Creation; 
     
     public Utilisateur() {}
     
     
     
     
     
     
     /**
	 * @param login
	 * @param cod_App
	 * @param password
	 * @param nom_Prenom
	 * @param obs
	 * @param f_Admin
	 * @param f_Actif
	 * @param mail
	 * @param f_Super_User
	 * @param f_Eligible
	 * @param f_Admin_Central
	 * @param flag_Site
	 * @param id_Site
	 * @param password_Mail_Smtp
	 * @param user_Mail_Smtp
	 * @param f_Admin_Ministere
	 * @param f_Admin_Structure
	 * @param f_Biens
	 * @param f_Services
	 * @param f_Travaux
	 * @param f_User_Cons
	 * @param f_Connect
	 * @param flag_Pass
	 * @param dATE_Init_Pass
	 * @param f_User
	 * @param n_Cin
	 * @param code_Op
	 * @param nom_Prenom_Ar
	 * @param obs_Ar
	 * @param date_Creation
	 */
	public Utilisateur(String login, String cod_App, String password, String nom_Prenom, String obs, Integer f_Admin,
			Integer f_Actif, String mail, Integer f_Super_User, Integer f_Eligible, Integer f_Admin_Central,
			Integer flag_Site, Integer id_Site, String password_Mail_Smtp, String user_Mail_Smtp,
			Integer f_Admin_Ministere, Integer f_Admin_Structure, Integer f_Biens, Integer f_Services,
			Integer f_Travaux, Integer f_User_Cons, Integer f_Connect, Integer flag_Pass, Date dATE_Init_Pass,
			Integer f_User, String n_Cin, String code_Op, String nom_Prenom_Ar, String obs_Ar, Date date_Creation) {
		super();
		Login = login;
		Cod_App = cod_App;
		Password = password;
		Nom_Prenom = nom_Prenom;
		Obs = obs;
		F_Admin = f_Admin;
		F_Actif = f_Actif;
		Mail = mail;
		F_Super_User = f_Super_User;
		F_Eligible = f_Eligible;
		F_Admin_Central = f_Admin_Central;
		Flag_Site = flag_Site;
		Id_Site = id_Site;
		Password_Mail_Smtp = password_Mail_Smtp;
		User_Mail_Smtp = user_Mail_Smtp;
		F_Admin_Ministere = f_Admin_Ministere;
		F_Admin_Structure = f_Admin_Structure;
		F_Biens = f_Biens;
		F_Services = f_Services;
		F_Travaux = f_Travaux;
		F_User_Cons = f_User_Cons;
		F_Connect = f_Connect;
		Flag_Pass = flag_Pass;
		DATE_Init_Pass = dATE_Init_Pass;
		F_User = f_User;
		N_Cin = n_Cin;
		Code_Op = code_Op;
		Nom_Prenom_Ar = nom_Prenom_Ar;
		Obs_Ar = obs_Ar;
		Date_Creation = date_Creation;
	}


	/*
      * structure
      */
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="Id_Structure")
	    private Structure structure;
	 //@JsonIgnore
	 

/*******CONSTRAINT "fk utilisateur,profilprojet" FOREIGN KEY ("code app")REFERENCES "utilisateur" ("Cod_App") ENABLE,*/


		@LazyCollection(LazyCollectionOption.FALSE)
		@OneToMany(mappedBy="utilisateur",cascade = CascadeType.ALL)
	  private Collection<Profil_Projet> profilprojet;



	  
	  
	 
}
