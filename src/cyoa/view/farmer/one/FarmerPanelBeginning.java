package cyoa.view.farmer.one;

import javax.swing.JPanel;
import cyoa.controller.Controller;
import java.awt.*;
import javax.swing.*;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the first slide of the farmer story
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelBeginning extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	
	private FarmerStory farmerInfo;
	
	private JButton bOneButton;
	private JButton bTwoButton;
	private JButton bThreeButton;
	
	/**
	 * Creates a new beginning farmer panel with the controller it will be contained in
	 * @param app the controller that the panel will be contained in
	 */
	public FarmerPanelBeginning(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel(new GridLayout(1,0));
		this.label = new JLabel("One of your sheep has jumped the fence and run off into the dark "
				+ "forest! /nWhat will you do:");
		this.layout = new SpringLayout();
		
		this.farmerInfo = new FarmerStory();
		
		this.bOneButton = new JButton("go to b1");
		this.bTwoButton = new JButton("go to b2");
		this.bThreeButton = new JButton("go to b3");
		
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
		
		panel.add(bOneButton);
		panel.add(bTwoButton);
		panel.add(bThreeButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		bOneButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.B_ONE]));
		bTwoButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.B_TWO]));
		bThreeButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.B_THREE]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, panel, 269, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -506, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -253, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -1044, SpringLayout.EAST, this);
	}
}
