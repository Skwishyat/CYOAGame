package cyoa.view;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import cyoa.controller.Controller;

public class PastStoriesPanel extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	
	private JLabel imageLabel;
	private ImageIcon graphImage;
	
	private JScrollPane scrollPane;
	
	public PastStoriesPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel();
		this.label = new JLabel("take a look at the stories you previously completed:");
		this.layout = new SpringLayout();
		
		this.graphImage = new ImageIcon();
		this.scrollPane = new JScrollPane();
		
		updateDisplay();
		setupPanel();
		setupLayout();
	}
	
	private void updateDisplay()
	{
		String fileName = "src/cyoa/view/images/BasicStoryBoard.png";
		
		graphImage = new ImageIcon(getClass().getResource("/BasicStoryBoard.png"));
		imageLabel.setIcon(graphImage);
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(800,800));
		
		this.add(panel);
		this.add(label);
		this.add(imageLabel);
		
		panel.add(scrollPane);
		
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, panel, 98, SpringLayout.SOUTH, label);
		layout.putConstraint(SpringLayout.SOUTH, panel, -611, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, panel, 227, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, panel, 381, SpringLayout.WEST, this);
	}
}
