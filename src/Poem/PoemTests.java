package Poem;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.*;
public class PoemTests {

	String[] luuletus = {"Kui sind kiusab kurat",
			"hüüa valjusti\\: Kurat!",
			"Kui sind jälgib jumal",
			"ütle julgesti\\: Jumal!",
			"ära häbene sõpru,",
			"ära vaenlasi varja,",
			"lahke meelega mine",
			"väike karjalaps karja."};
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
		assertThat(poem.firstAppear("hüüa"), is(2));
	}
	
	@Test
	public void linesThatContain(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.rowsAppear("kui").toString(), is("[1, 3]"));
	}

	@Test
	public void doesNotContain(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.rowsAppear("non").toString(), is("[-1]"));
	}
	
	@Test
	public void wordAppeardRows(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("kiusab").toString(), is("[Kui sind kiusab kurat]"));
	}
	

	@Test
	public void returnEmptyList(){
		Poem poem = new Poem(luuletus);
		assertThat(poem.appearedRows("kiues").toString(), is("[no match]"));
	}
}
