package rpp2023vezbeit.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity implementation class for Entity: Dobavljac
 *
 */
@Entity
@NamedQuery(name="Dobavljac.findAll", query="SELECT d FROM Dobavljac d")
public class Dobavljac implements Serializable {

	   
	@Id
	@SequenceGenerator(name="DOBAVLJAC_ID_GENERATOR", sequenceName="DOBAVLJAC_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOBAVLJAC_ID_GENERATOR")
	private Integer id;
	private String naziv;
	private String adresa;
	private String kontakt;
	private static final long serialVersionUID = 1L;
	
	//bi-directional many-to-one association to Porudzbina
	@OneToMany(mappedBy="dobavljac")
	@JsonIgnore
	private List<Porudzbina> porudzbina;

	public Dobavljac() {
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
	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}   
	public String getKontakt() {
		return this.kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}

   
}
