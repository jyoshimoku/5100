package hw6;

import java.util.ArrayList;



import java.awt.List;
import java.text.Format;
import java.util.*;
public class Mreview implements Comparable<Mreview> {
	private String title;   // title of the movie
	private ArrayList<Integer> ratings; // list of ratings stored in a Store object

	
public Mreview() {
	this.title="";
	this.ratings= new ArrayList<>();
}

public Mreview(String ttl) {
	this.title=ttl;
	this.ratings= new ArrayList<>();
}
public Mreview(String ttl, int firstRating) {
	this.title=ttl;
	this.ratings= new ArrayList<>(1);
	this.ratings.add(0,firstRating);
}

public void addRating(int r) {
	this.ratings.add(r);
	
	
}

public double aveRating() {
	int sum=0;
	double ave=0;
	for (int i = 0; i < this.ratings.size(); i++) {
		sum += this.ratings.get(i);
	}
	ave=(double)sum/this.ratings.size();
	return ave;
}

@Override
public int compareTo(Mreview obj) {
	int value=this.title.compareTo(obj.title);
	return value;
	
}

public boolean equals(Mreview obj) {
	if (this.title.equals(obj.title)) {
		return true;
	} else {
		return false;
	}
	
}


public String getTitle() {
	return title;
}

public int numRatings() {
	
	return this.ratings.size();
}

@Override
public String toString() {
	return String.format("%s, average %f out of %d ratings",this.getTitle(),this.aveRating(),this.numRatings());
}

public static void main(String[] args) {
	Mreview a = new Mreview("Matrix", 4);
	a.addRating(5);
	a.addRating(3);
	a.addRating(5);
	System.out.println(a.toString());
	System.out.println(a.equals(new Mreview("Matrix",6)));
	System.out.println(a.equals(new Mreview("StarWar",8)));
	System.out.println(a.compareTo(new Mreview("IronMan",5)));
	System.out.println(a.compareTo(new Mreview("Superman",5)));
}


}
