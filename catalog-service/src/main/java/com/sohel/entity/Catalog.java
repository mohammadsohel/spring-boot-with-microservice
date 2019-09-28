package com.sohel.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name = "catalog")

public class Catalog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "catalog_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalog_Sequence")
	@SequenceGenerator(allocationSize = 1, name = "catalog_Sequence", sequenceName = "catalog_Sequence")
	private Long catalogId;

	@Column(name = "name")
	private String name;
	
	

	
	@Column(name = "price")
	private String price;
	
	@Column(name = "specification")
	private String specification;
	
	
	
/*	@OneToMany(mappedBy = "catalog", fetch = FetchType.EAGER)
	@Cascade({ CascadeType.ALL })
	private List<Order> orderList;*/

	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


	
	


}
