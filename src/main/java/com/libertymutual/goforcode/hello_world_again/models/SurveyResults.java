package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {

	private int russetCount;
	private int goldenCount;
	private int sweetCount;
	
	public int russetTotal() {
		return russetCount;
	}
	
	public int goldenTotal() {
		return goldenCount;
	}
	
	public int sweetTotal() {
		return sweetCount;
	}
	
	
	public void registerrussetvote() {
		russetCount = russetCount + 1;
	}
	public void registersweetvote() {
		sweetCount = sweetCount + 1;
	}

	public void registergoldenvote() {
		goldenCount = goldenCount + 1;
	}
}
