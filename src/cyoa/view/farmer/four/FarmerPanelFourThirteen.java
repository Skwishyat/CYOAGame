package cyoa.view.farmer.four;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the thirteenth possibility of the fourth situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelFourThirteen extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton eElevenButton;
	private JButton eTwelveButton;
	private JButton eThirteenButton;
	
	/**
	 * Creates a new FarmerPanelFourThirteen with the controller it will be contained in
	 * @param app The controller it will be contained in
	 */
	public FarmerPanelFourThirteen(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.label = new JLabel("d13");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.eElevenButton = new JButton("go to e11");
		this.eTwelveButton = new JButton("go to e12");
		this.eThirteenButton = new JButton("go to e13");
		
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
		
		panel.add(eElevenButton);
		panel.add(eTwelveButton);
		panel.add(eThirteenButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		eElevenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.E_ELEVEN]));
		eTwelveButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.E_TWELVE]));
		eThirteenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.E_THIRTEEN]));
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
