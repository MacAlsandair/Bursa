package com.macalsandair.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.macalsandair.SocialClass;

//@Component
@Entity
public class PopCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int population;
	private SocialClass socialClass;
//	private Town town;
	
	//private ChildPopCard child;
	
	public PopCard(int population, SocialClass socialClass, Town town) {
		this.population = population;
		this.socialClass = socialClass;
		//this.town = town;
		//this.town.getPullOfPopCards().add(this);
		}

//	public boolean hasChild () {
//		if (child != null) {
//			return true;
//		}
//		else return false;
//	}

	public PopCard() {
		super();
	}

	@Override
	public String toString() {
		return "PopCard [population=" + population + ", socialClass=" + socialClass + "]";
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public SocialClass getSocialClass() {
		return socialClass;
	}

	public void setSocialClass(SocialClass socialClass) {
		this.socialClass = socialClass;
	}

//	@ManyToOne(cascade = CascadeType.ALL, targetEntity = ChildPopCard.class)
//	@JoinColumn(name="child_popcard_id")
//	public ChildPopCard getChild() {
//		return child;
//	}
//	public void setChild(ChildPopCard child) {
//		this.child = child;
//	}
//
//	public Town getTown() {
//		return town;
//	}
//
//	public void setTown(Town town) {
//		this.town = town;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



}
