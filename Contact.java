import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
class Contact implements ActionListener
{
    JFrame frame;
    JMenuBar menuBar;
    JMenu menuFile,menuHelp,menuAbout;  
    JMenuItem iNew,iSearch,iBackColor,iHome,iAbout;
    JLabel line1,line2,line3;
    JButton butWelcome;
    Contact()
    {  
        frame= new JFrame("Contact");  
        menuBar=new JMenuBar();  
        iHome=new JMenuItem("Home");
        menuFile=new JMenu("File");  
        menuHelp=new JMenu("Help");
        menuAbout=new JMenu("About");
        iNew=new JMenuItem("New");  
        iSearch=new JMenuItem("Search");  
        iBackColor=new JMenuItem("Frame Backcolor"); 
        iAbout =new JMenuItem("About");
        line1 =new JLabel("Welcome To Contact");
        line2 =new JLabel("You can easily save and ");
        line3 =new JLabel("store your Contacts here.");
        butWelcome =new JButton("WELCOME");
        menuFile.add(iHome);
        menuFile.add(iNew);
        menuFile.add(iSearch);
        menuHelp.add(iBackColor);
        menuAbout.add(iAbout);
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);
        
        
        line1.setBounds(130,50,200,20);
        line2.setBounds(120,80,200,20);
        line3.setBounds(120,110,200,20);
        butWelcome.setBounds(140,140,120,20);
        frame.add(line1);
        frame.add(line2);
        frame.add(line3);
        frame.add(butWelcome);
        frame.setJMenuBar(menuBar);
        iNew.addActionListener(this);
        iSearch.addActionListener(this);
        iBackColor.addActionListener(this);
        butWelcome.addActionListener(this);
        iAbout.addActionListener(this);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setSize(430,300);  
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() ==butWelcome)
        {
            JOptionPane.showMessageDialog(frame,"Hello, Welcome to Contacts.\nYour are heartly welcomed here to be a part our Software.\nThank You.","Contact",JOptionPane.INFORMATION_MESSAGE); 
        }
        if(event.getSource()==iNew)
        {
            frame.dispose();
            new ContactNew();
        }
        if(event.getSource()==iSearch)
        {
            frame.dispose();
            new ContactSearch();
        }
        if(event.getSource()==iAbout)
        {
            JOptionPane.showMessageDialog(frame,"Contact\nVersion 1.0\nDesigned By Aditya Pandey","About",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[])
    {
        new Contact();
    }
}