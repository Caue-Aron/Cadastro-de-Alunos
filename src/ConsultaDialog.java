import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class ConsultaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	public ConsultaDialog(ArrayList<Aluno> as, Main parent) {
		super(parent, "Consultar aluno", true);
		
		String nomes;
		String enderecos;
		String [][] data = new String[as.size()][2];
		
		for (int i = 0; i < as.size(); i++) {
			nomes = as.get(i).getNome();
			enderecos = as.get(i).getEndereco();
			data[i][0] = nomes;
			data[i][1] = enderecos;
		}
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblNewLabel = new JLabel("Nome:");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 0, 5);
				gbc_textField.fill = GridBagConstraints.BOTH;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 0;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
			}
			{
				JButton btnNewButton = new JButton("Pesquisar");
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridx = 2;
				gbc_btnNewButton.gridy = 0;
				panel.add(btnNewButton, gbc_btnNewButton);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.SOUTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JButton btnNewButton_1 = new JButton("Selecionar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int index = table.getSelectedRow();
						Aluno a = as.remove(index);
						as.add(a);
						dispose();
					}
				});
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
				gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton_1.gridx = 0;
				gbc_btnNewButton_1.gridy = 0;
				panel.add(btnNewButton_1, gbc_btnNewButton_1);
			}
			{
				JButton btnNewButton_2 = new JButton("Cancelar");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
				gbc_btnNewButton_2.anchor = GridBagConstraints.WEST;
				gbc_btnNewButton_2.gridx = 1;
				gbc_btnNewButton_2.gridy = 0;
				panel.add(btnNewButton_2, gbc_btnNewButton_2);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					data,
					new String[] {
						"Aluno", "Endereco"
					}
				));
				scrollPane.setViewportView(table);
			}
		}
	}

}
