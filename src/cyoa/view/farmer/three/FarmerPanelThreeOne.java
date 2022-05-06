package cyoa.view.farmer.three;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the first possibility of the third situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelThreeOne extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton dOneButton;
	private JButton dTwoButton;
	private JButton dEightButton;
	
	/**
	 * Creates a new FarmerPanelThreeOne with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelThreeOne(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.label = new JLabel("c1");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.dOneButton = new JButton("go to d1");
		this.dTwoButton = new JButton("go to d2");
		this.dEightButton = new JButton("go to d8");
		
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
		
		panel.add(dOneButton);
		panel.add(dTwoButton);
		panel.add(dEightButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		dOneButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_ONE]));
		dTwoButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_TWO]));
		dEightButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_EIGHT]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, panel, 265, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -279, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, -583, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -203, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -83, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, label, -384, SpringLayout.EAST, this);
	}
}
