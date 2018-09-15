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
		super ("Primeira aplica��o Swing");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		initialize();
		
	}
	private void initialize() {
		botao = new JButton("um bot�o");
		botao.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e ) {
				label.setText("cliquei no bot�o");
			}
		
			
		});
		label = new JLabel ("algum bot�o");
		getContentPane().add(botao);
		getContentPane().add(label);
		
		
	}
	

	public static void main(String[] args) {
		AppSwing app = new AppSwing();
		app.setVisible(Boolean.TRUE);

	}

}
