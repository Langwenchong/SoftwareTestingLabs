package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.homework;

public class homeworkTest {
	public homework h;

	@Before
	public void setUp() throws Exception {
		h = new homework();
	}

	@Test
	public void test1() {
		assertEquals(1, h.check(1));
	}

	@Test
	public void test2() {
		assertEquals(0, h.check(14));
	}

	@Test
	public void test3() {
		assertEquals(1, h.check(15));
	}

	@Test
	public void test4() {
		assertEquals(1, h.check(71));
	}

	@Test
	public void test5() {
		assertEquals(0, h.check(100));
	}

	@Test
	public void testHomework() {
		h.homework(39);
	}

}
