import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.ListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JComboBox cbEstado;
	private JRadioButton rbtnFeminino;
	private JRadioButton rbtnMasculino;
	private JCheckBox cbxInformatica;
	private JCheckBox cbxQuimica;
	private JCheckBox cbxModa;
	private JList listInteresses;
	private JList listInteressado;
	private ListModel<String> list;
	private JTextPane txtObs;
	private ConfirmarGravar cg;
	private ArrayList<Aluno> alunos;
	private JButton btnGravar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		alunos = new ArrayList<Aluno>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(8, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{89, 0};
		gbl_panel_1.rowHeights = new int[]{23, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = " ";
				String endereco = " ";
				String cidade = " ";
				String estado = " ";
				
				nome = txtNome.getText();
				endereco = txtEndereco.getText();
				cidade = txtCidade.getText();
				estado = String.valueOf(cbEstado.getSelectedItem());
				
				String sexo = "";
				if (rbtnFeminino.isSelected())
					sexo = "Feminino";
				else if (rbtnMasculino.isSelected())
					sexo = "Masculino";
				
				String curso = "";
				
				if (cbxInformatica.isSelected())
					curso = "Informática ";
				
				if (cbxQuimica.isSelected())
					curso += "Química ";
				
				if (cbxModa.isSelected())
					curso += "Moda";
				
				String obs = " ";
				
				
				obs = txtObs.getText();
				
				Aluno a = new Aluno(nome, endereco, cidade, estado, curso, sexo, obs);
				alunos.remove(alunos.size() - 1);
				alunos.add(a);
				
				btnAlterar.setEnabled(false);
				btnGravar.setEnabled(true);
			}
		});
		btnAlterar.setEnabled(false);
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAlterar.anchor = GridBagConstraints.NORTH;
		gbc_btnAlterar.gridx = 0;
		gbc_btnAlterar.gridy = 0;
		panel_1.add(btnAlterar, gbc_btnAlterar);
		
		btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = " ";
				String endereco = " ";
				String cidade = " ";
				String estado = " ";
				
				nome = txtNome.getText();
				endereco = txtEndereco.getText();
				cidade = txtCidade.getText();
				estado = String.valueOf(cbEstado.getSelectedItem());
				
				String sexo = "";
				if (rbtnFeminino.isSelected())
					sexo = "Feminino";
				else if (rbtnMasculino.isSelected())
					sexo = "Masculino";
				
				String curso = "";
				
				if (cbxInformatica.isSelected())
					curso = "Informática ";
				
				if (cbxQuimica.isSelected())
					curso += "Química ";
				
				if (cbxModa.isSelected())
					curso += "Moda";
				
				String obs = " ";
				
				
				obs = txtObs.getText();
				
				Aluno a = new Aluno(nome, endereco, cidade, estado, curso, sexo, obs);
				
				cg = new ConfirmarGravar(a, alunos);
				cg.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.gridx = 0;
		gbc_btnGravar.gridy = 1;
		panel_1.add(btnGravar, gbc_btnGravar);
		
		Main janela = this;
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaDialog c = new ConsultaDialog(alunos, janela);
				c.setVisible(true);
				
				Aluno a = alunos.get(alunos.size() - 1);
				
				txtCidade.setText(a.getCidade());
				txtEndereco.setText(a.getEndereco());
				txtNome.setText(a.getNome());
				txtObs.setText(a.getObs());
				
				if (a.getSexo() == "Masculino"){
					rbtnMasculino.setSelected(true);
				}
				else if(a.getSexo() == "Feminino"){
					rbtnFeminino.setSelected(true);
				}
				
				if (a.getCurso().indexOf("Informática") != -1)
					cbxInformatica.setSelected(true);
				else
					cbxInformatica.setSelected(false);
				
				if (a.getCurso().indexOf("Moda") != -1) 
					cbxModa.setSelected(true);
				else
					cbxModa.setSelected(false);
				
				if (a.getCurso().indexOf("Química") != -1) 
					cbxQuimica.setSelected(true);
				else
					cbxQuimica.setSelected(false);
				
			
				btnAlterar.setEnabled(true);
				btnGravar.setEnabled(false);
			}
		});
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultar.gridx = 0;
		gbc_btnConsultar.gridy = 2;
		panel_1.add(btnConsultar, gbc_btnConsultar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCidade.setText("");
				txtEndereco.setText("");
				txtNome.setText("");
				txtObs.setText("");
				rbtnFeminino.setSelected(false);
				rbtnMasculino.setSelected(false);
				cbxInformatica.setSelected(false);
				cbxModa.setSelected(false);
				cbxQuimica.setSelected(false);
				
				btnGravar.setEnabled(true);
				btnAlterar.setEnabled(false);
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelar.gridx = 0;
		gbc_btnCancelar.gridy = 3;
		panel_1.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSair.gridx = 0;
		gbc_btnSair.gridy = 4;
		panel_1.add(btnSair, gbc_btnSair);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {461, 0};
		gbl_panel.rowHeights = new int[]{141, 141, 141, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 3;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 0;
		panel_2.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtEndereco = new JTextField();
		GridBagConstraints gbc_txtEndereco = new GridBagConstraints();
		gbc_txtEndereco.gridwidth = 3;
		gbc_txtEndereco.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndereco.gridx = 1;
		gbc_txtEndereco.gridy = 1;
		panel_2.add(txtEndereco, gbc_txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 2;
		panel_2.add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estado:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 2;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"SC", "SP"}));
		GridBagConstraints gbc_cbEstado = new GridBagConstraints();
		gbc_cbEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 3;
		gbc_cbEstado.gridy = 2;
		panel_2.add(cbEstado, gbc_cbEstado);
		
		JLabel lblNewLabel_4 = new JLabel("G\u00EAnero:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.anchor = GridBagConstraints.WEST;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.VERTICAL;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 3;
		panel_2.add(panel_5, gbc_panel_5);
		
		rbtnMasculino = new JRadioButton("Masculino");
		panel_5.add(rbtnMasculino);
		
		rbtnFeminino = new JRadioButton("Feminino");
		panel_5.add(rbtnFeminino);
		
		JLabel lblNewLabel_5 = new JLabel("Curso:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.anchor = GridBagConstraints.WEST;
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.VERTICAL;
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 4;
		panel_2.add(panel_6, gbc_panel_6);
		
		cbxInformatica = new JCheckBox("Inform\u00E1tica");
		panel_6.add(cbxInformatica);
		
		cbxQuimica = new JCheckBox("Qu\u00EDmica");
		panel_6.add(cbxQuimica);
		
		cbxModa = new JCheckBox("Moda");
		panel_6.add(cbxModa);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Interesses", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_3.add(scrollPane, gbc_scrollPane);
		
		ButtonGroup g = new ButtonGroup();
		g.add(rbtnFeminino);
		g.add(rbtnMasculino);
		
		listInteresses = new JList();
		listInteresses.setModel(new AbstractListModel() {
			String[] values = new String[] {"Finan\u00E7as", "Moda", "Tecnologia", "Games", "IA", "Desktop", "Programa\u00E7\u00E3o", "Bioqu\u00EDmica", "Banco de dados", "Web"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listInteresses);
		
		JButton btnPassaInteresse = new JButton(">>>");
		GridBagConstraints gbc_btnPassaInteresse = new GridBagConstraints();
		gbc_btnPassaInteresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPassaInteresse.anchor = GridBagConstraints.SOUTH;
		gbc_btnPassaInteresse.insets = new Insets(0, 0, 5, 5);
		gbc_btnPassaInteresse.gridx = 1;
		gbc_btnPassaInteresse.gridy = 0;
		panel_3.add(btnPassaInteresse, gbc_btnPassaInteresse);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 0;
		panel_3.add(scrollPane_1, gbc_scrollPane_1);
		
		listInteressado = new JList();
		listInteressado.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(listInteressado);
		
		JButton btnVoltaInteresse = new JButton("<<<");
		GridBagConstraints gbc_btnVoltaInteresse = new GridBagConstraints();
		gbc_btnVoltaInteresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltaInteresse.anchor = GridBagConstraints.NORTH;
		gbc_btnVoltaInteresse.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoltaInteresse.gridx = 1;
		gbc_btnVoltaInteresse.gridy = 1;
		panel_3.add(btnVoltaInteresse, gbc_btnVoltaInteresse);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Observa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 2;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		txtObs = new JTextPane();
		GridBagConstraints gbc_txtObs = new GridBagConstraints();
		gbc_txtObs.fill = GridBagConstraints.BOTH;
		gbc_txtObs.gridx = 0;
		gbc_txtObs.gridy = 0;
		panel_4.add(txtObs, gbc_txtObs);
	}

}
