package Poem;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.*;
public class PoemTests {

	String[] luuletus = {"Kui sind kiusab kurat", "h��a valjusti\\: Kurat!", "Kui sind j�lgib jumal", "�tle julgesti\\: Jumal!", "�ra h�bene s�pru,", "�ra vaenlasi varja,", "lahke meelega mine", "v�ike karjalaps karja."};
	@Test
	public void hasWordTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.hasWord("Sind"), is(true));
	}
	
	@Test 
	public void countWordTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.countWord("Sind"), is(2));
	}
	
	@Test 
	public void firstAppearTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.firstAppear("h��a"), is(2));
	}
	
	@Test
	public void rowsAppearTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.rowsAppear("kui").toString(), is("[1, 3]"));
	}

	@Test
	public void nonRowsAppearTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.rowsAppear("non").toString(), is("[-1]"));
	}
	
	@Test
	public void appearedRowsTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("kiusab").toString(), is("[Kui sind kiusab kurat]"));
	}
	

	@Test
	public void nonAppearedRowsTest(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("kiues").toString(), is("[no match]"));
	}
}
