package com.pms.entityies;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PriductEntity {
	 @Id
	 @Column(name="Id")
	 private Integer product_id;
	 
	 @Column(name="PRODUCT_PRICE")
	private String product_name;
	 
	 @Column(name="PRODUCT_PRICE")
	private Integer product_price;
	 
	 @Column(name="PRODUCT_STATUS")
	private Boolean isAvailable;
	 @Column (name="CREATED_ON")
	 private  final static LocalDate createdOn = LocalDate.now();
	 
	 @Column(name="UPDATED_ON")
	 private final static LocalDate updatedOn = LocalDate.now();
	 

}
