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
		for (String line : this.poem) {
			for (String j : splitLine(line)) {
				if (compareWords(word, j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int countWord(String word){
		int counter = 0;
		for (String i : this.poem) {
			for (String j : splitLine(i)) {
				if (compareWords(word, j)) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	public int firstAppear(String word){
		int row = 1;
		for (String line : this.poem) {
			for (String j : splitLine(line)) {
				if (compareWords(word, j)) {
					return row;
				}
			}
			row++;
		}
		return -1;
	}
	
	public List<Integer> rowsAppear(String word){
		int row = 1;
		List<Integer> rows = new ArrayList<>();
		for (String line : this.poem) {
			for (String j : splitLine(line)) {
				if (compareWords(word, j)) {
					rows.add(row);
				}
			}
			row++;
		}
	
		return rows;
	}

	private String[] splitLine(String line) {
		return line.replaceAll("[,:!?.]","").split(" ");
	}
	
	public List<String> appearedRows(String word){

		List<String> rows = new ArrayList<>();
		for (String line : this.poem) {
			for (String j : splitLine(line)) {
				if (compareWords(word, j)) {
					rows.add(line);
				}
			}

		}
		return rows;
	}

	private boolean compareWords(String word1, String word2) {
		return word2.toLowerCase().equals(word1.toLowerCase());
	}
}