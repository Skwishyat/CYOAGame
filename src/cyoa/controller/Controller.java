package cyoa.controller;

import cyoa.view.StoryFrame;

/**
 * The controller for the choose your own adventure game
 * @author awil7254
 *
 */
public class Controller
{
	private StoryFrame frame;
	
	/**
	 * creates a new controller for the choose your own adventure game
	 */
	public Controller()
	{
		frame = new StoryFrame(this);
	}
	
	/**
	 * starts running the application
	 */
	public void start()
	{
		
	}
	
	public StoryFrame getFrame()
	{
		return frame;
	}
}
