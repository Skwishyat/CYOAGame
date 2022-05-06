package cyoa.view;

import java.awt.Dimension;

import javax.swing.*;

import cyoa.controller.Controller;

public class PastStoriesPanel extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	
	public PastStoriesPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel();
		this.label = new JLabel("take a look at the stories you previously completed:");
		this.layout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(800,800));
		
		this.add(panel);
		this.add(label);
	}
	
	private void setupLayout()
	{
		
	}
}
