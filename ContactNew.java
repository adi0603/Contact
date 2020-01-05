import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
class ContactNew implements ActionListener
{
    JFrame contactNew;
    JMenuBar menuBar;
    JMenu menuFile,menuHelp,menuAbout;
    JMenuItem iNew,iSearch,iBackColor,iHome,iAbout;
    JLabel labNewContact,labName,labMobile,labAddress,labCategory;
    JTextField txtName,txtMobile;
    JTextArea txtAddress;
    JButton butSave;
    Choice chCategory;
    ContactNew()
    {  
        contactNew= new JFrame("Contact");  
        menuBar=new JMenuBar();  
        iHome=new JMenuItem("Home");
        menuFile=new JMenu("File");  
        menuHelp=new JMenu("Help");
        menuAbout=new JMenu("About");
        iNew=new JMenuItem("New");  
        iSearch=new JMenuItem("Search");  
        iBackColor=new JMenuItem("Frame Backcolor");
        iAbout=new JMenuItem("About");
        labNewContact = new JLabel("New Contact");
        labName =new JLabel("Name");
        labMobile = new JLabel("Mobile");
        labAddress =new JLabel("Address");
        labCategory =new JLabel("Category");
        txtName = new JTextField();
        txtMobile=new JTextField();
        txtAddress=new JTextArea();
        txtAddress.setLineWrap(true);
        butSave=new JButton("Save");
        chCategory=new Choice();
        chCategory.add("Casual");
        chCategory.add("Family");
        chCategory.add("Friend");
        chCategory.add("Relative");
        menuFile.add(iHome);
        menuFile.add(iNew);
        menuFile.add(iSearch);
        menuHelp.add(iBackColor);
        menuAbout.add(iAbout);
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);
        contactNew.add(labNewContact);
        contactNew.add(labName);
        contactNew.add(labMobile);
        contactNew.add(labAddress);
        contactNew.add(labCategory);
        contactNew.add(txtName);
        contactNew.add(txtMobile);
        contactNew.add(txtAddress);
        contactNew.add(chCategory);
        contactNew.add(butSave);
        labNewContact.setBounds(170,20,150,20);
        labName.setBounds(20,50,70,20);
        txtName.setBounds(100,50,100,20);
        labMobile.setBounds(210,50,70,20);
        txtMobile.setBounds(290,50,100,20);

        labAddress.setBounds(20,80,70,20);
        txtAddress.setBounds(100,80,100,50);
        labCategory.setBounds(210,80,70,20);
        chCategory.setBounds(290,80,100,20);
        butSave.setBounds(250,110,80,20);

        iSearch.addActionListener(this);
        iBackColor.addActionListener(this);
        iAbout.addActionListener(this);
        contactNew.setJMenuBar(menuBar);
        iHome.addActionListener(this);
        butSave.addActionListener(this);
        contactNew.getContentPane().setBackground(Color.ORANGE);
        chCategory.setBackground(Color.WHITE);
        contactNew.setSize(430,300);  
        contactNew.setLayout(null);  
        contactNew.setVisible(true);
        contactNew.setResizable(false);
        contactNew.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==iHome)
        {
            contactNew.dispose();
            new Contact();
        }
        if(event.getSource()==iSearch)
        {
            contactNew.dispose();
            new ContactSearch();
        }
        if(event.getSource()==iAbout)
        {
            JOptionPane.showMessageDialog(contactNew,"Contact\nVersion 1.0\nDesigned By Aditya Pandey","About",JOptionPane.INFORMATION_MESSAGE);
        }
        if(event.getSource() == butSave)
        {
            String name=txtName.getText();
            String number=txtMobile.getText();
            int category=chCategory.getSelectedIndex();
            String address=txtAddress.getText();

            if(name.length() < 1 )
            {
                JOptionPane.showMessageDialog(contactNew, "Fill the name properly", "Warning",JOptionPane.ERROR_MESSAGE);
            }
            else if(number.length() != 10 )
            {
                JOptionPane.showMessageDialog(contactNew, "Incorrect Mobile Number", "Warning",JOptionPane.ERROR_MESSAGE);
            }
            else if(address.length() < 3 )
            {
                JOptionPane.showMessageDialog(contactNew, "Fill the Address properly", "Warning",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(contactNew, "Your Contact Was Successfully Saved", "Warning",JOptionPane.INFORMATION_MESSAGE);
                txtName.setText("");
                txtMobile.setText("");
                txtAddress.setText("");
            }
        }
    }

}