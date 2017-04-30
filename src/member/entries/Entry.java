package member.entries;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.CrewLogSystem;

@SuppressWarnings("serial")
public class Entry extends JButton implements CrewLogSystem, ActionListener{
	String Entry;
	String Date;
	String User;
	String Job;
	public Entry(String Date, String User, String Job, String Entry) {
		super(Date);
		this.setFont(FONT_16);
		this.setSize(new Dimension(40,60));
		this.Date=Date;
		this.User=User;
		this.Job=Job;
		this.Entry=Entry;
		
		this.addActionListener(this);
	}
	public String getEntry() {
		return Entry;
	}
	public String getDate() {
		return Date;
	}
	public String getUser() {
		return User;
	}
	public String getJob() {
		return Job;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		@SuppressWarnings("unused")
		VeiwEntry entry = new VeiwEntry(this);
		
	}

}
