package cyoa.tests; // Change!!!!

import cyoa.controller.Controller; // Change!!!!

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest
{
	private Controller testedController;

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedController = new Controller();
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedController  = null;
	}

	@Test
	void testNotNull()
	{
		assertTrue(testedController != null, "Can't be null");
	}

	@Test
	void testGetFrame()
	{
		assertTrue(testedController.getFrame() instanceof JFrame, "getFrame must return a frame");
	}

}
