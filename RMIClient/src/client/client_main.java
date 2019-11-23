package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.FontWeight;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JSeparator;

import com.code.value.AnswerBundle;
import com.code.value.FinalResult;
import com.code.value.QuestionRate;
import com.sun.javafx.application.PlatformImpl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.beans.PropertyChangeListener;
import java.util.Enumeration;
import java.util.List;
import java.beans.PropertyChangeEvent;

public class client_main {
	
	//private javax.swing.ButtonGroup buttonGroup1;
	
	ButtonGroup ab = new javax.swing.ButtonGroup();
	ButtonGroup ab2 = new javax.swing.ButtonGroup();
	
	ButtonGroup ab3 = new javax.swing.ButtonGroup();
	ButtonGroup ab4 = new javax.swing.ButtonGroup();
	
	ButtonGroup ab5 = new javax.swing.ButtonGroup();
	ButtonGroup ab6 = new javax.swing.ButtonGroup();
	
	ButtonGroup ab7 = new javax.swing.ButtonGroup();
	ButtonGroup ab8 = new javax.swing.ButtonGroup();
	
	ButtonGroup ab9 = new javax.swing.ButtonGroup();
	ButtonGroup ab10 = new javax.swing.ButtonGroup();
	
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client_main window = new client_main();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public client_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel panel;
	JPanel panel2 ;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1183, 709);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 panel = new JPanel();
		panel.setBounds(0, 0, 1167, 670);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(44,55,77));
		panel.setLayout(null);
		
		frame.setLocationRelativeTo(null);

 panel2 = new JPanel();
		panel2.setBounds(0, 0, 1167, 670);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		panel2.setBackground(Color.RED);
		panel2.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 1167, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Survay On Assesin Knowledge About Counter Drugs");
		label.setBounds(10, 11, 523, 25);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 349, 16);
		panel_1.add(separator);
		
		JLabel label_1 = new JLabel("Login As :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(712, 17, 72, 46);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\r\n");
		label_2.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\icons8-customer-50.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(783, 1, 54, 62);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("<html><b><i><u>Customer<u><i><b></html>");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.ITALIC, 14));
		label_3.setBounds(847, 26, 66, 28);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label_4.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\icons8_Delete_25px.png"));
		label_4.setBounds(1117, 1, 40, 62);
		panel_1.add(label_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setForeground(Color.CYAN);
		chckbxNewCheckBox.setOpaque(false);
		ab.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(599, 86, 69, 23);
		panel.add(chckbxNewCheckBox);
		
		
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setForeground(Color.CYAN);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_1.setOpaque(false);
		ab.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(670, 88, 92, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("01 ) What is your Gender ?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 88, 240, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblWhatIsYour = new JLabel("02) What is your age ?");
		lblWhatIsYour.setForeground(Color.WHITE);
		lblWhatIsYour.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWhatIsYour.setBounds(10, 141, 210, 23);
		panel.add(lblWhatIsYour);
		
		JLabel lblDoYouTake = new JLabel("03) Do you take medicine for a long time ?");
		lblDoYouTake.setForeground(Color.WHITE);
		lblDoYouTake.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoYouTake.setBounds(10, 189, 359, 23);
		panel.add(lblDoYouTake);
		
		JLabel lblDoYouBuy = new JLabel("04) Do you buy medicine from a pharmacy without a prescription ?");
		lblDoYouBuy.setForeground(Color.WHITE);
		lblDoYouBuy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoYouBuy.setBounds(10, 249, 554, 23);
		panel.add(lblDoYouBuy);
		
		JLabel lblHowOftenYou = new JLabel("05) How often you get medicine without a prescription ?");
		lblHowOftenYou.setForeground(Color.WHITE);
		lblHowOftenYou.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHowOftenYou.setBounds(10, 308, 470, 23);
		panel.add(lblHowOftenYou);
		
		JLabel lblDoYouHave = new JLabel("06) Do you have proper knowledge about those medicine which you buy from the pharmacy without a prescription ?");
		lblDoYouHave.setForeground(Color.WHITE);
		lblDoYouHave.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoYouHave.setBounds(10, 371, 953, 23);
		panel.add(lblDoYouHave);
		
		JLabel lblDoYouKnow = new JLabel("07) Do you know side effect of those medicine ?");
		lblDoYouKnow.setForeground(Color.WHITE);
		lblDoYouKnow.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoYouKnow.setBounds(10, 427, 390, 23);
		panel.add(lblDoYouKnow);
		
		JLabel lblWhyDoYou = new JLabel("08) Why do you take medicine from pharmacy without a prescription ?");
		lblWhyDoYou.setForeground(Color.WHITE);
		lblWhyDoYou.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWhyDoYou.setBounds(10, 488, 572, 23);
		panel.add(lblWhyDoYou);
		
		JLabel lblHowDidYou = new JLabel("09) How did you come to know about those medicine ?");
		lblHowDidYou.setForeground(Color.WHITE);
		lblHowDidYou.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHowDidYou.setBounds(10, 551, 454, 23);
		panel.add(lblHowDidYou);
		
		JLabel lblDoYouThink = new JLabel("10 ) Do you think buy medicines without a prescription is good idea ?");
		lblDoYouThink.setForeground(Color.WHITE);
		lblDoYouThink.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDoYouThink.setBounds(10, 610, 572, 23);
		panel.add(lblDoYouThink);
		
		JCheckBox checkBox = new JCheckBox("17 - 21");
		ab2.add(checkBox);
		checkBox.setOpaque(false);
		checkBox.setForeground(Color.CYAN);
		checkBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox.setBounds(599, 141, 92, 23);
		checkBox.setSelected(true);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("22 - 29");
		ab2.add(checkBox_1);
		checkBox_1.setOpaque(false);
		checkBox_1.setForeground(Color.CYAN);
		checkBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_1.setBounds(700, 143, 92, 23);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("30 - 39");
		ab2.add(checkBox_2);
		checkBox_2.setOpaque(false);
		checkBox_2.setForeground(Color.CYAN);
		checkBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_2.setBounds(810, 145, 92, 23);
		panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("40 - 49");
		ab2.add(checkBox_3);
		checkBox_3.setOpaque(false);
		checkBox_3.setForeground(Color.CYAN);
		checkBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_3.setBounds(924, 145, 92, 23);
		panel.add(checkBox_3);
		
		JCheckBox chckbxYes = new JCheckBox("Yes");
		ab3.add(chckbxYes);
		chckbxYes.setOpaque(false);
		chckbxYes.setForeground(Color.CYAN);
		chckbxYes.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxYes.setSelected(true);
		chckbxYes.setBounds(599, 187, 69, 23);
		panel.add(chckbxYes);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		ab3.add(chckbxNo);
		chckbxNo.setOpaque(false);
		chckbxNo.setForeground(Color.CYAN);
		chckbxNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNo.setBounds(670, 189, 56, 23);
		panel.add(chckbxNo);
		
		JCheckBox chckbxOnceAWeek = new JCheckBox("Once a week");
		ab5.add(chckbxOnceAWeek);
		chckbxOnceAWeek.setOpaque(false);
		chckbxOnceAWeek.setForeground(Color.CYAN);
		chckbxOnceAWeek.setSelected(true);
		chckbxOnceAWeek.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxOnceAWeek.setBounds(599, 308, 129, 23);
		panel.add(chckbxOnceAWeek);
		
		JCheckBox chckbxTwiceAWeek = new JCheckBox("Twice a week");
		ab5.add(chckbxTwiceAWeek);
		chckbxTwiceAWeek.setOpaque(false);
		chckbxTwiceAWeek.setForeground(Color.CYAN);
		chckbxTwiceAWeek.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxTwiceAWeek.setBounds(742, 308, 137, 23);
		panel.add(chckbxTwiceAWeek);
		
		JCheckBox chckbxOnceAMonth = new JCheckBox("Once a month");
		ab5.add(chckbxOnceAMonth);
		chckbxOnceAMonth.setOpaque(false);
		chckbxOnceAMonth.setForeground(Color.CYAN);
		chckbxOnceAMonth.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxOnceAMonth.setBounds(894, 308, 137, 23);
		panel.add(chckbxOnceAMonth);
		
		JCheckBox checkBox_4 = new JCheckBox("No");
		ab4.add(checkBox_4);
		checkBox_4.setOpaque(false);
		checkBox_4.setForeground(Color.CYAN);
		checkBox_4.setSelected(true);
		checkBox_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_4.setBounds(670, 249, 56, 23);
		panel.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Yes");
		ab4.add(checkBox_5);
		checkBox_5.setOpaque(false);
		checkBox_5.setForeground(Color.CYAN);
		checkBox_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_5.setBounds(599, 247, 69, 23);
		panel.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("No");
		ab6.add(checkBox_6);
		checkBox_6.setOpaque(false);
		checkBox_6.setForeground(Color.CYAN);
		checkBox_6.setSelected(true);
		checkBox_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_6.setBounds(1040, 371, 56, 23);
		panel.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Yes");
		ab6.add(checkBox_7);
		checkBox_7.setOpaque(false);
		checkBox_7.setForeground(Color.CYAN);
		checkBox_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_7.setBounds(969, 369, 69, 23);
		panel.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("No");
		ab7.add(checkBox_8);
		checkBox_8.setOpaque(false);
		checkBox_8.setForeground(Color.CYAN);
		checkBox_8.setSelected(true);
		checkBox_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_8.setBounds(670, 427, 56, 23);
		panel.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Yes");
		ab7.add(checkBox_9);
		checkBox_9.setOpaque(false);
		checkBox_9.setForeground(Color.CYAN);
		checkBox_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_9.setBounds(599, 425, 69, 23);
		panel.add(checkBox_9);
		
		JCheckBox chckbxToSaveTime_1 = new JCheckBox("To save money");
		ab8.add(chckbxToSaveTime_1);
		chckbxToSaveTime_1.setOpaque(false);
		chckbxToSaveTime_1.setForeground(Color.CYAN);
		chckbxToSaveTime_1.setSelected(true);
		chckbxToSaveTime_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxToSaveTime_1.setBounds(746, 488, 153, 23);
		panel.add(chckbxToSaveTime_1);
		
		JCheckBox chckbxToSaveTime = new JCheckBox("To save time");
		ab8.add(chckbxToSaveTime);
		chckbxToSaveTime.setOpaque(false);
		chckbxToSaveTime.setForeground(Color.CYAN);
		chckbxToSaveTime.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxToSaveTime.setBounds(599, 488, 137, 23);
		panel.add(chckbxToSaveTime);
		
		JCheckBox chckbxBoth = new JCheckBox("Both");
		ab8.add(chckbxBoth);
		chckbxBoth.setOpaque(false);
		chckbxBoth.setForeground(Color.CYAN);
		chckbxBoth.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxBoth.setBounds(916, 490, 69, 23);
		panel.add(chckbxBoth);
		
		JCheckBox chckbxFromTheInternet = new JCheckBox("From the internet");
		ab9.add(chckbxFromTheInternet);
		chckbxFromTheInternet.setOpaque(false);
		chckbxFromTheInternet.setForeground(Color.CYAN);
		chckbxFromTheInternet.setSelected(true);
		chckbxFromTheInternet.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxFromTheInternet.setBounds(599, 551, 169, 23);
		panel.add(chckbxFromTheInternet);
		
		JCheckBox chckbxFromTheDoctor = new JCheckBox("From the doctor");
		ab9.add(chckbxFromTheDoctor);
		chckbxFromTheDoctor.setOpaque(false);
		chckbxFromTheDoctor.setForeground(Color.CYAN);
		chckbxFromTheDoctor.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxFromTheDoctor.setBounds(783, 551, 155, 23);
		panel.add(chckbxFromTheDoctor);
		
		JCheckBox chckbxFromTheFriend = new JCheckBox("From the friend");
		ab9.add(chckbxFromTheFriend);
		chckbxFromTheFriend.setOpaque(false);
		chckbxFromTheFriend.setForeground(Color.CYAN);
		chckbxFromTheFriend.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxFromTheFriend.setBounds(952, 551, 155, 23);
		panel.add(chckbxFromTheFriend);
		
		JCheckBox checkBox_10 = new JCheckBox("No");
		ab10.add(checkBox_10);
		checkBox_10.setOpaque(false);
		checkBox_10.setForeground(Color.CYAN);
		checkBox_10.setSelected(true);
		checkBox_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_10.setBounds(670, 612, 56, 23);
		panel.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("Yes");
		ab10.add(checkBox_11);
		checkBox_11.setOpaque(false);
		checkBox_11.setForeground(Color.CYAN);
		checkBox_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		checkBox_11.setBounds(599, 610, 69, 23);
		panel.add(checkBox_11);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AnswerBundle answerbun=new AnswerBundle();
				
				for(Enumeration<AbstractButton>bt=ab.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setGender(btn.getText());
						System.out.println(answerbun.getGender());
					}
				}
				for(Enumeration<AbstractButton>bt=ab2.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setAge(btn.getText());
						
					}
				}
				for(Enumeration<AbstractButton>bt=ab3.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setLong_time_medicine(btn.getText());
						
					}
				}
				for(Enumeration<AbstractButton>bt=ab4.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setBuy_medicine_without_prescription(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab5.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setHow_often_buy_without_prescription(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab6.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setKnowledge_about_medicine(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab7.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setKnow_side_effect(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab8.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setWhy_buy_medicine_without_prescription(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab9.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setHow_know_medicine(btn.getText());
					}
				}
				for(Enumeration<AbstractButton>bt=ab10.getElements();bt.hasMoreElements();) {
					AbstractButton btn=bt.nextElement();
					if(btn.isSelected()) {
						answerbun.setBuy_medicine_without_prescription_good_idea(btn.getText());
					}
				}
				
				try {
					PlatformImpl.startup(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try {
							
							}catch(Exception e) {
								e.printStackTrace();
							}
						}
					});
					setstatistics(panel2, ServerRemotefounder.getRemote().SubmitAnswers(answerbun, ServerRemotefounder.getSession()));
					panel.setVisible(false);
					panel2.setVisible(true);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(1040, 622, 105, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\bg3.jpg"));
		lblNewLabel.setBounds(0, 0, 1167, 670);
		panel.add(lblNewLabel);
		frame.setVisible(true);
	}
	
	private void setstatistics(JPanel jp,FinalResult res) {
		JScrollPane jscrl=new JScrollPane();
		JPanel content=new JPanel();
		jscrl.setViewportView(content);
		JFXPanel pn=new JFXPanel();
		
		Hyperlink back=new Hyperlink("Back to Main");
		content.setBackground(Color.PINK);
		content.setSize(1167, 670);
		content.setLayout(new CardLayout());
		
		AnchorPane root=new AnchorPane();
		
		Label l=new Label("According to your answers, The medicines are "+res.getMedicineUsabale()+" and your are "+res.getMyknowledge()+" about the medicine");
		l.setFont(javafx.scene.text.Font.font("Segoe UI", FontWeight.BOLD, 18));
		l.setTextFill(javafx.scene.paint.Color.web("#2196f3"));
		
		CategoryAxis cat=new CategoryAxis();
		cat.setLabel("Age Ranges");
		
		NumberAxis num=new NumberAxis();
		num.setLabel("Knowledge Level");
		BarChart<String, Number>bar=new BarChart<>(cat, num);
		bar.setTitle("Knowledgable Level By Age Range");
		bar.setAnimated(false);
		for(QuestionRate qr:res.getKnowledge()) {
			XYChart.Series<String, Number>ser=new XYChart.Series<>();
			ser.getData().add(new XYChart.Data<String, Number>("", Integer.parseInt(qr.getValue().split("\\.")[0])));
			ser.setName(qr.getAge_range());
			bar.getData().add(ser);
		}
		
		
		
		
	
		
		
		
		
		CategoryAxis cat2=new CategoryAxis();
		cat2.setLabel("Age Ranges");
		
		NumberAxis num2=new NumberAxis();
		num2.setLabel("Usage Level");
		BarChart<String, Number>bar2=new BarChart<>(cat2, num2);
		
		bar2.setTitle("Usage Level of medicine By Age Range");
		for(QuestionRate qr:res.getUsable()) {
			XYChart.Series<String, Number>ser=new XYChart.Series<>();
			ser.getData().add(new XYChart.Data<String, Number>("", Integer.parseInt(qr.getValue().split("\\.")[0])));
			ser.setName(qr.getAge_range());
			bar2.getData().add(ser);
		}
		
		AnchorPane.setLeftAnchor(l, 30d);
		AnchorPane.setTopAnchor(l, 40d);
	   AnchorPane.setRightAnchor(l, 30d);
	   l.setAlignment(Pos.CENTER);
		l.setMaxWidth(1100);
		AnchorPane.setTopAnchor(bar, 120d);
		AnchorPane.setLeftAnchor(bar, 30d);
		
		AnchorPane.setTopAnchor(bar2, 120d);
		AnchorPane.setLeftAnchor(bar2, 530d);
		
		
		
		
		root.getChildren().addAll(l,bar,bar2,back);
		//pn.setBackground(new Color(arg0, arg1));
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Scene scene=new Scene(root, 1167, 670);
				root.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
				back.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
				AnchorPane.setRightAnchor(back, 30d);
				AnchorPane.setBottomAnchor(back, 40d);
				
				back.setOnAction((javafx.event.ActionEvent e)->{
					panel.setVisible(true);
					panel2.setVisible(false);
					ServerRemotefounder.setNewSession();
				});
				
				pn.setScene(scene);
			
				
			}
		});
		content.add(pn);
		jscrl.setBounds(0, 0, 1167, 670);
		jp.add(jscrl);
	
	}
}
