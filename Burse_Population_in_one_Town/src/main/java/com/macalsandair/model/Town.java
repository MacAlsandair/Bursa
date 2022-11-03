package com.macalsandair.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Town")
@Table(name = "town")
public class Town {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//private ArrayList <Popcard> pullOfPopCards;
	
	private String name;
	
    @OneToMany(
            mappedBy = "town",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
	private List <Popcard> popcards;
	
	//private LocalityType localityType;
	
	//@ManyToOne(targetEntity=GameSave.class)
	//private GameSave gameSave;
	
//	@Autowired
//	private LocalityCollection localityCollection;

	public Town(String name) {
		super();
		this.name = name;
	}

	public Town() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
