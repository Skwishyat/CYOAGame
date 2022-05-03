package cyoa.view.farmer.two;

import java.awt.Dimension;

import javax.swing.*;
import cyoa.controller.Controller;

/**
 * This is the panel for the second possibility of the second situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelTwoTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	private SpringLayout layout;
	private JLabel label;
	
	/**
	 * Creates a new FarmerPanelTwoTwo with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelTwoTwo(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
		
		this.layout = new SpringLayout();
		this.label = new JLabel("B2");
		
		
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
		layout.putConstraint(SpringLayout.NORTH, panel, 183, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, 135, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, 255, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, panel, 191, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, label, 84, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, label, 283, SpringLayout.WEST, this);
	}
}
