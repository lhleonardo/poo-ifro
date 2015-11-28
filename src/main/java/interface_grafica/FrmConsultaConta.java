package interface_grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import polimorfismo.ContaEspecial;

public class FrmConsultaConta extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private List<ContaEspecial> contas;
	private JPanel panel;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JButton btnPesquisar;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				FrmConsultaConta frame = new FrmConsultaConta(null);
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public FrmConsultaConta(List<ContaEspecial> contas) {
		this.setContas(contas);
		this.initComponents();
	}

	private void initComponents() {

		this.setBounds(100, 100, 400, 50);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(this.contentPane);

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);

		this.lblNumero = new JLabel("Número");
		this.panel.add(this.lblNumero);

		this.txtNumero = new JTextField();
		this.txtNumero.setColumns(5);
		this.panel.add(this.txtNumero);

		this.btnPesquisar = new JButton("Pesquisar");
		this.btnPesquisar.addActionListener(this);
		this.panel.add(this.btnPesquisar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnPesquisar) {
			this.pesquisaConta();
		}
	}

	/**
	 *
	 */
	private void pesquisaConta() {
		Integer numero = Integer.parseInt(this.txtNumero.getText());

		Optional<ContaEspecial> optional = this.contas.stream().filter(c -> c.getNumero() == numero).findFirst();

		if (optional.isPresent()) {
			JOptionPane.showMessageDialog(this, optional.get(), "Mensagem de Informação", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Nada foi encontrado.", "Mensagem de Informação", JOptionPane.ERROR_MESSAGE);
		}

	}

	public List<ContaEspecial> getContas() {
		return this.contas;
	}

	public void setContas(List<ContaEspecial> contas) {
		this.contas = contas;
	}

}
