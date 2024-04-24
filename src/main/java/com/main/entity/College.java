package com.main.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@Table(name="JPA_OTM_COLLEGE_INFO")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class College 
{
	@Id
	@GeneratedValue
    private Integer cid;
	
	@NonNull
    private String cname;
	
	@NonNull
    private String caddr;
    
	@NonNull
	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name="s_fk", referencedColumnName = "cid")
    private List<Student> sList;
}
