package main.admin;

import java.awt.BorderLayout;

import javax.swing.*;

import main.admin.OMSAdmin;
import main.admin.OMSAdminController;

@SuppressWarnings("serial")
public class OMSAdmin extends JFrame {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 550;
	
	public OMSAdmin(OMSAdminController controller) {
		JPanel rootPanel = new JPanel();
		setContentPane(rootPanel);
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		
		
//		rootPanel.add(controller.getCartPane(), BorderLayout.NORTH);
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		rootPanel.add(tabbedPane, BorderLayout.CENTER);
		
		
		JPanel bookPage = controller.getBookPage();
		tabbedPane.addTab("Books", null, bookPage, "Books");
		
		
		tabbedPane.addTab("Compact Discs", null, new JPanel(), "Compact Discs");
		tabbedPane.addTab("Digital Video Discs", null, new JPanel(), "Digital Video Discs");



		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Online Media System for Admin - Nguyen Kien Trung - 20173421");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new OMSAdmin(new OMSAdminController());
			}
		});
	}
}
