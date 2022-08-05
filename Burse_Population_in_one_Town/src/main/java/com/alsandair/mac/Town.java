package com.alsandair.mac;
import java.util.ArrayList;

public class Town {
	private ArrayList <PopCard> pullOfPopCards;
	private static ArrayList <Town> pullOfTowns;
	
	
	public Town () {
		this.setPullOfPopCards(new ArrayList <PopCard> ());
		
	}


	public ArrayList <PopCard> getPullOfPopCards() {
		return pullOfPopCards;
	}


	public void setPullOfPopCards(ArrayList <PopCard> pullOfTown) {
		this.pullOfPopCards = pullOfTown;
	}


	public static ArrayList <Town> getPullOfTowns() {
		return pullOfTowns;
	}


	public static void setPullOfTowns(ArrayList <Town> pullOfTowns) {
		Town.pullOfTowns = pullOfTowns;
	}

	
	
}
