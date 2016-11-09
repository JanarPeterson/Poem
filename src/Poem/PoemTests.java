package Poem;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.*;
public class PoemTests {

	String[] luuletus = {"Kui sind kiusab kurat",
			"h��a valjusti\\: Kurat!",
			"Kui sind j�lgib jumal",
			"�tle julgesti\\: Jumal!",
			"�ra h�bene s�pru,",
			"�ra vaenlasi varja,",
			"lahke meelega mine",
			"v�ike karjalaps karja."};
	@Test
	public void doesContain(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.hasWord("Sind"), is(true));
	}
	
	@Test 
	public void appeardTimes(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.countWord("Sind"), is(2));
	}
	
	@Test 
	public void firstAppeardLineNumber(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.firstAppear("h��a"), is(2));
	}
	
	@Test
	public void linesThatContain(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.rowsAppear("kui"), is(Arrays.asList(1, 3)));
	}

	@Test
	public void doesNotContain(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.firstAppear("non"), is(-1));
	}
	
	@Test
	public void wordAppeardRows(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("sind"), is(Arrays.asList(luuletus[0], luuletus[2])));
	}
	

	@Test
	public void returnEmptyList(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("kiues"), is(Arrays.asList()) );
	}
}
