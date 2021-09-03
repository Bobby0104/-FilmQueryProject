package com.skilldistillery.filmquery.entities;

import java.util.Objects;

public class Film {
	
	private int id;
	private int tiltle;
	private String desciption;
	private Integer releaseYear;
	private int rentalDuration;
	private double rentalRate;
	private Integer length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;
	private int laguangeId;
	
	public Film() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTiltle() {
		return tiltle;
	}

	public void setTiltle(int tiltle) {
		this.tiltle = tiltle;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public int getLaguangeId() {
		return laguangeId;
	}

	public void setLaguangeId(int laguangeId) {
		this.laguangeId = laguangeId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desciption, id, laguangeId, length, rating, releaseYear, rentalDuration, rentalRate,
				replacementCost, specialFeatures, tiltle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(desciption, other.desciption) && id == other.id && laguangeId == other.laguangeId
				&& Objects.equals(length, other.length) && Objects.equals(rating, other.rating)
				&& Objects.equals(releaseYear, other.releaseYear) && rentalDuration == other.rentalDuration
				&& Double.doubleToLongBits(rentalRate) == Double.doubleToLongBits(other.rentalRate)
				&& Double.doubleToLongBits(replacementCost) == Double.doubleToLongBits(other.replacementCost)
				&& Objects.equals(specialFeatures, other.specialFeatures) && tiltle == other.tiltle;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", tiltle=" + tiltle + ", desciption=" + desciption + ", releaseYear=" + releaseYear
				+ ", rentalDuration=" + rentalDuration + ", rentalRate=" + rentalRate + ", length=" + length
				+ ", replacementCost=" + replacementCost + ", rating=" + rating + ", specialFeatures=" + specialFeatures
				+ ", laguangeId=" + laguangeId + "]";
	}

	public Film(int id, int tiltle, String desciption, Integer releaseYear, int rentalDuration, double rentalRate,
			Integer length, double replacementCost, String rating, String specialFeatures, int laguangeId) {
		super();
		this.id = id;
		this.tiltle = tiltle;
		this.desciption = desciption;
		this.releaseYear = releaseYear;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.laguangeId = laguangeId;
	}
	           
	
}
