import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStacks 
{
	MyStack B;
	MyStack A;
	
	@BeforeEach
	void setUp() throws Exception
	{
		B = new MyStack<String>();
	}
	
	@Test 
	void testUnderFlowException()
	{
		assertThrows(StackUnderFlowException.class, () ->
		{
			B.pop();
		});
		assertThrows(StackUnderFlowException.class, () ->
		{
			B.top();
		});
	}
	@Test 
	void testStacks()
	{
		A = new MyStack<String>();
		assertTrue(A.isEmpty());
		A.push("1st");
		assertFalse(A.isEmpty());
		assertEquals("1st",A.top());
		A.push("2nd");
		assertEquals("2nd",A.top());
		A.push("3rd");
		assertEquals("3rd",A.top());
		A.pop();
		assertEquals("2nd",A.pop());
		assertEquals("1st",A.top());
		A.pop();
		assertEquals("1st",A.pop());
		assertEquals(null,A.top());
		A.pop();
		assertEquals(null,A.pop());
		A.pop();
	}
}
