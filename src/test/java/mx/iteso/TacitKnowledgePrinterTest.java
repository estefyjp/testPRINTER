package mx.iteso;

import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;


import static org.junit.Assert.*;
public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
        //Verify calculate being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?
	private Printer printer;
	TacitKnowledgePrinter tkPrinter;
	
	@Before 
	public void setUp(){
		printer = mock(Printer.class);
		tkPrinter = new TacitKnowledgePrinter(printer);
	}
	@Test
	public void printNumbersTimes10(){	
		tkPrinter.printNumbers(10);
		verify(printer, times(10)).print(anyString());	
	}
	@Test(expected = RuntimeException.class)
	public void prinrNumberTimes0(){
		tkPrinter.printNumbers(0);
	}
	
	


}
