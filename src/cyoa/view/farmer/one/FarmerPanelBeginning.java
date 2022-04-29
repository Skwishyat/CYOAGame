package cyoa.view.farmer.one;

import javax.swing.JPanel;
import cyoa.controller.Controller;
import java.awt.*;
import javax.swing.*;
import cyoa.view.farmer.two.*;

public class FarmerPanelBeginning extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	
	private FarmerPanelTwoOne bOne;
	private FarmerPanelTwoTwo bTwo;
	private FarmerPanelTwoThree bThree;
	
	private JButton bOneButton;
	private JButton bTwoButton;
	private JButton bThreeButton;
	
	public FarmerPanelBeginning(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel(new GridLayout(1,0));
		this.label = new JLabel("One of your sheep has jumped the fence and run off into the dark "
				+ "forest! /nWhat will you do:");
		this.layout = new SpringLayout();
		
		this.bOne = new FarmerPanelTwoOne(this.app);
		this.bTwo = new FarmerPanelTwoTwo(this.app);
		this.bThree = new FarmerPanelTwoThree(this.app);
		
		this.bOneButton = new JButton("first option");
		this.bTwoButton = new JButton("second option");
		this.bThreeButton = new JButton("third option");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
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
	
	private void setupListeners()
	{
		bOneButton.addActionListener(click -> app.getFrame().changeScreen("FBOne"));
		bTwoButton.addActionListener(click -> app.getFrame().changeScreen("FBTwo"));
		bThreeButton.addActionListener(click -> app.getFrame().changeScreen("FBThree"));
	}
	
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
