package cyoa.view.farmer.six;

import javax.swing.JPanel;
import cyoa.controller.Controller;

/**
 * This is the panel for the first possible ending 
 * It is a good semi-common ending
 * @author awil7254
 *
 */
public class FarmerPanelFirstEnding extends JPanel
{
	private Controller app;
	private JPanel panel;
	
	/**
	 * Creates a new FarmerPanelFirstEnding with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelFirstEnding(Controller app)
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
