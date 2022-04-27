package cyoa.view.farmer.four;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFourTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelFourTwo(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
