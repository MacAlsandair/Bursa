package com.alsandair.mac;
import java.util.ArrayList;

public class PullOfTown {
	private ArrayList <PopCard> pullOfTownArray;
	
	
	public PullOfTown () {
		this.setPullOfTownArray(new ArrayList <PopCard> ());
	}


	public ArrayList <PopCard> getPullOfTownArray() {
		return pullOfTownArray;
	}


	public void setPullOfTownArray(ArrayList <PopCard> pullOfTown) {
		this.pullOfTownArray = pullOfTown;
	}

	
	
}
