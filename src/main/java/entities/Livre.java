package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIVRE")
public class Livre {
	@Id
	int id;
	
	@Column(name="TITRE",length=255,nullable=false)
	String title;
	
	@Column(name="AUTEUR",length=50,nullable=false)
	String author;
	
	public Livre(){
		
	}
	
	public String toString(){
		return "Book N° : "+id+", Title : "+title+" written by : "+author;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTitre(){
		return title;
	}

	public void setTitre(String titre){
		title = titre;
	}
	
	public String getAuthor(){
		return author;
	}

	public void setAuthor(String auteur){
		author = auteur;
	}
}
