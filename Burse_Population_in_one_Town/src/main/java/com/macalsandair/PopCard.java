package com.macalsandair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class PopCard {
	private int population;
	private SocialClass socialClass;
	private Town town;
	private ChildPopCard child;
	
	PopCard(int population, SocialClass socialClass, Town town) {
		this.population = population;
		this.socialClass = socialClass;
		this.town = town;
		this.town.getPullOfPopCards().add(this);
		}

	public boolean hasChild () {
		if (child != null) {
			return true;
		}
		else return false;
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

	public ChildPopCard getChild() {
		return child;
	}

	public void setChild(ChildPopCard child) {
		this.child = child;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}



}
