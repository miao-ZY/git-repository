/*
 * san3.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class san3 extends javax.swing.JFrame {

	/** Creates new form san3 */
	public san3() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton2.setForeground(new java.awt.Color(204, 0, 0));
		jButton2.setText("\u8fd4\u56de");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(640, 420, 37, 25);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setBackground(new java.awt.Color(153, 153, 153));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 8));
		jButton1.setText("LL");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(400, 151, 10, 20);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new san33().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new san3().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLayeredPane jLayeredPane1;
	// End of variables declaration//GEN-END:variables

}