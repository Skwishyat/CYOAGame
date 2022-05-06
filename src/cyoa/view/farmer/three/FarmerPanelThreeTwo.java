package cyoa.view.farmer.three;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the second possibility of the third situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelThreeTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton dThreeButton;
	private JButton dFourButton;
	private JButton dFiveButton;
	
	/**
	 * Creates a new FarmerPanelThreeTwo with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelThreeTwo(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.label = new JLabel("c2");
		this.layout = new SpringLayout();
		layout.putConstraint(SpringLayout.NORTH, panel, 84, SpringLayout.SOUTH, label);
		layout.putConstraint(SpringLayout.SOUTH, panel, -341, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -618, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, -582, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -202, SpringLayout.EAST, this);
		this.farmerInfo = new FarmerStory();
		
		this.dThreeButton = new JButton("go to d3");
		this.dFourButton = new JButton("go to d4");
		this.dFiveButton = new JButton("go to d5");
		
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
		this.setPreferredSize(new Dimension(800,800));
		
		this.add(panel);
		this.add(label);
		
		panel.add(dThreeButton);
		panel.add(dFourButton);
		panel.add(dFiveButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		dThreeButton.addActionListener(clikc -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_THREE]));
		dFourButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_FOUR]));
		dFiveButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_FIVE]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.EAST, label, -384, SpringLayout.EAST, this);
	}
}
