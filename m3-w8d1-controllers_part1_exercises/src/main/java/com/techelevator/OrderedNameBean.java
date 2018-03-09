package com.techelevator;

public class OrderedNameBean {
	
	private String first;
	private String middle;
	private String last;
	private String result;
	
	public OrderedNameBean(String first, String middle, String last, String result) {
		this.first = first;
		this.middle = middle;
		this.last = last;
		this.result = result;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}



}
