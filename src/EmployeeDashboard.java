import java.awt.*;
import javax.swing.*;

public class EmployeeDashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDashboard window = new EmployeeDashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 576);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl2 = new JLabel("Online Movie Tickets Booking");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Poppins", Font.BOLD, 35));
		lbl2.setForeground(new Color(255, 255, 255));
		lbl2.setBounds(38, 59, 531, 53);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("Today");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(new Color(255, 255, 255));
		lbl3.setFont(new Font("Poppins", Font.PLAIN, 23));
		lbl3.setBounds(38, 122, 95, 43);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("February 16, 2022");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(new Color(255, 255, 255));
		lbl4.setFont(new Font("Poppins SemiBold", Font.PLAIN, 16));
		lbl4.setBounds(40, 156, 154, 38);
		frame.getContentPane().add(lbl4);
		
		JLabel lblfirstm = new JLabel("");
		lblfirstm.setHorizontalAlignment(SwingConstants.CENTER);
		lblfirstm.setBounds(46, 204, 174, 282);
		lblfirstm.setIcon(new ImageIcon(this.getClass().getResource("/images/1.png")));
		frame.getContentPane().add(lblfirstm);
		
		JLabel lblsecm = new JLabel("");
		lblsecm.setHorizontalAlignment(SwingConstants.CENTER);
		lblsecm.setBounds(235, 204, 166, 282);
		lblsecm.setIcon(new ImageIcon(this.getClass().getResource("/images/2.png")));
		frame.getContentPane().add(lblsecm);
		
		JLabel lblthirdm = new JLabel("");
		lblthirdm.setHorizontalAlignment(SwingConstants.CENTER);
		lblthirdm.setBounds(416, 204, 174, 282);
		lblthirdm.setIcon(new ImageIcon(this.getClass().getResource("/images/3.png")));
		frame.getContentPane().add(lblthirdm);
		
		JLabel lblfourthm = new JLabel("");
		lblfourthm.setHorizontalAlignment(SwingConstants.CENTER);
		lblfourthm.setBounds(602, 204, 174, 282);
		lblfourthm.setIcon(new ImageIcon(this.getClass().getResource("/images/4.png")));
		frame.getContentPane().add(lblfourthm);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1010, 43);
		panel.setBackground(new Color(247, 165, 35));
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogo.setBounds(32, 0, 55, 43);
		panel.add(lbllogo);
		lbllogo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/blue-logo.png")).getImage().getScaledInstance(45, 33, Image.SCALE_DEFAULT)));
		
		JLabel lbl1 = new JLabel("INMA Theatre");
		lbl1.setBounds(95, 11, 131, 25);
		panel.add(lbl1);
		lbl1.setFont(new Font("Poppins Black", Font.BOLD, 16));
		lbl1.setForeground(new Color(255, 255, 255));
		
		JButton user_account = new JButton("Employee");
		user_account.setHorizontalAlignment(SwingConstants.TRAILING);
		user_account.setOpaque(false);
		user_account.setContentAreaFilled(false);
		user_account.setFocusPainted(false);
		user_account.setForeground(Color.WHITE);
		user_account.setFont(new Font("Poppins SemiBold", Font.PLAIN, 14));
		user_account.setBounds(872, 6, 107, 32);
		panel.add(user_account);
		
		JLabel user_profpic = new JLabel("");
		user_profpic.setHorizontalAlignment(SwingConstants.CENTER);
		user_profpic.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/user-account.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
		user_profpic.setBounds(832, 0, 63, 43);
		panel.add(user_profpic);
		
		JLabel lblrectangle = new JLabel("");
		lblrectangle.setIcon(new ImageIcon(this.getClass().getResource("/images/background.png")));
		lblrectangle.setBounds(0, 0, 1008, 537);
		frame.getContentPane().add(lblrectangle);
		
	}
}
