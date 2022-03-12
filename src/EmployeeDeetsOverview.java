import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EmployeeDeetsOverview {

	JFrame frame;
	public JLabel lbl_ID1;
	public JLabel lbl_name;
	public JLabel lbl_num1;
	public JLabel lbl_email1;
	public JLabel lbl_pass1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDeetsOverview window = new EmployeeDeetsOverview();
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
	public EmployeeDeetsOverview() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 206, 537);
		panel.setBackground(new Color(247, 165, 35));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel blue_logo = new JLabel("");
		blue_logo.setIcon(new ImageIcon(AdminDash.class.getResource("/images/blue-logo.png")));
		blue_logo.setBounds(20, 18, 67, 46);
		panel.add(blue_logo);
		
		JButton btn_dash = new JButton("Dashboard");
		btn_dash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminDash adminD = new AdminDash();
				adminD.frame.setVisible(true);
				frame.dispose();
			}
		});
		btn_dash.setForeground(Color.WHITE);
		btn_dash.setBackground(new Color(247, 165, 35));
		btn_dash.setBorderPainted(false);
		btn_dash.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_dash.setFocusPainted(false);
		btn_dash.setHorizontalAlignment(SwingConstants.LEFT);
		btn_dash.setFont(new Font("Poppins SemiBold", Font.PLAIN, 15));
		btn_dash.setBounds(5, 79, 194, 40);
		panel.add(btn_dash);
		
		JButton btn_sched = new JButton("Scheduled Movies");
		btn_sched.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				SchedMovies sm = new SchedMovies();
                sm.frame.setVisible(true);
                frame.dispose();
			}
		});
		btn_sched.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_sched.setHorizontalAlignment(SwingConstants.LEFT);
		btn_sched.setForeground(Color.WHITE);
		btn_sched.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		btn_sched.setFocusPainted(false);
		btn_sched.setBorderPainted(false);
		btn_sched.setBackground(new Color(247, 165, 35));
		btn_sched.setBounds(5, 126, 194, 40);
		panel.add(btn_sched);
		
		JButton btn_reservations = new JButton("Reservations");
		btn_reservations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Reservations r = new Reservations();
                r.frame.setVisible(true);
                frame.dispose();
			}
		});
		btn_reservations.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_reservations.setHorizontalAlignment(SwingConstants.LEFT);
		btn_reservations.setForeground(Color.WHITE);
		btn_reservations.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		btn_reservations.setFocusPainted(false);
		btn_reservations.setBorderPainted(false);
		btn_reservations.setBackground(new Color(247, 165, 35));
		btn_reservations.setBounds(5, 173, 194, 40);
		panel.add(btn_reservations);
			
		JButton btn_employees = new JButton("Employees");
		btn_employees.setHorizontalAlignment(SwingConstants.LEFT);
		btn_employees.setForeground(Color.WHITE);
		btn_employees.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		btn_employees.setFocusPainted(false);
		btn_employees.setBorderPainted(false);
		btn_employees.setBackground(new Color(246, 198, 36));
		btn_employees.setBounds(5, 217, 194, 40);
		panel.add(btn_employees);
		
		JLabel lblback = new JLabel("");
		lblback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeeDetails empDeets = new EmployeeDetails();
                empDeets.frame.setVisible(true);
                frame.dispose();
			}
		});
		lblback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblback.setBounds(234, 37, 40, 39);
        lblback.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/back.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
        frame.getContentPane().add(lblback);
        
        JLabel lbl_employee = new JLabel("Gabrille David");
		lbl_employee.setForeground(Color.WHITE);
		lbl_employee.setFont(new Font("Poppins Black", Font.PLAIN, 21));
		lbl_employee.setBounds(274, 49, 182, 19);
		frame.getContentPane().add(lbl_employee);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(false);
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(247, 165, 35));
		menuBar.setBounds(735, 10, 263, 43);
		frame.getContentPane().add(menuBar);
		
		JMenu user_account = new JMenu("   Admin   ");
		user_account.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/user-account.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
		user_account.setHorizontalAlignment(SwingConstants.CENTER);
		user_account.setBounds(new Rectangle(0, 0, 10, 0));
		user_account.setFont(new Font("Poppins SemiBold", Font.PLAIN, 14));
		user_account.setForeground(Color.WHITE);
		user_account.setContentAreaFilled(false);
		user_account.setBackground(new Color(247, 165, 35));
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(user_account);
		
		JMenuItem logout_item = new JMenuItem("Logout");
		logout_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exitconfirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "", JOptionPane.YES_NO_OPTION);
				if (exitconfirmation == JOptionPane.YES_OPTION) {
					SignIn signIn = new SignIn();
					signIn.frame.setVisible(true);
					frame.dispose();
				}			
			}
		});
		logout_item.setBackground(Color.WHITE);
		logout_item.setFont(new Font("Poppins SemiBold", Font.PLAIN, 14));
		user_account.add(logout_item);
		
		JPanel hr = new JPanel();
		hr.setBounds(233, 78, 747, 2);
		frame.getContentPane().add(hr);
		
		JButton remove_employee = new JButton("Remove");
		remove_employee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		remove_employee.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		remove_employee.setBorderPainted(false);
		remove_employee.setFont(new Font("Poppins", Font.BOLD, 10));
		remove_employee.setForeground(new Color(17, 34, 44));
		remove_employee.setBackground(new Color(246, 198, 36));
		remove_employee.setBounds(863, 337, 121, 29);
		frame.getContentPane().add(remove_employee);
		
		JPanel white_bg = new JPanel();
		white_bg.setBackground(Color.WHITE);
		white_bg.setBounds(234, 97, 747, 225);
		frame.getContentPane().add(white_bg);
		white_bg.setLayout(null);
		
		JLabel emp_profpic = new JLabel("");
		emp_profpic.setHorizontalAlignment(SwingConstants.CENTER);
		emp_profpic.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/emp_prof.png")).getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT)));
		emp_profpic.setBounds(10, 11, 256, 203);
		white_bg.add(emp_profpic);
		
		JLabel lbl_empName = new JLabel("Employee Name:");
		lbl_empName.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lbl_empName.setBounds(276, 73, 116, 17);
		white_bg.add(lbl_empName);
		
		JLabel lbl_number = new JLabel("Contact Number:");
		lbl_number.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lbl_number.setBounds(276, 104, 116, 17);
		white_bg.add(lbl_number);
		
		JLabel emp_email = new JLabel("Email:");
		emp_email.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		emp_email.setBounds(276, 137, 116, 17);
		white_bg.add(emp_email);
		
		JLabel emp_pass = new JLabel("Password:");
		emp_pass.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		emp_pass.setBounds(276, 167, 112, 19);
		white_bg.add(emp_pass);
		
		lbl_pass1 = new JLabel("");
		lbl_pass1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lbl_pass1.setBounds(417, 167, 320, 19);
		white_bg.add(lbl_pass1);
		
		lbl_email1 = new JLabel("");
		lbl_email1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lbl_email1.setBounds(417, 137, 320, 17);
		white_bg.add(lbl_email1);
		
		lbl_num1 = new JLabel("");
		lbl_num1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lbl_num1.setBounds(417, 104, 320, 17);
		white_bg.add(lbl_num1);
		
		lbl_name = new JLabel("");
		lbl_name.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lbl_name.setBounds(417, 73, 320, 17);
		white_bg.add(lbl_name);
		
		JLabel lbl_empID = new JLabel("Employee ID:");
		lbl_empID.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lbl_empID.setBounds(276, 43, 87, 17);
		white_bg.add(lbl_empID);
		
		lbl_ID1 = new JLabel("");
		lbl_ID1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lbl_ID1.setBounds(417, 43, 320, 17);
		white_bg.add(lbl_ID1);
		
		JButton edit_employee = new JButton("Edit");
		edit_employee.setForeground(new Color(17, 34, 44));
		edit_employee.setFont(new Font("Poppins", Font.BOLD, 10));
		edit_employee.setBorderPainted(false);
		edit_employee.setBackground(new Color(246, 198, 36));
		edit_employee.setBounds(732, 337, 121, 29);
		frame.getContentPane().add(edit_employee);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(this.getClass().getResource("/images/background.png")));
		bg.setBounds(0, 0, 1008, 537);
		frame.getContentPane().add(bg);
	}
}