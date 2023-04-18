package com.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.day24.EventTest1.EventHandler;

public class EventTest2 extends Frame{
		private Button btClose;
		
		public void EventTest2() {
			btClose = new Button("Close");
			this.add(btClose, "South");
			//이벤트연결
			btClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("익명 클래스 이용!");
					System.exit(0);;
					
				}
			});
			
		}//생성자
		
	public static void main(String[] args) {
		EventTest2 f = new EventTest2();
		f.setSize(300,200);
		f.setVisible(true);


	}

}