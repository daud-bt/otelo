package otelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class otelo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otelo window = new otelo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public otelo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 609, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ActionListener bl = new ActionListener() {
			int pemain=1;
			
			public void actionPerformed(ActionEvent e) {

				JButton thisButton = (JButton)e.getSource();
				String s = thisButton.getText();
				String[] hasil = s.split(",");
				System.out.println("x: "+hasil[0]+"  "+"y: "+hasil[1]);
				
				
				if(pemain==1)
				{
					Icon icon = new ImageIcon("D:\\white.png");				
					if(thisButton.getIcon()==null) {
						pemain=0;
						thisButton.setIcon(icon);
					}
					
				}
				else
				{
					Icon icon = new ImageIcon("D:\\black.png");					
					if(thisButton.getIcon()==null) {
						pemain=1;
						thisButton.setIcon(icon);			
					}
				}
				

				
			}
		};

		JButton button = new JButton("0,0");
		button.setForeground(UIManager.getColor("Button.background"));

		
	

		button.addActionListener(bl);
		button.setBounds(23, 23, 49, 39);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1,0");
		button_1.setForeground(UIManager.getColor("Button.background"));
		button_1.addActionListener(bl);
		
//		if (button_1.getIcon().equals(white) ) {
//			button_1.setText("haha");
//		}
		
		button_1.setBounds(82, 23, 49, 39);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2,0");
		button_2.setForeground(UIManager.getColor("Button.background"));
		button_2.addActionListener(bl);
		button_2.setBounds(143, 23, 49, 39);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3,0");
		button_3.setForeground(UIManager.getColor("Button.background"));
		button_3.addActionListener(bl);
		button_3.setBounds(200, 23, 49, 39);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4,0");
		button_4.setForeground(UIManager.getColor("Button.background"));
		button_4.addActionListener(bl);
		button_4.setBounds(259, 23, 49, 39);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5,0");
		button_5.setForeground(UIManager.getColor("Button.background"));
		button_5.addActionListener(bl);
		button_5.setBounds(318, 23, 49, 39);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6,0");
		button_6.setForeground(UIManager.getColor("Button.background"));
		button_6.addActionListener(bl);
		button_6.setBounds(377, 23, 49, 39);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7,0");
		button_7.setForeground(UIManager.getColor("Button.background"));
		button_7.addActionListener(bl);
		button_7.setBounds(436, 23, 49, 39);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0,1");
		button_8.setForeground(UIManager.getColor("Button.background"));
		button_8.addActionListener(bl);
		button_8.setBounds(23, 73, 49, 39);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1,1");
		button_9.setForeground(UIManager.getColor("Button.background"));
		button_9.addActionListener(bl);
		button_9.setBounds(82, 73, 49, 39);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2,1");
		button_10.setForeground(UIManager.getColor("Button.background"));
		button_10.addActionListener(bl);
		button_10.setBounds(143, 73, 49, 39);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3,1");
		button_11.setForeground(UIManager.getColor("Button.background"));
		button_11.addActionListener(bl);
		button_11.setBounds(200, 73, 49, 39);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("4,1");
		button_12.setForeground(UIManager.getColor("Button.background"));
		button_12.addActionListener(bl);
		button_12.setBounds(259, 73, 49, 39);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("5,1");
		button_13.setForeground(UIManager.getColor("Button.background"));
		button_13.addActionListener(bl);
		button_13.setBounds(318, 73, 49, 39);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("6,1");
		button_14.setForeground(UIManager.getColor("Button.background"));
		button_14.addActionListener(bl);
		button_14.setBounds(377, 73, 49, 39);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("7,1");
		button_15.setForeground(UIManager.getColor("Button.background"));
		button_15.addActionListener(bl);
		button_15.setBounds(436, 73, 49, 39);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("0,2");
		button_16.setForeground(UIManager.getColor("Button.background"));
		button_16.addActionListener(bl);
		button_16.setBounds(23, 123, 49, 39);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("1,2");
		button_17.setForeground(UIManager.getColor("Button.background"));
		button_17.addActionListener(bl);
		button_17.setBounds(82, 123, 49, 39);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("2,2");
		button_18.setForeground(UIManager.getColor("Button.background"));
		button_18.addActionListener(bl);
		button_18.setBounds(143, 123, 49, 39);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("3,2");
		button_19.setForeground(UIManager.getColor("Button.background"));
		button_19.addActionListener(bl);
		button_19.setBounds(200, 123, 49, 39);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("4,2");
		button_20.setForeground(UIManager.getColor("Button.background"));
		button_20.addActionListener(bl);
		button_20.setBounds(259, 123, 49, 39);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("5,2");
		button_21.setForeground(UIManager.getColor("Button.background"));
		button_21.addActionListener(bl);
		button_21.setBounds(318, 123, 49, 39);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("6,2");
		button_22.setForeground(UIManager.getColor("Button.background"));
		button_22.addActionListener(bl);
		button_22.setBounds(377, 123, 49, 39);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("7,2");
		button_23.setForeground(UIManager.getColor("Button.background"));
		button_23.addActionListener(bl);
		button_23.setBounds(436, 123, 49, 39);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("7,4");
		button_24.setForeground(UIManager.getColor("Button.background"));
		button_24.addActionListener(bl);
		button_24.setBounds(436, 223, 49, 39);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("7,3");
		button_25.setForeground(UIManager.getColor("Button.background"));
		button_25.addActionListener(bl);
		button_25.setBounds(436, 173, 49, 39);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("0,3");
		button_26.setForeground(UIManager.getColor("Button.background"));
		button_26.addActionListener(bl);
		button_26.setBounds(23, 173, 49, 39);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("1,3");
		button_27.setForeground(UIManager.getColor("Button.background"));
		button_27.addActionListener(bl);
		button_27.setBounds(82, 173, 49, 39);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("0,4");
		button_28.setForeground(UIManager.getColor("Button.background"));
		button_28.addActionListener(bl);
		button_28.setBounds(23, 223, 49, 39);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("0,5");
		button_29.setForeground(UIManager.getColor("Button.background"));
		button_29.addActionListener(bl);
		button_29.setBounds(23, 273, 49, 39);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("1,5");
		button_30.setForeground(UIManager.getColor("Button.background"));
		button_30.addActionListener(bl);
		button_30.setBounds(84, 273, 49, 39);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("1,4");
		button_31.setForeground(UIManager.getColor("Button.background"));
		button_31.addActionListener(bl);
		button_31.setBounds(84, 223, 49, 39);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.addActionListener(bl);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("2,3");
		button_33.setForeground(UIManager.getColor("Button.background"));
		button_33.addActionListener(bl);
		button_33.setBounds(143, 173, 49, 39);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("2,4");
		button_34.setForeground(UIManager.getColor("Button.background"));
		button_34.addActionListener(bl);
		button_34.setBounds(141, 223, 49, 39);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("2,5");
		button_35.setForeground(UIManager.getColor("Button.background"));
		button_35.addActionListener(bl);
		button_35.setBounds(141, 273, 49, 39);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("3,5");
		button_36.setForeground(UIManager.getColor("Button.background"));
		button_36.addActionListener(bl);
		button_36.setBounds(200, 273, 49, 39);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("3,4");
		button_37.setForeground(UIManager.getColor("Button.background"));
		button_37.addActionListener(bl);
		button_37.setBounds(200, 223, 49, 39);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("3,3");
		button_38.setForeground(UIManager.getColor("Button.background"));
		button_38.addActionListener(bl);
		button_38.setBounds(200, 173, 49, 39);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("4,3");
		button_39.setForeground(UIManager.getColor("Button.background"));
		button_39.addActionListener(bl);
		button_39.setBounds(259, 173, 49, 39);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("4,4");
		button_40.setForeground(UIManager.getColor("Button.background"));
		button_40.addActionListener(bl);
		button_40.setBounds(259, 223, 49, 39);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("4,5");
		button_41.setForeground(UIManager.getColor("Button.background"));
		button_41.addActionListener(bl);
		button_41.setBounds(259, 273, 49, 39);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("5,5");
		button_42.setForeground(UIManager.getColor("Button.background"));
		button_42.addActionListener(bl);
		button_42.setBounds(318, 273, 49, 39);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("5,4");
		button_43.setForeground(UIManager.getColor("Button.background"));
		button_43.addActionListener(bl);
		button_43.setBounds(318, 223, 49, 39);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("5,3");
		button_44.setForeground(UIManager.getColor("Button.background"));
		button_44.addActionListener(bl);
		button_44.setBounds(318, 173, 49, 39);
		frame.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("6,3");
		button_45.setForeground(UIManager.getColor("Button.background"));
		button_45.addActionListener(bl);
		button_45.setBounds(377, 173, 49, 39);
		frame.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("6,4");
		button_46.setForeground(UIManager.getColor("Button.background"));
		button_46.addActionListener(bl);
		button_46.setBounds(377, 223, 49, 39);
		frame.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("6,5");
		button_47.setForeground(UIManager.getColor("Button.background"));
		button_47.addActionListener(bl);
		button_47.setBounds(377, 273, 49, 39);
		frame.getContentPane().add(button_47);
		
		JButton button_48 = new JButton("7,6");
		button_48.setForeground(UIManager.getColor("Button.background"));
		button_48.addActionListener(bl);
		button_48.setBounds(436, 323, 49, 39);
		frame.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("7,5");
		button_49.setForeground(UIManager.getColor("Button.background"));
		button_49.addActionListener(bl);
		button_49.setBounds(436, 273, 49, 39);
		frame.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("0,6");
		button_50.setForeground(UIManager.getColor("Button.background"));
		button_50.addActionListener(bl);
		button_50.setBounds(23, 323, 49, 39);
		frame.getContentPane().add(button_50);
		
		JButton button_51 = new JButton("0,7");
		button_51.setForeground(UIManager.getColor("Button.background"));
		button_51.addActionListener(bl);
		button_51.setBounds(23, 373, 49, 39);
		frame.getContentPane().add(button_51);
		
		JButton button_52 = new JButton("1,6");
		button_52.setForeground(UIManager.getColor("Button.background"));
		button_52.addActionListener(bl);
		button_52.setBounds(84, 323, 49, 39);
		frame.getContentPane().add(button_52);
		
		JButton button_53 = new JButton("1,7");
		button_53.setForeground(UIManager.getColor("Button.background"));
		button_53.addActionListener(bl);
		button_53.setBounds(84, 373, 49, 39);
		frame.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("2,6");
		button_54.setForeground(UIManager.getColor("Button.background"));
		button_54.addActionListener(bl);
		button_54.setBounds(141, 323, 49, 39);
		frame.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("2,7");
		button_55.setForeground(UIManager.getColor("Button.background"));
		button_55.addActionListener(bl);
		button_55.setBounds(141, 373, 49, 39);
		frame.getContentPane().add(button_55);
		
		JButton button_56 = new JButton("3,6");
		button_56.setForeground(UIManager.getColor("Button.background"));
		button_56.addActionListener(bl);
		button_56.setBounds(200, 322, 49, 39);
		frame.getContentPane().add(button_56);
		
		JButton button_57 = new JButton("3,7");
		button_57.setForeground(UIManager.getColor("Button.background"));
		button_57.addActionListener(bl);
		button_57.setBounds(200, 373, 49, 39);
		frame.getContentPane().add(button_57);
		
		JButton button_58 = new JButton("4,6");
		button_58.setForeground(UIManager.getColor("Button.background"));
		button_58.addActionListener(bl);
		button_58.setBounds(259, 323, 49, 39);
		frame.getContentPane().add(button_58);
		
		JButton button_59 = new JButton("4,7");
		button_59.setForeground(UIManager.getColor("Button.background"));
		button_59.addActionListener(bl);
		button_59.setBounds(259, 373, 49, 39);
		frame.getContentPane().add(button_59);
		
		JButton button_60 = new JButton("5,6");
		button_60.setForeground(UIManager.getColor("Button.background"));
		button_60.addActionListener(bl);
		button_60.setBounds(318, 322, 49, 39);
		frame.getContentPane().add(button_60);
		
		JButton button_61 = new JButton("5,7");
		button_61.setForeground(UIManager.getColor("Button.background"));
		button_61.addActionListener(bl);
		button_61.setBounds(318, 373, 49, 39);
		frame.getContentPane().add(button_61);
		
		JButton button_62 = new JButton("6,6");
		button_62.setForeground(UIManager.getColor("Button.background"));
		button_62.addActionListener(bl);
		button_62.setBounds(377, 322, 49, 39);
		frame.getContentPane().add(button_62);
		
		JButton button_63 = new JButton("6,7");
		button_63.setForeground(UIManager.getColor("Button.background"));
		button_63.addActionListener(bl);		
		button_63.setBounds(377, 373, 49, 39);
		frame.getContentPane().add(button_63);
		
		JButton button_64 = new JButton("7,7");
		button_64.setForeground(UIManager.getColor("Button.background"));
		button_64.addActionListener(bl);
		button_64.setBounds(436, 373, 49, 39);
		frame.getContentPane().add(button_64);
	}
}
