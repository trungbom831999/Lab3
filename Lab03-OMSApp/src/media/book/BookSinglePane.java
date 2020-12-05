package media.book;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;

import media.PhysicalMediaSinglePane;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	
	private JLabel labelPublisher;
	private JLabel labelPublicationDate;
	private JLabel labelAuthors;
	private JLabel labelNumberOfPages;
	private JLabel labelLanguage;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
	
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublicationDate = new JLabel();
		add(labelPublicationDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthors = new JLabel();
		add(labelAuthors, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfPages = new JLabel();
		add(labelNumberOfPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
	}
	
	public void displayData() {
		super.displayData();
		
		if (t instanceof Book) {
			Book book = (Book) t;
			
			labelPublisher.setText("Publisher: " + book.getPublisher());
			labelPublicationDate.setText("Publication date: " + book.getPublicationDate());
			labelAuthors.setText("Authors: " + book.getAuthors());
			labelNumberOfPages.setText("Number of Pages: " + book.getNumberOfPages());
			labelLanguage.setText("Language: " + book.getLanguage());			
		}
	}
}
