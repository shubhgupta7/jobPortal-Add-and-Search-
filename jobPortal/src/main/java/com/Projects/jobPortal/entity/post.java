package com.Projects.jobPortal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="JobPost")
public class post {
  private  String profile;
  private  String desc;
  private  String exp;
  private String[] techs;
}

