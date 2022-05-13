package cyoa.view;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import cyoa.controller.Controller;

public class PastStoriesPanel extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	private JPanel viewPanel;
	private JLabel graphLabel;
	private BufferedImage graphImage;
	private JLabel imageLabel;
	private JButton mainButton;
	
	public PastStoriesPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel(new GridLayout(1,1));
		this.label = new JLabel("take a look at the stories you previously completed:");
		this.layout = new SpringLayout();
		
		this.viewPanel = new JPanel(new GridLayout(3,3)); 
		
		this.mainButton = new JButton("Go back to main screen");
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	
	public void addGraph(String storyType)
	{
		try
		{
			this.graphImage = ImageIO.read(new File("src/cyoa/view/images/BasicStoryBoard copy.png"));
		}
		catch (IOException exception)
		{
			System.out.println("didn't work");
		}
		this.imageLabel = new JLabel(new ImageIcon(graphImage));
		this.graphLabel = new JLabel(storyType);
		viewPanel.add(graphLabel);
		viewPanel.add(imageLabel);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(1200,800));
		
		this.add(viewPanel);
		this.add(panel);
		
		this.add(label);
		
		panel.add(mainButton);
	}
	
	private void setupListeners()
	{
		mainButton.addActionListener(click -> app.getFrame().changeScreen("main"));
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, viewPanel, 15, SpringLayout.NORTH, this);
	}
}
