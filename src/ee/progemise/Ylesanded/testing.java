package ee.progemise.ylesanded;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testing
{
	private static final String[] DATA = { "A", "B", "C", "D", "E", "F" };

	//Little unit tests here.
	@Test
	public void test()
	{
		assertEquals("",          execute(0));
		assertEquals("A",         execute(1));
		assertEquals("AB",        execute(2));
		assertEquals("ABC",       execute(3));
		assertEquals("ABCD",      execute(4));
		assertEquals("ABCDE",     execute(5));
		assertEquals("ABCDEF",    execute(6));
		assertEquals("ABCDEFA",   execute(7));
		assertEquals("ABCDEFAB",  execute(8));
		assertEquals("ABCDEFABC", execute(9));
	}

	private String execute(int elements)
	{
		String result = "";
		for (int index = 0; index < elements; index++)
		{
			result += DATA[index % DATA.length];
		}
		return result;
	}
}
