package com.br.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_sellers")
public class Seller{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	@Getter
	@Setter
	private String Name;	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();	
}
