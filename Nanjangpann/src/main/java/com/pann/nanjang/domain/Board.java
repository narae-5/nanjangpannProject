package com.pann.nanjang.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter; 

@Entity 
@Getter
@Setter
@Table(name="tbl_boards") 
public class Board { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long nno; 
	private String title; 
	private String writer; 
	
	@CreationTimestamp 
	private Timestamp regdate; 
	
	@UpdateTimestamp 
	private Timestamp updatedate; 
	
}
