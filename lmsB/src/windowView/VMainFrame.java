package windowView;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import constants.Config.FVMainFrame;


public class VMainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private VMainPanel vMainPanel;
	
	public VMainFrame() {
		//attributes
		this.setLocation(FVMainFrame.Location);
		this.setSize(FVMainFrame.size);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//component
		this.vMainPanel = new VMainPanel();
		this.add(this.vMainPanel);
	}
	
	private void initialize() {
		//variable attributes
		this.vMainPanel.initialize();
	}
	
	public static void main(String[] args) {
		VMainFrame vMain = new VMainFrame();
		vMain.initialize();
		
		vMain.setVisible(true);
	}
}
