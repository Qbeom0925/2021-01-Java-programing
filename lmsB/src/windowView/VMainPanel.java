package windowView;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

import constants.Config.FVMainPanel;

public class VMainPanel extends JPanel {
	//attributes
	private static final long serialVersionUID = 1L;
	//components
	
	private VSungangsincheong vSungangsincheong;
	public VMainPanel() {
		super();
		//attributes
		this.setBackground(FVMainPanel.background);
		//components
		this.vSungangsincheong = new VSungangsincheong();
		this.add(this.vSungangsincheong);
	}
	public void initialize() {
//		this.vLogin.initialize();
		this.vSungangsincheong.initialize();
	}
	
}
