package examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExampleDialog extends JFrame {
	private static final long serialVersionUID = 4845533619775211274L;

	private JButton button = new JButton("Click");
	private String text = "Nesto";
	
	public ExampleDialog() {
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setTitle("Example JFrame");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ExampleDialog window = new ExampleDialog();
		System.out.println("Text: " + window.text);
	}
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -4070623060379881616L;

		private JTextField field = new JTextField();
		private JButton click = new JButton("Send");
		
		public MyDialog() {
			setLayout(new BorderLayout());
			add(field);
			add(click, BorderLayout.SOUTH);
			click.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					text = field.getText();
					button.setText(text);
					dispose();
				}
			});
			
			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}

}
