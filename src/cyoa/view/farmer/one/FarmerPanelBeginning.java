package cyoa.view.farmer.one;

import javax.swing.JPanel;
import cyoa.controller.Controller;
import java.awt.*;
import javax.swing.*;

public class FarmerPanelBeginning extends JPanel
{
	private Controller app;
	private JLabel label;
	
	public FarmerPanelBeginning(Controller app)
	{
		super();
		this.app = app;
		
		this.label = new JLabel("One of your sheep has jumped the fance and run off into the dark forest! /nWhat will you do:");
	}
}
