package com.cg.servicetest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cg.services.AddService;
import com.cg.services.CallServices;

class AddClassTest {
	//@Test
	/*void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

		AddService addService;
		CallServices calcService;

		addService = Mockito.mock(AddService.class);
		calcService = new CallServices(addService);

		int num1 = 11;
		int num2 = 10;
		int expected = 21;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(5, 6);

		assertEquals(expected, actual);
*/
	
	CallServices calcService;

	@Mock
	AddService addService;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

		calcService = new CallServices(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}

	}
	

