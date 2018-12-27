import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import Model.event;

/*
 * san33.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class san33 extends javax.swing.JFrame {

	/** Creates new form san33 */
	public san33() {
		initComponents();
		this.setLocationRelativeTo(null);
		try {
			load();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void load() throws UnknownHostException, IOException,
			ClassNotFoundException {
		event u = new event();
		ArrayList<event> events = u.viewData3();
		Object detail[][] = new Object[events.size()][1];
		for (int i = events.size() - 1; i < events.size(); i++) {
			this.jTextArea1.setText(events.get(i - 3).getContent());
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel15 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton2.setForeground(new java.awt.Color(204, 0, 0));
		jButton2.setText("Next");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(547, 420, 50, 25);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jScrollPane1.setBounds(120, 330, 490, 120);
		jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/jj.jpg"))); // NOI18N
		jLabel15.setBounds(0, -210, 1280, 887);
		jLayeredPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new san333().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new san33().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}