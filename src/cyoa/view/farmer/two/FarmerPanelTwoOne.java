package cyoa.view.farmer.two;

import java.awt.Dimension;

import javax.swing.*;
import cyoa.controller.Controller;

/**
 * This is the panel for the first possibility of the second situation the user will encounter
 * It has two options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelTwoOne extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	private JLabel label;
	private SpringLayout layout;
	
	/**
	 * Creates a new FarmerPanelTwoOne with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelTwoOne(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
		
		this.label = new JLabel("B1");
		this.layout = new SpringLayout();
		
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
		layout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, label, 70, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.NORTH, panel, 63, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, 232, SpringLayout.WEST, this);
	}
}
