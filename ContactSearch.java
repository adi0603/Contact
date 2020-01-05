import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
class ContactSearch implements ActionListener
{
    JFrame frame;
    JMenuBar menuBar;
    JMenu menuFile,menuHelp,menuAbout;  
    JMenuItem iNew,iSearch,iBackColor,iHome,iAbout;
    JLabel labContactSearch,labName,labNumber;
    JTextField txtName,txtNumber;
    JButton butSearch;
    ContactSearch()
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
        iAbout=new JMenuItem("About");
        
        labContactSearch =new JLabel("Search Contact");
        labName =new JLabel("Name");
        labNumber=new JLabel("Number");
        txtName=new JTextField();
        txtNumber=new JTextField();
        butSearch=new JButton("Search");
        
        menuFile.add(iHome);
        menuFile.add(iNew);
        menuFile.add(iSearch);
        menuHelp.add(iBackColor);
        menuAbout.add(iAbout);
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);
        
        frame.add(labContactSearch);
        frame.add(labName);
        frame.add(labNumber);
        frame.add(txtName);
        frame.add(txtNumber);
        frame.add(butSearch);
        
        labContactSearch.setBounds(170,10,150,20);
        labName.setBounds(10,40,50,20);
        txtName.setBounds(55,40,100,20);
        labNumber.setBounds(165,40,70,20);
        txtNumber.setBounds(230,40,90,20);
        butSearch.setBounds(330,40,90,20);
        
        frame.setJMenuBar(menuBar);
        iNew.addActionListener(this);
        iBackColor.addActionListener(this);
        iHome.addActionListener(this);
        iAbout.addActionListener(this);
        butSearch.addActionListener(this);
        
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setSize(430,300);  
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== iNew)
        {
            frame.dispose();
            new ContactNew();
        }
        if(event.getSource()== iHome)
        {
            frame.dispose();
            new Contact();
        }
        if(event.getSource()==iAbout)
        {
            JOptionPane.showMessageDialog(frame,"Contact\nVersion 1.0\nDesigned By Aditya Pandey","About",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
}