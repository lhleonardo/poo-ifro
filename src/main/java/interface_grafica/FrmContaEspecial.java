package interface_grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import polimorfismo.ContaEspecial;

public class FrmContaEspecial extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblLimite;
	private JTextField txtLimite;
	private JButton btnCriaConta;

	int ultimaConta = 0;

	private List<ContaEspecial> contas = new ArrayList<>();
	private JButton btnRelatorio;
	private JButton btnPesquisar;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				FrmContaEspecial frame = new FrmContaEspecial();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public FrmContaEspecial() {
		this.initComponents();
		this.montaTela();
	}

	private void initComponents() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 540, 107);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(this.contentPane);

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);

		this.lblNome = new JLabel("Nome");

		this.txtNome = new JTextField();
		this.txtNome.setColumns(10);

		this.lblLimite = new JLabel("Límite");

		this.txtLimite = new JTextField();
		this.txtLimite.setColumns(5);

		this.btnCriaConta = new JButton("Cria Conta");

		this.btnRelatorio = new JButton("Relatório");

		this.btnPesquisar = new JButton("Pesquisar");
	}

	protected void montaTela() {
		this.panel.add(this.lblNome);
		this.panel.add(this.txtNome);
		this.panel.add(this.lblLimite);
		this.panel.add(this.txtLimite);
		this.panel.add(this.btnCriaConta);
		this.panel.add(this.btnRelatorio);
		this.panel.add(this.btnPesquisar);

		this.btnCriaConta.addActionListener(this);
		this.btnRelatorio.addActionListener(this);
		this.btnPesquisar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnCriaConta) {
			this.criaConta();
		} else if (e.getSource() == this.btnRelatorio) {
			this.imprimeContas();
		} else if (e.getSource() == this.btnPesquisar) {
			this.pesquisa();
		}
	}

	private void pesquisa() {
		FrmConsultaConta consulta = new FrmConsultaConta(this.contas);
		consulta.setModal(true);
		consulta.setVisible(true);
	}

	private void imprimeContas() {
		StringBuilder builder = new StringBuilder();

		this.contas.forEach(c -> builder.append(c + "\n"));

		JOptionPane.showMessageDialog(this, builder.toString(), "Relatório de Contas", JOptionPane.INFORMATION_MESSAGE);
	}

	protected void criaConta() {
		ContaEspecial conta = this.criaContaEspecial();
		this.contas.add(conta);
		this.mostraContaCriada(conta);
	}

	private void mostraContaCriada(ContaEspecial conta) {
		String mensagem = "Conta do número: " + conta.getNumero() + "\nnome: " + conta.getNome();
		JOptionPane.showMessageDialog(this, mensagem, "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
	}

	private ContaEspecial criaContaEspecial() {
		String nome = this.txtNome.getText();
		double limite = Double.parseDouble(this.txtLimite.getText());
		int numero = this.ultimaConta + 1;

		this.ultimaConta++;
		return new ContaEspecial(numero, nome, limite);
	}
}
