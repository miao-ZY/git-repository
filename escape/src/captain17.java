/*
 * captain17.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class captain17 extends javax.swing.JFrame {

	/** Creates new form captain17 */
	public captain17() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton2.setBackground(new java.awt.Color(0, 0, 0));
		jButton2.setFont(new java.awt.Font("ËÎÌו", 0, 20));
		jButton2.setForeground(new java.awt.Color(204, 0, 0));
		jButton2
				.setText("\u5148\u4ece\u8fd9\u91cc\u64a4\u79bb\uff0c\u5411\u603b\u90e8\u5bfb\u6c42\u652f\u63f4");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(80, 410, 300, 25);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setBackground(new java.awt.Color(0, 0, 0));
		jButton1.setFont(new java.awt.Font("ËÎÌו", 0, 20));
		jButton1.setForeground(new java.awt.Color(204, 0, 0));
		jButton1.setText("\u5e2e\u52a9\u535a\u58eb\u6467\u6bc1\u8fd9\u91cc");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(80, 320, 300, 25);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/4.jpg"))); // NOI18N
		jLabel1.setBounds(0, 0, 460, 240);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new java.awt.Font("ËÎÌו", 0, 18));
		jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jScrollPane1.setBounds(0, 240, 460, 370);
		jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new cap1().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new cap11().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new captain17().setVisible(true);
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