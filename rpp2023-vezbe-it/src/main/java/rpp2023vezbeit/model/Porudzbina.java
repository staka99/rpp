package rpp2023vezbeit.model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import rpp2023vezbeit.model.Dobavljac;

/**
 * Entity implementation class for Entity: Porudzbina
 *
 */
@Entity
@NamedQuery(name="Porudzbina.findAll", query="SELECT p FROM Porudzbina p")
public class Porudzbina implements Serializable {

	   
	@Id
	@SequenceGenerator(name="PORUDZBINA_ID_GENERATOR", sequenceName="PORUDZBINA_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PORUDZBINA_ID_GENERATOR")
	private Integer id;
	private Date datum;
	private Date isporuceno;
	private BigDecimal iznos;
	private Boolean placeno;	
	
	//bi-directional many-to-one association to Dobavljac
	@ManyToOne
	@JoinColumn(name="dobavljac")
	private Dobavljac dobavljac;

	//bi-directional many-to-one association to StavkaPorudzbine
	@OneToMany(mappedBy="porudzbina") 
	@JsonIgnore
	private List<StavkaPorudzbine> stavkaPorudzbine;
	
	private static final long serialVersionUID = 1L;

	public Porudzbina() {
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}   
	public Date getIsporuceno() {
		return this.isporuceno;
	}

	public void setIsporuceno(Date isporuceno) {
		this.isporuceno = isporuceno;
	}   
	public BigDecimal getIznos() {
		return this.iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}   
	public Boolean getPlaceno() {
		return this.placeno;
	}

	public void setPlaceno(Boolean placeno) {
		this.placeno = placeno;
	}   
	public Dobavljac getDobavljac() {
		return this.dobavljac;
	}

	public void setDobavljac(Dobavljac dobavljac) {
		this.dobavljac = dobavljac;
	}
	
   
}
