package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class topRatedMovies {

		private int ratings;
		private Long count;

		public topRatedMovies(int ratings, Long count) {
			this.ratings = ratings;
			this.count = count;
		}
		
		

		public topRatedMovies() {
			super();
			// TODO Auto-generated constructor stub
		}



		public int getRatings() {
			return ratings;
		}

		public void setRatings(int movie) {
			this.ratings = movie;
		}

		public Long getCount() {
			return count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
		

		
	}
