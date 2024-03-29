package com.example.demo.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class StudentResult {
	
@Id
private int result_Id;
private int max_Marks;
private Date dataAndTime;
private String result;

@ManyToOne
@JoinColumn(name = "qz_Id") 
@JsonIgnoreProperties("se")
private quiz qe; 


@ManyToOne
@JoinColumn(name = "stu_id") 
@JsonIgnoreProperties("rs")
private Student ss; 

}
