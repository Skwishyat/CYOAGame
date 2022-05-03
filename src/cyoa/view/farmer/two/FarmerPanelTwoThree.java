package cyoa.view.farmer.two;

import java.awt.Dimension;

import javax.swing.*;
import cyoa.controller.Controller;

/**
 * This is the panel for the third possibility of the second situation the user will encounter
 * It has two options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelTwoThree extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	private SpringLayout layout;
	private JLabel label;
	
	/**
	 * Creates a new FarmerPanelTwoThree with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelTwoThree(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
		
		this.layout = new SpringLayout();
		
		this.label = new JLabel("B3");
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	/**
	 * sets up the panel, adding all the components to be displayed
	 */
	private void setupPanel()
	{
		this.setLayout(layout);		
		this.setPreferredSize(new Dimension(1500,900));
		this.add(panel);
		this.add(label);
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
		layout.putConstraint(SpringLayout.NORTH, panel, 33, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, 114, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, 207, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, panel, 388, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, label, 78, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, label, 36, SpringLayout.EAST, panel);
	}
}
