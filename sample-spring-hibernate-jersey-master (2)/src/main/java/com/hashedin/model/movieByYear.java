package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class movieByYear {

	private Long count;
	private String year;

	public movieByYear(Long count, String year) {
		this.count = count;
		this.year = year;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public movieByYear() {
		super();
		// TODO Auto-generated constructor stub
	}
}
