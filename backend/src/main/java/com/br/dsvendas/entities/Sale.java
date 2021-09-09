package com.br.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Getter
	@Setter	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Getter
	@Setter
	private int visited;

	@Getter
	@Setter
	private int deals;

	@Getter
	@Setter
	private double amount;

	@Getter
	@Setter
	private LocalDate date;

	@Getter
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
}
