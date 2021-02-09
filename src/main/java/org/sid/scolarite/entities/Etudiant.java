package org.sid.scolarite.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity //pour mapper l'entiter etudiant
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOM", length=30) @NotEmpty
  	private String nom;
	
	@DateTimeFormat(pattern="yyy-MM-dd")
 	private Date dateNaissance;
	
	@NotEmpty
	@Email
	private String email;
	// private byte[] photo; // si vous voulez stockez lzs photos dans une base de donnees on utilise le type de données tableau de bytes.
	private String photo; //si vous voulez stocker les photos dans un dossier quelque part et stocker le nom de photo on utilise string.
	
	//constructeur sans parametre est obligatoire pour jpa et pour moi aussi.
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec parametre just pour moi.
	public Etudiant(String nom, Date dateNaissance, String email, String photo) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.photo = photo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
