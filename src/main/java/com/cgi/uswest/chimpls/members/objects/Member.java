package com.cgi.uswest.chimpls.members.objects;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Member {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	private String idprsn;
	private String idprvdorg;
	private String flinhome;
	
	Member() {}
	
	public Member(String idprvdorg, String idprsn, String flinhome) {
		super();
		this.idprvdorg = idprvdorg;
		this.idprsn = idprsn;
		this.flinhome = flinhome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getIdprsn() {
		return idprsn;
	}

	public void setIdprsn(String idprsn) {
		this.idprsn = idprsn;
	}

	public String getIdprvdorg() {
		return idprvdorg;
	}

	public void setIdprvdorg(String idprvdorg) {
		this.idprvdorg = idprvdorg;
	}

	public String getFlinhome() {
		return flinhome;
	}

	public void setFlinhome(String flinhome) {
		this.flinhome = flinhome;
	}
	
}
