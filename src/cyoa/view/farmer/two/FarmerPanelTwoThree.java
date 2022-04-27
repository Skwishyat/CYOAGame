package cyoa.view.farmer.two;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelTwoThree extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelTwoThree(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
