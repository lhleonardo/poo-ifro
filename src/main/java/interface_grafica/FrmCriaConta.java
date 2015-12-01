package interface_grafica;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import polimorfismo.Conta;
import polimorfismo.ContaEspecial;
import polimorfismo.ContaPoupanca;

import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrmCriaConta extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton btnConsultaSaldo;
	private JButton btnCriaConta;
	private JPanel contentPane;
	private JLabel jLabel2;
	private JRadioButton jRadioButton1;
	private JLabel lblCodigo;
	private JLabel lblLimite;
	private JLabel lblNome;
	private JLabel lblSaldo;
	private JLabel lblTipoConta;
	private JPanel pnlRadioGroup;
	private JRadioButton rbContaEspecial;
	private JRadioButton rbContaPoupanca;
	private JTextField txtCodigo;
	private JTextField txtLimite;
	private JTextField txtNome;
	private JTextField txtSaldo;

	private List<Conta> contas;
	private int ultimaConta = 1;
	private JButton btnRelatrio;

	public FrmCriaConta() {
		initComponents();
		meuInit();
	}

	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		contentPane = new javax.swing.JPanel();
		lblTipoConta = new javax.swing.JLabel();
		pnlRadioGroup = new javax.swing.JPanel();
		rbContaEspecial = new javax.swing.JRadioButton();
		rbContaPoupanca = new javax.swing.JRadioButton();
		lblNome = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		lblSaldo = new javax.swing.JLabel();
		txtSaldo = new javax.swing.JTextField();
		lblLimite = new javax.swing.JLabel();
		txtLimite = new javax.swing.JTextField();
		lblCodigo = new javax.swing.JLabel();
		txtCodigo = new javax.swing.JTextField();
		btnCriaConta = new javax.swing.JButton();
		btnConsultaSaldo = new javax.swing.JButton();
		btnConsultaSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnConsultaSaldoActionPerformed();
			}
		});

		jLabel2.setText("jLabel2");

		jRadioButton1.setText("jRadioButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Criador de Contas");
		setResizable(false);

		lblTipoConta.setText("Tipo de Conta");

		pnlRadioGroup.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		rbContaEspecial.setText("Conta Especial");
		rbContaEspecial.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				rbContaEspecialItemStateChanged(evt);
			}
		});

		rbContaPoupanca.setText("Conta Poupança");

		javax.swing.GroupLayout pnlRadioGroupLayout = new javax.swing.GroupLayout(pnlRadioGroup);
		pnlRadioGroup.setLayout(pnlRadioGroupLayout);
		pnlRadioGroupLayout.setHorizontalGroup(pnlRadioGroupLayout.createParallelGroup(
		        javax.swing.GroupLayout.Alignment.LEADING).addGroup(
		        pnlRadioGroupLayout.createSequentialGroup().addContainerGap().addComponent(rbContaEspecial)
		                .addGap(18, 18, 18).addComponent(rbContaPoupanca)
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pnlRadioGroupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {
		        rbContaEspecial, rbContaPoupanca });

		pnlRadioGroupLayout.setVerticalGroup(pnlRadioGroupLayout.createParallelGroup(
		        javax.swing.GroupLayout.Alignment.LEADING).addGroup(
		        pnlRadioGroupLayout
		                .createSequentialGroup()
		                .addContainerGap()
		                .addGroup(
		                        pnlRadioGroupLayout
		                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                .addComponent(rbContaEspecial)
		                                .addComponent(rbContaPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE,
		                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                .addContainerGap()));

		lblNome.setText("Nome");

		lblSaldo.setText("Saldo");

		lblLimite.setText("Limite");

		lblCodigo.setText("Código");

		txtCodigo.setEditable(false);

		btnCriaConta.setText("Criar conta");
		btnCriaConta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCriaContaActionPerformed(evt);
			}
		});

		btnConsultaSaldo.setText("Consultar Saldo");

		btnRelatrio = new JButton("Relat\u00F3rio");
		btnRelatrio.addActionListener(this);

		javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
		contentPaneLayout
		        .setHorizontalGroup(contentPaneLayout
		                .createParallelGroup(Alignment.LEADING)
		                .addGroup(
		                        contentPaneLayout
		                                .createSequentialGroup()
		                                .addContainerGap()
		                                .addGroup(
		                                        contentPaneLayout
		                                                .createParallelGroup(Alignment.TRAILING)
		                                                .addComponent(pnlRadioGroup,
		                                                        GroupLayout.DEFAULT_SIZE, 254,
		                                                        Short.MAX_VALUE)
		                                                .addComponent(txtNome, 254, 254, 254)
		                                                .addGroup(
		                                                        contentPaneLayout
		                                                                .createSequentialGroup()
		                                                                .addGroup(
		                                                                        contentPaneLayout
		                                                                                .createParallelGroup(
		                                                                                        Alignment.LEADING)
		                                                                                .addComponent(
		                                                                                        lblSaldo)
		                                                                                .addComponent(
		                                                                                        txtSaldo,
		                                                                                        114, 114, 114))
		                                                                .addGap(18)
		                                                                .addGroup(
		                                                                        contentPaneLayout
		                                                                                .createParallelGroup(
		                                                                                        Alignment.LEADING)
		                                                                                .addComponent(
		                                                                                        txtLimite,
		                                                                                        GroupLayout.PREFERRED_SIZE,
		                                                                                        122,
		                                                                                        GroupLayout.PREFERRED_SIZE)
		                                                                                .addComponent(
		                                                                                        lblLimite)))
		                                                .addGroup(
		                                                        contentPaneLayout
		                                                                .createSequentialGroup()
		                                                                .addComponent(btnRelatrio)
		                                                                .addPreferredGap(
		                                                                        ComponentPlacement.RELATED,
		                                                                        80, Short.MAX_VALUE)
		                                                                .addComponent(btnCriaConta))
		                                                .addGroup(
		                                                        contentPaneLayout
		                                                                .createSequentialGroup()
		                                                                .addGroup(
		                                                                        contentPaneLayout
		                                                                                .createParallelGroup(
		                                                                                        Alignment.LEADING)
		                                                                                .addComponent(
		                                                                                        lblTipoConta)
		                                                                                .addComponent(lblNome))
		                                                                .addGap(0, 187, Short.MAX_VALUE))
		                                                .addGroup(
		                                                        contentPaneLayout
		                                                                .createSequentialGroup()
		                                                                .addGroup(
		                                                                        contentPaneLayout
		                                                                                .createParallelGroup(
		                                                                                        Alignment.LEADING)
		                                                                                .addComponent(
		                                                                                        lblCodigo)
		                                                                                .addComponent(
		                                                                                        txtCodigo,
		                                                                                        GroupLayout.PREFERRED_SIZE,
		                                                                                        105,
		                                                                                        GroupLayout.PREFERRED_SIZE))
		                                                                .addPreferredGap(
		                                                                        ComponentPlacement.RELATED)
		                                                                .addComponent(btnConsultaSaldo,
		                                                                        GroupLayout.DEFAULT_SIZE,
		                                                                        143, Short.MAX_VALUE)))
		                                .addContainerGap()));
		contentPaneLayout.setVerticalGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING).addGroup(
		        contentPaneLayout
		                .createSequentialGroup()
		                .addContainerGap()
		                .addComponent(lblTipoConta)
		                .addGap(0)
		                .addGroup(
		                        contentPaneLayout
		                                .createParallelGroup(Alignment.TRAILING)
		                                .addGroup(
		                                        contentPaneLayout
		                                                .createSequentialGroup()
		                                                .addComponent(pnlRadioGroup,
		                                                        GroupLayout.PREFERRED_SIZE,
		                                                        GroupLayout.DEFAULT_SIZE,
		                                                        GroupLayout.PREFERRED_SIZE)
		                                                .addPreferredGap(ComponentPlacement.RELATED)
		                                                .addComponent(lblCodigo)
		                                                .addGap(0)
		                                                .addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE,
		                                                        GroupLayout.DEFAULT_SIZE,
		                                                        GroupLayout.PREFERRED_SIZE))
		                                .addComponent(btnConsultaSaldo))
		                .addGap(0)
		                .addComponent(lblNome)
		                .addGap(0)
		                .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
		                        GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(ComponentPlacement.RELATED)
		                .addGroup(
		                        contentPaneLayout.createParallelGroup(Alignment.LEADING)
		                                .addComponent(lblSaldo).addComponent(lblLimite))
		                .addGap(0)
		                .addGroup(
		                        contentPaneLayout
		                                .createParallelGroup(Alignment.BASELINE)
		                                .addComponent(txtSaldo, GroupLayout.PREFERRED_SIZE,
		                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		                                .addComponent(txtLimite, GroupLayout.PREFERRED_SIZE,
		                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(ComponentPlacement.RELATED)
		                .addGroup(
		                        contentPaneLayout.createParallelGroup(Alignment.BASELINE)
		                                .addComponent(btnCriaConta).addComponent(btnRelatrio))
		                .addGap(0, 10, Short.MAX_VALUE)));
		contentPane.setLayout(contentPaneLayout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE,
		                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		        .addGroup(
		                layout.createSequentialGroup()
		                        .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE,
		                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addContainerGap()));

		setSize(new java.awt.Dimension(280, 258));
		setLocationRelativeTo(null);
	}

	protected void btnConsultaSaldoActionPerformed() {
		Optional<String> retorno = Optional.ofNullable(JOptionPane
		        .showInputDialog("Informe o código da conta para realizar a consulta"));

		if (retorno.isPresent()) {
			Optional<Conta> first = contas.stream()
			        .filter(c -> c.getNumero().equals(Integer.parseInt(retorno.get()))).findFirst();

			if (first.isPresent()) {
				JOptionPane.showMessageDialog(this, first.get());
			} else {
				JOptionPane.showMessageDialog(this, "Nenuma conta com o código " + retorno.get()
				        + " foi encontrada.");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Informe o código para prosseguir.");
		}
	}

	protected void btnCriaContaActionPerformed(ActionEvent evt) {
		criaConta();

	}

	private void criaConta() {
		Conta c = null;

		String nome = txtNome.getText();

		if (rbContaEspecial.isSelected()) {
			if (!txtLimite.getText().isEmpty()) {
				c = new ContaEspecial(ultimaConta, nome, Double.parseDouble(txtLimite.getText()));
				adicionaConta(c);
			} else {
				JOptionPane.showMessageDialog(null, "Informe o limite antes de continuar.");
			}
		} else {
			c = new ContaPoupanca(ultimaConta, nome);
			adicionaConta(c);
		}

	}

	private void adicionaConta(Conta c) {
		contas.add(c);
		txtCodigo.setText(String.valueOf(ultimaConta));
		ultimaConta++;
	}

	private void rbContaEspecialItemStateChanged(java.awt.event.ItemEvent evt) {
		configuraCampoLimite();
	}

	private void configuraCampoLimite() {
		txtLimite.setEditable(rbContaEspecial.isSelected());
		txtLimite.setText("");
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					new FrmCriaConta().setVisible(true);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				        | UnsupportedLookAndFeelException ex) {

					Logger.getLogger(FrmCriaConta.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

	private void meuInit() {
		configuraComponentes();
		contas = new ArrayList<Conta>();
	}

	private void configuraComponentes() {
		ButtonGroup group = new ButtonGroup();
		group.add(rbContaEspecial);
		group.add(rbContaPoupanca);
		configuraCampoLimite();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRelatrio) {
			btnRelatrioActionPerformed(e);
		}
	}

	protected void btnRelatrioActionPerformed(ActionEvent e) {
		StringBuilder builder = new StringBuilder();
		contas.forEach(c -> builder.append(c + "\n"));
		JOptionPane.showMessageDialog(this, builder);
	}
}
