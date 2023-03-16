package rpp2023vezbeit.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import javax.persistence.*;
import rpp2023vezbeit.model.Artikl;
import rpp2023vezbeit.model.Porudzbina;

/**
 * Entity implementation class for Entity: StavkaPorudzbine
 *
 */
@Entity
@NamedQuery(name="StavkaPorudzbine.findAll", query="SELECT s FROM StavkaPorudzbine s")
public class StavkaPorudzbine implements Serializable {

	   
	@Id
	@SequenceGenerator(name="STAVKA_PORUDZBINE_ID_GENERATOR", sequenceName="STAVKA_PORUDZBINE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAVKA_PORUDZBINE_ID_GENERATOR")
	private Integer id;
	private Integer redniBroj;
	private BigDecimal kolicina;
	private String jedinicaMere;
	private BigDecimal cena;
	
	//bi-directional many-to-one association to Porudzbina
	@ManyToOne
	@JoinColumn(name="porudzbina")
	private Porudzbina porudzbina;
	
	//bi-directional many-to-one association to Artikl
	@ManyToOne
	@JoinColumn(name="artikl")
	private Artikl artikl;
	
	private static final long serialVersionUID = 1L;

	public StavkaPorudzbine() {
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getRedniBroj() {
		return this.redniBroj;
	}

	public void setRedniBroj(Integer redniBroj) {
		this.redniBroj = redniBroj;
	}   
	public BigDecimal getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}   
	public String getJedinicaMere() {
		return this.jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}   
	public BigDecimal getCena() {
		return this.cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}   
	public Porudzbina getPorudzbina() {
		return this.porudzbina;
	}

	public void setPorudzbina(Porudzbina porudzbina) {
		this.porudzbina = porudzbina;
	}   
	public Artikl getArtikl() {
		return this.artikl;
	}

	public void setArtikl(Artikl artikl) {
		this.artikl = artikl;
	}
   
}
