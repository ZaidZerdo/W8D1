package examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ExampleMenu extends JFrame {
	private static final long serialVersionUID = 1108071952045484046L;

	private JMenuBar bar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Edit");
	private JMenu menu3 = new JMenu("Source");
	private JMenuItem item1 = new JMenuItem("New");
	private JMenuItem item2 = new JMenuItem("Exit");
	
	public ExampleMenu() {
		setJMenuBar(bar);
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		
		menu1.add(item1);
		menu1.add(item2);
		
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adding new something.");
			}
		});
		
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle("Example JFrame with JMenu");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExampleMenu();
	}

}
