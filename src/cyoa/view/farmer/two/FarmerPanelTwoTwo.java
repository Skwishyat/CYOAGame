package cyoa.view.farmer.two;

import java.awt.Dimension;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;


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
	
	private FarmerStory farmerInfo;
	
	private JButton cThreeButton;
	private JButton cFourButton;
	private JButton cFiveButton;
	
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
		
		this.farmerInfo = new FarmerStory();
		
		this.cThreeButton = new JButton("go to c3");
		this.cFourButton = new JButton("go to c4");
		this.cFiveButton = new JButton("go to c5");
		
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
		
		panel.add(cThreeButton);
		panel.add(cFourButton);
		panel.add(cFiveButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		cThreeButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.C_THREE]));
		cFourButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.C_FOUR]));
		cFiveButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.C_FIVE]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, label, 84, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, label, 283, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, panel, 160, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, 223, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, panel, 420, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, panel, 51, SpringLayout.SOUTH, label);
	}
}
