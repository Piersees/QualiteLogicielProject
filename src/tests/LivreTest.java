package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mediatheque.OperationImpossible;
import mediatheque.document.Livre;
import util.InvariantBroken;

public class LivreTest {

	Livre livreemprunteempruntable, livrenonemprunteempruntable, livrenonemprunnonempruntab, livreempruntenonempruntable;

	@Test
	public void emprunterTest1() throws InvariantBroken, OperationImpossible {
		assertTrue(livrenonemprunteempruntable.emprunter());
	}
	
	@Test(expected = OperationImpossible.class)
	public void emprunterTest2() throws InvariantBroken, OperationImpossible {
		livreempruntenonempruntable.emprunter();
	}
	
	@Test(expected = OperationImpossible.class)
	public void emprunterTest3() throws InvariantBroken, OperationImpossible {
		livreemprunteempruntable.emprunter();
	}

}
