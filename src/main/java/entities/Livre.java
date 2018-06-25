package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIVRE")
public class Livre {
	@Id
	private int id;
	
	@Column(name="TITRE",length=255,nullable=false)
	private String title;
	
	@Column(name="AUTEUR",length=50,nullable=false)
	private String author;
	
	
	@ManyToMany
	@JoinTable(
			name="COMPO",
			joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
	)
	private List<Emprunt> emprunts;
	

	public Livre(){
		emprunts = new ArrayList<Emprunt>();
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
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}
