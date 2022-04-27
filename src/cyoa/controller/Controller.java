package cyoa.controller;

import cyoa.view.StoryFrame;

public class Controller
{
	private StoryFrame frame;
	
	public Controller()
	{
		frame = new StoryFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public StoryFrame getFrame()
	{
		return frame;
	}
}
