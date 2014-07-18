package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MoviesByProfession {

	
	private Long count;
	private String profession;

	public MoviesByProfession(String profession, Long count) {
		this.count = count;
		this.profession = profession;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	


	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public MoviesByProfession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}