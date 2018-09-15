import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.CORBA.INITIALIZE;

public class AppSwing  extends JFrame{
	JButton botao;
	JLabel label;
	public AppSwing() {
		super ("Primeira aplicação Swing");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		initialize();
		
	}
	private void initialize() {
		botao = new JButton("um botão");
		botao.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e ) {
				label.setText("cliquei no botão");
			}
		
			
		});
		label = new JLabel ("algum botão");
		getContentPane().add(botao);
		getContentPane().add(label);
		
		
	}
	

	public static void main(String[] args) {
		AppSwing app = new AppSwing();
		app.setVisible(Boolean.TRUE);

	}

}
