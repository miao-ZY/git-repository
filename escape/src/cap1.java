import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;

/*
 * cap1.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class cap1 extends javax.swing.JFrame implements Runnable {

	/** Creates new form cap1 */
	public cap1() {
		initComponents();
		this.setLocationRelativeTo(null);
		playmusic();
	}

	void playmusic() {
		try {
			URL cb;
			File f = new File(
					"Outlast 2 OST --- 1 the origins of muRder victim jane doe.wav");
			cb = f.toURL();
			AudioClip aau;
			aau = Applet.newAudioClip(cb);
			aau.loop();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jButton8 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel7 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton8.setBackground(new java.awt.Color(255, 255, 255));
		jButton8.setForeground(new java.awt.Color(153, 0, 0));
		jButton8.setText("\u4f7f\u7528");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		jButton8.setBounds(790, 150, 120, 29);
		jLayeredPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextField1.setEditable(false);
		jTextField1.setForeground(new java.awt.Color(153, 0, 0));
		jTextField1.setText("0");
		jTextField1.setBounds(890, 100, 20, 26);
		jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel9.setBackground(new java.awt.Color(51, 51, 0));
		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel9.setForeground(new java.awt.Color(153, 0, 0));
		jLabel9.setText("\u4f53\u529b\u836f\u5242\uff1a");
		jLabel9.setBounds(790, 100, 100, 30);
		jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel8.setForeground(new java.awt.Color(204, 0, 0));
		jLabel8.setText("\u5730\u4e0b\u4e09\u5c42");
		jLabel8.setBounds(360, 20, 144, 70);
		jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton7.setBackground(new java.awt.Color(0, 0, 0));
		jButton7.setForeground(new java.awt.Color(204, 0, 0));
		jButton7.setText("\u901a\u5f80\u4e0b\u4e00\u5c42");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jButton7.setBounds(517, 540, 120, 29);
		jLayeredPane1.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton6.setBackground(new java.awt.Color(0, 0, 0));
		jButton6.setForeground(new java.awt.Color(204, 0, 0));
		jButton6.setText("\u623f\u95f4\u4e94");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jButton6.setBounds(400, 540, 77, 29);
		jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton5.setBackground(new java.awt.Color(0, 0, 0));
		jButton5.setForeground(new java.awt.Color(204, 0, 0));
		jButton5.setText("\u623f\u95f4\u56db");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jButton5.setBounds(280, 540, 77, 29);
		jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton4.setBackground(new java.awt.Color(0, 0, 0));
		jButton4.setForeground(new java.awt.Color(204, 0, 0));
		jButton4.setText("\u623f\u95f4\u4e09");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jButton4.setBounds(530, 490, 77, 29);
		jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton3.setBackground(new java.awt.Color(0, 0, 0));
		jButton3.setForeground(new java.awt.Color(204, 0, 0));
		jButton3.setText("\u623f\u95f4\u4e8c");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jButton3.setBounds(400, 490, 77, 29);
		jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton2.setBackground(new java.awt.Color(0, 0, 0));
		jButton2.setForeground(new java.awt.Color(204, 0, 0));
		jButton2.setText("\u623f\u95f4\u4e00");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jButton2.setBounds(280, 490, 77, 29);
		jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new java.awt.Font("宋体", 0, 18));
		jTextArea1.setForeground(new java.awt.Color(204, 0, 0));
		jTextArea1.setRows(5);
		jTextArea1
				.setText("\u8c28\u614e\u9009\u62e9\u8981\u63a2\u7d22\u7684\u623f\u95f4\uff1a");
		jScrollPane1.setViewportView(jTextArea1);

		jScrollPane1.setBounds(250, 450, 410, 140);
		jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel7.setForeground(new java.awt.Color(153, 0, 0));
		jLabel7.setText("100");
		jLabel7.setBounds(80, 110, 52, 30);
		jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel6.setBackground(new java.awt.Color(51, 51, 0));
		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel6.setForeground(new java.awt.Color(153, 0, 0));
		jLabel6.setText("\u4f53\u529b\uff1a");
		jLabel6.setBounds(20, 110, 60, 30);
		jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel5.setForeground(new java.awt.Color(153, 0, 0));
		jLabel5.setText("\u6b63\u5e38");
		jLabel5.setBounds(80, 70, 52, 30);
		jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel4.setBackground(new java.awt.Color(51, 51, 0));
		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setForeground(new java.awt.Color(153, 0, 0));
		jLabel4.setText("\u72b6\u6001\uff1a");
		jLabel4.setBounds(20, 70, 90, 30);
		jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setBackground(new java.awt.Color(0, 0, 0));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setForeground(new java.awt.Color(204, 0, 0));
		jButton1.setText("\u83dc\u5355");
		jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(865, 40, 50, 29);
		jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setForeground(new java.awt.Color(153, 0, 0));
		jLabel3.setText("60");
		jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel3AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		jLabel3.setBounds(110, 30, 52, 30);
		jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel2.setBackground(new java.awt.Color(51, 51, 0));
		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setForeground(new java.awt.Color(153, 0, 0));
		jLabel2.setText("\u9003\u79bb\u65f6\u95f4\uff1a");
		jLabel2.setBounds(20, 30, 90, 30);
		jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/6.jpg.jpg"))); // NOI18N
		jLabel1.setBounds(0, 0, 946, 620);
		jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		int i;
		int x;
		String a;
		String b;
		String c;
		String d;
		c = this.jLabel7.getText();
		a = this.jTextField1.getText();
		i = Integer.parseInt(a);
		x = Integer.parseInt(c);
		if (i >= 1) {
			i = i - 1;
			b = String.valueOf(i);
			this.jTextField1.setText(b);
			x = x + 20;
			d = String.valueOf(x);
			this.jLabel7.setText(d);
		} else {
			JOptionPane.showMessageDialog(this, "无药剂可使用");
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String x;
		String y;
		int a;
		int b = 30;
		x = this.jLabel7.getText();
		a = Integer.parseInt(x);
		if (a >= 30) {
			a = a - b;
			y = String.valueOf(a);
			this.jLabel7.setText(y);
			new fusan5().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "体力不够");
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String x;
		String y;
		int a;
		int b = 30;
		x = this.jLabel7.getText();
		a = Integer.parseInt(x);
		if (a >= 30) {
			a = a - b;
			y = String.valueOf(a);
			this.jLabel7.setText(y);
			new fusan4().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "体力不够");
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		String x;
		String y;
		int a;
		int b = 20;
		x = this.jLabel7.getText();
		a = Integer.parseInt(x);
		if (a >= 20) {
			a = a - b;
			y = String.valueOf(a);
			this.jLabel7.setText(y);
			new fusan3().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "体力不够");
		}
		
		int i=1;
		String o;
		o= String.valueOf(i);
		this.jTextField1.setText(o);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String x;
		String y;
		int a;
		int b = 30;
		x = this.jLabel7.getText();
		a = Integer.parseInt(x);
		if (a >= 30) {
			a = a - b;
			y = String.valueOf(a);
			this.jLabel7.setText(y);
			new fusan2().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "体力不够");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String x;
		String y;
		int a;
		int b = 20;
		x = this.jLabel7.getText();
		a = Integer.parseInt(x);
		if (a >= 20) {
			a = a - b;
			y = String.valueOf(a);
			this.jLabel7.setText(y);
			new fusan1().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "体力不够");
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new menu().setVisible(true);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new inputpassword(this).setVisible(true);

	}

	private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {
		// TODO add your handling code here:
		Thread t = new Thread(this);
		t.start();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new cap1().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;

	// End of variables declaration//GEN-END:variables
	public void run() {
		for (int i = 60; i >= 0; i--) {
			try {
				this.jLabel3.setText(i + "");
				Thread.sleep(1000);
				if (i == 0) {
					this.dispose();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}