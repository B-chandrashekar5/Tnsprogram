package com.tnsif.Demo.Day18.Junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Junit {

	@Test
	void test() {
		System.out.println("Test");
	}
	@Test
	void show()
	{
		assertEquals(10,5+5);
	}
		@ParameterizedTest
		@ValueSource(strings = {"kali","gali"})
		void endsWithi(String str) {
			assertTrue(str.endsWith("i"));
			
		}
		@BeforeEach
		void display() {
			System.out.println("BeforeEach");
			
		}
		@BeforeAll
		static void Display1() {
			System.out.println("BeforeAll");
			
		}
		@AfterEach
		void Display2() {
			System.out.println("AfterEach");
			
	}
		@AfterAll
		static void Display3() {
			System.out.println("AfterAll");
			
}
}
