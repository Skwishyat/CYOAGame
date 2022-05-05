package cyoa.view.farmer.six;

import javax.swing.*;
import cyoa.controller.Controller;

/**
 * This is the panel for the third possible ending
 * It is a neutral semi-common ending
 * @author awil7254
 *
 */
public class FarmerPanelThirdEnding extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private JButton mainButton;
	
	/**
	 * Creates a new FarmerPanelThirdEnding with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelThirdEnding(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
		
		this.label = new JLabel("");
		this.layout = new SpringLayout();
		this.mainButton = new JButton("Return to main screen");
		
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
