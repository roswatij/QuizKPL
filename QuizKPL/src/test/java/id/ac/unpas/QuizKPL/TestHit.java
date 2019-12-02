package id.ac.unpas.QuizKPL;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHit {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testProcess1() {
		Hitung hitung = new Hitung();
		int ketemu = hitung.hitungTambah(1, 2);
		assertEquals( ketemu, 3);
		
	}
}
