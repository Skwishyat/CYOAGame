package cyoa.tests; // Change!!!!

import cyoa.controller.Controller; // Change!!!!
import cyoa.view.StoryFrame;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
	
	
	void testMethods()
	{
		Method [] methods = testedController.getClass().getDeclaredMethods();
		assertTrue(methods.length >= 3, "You need at least three methods in the controller");
		
		boolean hasStart = false;
		boolean hasGetFrame = false;
		boolean hasAddGraph = false;
		
		for (Method method : methods)
		{
			if (method.getName().equals("addGraph"))
			{
				hasAddGraph = true;
				assertTrue(Modifier.isPublic(method.getModifiers()), "The addGraph method must be public");
				assertTrue(method.getReturnType().equals(Void.TYPE), "The addGraph method must be void");
			}
			else if (method.getName().equals("getFrame"))
			{
				hasGetFrame = true;
				assertTrue(Modifier.isPublic(method.getModifiers()), "The getFrame method must be public");
				assertEquals(method.getClass(), StoryFrame.class, "The getFrame method must return a StoryFrame");
			}
			else if (method.getName().equals("start"))
			{
				hasStart = true;
				assertTrue(Modifier.isPrivate(method.getModifiers()), "The start method must be public");
			}
			
		}
		
		assertTrue(hasStart, "You need a method named start");
		assertTrue(hasAddGraph, "You need a method named addGraph");
		assertTrue(hasGetFrame, "You need a method named hasGetFrame");
	}

}
