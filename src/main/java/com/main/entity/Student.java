package com.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="JPA_OTM_STUDENT_INFO")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student 
{
	  @Id
	  @SequenceGenerator(name = "gen2", sequenceName = "JPA_STUDENT_INFO_SEQ1", initialValue = 100, allocationSize = 1)
	  @GeneratedValue(generator = "gen2", strategy = GenerationType.SEQUENCE)
      private Integer sid;
	  
	  @NonNull
      private String sname;
	  
	  @NonNull
      private String branch;
	  
	  @NonNull
      private String saddr;
	  
	  @NonNull
      private String email;
	  
	  @NonNull
      private Long mobNo;
}
