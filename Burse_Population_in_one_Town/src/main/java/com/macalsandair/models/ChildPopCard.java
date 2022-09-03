package com.macalsandair.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.macalsandair.SocialClass;

@Entity
public class ChildPopCard extends PopCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public ChildPopCard() {
	}
	
	//private PopCard parent;

	ChildPopCard(int population, SocialClass socialClass, Town town) {
		super(population, socialClass, town);
	}
//	public ChildPopCard (int population, PopCard popCard) {
////		super(population, popCard.getSocialClass(), popCard.getTown());
//		this.parent = popCard;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
//	@ManyToOne(cascade = CascadeType.ALL, targetEntity = ChildPopCard.class)
//	@JoinColumn(name="child_popcard_id")
//	public PopCard getParent() {
//		return parent;
//	}
//	public void setParent(PopCard parent) {
//		this.parent = parent;
//	}

}
