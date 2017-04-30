package member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import GUI.CrewLogSystem;
import member.entries.Entry;

@SuppressWarnings("serial")
public class Member extends JButton implements CrewLogSystem, ActionListener{
	String name;
	String Job;
	public ArrayList<Entry> Entries = new ArrayList<Entry>();
	public Member(String name, String Job) {
		super(name+":"+Job);
		this.name=name;
		this.Job=Job;
		this.setFont(FONT_24);
		this.addActionListener(this);
	}
	public String getName(){
		return name;
	}
	public String getJob(){
		return Job;
	}
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unused")
		MemberOverview screen = new MemberOverview(this);
	}

}
