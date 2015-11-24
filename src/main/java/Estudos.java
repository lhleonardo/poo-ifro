/*
 * Este exemplo mostra como efetuar uma pesquisa incremental em uma JList. À medida que o
 * texto é digitado no JTextField, o primeiro item começando com tal texto é selecionado
 * na JList.
 */

import java.awt.Container;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Position;

public class Estudos extends JFrame {
	JList lista;

	public Estudos() {
		super("A classe JList");

		Container c = getContentPane();
		c.setLayout(null);

		// Cria os itens da lista
		String linguagens[] = { "C#", "VB.NET", "Java", "C++", "JavaScript", "Visual Basic", "Delphi", "Python", "C", "ASP", "ASP.NET",
		        "PHP" };

		// ordena os itens da lista
		Arrays.sort(linguagens);

		// Cria a JList
		lista = new JList(linguagens);

		// Adiciona um rótulo
		JLabel rotulo = new JLabel("Pesquisar na lista:");
		c.add(rotulo);
		rotulo.setBounds(10, 5, 200, 20);

		// Adiciona a caixa de texto usada para pesquisar
		// os valores na lista
		final JTextField pesquisa = new JTextField();
		pesquisa.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				pesquisarLista(pesquisa.getText());
			}

			public void removeUpdate(DocumentEvent e) {
				pesquisarLista(pesquisa.getText());
			}

			public void changedUpdate(DocumentEvent e) {
			}
		});

		c.add(pesquisa);
		pesquisa.setBounds(10, 27, 150, 20);

		// Adiciona a lista à janela
		JScrollPane scroll = new JScrollPane(lista);
		c.add(scroll);
		scroll.setBounds(10, 49, 150, 150);

    setSize(350, 250);
		setVisible(true);
	}

	public static void main(String args[]) {
		Estudos app = new Estudos();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void pesquisarLista(String texto) {
		int pos = lista.getNextMatch(texto, 0, Position.Bias.Forward);
		lista.setSelectedIndex(pos);
		lista.ensureIndexIsVisible(pos);
	}
}