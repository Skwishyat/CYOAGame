package cyoa.view.farmer.four;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFourOne extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelFourOne(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
