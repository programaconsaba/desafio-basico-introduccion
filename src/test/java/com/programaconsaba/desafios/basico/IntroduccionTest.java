package com.programaconsaba.desafios.basico;

import org.junit.Test;

import com.programaconsaba.desafios.test.DesafioTestBase;

public class IntroduccionTest extends DesafioTestBase {

	@Override
	public String getTestFileName() {
		return "Introduccion.json";
	}
	
	@Test
	public void test() {
		String[] args = null;
		Introduccion.main(args);
	}

}