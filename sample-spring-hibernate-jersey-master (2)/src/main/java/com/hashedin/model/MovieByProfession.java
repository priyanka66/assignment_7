package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MovieByProfession {

	private Integer count;
	private String profession;

	public MovieByProfession(String profession, Integer count) {
		this.count = count;
		this.profession = profession;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public MovieByProfession() {
		super();
		// TODO Auto-generated constructor stub
	}

}