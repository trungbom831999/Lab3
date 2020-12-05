package main.admin;

import javax.swing.JPanel;

import cart.CartController;
import media.admin.AdminBookPageController;
import media.user.UserBookPageController;

public class OMSAdminController {
	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
