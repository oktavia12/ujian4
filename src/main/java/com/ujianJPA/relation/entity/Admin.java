package com.ujianJPA.relation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	@Column(name = "username")
	@NotNull
	private String username;
	@Column(name = "password") 
	@NotNull
	private String password;

}
