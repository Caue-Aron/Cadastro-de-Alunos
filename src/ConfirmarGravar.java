import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmarGravar extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ConfirmarGravar(Aluno a, ArrayList<Aluno> as) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{251, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{158, 204, 0};
		gbl_panel.rowHeights = new int[]{14, 188, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Confirma\u00E7\u00E3o de Dados");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		GridBagConstraints gbc_panel_2_1 = new GridBagConstraints();
		gbc_panel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2_1.fill = GridBagConstraints.BOTH;
		gbc_panel_2_1.gridx = 0;
		gbc_panel_2_1.gridy = 1;
		panel.add(panel_2_1, gbc_panel_2_1);
		GridBagLayout gbl_panel_2_1 = new GridBagLayout();
		gbl_panel_2_1.columnWidths = new int[]{0, 0};
		gbl_panel_2_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2_1.setLayout(gbl_panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 0;
		panel_2_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cidade:");
		GridBagConstraints gbc_lblNewLabel_2_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_2.gridx = 0;
		gbc_lblNewLabel_2_2.gridy = 1;
		panel_2_1.add(lblNewLabel_2_2, gbc_lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Endere\u00E7o:");
		GridBagConstraints gbc_lblNewLabel_2_1_6 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_1_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_6.gridx = 0;
		gbc_lblNewLabel_2_1_6.gridy = 2;
		panel_2_1.add(lblNewLabel_2_1_6, gbc_lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Sexo:");
		GridBagConstraints gbc_lblNewLabel_2_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_1_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_1_1.gridx = 0;
		gbc_lblNewLabel_2_1_1_1.gridy = 3;
		panel_2_1.add(lblNewLabel_2_1_1_1, gbc_lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Cursos:");
		GridBagConstraints gbc_lblNewLabel_2_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_1_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_2_1.gridx = 0;
		gbc_lblNewLabel_2_1_2_1.gridy = 4;
		panel_2_1.add(lblNewLabel_2_1_2_1, gbc_lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Interesses:");
		GridBagConstraints gbc_lblNewLabel_2_1_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_3_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_1_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2_1_3_1.gridx = 0;
		gbc_lblNewLabel_2_1_3_1.gridy = 5;
		panel_2_1.add(lblNewLabel_2_1_3_1, gbc_lblNewLabel_2_1_3_1);
		
		JLabel lblasdf = new JLabel("Estado:");
		GridBagConstraints gbc_lblasdf = new GridBagConstraints();
		gbc_lblasdf.anchor = GridBagConstraints.EAST;
		gbc_lblasdf.insets = new Insets(0, 0, 5, 0);
		gbc_lblasdf.gridx = 0;
		gbc_lblasdf.gridy = 6;
		panel_2_1.add(lblasdf, gbc_lblasdf);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		GridBagConstraints gbc_lblObservaes = new GridBagConstraints();
		gbc_lblObservaes.anchor = GridBagConstraints.EAST;
		gbc_lblObservaes.gridheight = 3;
		gbc_lblObservaes.insets = new Insets(0, 0, 5, 0);
		gbc_lblObservaes.gridx = 0;
		gbc_lblObservaes.gridy = 7;
		panel_2_1.add(lblObservaes, gbc_lblObservaes);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNome = new JLabel(a.getNome());
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel_2.add(lblNome, gbc_lblNome);
		
		JLabel lblCidade = new JLabel(a.getCidade());
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 0);
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 1;
		panel_2.add(lblCidade, gbc_lblCidade);
		
		JLabel lblEndereco = new JLabel(a.getEndereco());
		GridBagConstraints gbc_lblEndereco = new GridBagConstraints();
		gbc_lblEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_lblEndereco.anchor = GridBagConstraints.WEST;
		gbc_lblEndereco.gridx = 0;
		gbc_lblEndereco.gridy = 2;
		panel_2.add(lblEndereco, gbc_lblEndereco);
		
		JLabel lblSexo = new JLabel(a.getSexo());
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.WEST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 0);
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 3;
		panel_2.add(lblSexo, gbc_lblSexo);
		
		JLabel lblCursos = new JLabel(a.getCurso());
		GridBagConstraints gbc_lblCursos = new GridBagConstraints();
		gbc_lblCursos.anchor = GridBagConstraints.WEST;
		gbc_lblCursos.insets = new Insets(0, 0, 5, 0);
		gbc_lblCursos.gridx = 0;
		gbc_lblCursos.gridy = 4;
		panel_2.add(lblCursos, gbc_lblCursos);
		
		JLabel lblInteresses = new JLabel("Sem interesses");
		GridBagConstraints gbc_lblInteresses = new GridBagConstraints();
		gbc_lblInteresses.anchor = GridBagConstraints.WEST;
		gbc_lblInteresses.insets = new Insets(0, 0, 5, 0);
		gbc_lblInteresses.gridx = 0;
		gbc_lblInteresses.gridy = 5;
		panel_2.add(lblInteresses, gbc_lblInteresses);
		
		JLabel lblEstado = new JLabel(a.getEstado());
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 0);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 6;
		panel_2.add(lblEstado, gbc_lblEstado);
		
		JLabel lblObs = new JLabel(a.getObs());
		GridBagConstraints gbc_lblObs = new GridBagConstraints();
		gbc_lblObs.anchor = GridBagConstraints.WEST;
		gbc_lblObs.gridheight = 2;
		gbc_lblObs.gridx = 0;
		gbc_lblObs.gridy = 7;
		panel_2.add(lblObs, gbc_lblObs);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				as.add(a);
				dispose();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.anchor = GridBagConstraints.WEST;
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 2;
		panel.add(btnCancelar, gbc_btnCancelar);
	}

}
