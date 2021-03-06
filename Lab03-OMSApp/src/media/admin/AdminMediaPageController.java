package media.admin;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.IDataManageController;

public abstract class AdminMediaPageController extends ADataPageController<Media> {
	
	protected IDataManageController iDataManageController;

	public AdminMediaPageController() {
		super();
	}
	
	public AdminMediaPageController( IDataManageController iDataManageController){
		this();
		this.iDataManageController = iDataManageController;
	}
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	abstract public void showEditDialog(Media media);
}
