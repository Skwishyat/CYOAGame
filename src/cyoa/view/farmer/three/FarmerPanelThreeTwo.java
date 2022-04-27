package cyoa.view.farmer.three;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelThreeTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelThreeTwo(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
