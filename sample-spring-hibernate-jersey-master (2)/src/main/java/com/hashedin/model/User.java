package com.hashedin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@XmlRootElement
@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u") })
public class User {
	
	@Id	
	private Long userId;

	private String profession;
	private int user_count;
	
/*	@XmlInverseReference(mappedBy = "user")
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", targetEntity = Ratings.class)
	private List<Ratings> ratings;
*/
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getUser_count() {
		return user_count;
	}

	public void setUser_count(int user_count) {
		this.user_count = user_count;
	}

/*	public List<Ratings> getRatings() {
		return ratings;
	}

	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}*/

	
}
