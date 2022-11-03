package com.macalsandair.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Component
@Entity(name = "Popcard")
@Table(name = "popcard")
public class Popcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int population;
	private SocialClass socialClass;
	private int age = 0;

	private LiveStatus liveStatus = LiveStatus.ALIVE; 
	
	@OneToMany(mappedBy="parent")
	private List <Popcard> children;
	
	@ManyToOne
	private Popcard parent;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Popcard incubated;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Town town;

	public Popcard() {
		super();
	}


	public boolean hasIncubated() {
		
		if (getIncubated() != null) {
			if (getIncubated().getLiveStatus() == LiveStatus.DEAD) {
				setIncubated(null);
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	public void killPopcard() {
		setLiveStatus(LiveStatus.DEAD);
	}

	public Popcard(int population, SocialClass socialClass, int age, Town town) {
		super();
		this.population = population;
		this.socialClass = socialClass;
		this.age = age;
		this.town = town;
	}


	public Popcard(Popcard parent2, int incrementalAmount) {
		super();
		this.population = incrementalAmount;
		this.socialClass = parent2.getSocialClass();
		this.age = 0;
		this.town = parent2.getTown();
		this.parent = parent2;
		parent2.setIncubated(this);
		parent2.getChildren().add(this);
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public List<Popcard> getChildren() {
		return children;
	}


	public void setChildren(List<Popcard> children) {
		this.children = children;
	}


	public Popcard getParent() {
		return parent;
	}


	public void setParent(Popcard parent) {
		this.parent = parent;
	}


	public LiveStatus getLiveStatus() {
		return liveStatus;
	}


	public void setLiveStatus(LiveStatus liveStatus) {
		this.liveStatus = liveStatus;
	}


	public Popcard getIncubated() {
		return incubated;
	}


	public void setIncubated(Popcard incubated) {
		this.incubated = incubated;
	}


}
