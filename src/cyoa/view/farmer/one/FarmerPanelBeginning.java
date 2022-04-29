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
	
	private FarmerPanelTwoOne bOne;
	private FarmerPanelTwoTwo bTwo;
	private FarmerPanelTwoThree bThree;
	
	public FarmerPanelBeginning(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel();
		this.label = new JLabel("One of your sheep has jumped the fance and run off into the dark forest! /nWhat will you do:");
	}
}
