package com.macalsandair.models;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macalsandair.Locality;
import com.macalsandair.LocalityCollection;

@Entity
public class Town implements Locality {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private ArrayList <PopCard> pullOfPopCards;
	
//	@Autowired
//	private LocalityCollection localityCollection;

	public Town () {
		this.setPullOfPopCards(new ArrayList <PopCard> ());
		//localityCollection.getPullOfTowns().add(this);
		
	}
	
	public ArrayList <PopCard> getPullOfPopCards() {
		return pullOfPopCards;
	}


	public void setPullOfPopCards(ArrayList <PopCard> pullOfTown) {
		this.pullOfPopCards = pullOfTown;
	}

	@Override
	public String toString() {
		return "Town [pullOfPopCards=" + pullOfPopCards + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public LocalityCollection getLocalityCollection() {
//		return localityCollection;
//	}
//
//	public void setLocalityCollection(LocalityCollection localityCollection) {
//		this.localityCollection = localityCollection;
//	}

}
