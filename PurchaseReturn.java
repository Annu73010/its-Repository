
package heater.sales.management.system;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;

public class PurchaseReturn {
    
    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;
    static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    static JComboBox c;
    static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    static JPanel p1,p2;
    static JFrame frame;
    static JButton submit, cancel;
    
    public PurchaseReturn(){
        
        frame = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
       
        frame.setContentPane(p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1230,560);
        frame.setVisible(true);
        p1.setLayout(null);
        
        l1 = new JLabel("Sno.");
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        l2 = new JLabel("Purchase ID");
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l3 = new JLabel("Quantity");
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l4 = new JLabel("Amount");
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        l5 = new JLabel("Date");
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        l6 = new JLabel("Item No.");
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        l7 = new JLabel("Order No.");
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        l8 = new JLabel("Product Quantity");
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        l9 = new JLabel("Product Total");
        l9.setFont(new Font("Tahoma",Font.BOLD,20));
        l10 = new JLabel("Product Date");
        l10.setFont(new Font("Tahoma",Font.BOLD,20));
        l11 = new JLabel("Product Notes");
        l11.setFont(new Font("Tahoma",Font.BOLD,20));
        l12 = new JLabel("PURCHASE RETURN DETAILS");
        l12.setFont(new Font("Tahoma",Font.BOLD,38));
        l12.setForeground(new java.awt.Color(128,0,0));
        t1 = new JTextField();
        t1.setFont(new Font("Dialog",Font.PLAIN,20));
        c = new JComboBox();
        c.setFont(new Font("Dialog",Font.PLAIN,20));
        t2 = new JTextField();
        t2.setFont(new Font("Dialog",Font.PLAIN,20));
        t3 = new JTextField();
        t3.setFont(new Font("Dialog",Font.PLAIN,20));
        t4 = new JTextField();
        t4.setFont(new Font("Dialog",Font.PLAIN,20));
        t5 = new JTextField();
        t5.setFont(new Font("Dialog",Font.PLAIN,20));
        t6 = new JTextField();
        t6.setFont(new Font("Dialog",Font.PLAIN,20));
        t7 = new JTextField();
        t7.setFont(new Font("Dialog",Font.PLAIN,20));
        t8 = new JTextField();
        t8.setFont(new Font("Dialog",Font.PLAIN,20));
        t9 = new JTextField();
        t9.setFont(new Font("Dialog",Font.PLAIN,20));
        t10 = new JTextField();
        t10.setFont(new Font("Dialog",Font.PLAIN,20));
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Tahoma",Font.BOLD,15));
        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Tahoma",Font.BOLD,15)); 
        
        p2.setBorder(new javax.swing.border.TitledBorder("Purchase"));
        
        l12.setBounds(280, 20, 590, 45);
        l1.setBounds(50, 80, 180, 30);
        l2.setBounds(50, 150, 180, 30);
        l3.setBounds(50, 220, 180, 30);
        l4.setBounds(50, 290, 180, 30);
        l5.setBounds(50, 360, 180, 30);
        l6.setBounds(550, 90, 230, 30);
        l7.setBounds(550, 150, 230, 30);
        l8.setBounds(550, 210, 230, 30);
        l9.setBounds(550, 270, 230, 30);
        l10.setBounds(550, 330, 230, 30);
        l11.setBounds(550, 390, 230, 30);
       
        t1.setBounds(230, 80, 250, 30);
        c.setBounds(230, 150, 250, 30);
        t2.setBounds(230, 220, 250, 30);
        t3.setBounds(230, 290, 250, 30);
        t4.setBounds(230, 360, 250, 30);
        t5.setBounds(780, 90, 380, 30);
        t6.setBounds(780, 150, 380, 30);
        t7.setBounds(780, 210, 380, 30);
        t8.setBounds(780, 270, 380, 30);
        t9.setBounds(780, 330, 380, 30);
        t10.setBounds(780, 390, 380, 30);
        
        submit.setBounds(90, 430, 100, 50);
        cancel.setBounds(240, 430, 100, 50);
        
        p2.setBounds(530, 70, 640, 370);
        
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(l11);
        p1.add(l12);
       
        p1.add(t1);
        p1.add(c);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(t8);
        p1.add(t9);
        p1.add(t10);
       
        p1.add(submit);
        p1.add(cancel);
        
        p1.add(p2);
       
       
    }
    
    public static void main(String[] args){
        
        con = HeaterSalesManagementSystem.System();
        new PurchaseReturn();
        
        
        
    }
    
}
