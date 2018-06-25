package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {

	@Id
	private int id;

	@Column(name="DATE_DEBUT",nullable=false)
	private LocalDate startDate;

	@Column(name="DATE_FIN")
	private LocalDate endDate;

	@Column(name="DELAI",length=10)
	private int delay;

	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	@ManyToMany
	@JoinTable(
			name="COMPO",
			joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")
	)
	private List<Livre> books;

	public Emprunt(){
		books = new ArrayList<Livre>();
	}
	
	public String toString(){
		return "Borrowing ID : " + id + ", Number of book : "+books.size();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Livre> getBooks() {
		return books;
	}

	public void setBooks(List<Livre> books) {
		this.books = books;
	}


}
