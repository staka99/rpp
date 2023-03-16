package rpp2023vezbeit.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity implementation class for Entity: Artikl
 *
 */
@Entity
@NamedQuery(name="Artikl.findAll", query="SELECT a FROM Artikl a")
public class Artikl implements Serializable {

	   
	@Id
	@SequenceGenerator(name="ARTIKL_ID_GENERATOR", sequenceName="ARTIKL_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ARTIKL_ID_GENERATOR")
	private Integer id;
	private String naziv;
	private String proizvodjac;
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to StavkaPorudzbine
	@OneToMany(mappedBy="artikl")
	@JsonIgnore
	private List<StavkaPorudzbine> stavkaPorudzbine;
	
	public Artikl() {
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}   
	public String getProizvodjac() {
		return this.proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
   


}
