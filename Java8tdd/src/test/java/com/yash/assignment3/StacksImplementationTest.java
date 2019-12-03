package com.yash.assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StacksImplementationTest {

	StacksImplementation stackimpl = new StacksImplementation(10);

	@Test
	public void shouldReturnStackImpl() {

		stackimpl.push(10);
		stackimpl.push(20);
		stackimpl.push(30);
		stackimpl.push(40);
		stackimpl.push(50);

		// while (!stackimpl.isEmpty()) {
		// long value = stackimpl.pop();
		// System.out.print(value);
		// System.out.print(" ");
		// }
		// System.out.println("");

		assertEquals(50, stackimpl.pop());
		assertEquals(40, stackimpl.peek());
	}
}
