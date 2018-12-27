/*
 * zuihou1.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class zuihou1 extends javax.swing.JFrame {

	/** Creates new form zuihou1 */
	public zuihou1() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

		jButton2.setBackground(new java.awt.Color(0, 0, 0));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton2.setForeground(new java.awt.Color(204, 0, 0));
		jButton2.setText("\u81ea\u5df1\u4e00\u4e2a\u4eba\u9003\u79bb");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(130, 370, 200, 33);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setBackground(new java.awt.Color(0, 0, 0));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setForeground(new java.awt.Color(204, 0, 0));
		jButton1.setText("\u628a\u535a\u58eb\u6253\u6655\u5e26\u8d70");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(130, 300, 200, 33);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

		jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new java.awt.Font("ËÎÌו", 0, 18));
		jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jTextArea1.setEnabled(false);
		jScrollPane1.setViewportView(jTextArea1);

		jScrollPane1.setBounds(0, 190, 460, 370);
		jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/1.jpg"))); // NOI18N
		jLabel1.setBounds(0, 0, 460, 190);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 456,
				Short.MAX_VALUE).addGap(0, 456, Short.MAX_VALUE).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 558,
				Short.MAX_VALUE).addGap(0, 558, Short.MAX_VALUE).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new zuihou111().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new zuihou11().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new zuihou1().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}