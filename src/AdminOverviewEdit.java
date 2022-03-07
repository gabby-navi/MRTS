import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.toedter.calendar.JDateChooser;

public class AdminOverviewEdit {

	JFrame frame;
	private JTextField movie_title;
	private JTextField times_1f;
	private JTextField times_2f;
	private JTextField times_1s;
	private JTextField times_2s;
	private JTextField times_3s;
	private JTextField txt_price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminOverviewEdit window = new AdminOverviewEdit();
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
	public AdminOverviewEdit() {
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
		
		JPanel panelo = new JPanel();
		panelo.setBounds(0, 0, 206, 537);
		panelo.setBackground(new Color(247, 165, 35));
		frame.getContentPane().add(panelo);
		panelo.setLayout(null);
		
		JButton btn_dash = new JButton("Dashboard");
		btn_dash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AdminDash ad = new AdminDash();
                ad.frame.setVisible(true);
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
		panelo.add(btn_dash);
		
		JButton btn_sched = new JButton("Scheduled Movies");
		btn_sched.setForeground(Color.WHITE);
		btn_sched.setBackground(new Color(246, 198, 36));
		btn_sched.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_sched.setHorizontalAlignment(SwingConstants.LEFT);
		btn_sched.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		btn_sched.setFocusPainted(false);
		btn_sched.setBorderPainted(false);
		btn_sched.setBounds(5, 126, 194, 40);
		panelo.add(btn_sched);
		
		JButton btn_reservations = new JButton("Reservations");
		btn_reservations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Reservations r = new Reservations();
                r.frame.setVisible(true);
                frame.dispose();
			}
		});
		btn_reservations.setForeground(Color.WHITE);
		btn_reservations.setBackground(new Color(247, 165, 35));
		btn_reservations.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_reservations.setHorizontalAlignment(SwingConstants.LEFT);
		btn_reservations.setFont(new Font("Poppins Medium", Font.PLAIN, 15));
		btn_reservations.setFocusPainted(false);
		btn_reservations.setBorderPainted(false);
		btn_reservations.setBounds(5, 173, 194, 40);
		panelo.add(btn_reservations);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon(this.getClass().getResource("/images/logo.png")));
		lbl_logo.setBounds(20, 18, 67, 46);
		panelo.add(lbl_logo);
		
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
		
		JLabel lblback = new JLabel("");
		lblback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				SchedMovies sm = new SchedMovies();
                sm.frame.setVisible(true);
                frame.dispose();
			}
		});
		lblback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblback.setBounds(234, 37, 40, 39);
        lblback.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/back.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
        frame.getContentPane().add(lblback); 
		
		JLabel lbl_schedmovies = new JLabel("Uncharted");
		lbl_schedmovies.setForeground(Color.WHITE);
		lbl_schedmovies.setFont(new Font("Poppins Black", Font.PLAIN, 21));
		lbl_schedmovies.setBounds(274, 49, 137, 19);
		frame.getContentPane().add(lbl_schedmovies);
		
		JPanel line = new JPanel();
		line.setBounds(233, 78, 747, 2);
		frame.getContentPane().add(line);
		
		JButton btn_edit = new JButton("Save");
		btn_edit.setFocusPainted(false);
		btn_edit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_edit.setBorderPainted(false);
		btn_edit.setFont(new Font("Poppins", Font.BOLD, 10));
		btn_edit.setForeground(new Color(17, 34, 44));
		btn_edit.setBackground(new Color(246, 198, 36));
		btn_edit.setBounds(859, 90, 121, 29);
		frame.getContentPane().add(btn_edit);
		
		JButton btn_edit_1 = new JButton("Cancel");
		btn_edit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AdminOverview ao = new AdminOverview();
                ao.frame.setVisible(true);
                frame.dispose();
			}
		});
		btn_edit_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_edit_1.setForeground(new Color(17, 34, 44));
		btn_edit_1.setFont(new Font("Poppins", Font.BOLD, 10));
		btn_edit_1.setFocusPainted(false);
		btn_edit_1.setBorderPainted(false);
		btn_edit_1.setBackground(new Color(246, 198, 36));
		btn_edit_1.setBounds(732, 90, 121, 29);
		frame.getContentPane().add(btn_edit_1);
		
		JPanel panelw = new JPanel();
		panelw.setBackground(Color.WHITE);
		panelw.setBounds(233, 129, 747, 380);
		frame.getContentPane().add(panelw);
		panelw.setLayout(null);
		
		JButton btn_change = new JButton("Change");
		btn_change.setBorderPainted(false);
		btn_change.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_change.setBounds(48, 240, 87, 19);
		btn_change.setFont(new Font("Poppins", Font.BOLD, 10));
		btn_change.setBackground(new Color(246, 198, 36));
		panelw.add(btn_change);
		
		JLabel lblposter = new JLabel("");
		lblposter.setBounds(18, 10, 150, 229);
		lblposter.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/UN poster.png")).getImage().getScaledInstance(150, 220, Image.SCALE_DEFAULT)));
		panelw.add(lblposter);
		
		JLabel lblmt = new JLabel("Movie Title:");
		lblmt.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblmt.setBounds(185, 22, 87, 17);
		panelw.add(lblmt);
		
		JLabel lbld = new JLabel("Description:");
		lbld.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lbld.setBounds(185, 60, 87, 17);
		panelw.add(lbld);
		
		JLabel lblcm1 = new JLabel("Cinema Number:");
		lblcm1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblcm1.setBounds(185, 191, 112, 19);
		panelw.add(lblcm1);
		
		JLabel lblta1 = new JLabel("Times Available:");
		lblta1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lblta1.setBounds(185, 229, 106, 19);
		panelw.add(lblta1);
		
		JLabel lblp = new JLabel("Price:");
		lblp.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblp.setBounds(185, 339, 45, 19);
		panelw.add(lblp);
		
		movie_title = new JTextField();
		movie_title.setMargin(new Insets(3, 7, 3, 3));
		movie_title.setFont(new Font("Poppins", Font.PLAIN, 12));
		movie_title.setText("Uncharted");
		movie_title.setBounds(296, 19, 437, 22);
		panelw.add(movie_title);
		movie_title.setColumns(10);
		
		JTextArea txt_area = new JTextArea();
		txt_area.setBorder(new LineBorder(new Color(0, 0, 0)));
		txt_area.setMargin(new Insets(3, 7, 3, 3));
		txt_area.setFont(new Font("Poppins", Font.PLAIN, 12));
		txt_area.setText("Nathan Drake and his wisecracking partner Victor 'Sully' Sullivan embark on a dangerous quest to find the greatest treasure never found while also tracking clues that may lead to Nate's long-lost brother.");
		txt_area.setLineWrap(true);
		txt_area.setWrapStyleWord(true);
		txt_area.setBounds(296, 54, 437, 57);
		panelw.add(txt_area);
		
		JButton cinema_1f = new JButton("1");
		cinema_1f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_1f.setForeground(new Color(17, 34, 44));
		cinema_1f.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_1f.setBorderPainted(false);
		cinema_1f.setBackground(new Color(247, 165, 35));
		cinema_1f.setFocusPainted(false);
		cinema_1f.setBounds(296, 186, 45, 30);
		panelw.add(cinema_1f);
		
		JButton cinema_2f = new JButton("2");
		cinema_2f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_2f.setForeground(new Color(17, 34, 44));
		cinema_2f.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_2f.setFocusPainted(false);
		cinema_2f.setBorderPainted(false);
		cinema_2f.setBackground(new Color(246, 198, 36));
		cinema_2f.setBounds(345, 186, 45, 30);
		panelw.add(cinema_2f);
		
		JButton cinema_3f = new JButton("3");
		cinema_3f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_3f.setForeground(new Color(17, 34, 44));
		cinema_3f.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_3f.setFocusPainted(false);
		cinema_3f.setBorderPainted(false);
		cinema_3f.setBackground(new Color(246, 198, 36));
		cinema_3f.setBounds(394, 186, 45, 30);
		panelw.add(cinema_3f);
		
		JButton cinema_4f = new JButton("4");
		cinema_4f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_4f.setForeground(new Color(17, 34, 44));
		cinema_4f.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_4f.setFocusPainted(false);
		cinema_4f.setBorderPainted(false);
		cinema_4f.setBackground(new Color(246, 198, 36));
		cinema_4f.setBounds(443, 186, 45, 30);
		panelw.add(cinema_4f);
		
		times_1f = new JTextField();
		times_1f.setText("8:00PM");
		times_1f.setMargin(new Insets(3, 7, 3, 3));
		times_1f.setFont(new Font("Poppins", Font.PLAIN, 12));
		times_1f.setColumns(10);
		times_1f.setBounds(296, 228, 63, 20);
		panelw.add(times_1f);
		
		times_2f = new JTextField();
		times_2f.setMargin(new Insets(3, 7, 3, 3));
		times_2f.setFont(new Font("Poppins", Font.PLAIN, 12));
		times_2f.setColumns(10);
		times_2f.setBounds(363, 228, 63, 20);
		panelw.add(times_2f);
		
		JLabel lblcm1_1 = new JLabel("Cinema Number:");
		lblcm1_1.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblcm1_1.setBounds(185, 266, 112, 19);
		panelw.add(lblcm1_1);
		
		JButton cinemaa_1s = new JButton("1");
		cinemaa_1s.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinemaa_1s.setForeground(new Color(17, 34, 44));
		cinemaa_1s.setFont(new Font("Poppins", Font.BOLD, 12));
		cinemaa_1s.setFocusPainted(false);
		cinemaa_1s.setBorderPainted(false);
		cinemaa_1s.setBackground(new Color(246, 198, 36));
		cinemaa_1s.setBounds(296, 260, 45, 30);
		panelw.add(cinemaa_1s);
		
		JButton cinema_2s = new JButton("2");
		cinema_2s.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_2s.setForeground(new Color(17, 34, 44));
		cinema_2s.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_2s.setFocusPainted(false);
		cinema_2s.setBorderPainted(false);
		cinema_2s.setBackground(new Color(247, 165, 35));
		cinema_2s.setBounds(345, 260, 45, 30);
		panelw.add(cinema_2s);
		
		JButton cinema_3s = new JButton("3");
		cinema_3s.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_3s.setForeground(new Color(17, 34, 44));
		cinema_3s.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_3s.setFocusPainted(false);
		cinema_3s.setBorderPainted(false);
		cinema_3s.setBackground(new Color(246, 198, 36));
		cinema_3s.setBounds(394, 260, 45, 30);
		panelw.add(cinema_3s);
		
		JButton cinema_4s = new JButton("4");
		cinema_4s.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cinema_4s.setForeground(new Color(17, 34, 44));
		cinema_4s.setFont(new Font("Poppins", Font.BOLD, 12));
		cinema_4s.setFocusPainted(false);
		cinema_4s.setBorderPainted(false);
		cinema_4s.setBackground(new Color(246, 198, 36));
		cinema_4s.setBounds(443, 260, 45, 30);
		panelw.add(cinema_4s);
		
		JLabel lblta1_1 = new JLabel("Times Available:");
		lblta1_1.setFont(new Font("Poppins Medium", Font.PLAIN, 12));
		lblta1_1.setBounds(185, 305, 106, 19);
		panelw.add(lblta1_1);
		
		times_1s = new JTextField();
		times_1s.setText("2:30PM");
		times_1s.setMargin(new Insets(3, 7, 3, 3));
		times_1s.setFont(new Font("Poppins", Font.PLAIN, 12));
		times_1s.setColumns(10);
		times_1s.setBounds(296, 304, 63, 20);
		panelw.add(times_1s);
		
		times_2s = new JTextField();
		times_2s.setText("5:30PM");
		times_2s.setMargin(new Insets(3, 7, 3, 3));
		times_2s.setFont(new Font("Poppins", Font.PLAIN, 12));
		times_2s.setColumns(10);
		times_2s.setBounds(363, 304, 63, 20);
		panelw.add(times_2s);
		
		times_3s = new JTextField();
		times_3s.setText("8:30PM");
		times_3s.setMargin(new Insets(3, 7, 3, 3));
		times_3s.setFont(new Font("Poppins", Font.PLAIN, 12));
		times_3s.setColumns(10);
		times_3s.setBounds(430, 304, 63, 20);
		panelw.add(times_3s);
		
		txt_price = new JTextField();
		txt_price.setText("P350.00");
		txt_price.setMargin(new Insets(3, 7, 3, 3));
		txt_price.setFont(new Font("Poppins", Font.PLAIN, 12));
		txt_price.setColumns(10);
		txt_price.setBounds(296, 336, 428, 20);
		panelw.add(txt_price);
		
		JButton add_time = new JButton("+");
		add_time.setBackground(new Color(246, 198, 36));
		add_time.setFont(new Font("Poppins", Font.BOLD, 11));
		add_time.setFocusPainted(false);
		add_time.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add_time.setBorderPainted(false);
		add_time.setBounds(431, 228, 47, 19);
		panelw.add(add_time);
		
		JLabel lblstart = new JLabel("Start Showing:");
		lblstart.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblstart.setBounds(185, 128, 116, 17);
		panelw.add(lblstart);
		
		JDateChooser startDate = new JDateChooser();
		startDate.setBounds(296, 125, 437, 20);
		panelw.add(startDate);
		
		JLabel lblend = new JLabel("End Showing:");
		lblend.setFont(new Font("Poppins SemiBold", Font.PLAIN, 12));
		lblend.setBounds(185, 157, 116, 17);
		panelw.add(lblend);
		
		JDateChooser endDate = new JDateChooser();
		endDate.setBounds(296, 154, 437, 20);
		panelw.add(endDate);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(this.getClass().getResource("/images/background.png")));
		bg.setBounds(0, 0, 1008, 537);
		frame.getContentPane().add(bg);
		
	}
}
