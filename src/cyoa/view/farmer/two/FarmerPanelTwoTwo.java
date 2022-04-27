package cyoa.view.farmer.two;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelTwoTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelTwoTwo(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
