package cyoa.view.farmer.five;

import javax.swing.JPanel;
import cyoa.controller.Controller;

/**
 * This is the panel for the tenth possibility of the fifth situation the user will encounter
 * It has one option for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelFiveTen extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	/**
	 * Creates a new FarmerPanelFiveTen with the controller it will be contained in
	 * @param app The controller it will be contained in
	 */
	public FarmerPanelFiveTen(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	/**
	 * sets up the panel, adding all the components to be displayed
	 */
	private void setupPanel()
	{
		
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		
	}
}
