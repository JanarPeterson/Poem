package Poem;

import java.util.ArrayList;
import java.util.List;

public class Poem {
	
	String[] poem;

	public String[] getPoem() {
		return poem;
	}

	public void setPoem(String[] poem) {
		this.poem = poem;
	}

	public Poem(String[] poem) {
		this.poem = poem;
	}
	
	public boolean hasWord(String word){
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	public int countWord(String word){
		int counter = 0;
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				counter++;
			}
		}
		return counter;
	}
	
	public int firstAppear(String word){
		int row = 1;
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				return row;
			}
			else{
			row++;
			}
		}
		return -1;
	}
	
	public List<Integer> rowsAppear(String word){
		int row = 1;
		List<Integer> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				rows.add(row);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add(-1);
		}
		return rows;
	}
	
	public List<String> appearedRows(String word){
		int row = 1;
		List<String> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				rows.add(i);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add("no match");
		}
		return rows;
	}
}