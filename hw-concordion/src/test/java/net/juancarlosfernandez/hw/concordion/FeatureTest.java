package net.juancarlosfernandez.hw.concordion;

import net.juancarlosfernandez.hw.concordion.Calculadora;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class FeatureTest{

	public int oneSumOneAreTwo(int oper1, int oper2) {
		
		Calculadora aCalculadora = new Calculadora();
		
		return aCalculadora.suma(oper1,oper2);
		
	}
}
