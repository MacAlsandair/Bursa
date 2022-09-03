package com.macalsandair;

import java.util.ArrayList;

import javax.persistence.Entity;

import org.springframework.stereotype.Service;

import com.macalsandair.models.Town;

@Entity
public class LocalityCollection {
	
	
	
	private ArrayList<Town> pullOfTowns;

	public LocalityCollection(ArrayList<Town> pullOfTowns) {
		this.pullOfTowns = pullOfTowns;
	}

	public ArrayList<Town> getPullOfTowns() {
		return pullOfTowns;
	}

	public void setPullOfTowns(ArrayList<Town> pullOfTowns) {
		this.pullOfTowns = pullOfTowns;
	}
	
}