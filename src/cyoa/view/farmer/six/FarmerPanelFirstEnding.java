package cyoa.view.farmer.six;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFirstEnding extends JPanel
{
	private Controller app;
	private JPanel panel;
	
	public FarmerPanelFirstEnding(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
