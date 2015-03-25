package com.lab3.Admiterator;

import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AdmiteratorTest {

	@Test
	@Parameters(method =  "admit")
	public void admit_test(Type parameter1, Type param2) {
		
	}
	private Object admit(){
		return new Object[][]{{arg1_for_run1, arg2_for_run2, ect...}};
	}

}
