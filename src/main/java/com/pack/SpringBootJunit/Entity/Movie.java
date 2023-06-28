package com.pack.SpringBootJunit.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie100")
public class Movie {
	@Id
	private Integer id;
	private String name;
	private String language;
	private String type;
	private Integer rating;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Movie(Integer id, String name, String language, String type, Integer rating) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.type = type;
		this.rating = rating;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
