
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Constantino Muianga
 */
public class Edit extends javax.swing.JFrame {
Connection con = null;
Statement stm = null;
ResultSet rs = null;
String pat = null;
    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Record");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Edit Record");

        jLabel2.setText("Prison ID:-");

        jLabel3.setText("First Name:-");

        jLabel4.setText("Last Name:-");

        jLabel5.setText("Gender :-");

        jLabel6.setText("Religion:-");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Others");

        jLabel7.setText("Date of Birth:-");

        jLabel8.setText("Address:-");

        jLabel9.setText("Parents Name:-");

        jLabel10.setText("Occupation:-");

        jLabel11.setText("Crime Committed:-");

        jLabel12.setText("Arrest Detail:-");

        jLabel13.setText("Prison Name:-");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel14.setText("Age:-");

        jLabel15.setText("Section Of Law:-");

        jLabel16.setText("Court Hearing:-");

        jLabel17.setText("Health:-");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel18.setText("Enter Case No");

        jLabel19.setText("Job Assign:-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Carpentry", "Barbar", "Cook", "Laundry" }));

        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        image.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jRadioButton1))
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel14))
                                        .addGap(23, 23, 23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField13)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String in = jTextField1.getText();
        if(in.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the Value of Prison ID");
        }
        else{
        int cs_no = Integer.parseInt(jTextField1.getText());
        
        //connection and output
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            stm = con.createStatement();
            
            File file = new File("E:\\storeproject\\image1.jpg");
            FileOutputStream fos = new FileOutputStream(file);
            byte b[];
            Blob blob;
            String r = "Select * From Prison_Record where cs_no="+cs_no+";";
            rs = stm.executeQuery(r) ;
            if(rs.next()){
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String gendar = rs.getString("gender");
                String rilsn = rs.getString("religion");
                int age = rs.getInt("age");
                String dob = rs.getString("dob");
                String adrs = rs.getString("adrs");
                String pname = rs.getString("pname");
                String ocuptn = rs.getString("ocptn");
                String crm_comtd = rs.getString("crm_comtd");
                String arst = rs.getString("arst");
                String pr_name = rs.getString("pr_name");
                String sct_law = rs.getString("sct_law");
                String cort_harng = rs.getString("cort_haring");
                String health = rs.getString("health");
                String job = rs.getString("job");
                
                jTextField2.setText(""+fname);
                jTextField3.setText(""+lname);
                switch (gendar) {
                    case "Male":
                    case "MALE":
                    case "male":
                        jRadioButton1.setSelected(true);
                        break;
                    case "Female":
                    case "FEMALE":
                    case "female":
                        jRadioButton2.setSelected(true);
                        break;
                    case "Others":
                    case "OTHERS":
                    case "others":
                        jRadioButton3.setSelected(true);
                        break;
                }
                String Date = dob;        
                java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(Date);
                jDateChooser1.setDate(date2);
                jTextField4.setText(""+rilsn);
                jTextField5.setText(""+age);
                jTextField6.setText(""+adrs);
                jTextField7.setText(""+pname);
                jTextField8.setText(""+ocuptn);
                jTextField9.setText(""+crm_comtd);
                jTextField10.setText(""+arst);
                jTextField11.setText(""+pr_name);
                jTextField12.setText(""+sct_law);
                jTextField13.setText(""+cort_harng);
                jTextField14.setText(""+health);
                jComboBox1.setSelectedItem(job);
                
                blob = rs.getBlob("image");
                b = blob.getBytes(1, (int)blob.length());
                fos.write(b);
                
                ImageIcon icon = new ImageIcon("E:\\storeproject\\image1.jpg");
                Image im = icon.getImage();
                Image myImg = im.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newimage = new ImageIcon(myImg);
                image.setIcon(newimage);
                pat = "E:\\storeproject\\image1.jpg" ;
            }
            else{
                JOptionPane.showMessageDialog(null,"No Record Found");
            }     
            
        }
        
        //error message
        catch(ClassNotFoundException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        } catch (ParseException ex) {
        Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        main f1 = new main();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //read data from frame
        int cs_no = Integer.parseInt(jTextField1.getText());
        String pID = Integer.toString(cs_no);
        String fname = jTextField2.getText();
        String lname = jTextField3.getText();
        String gen = null ;
        
        if (jRadioButton1.isSelected())
            {
                gen = "Male";
            }
        else if (jRadioButton2.isSelected())
            {
                gen = "Female";
            }
        else if (jRadioButton3.isSelected())
            {
                gen = "Others";
            }
        String rlgn = jTextField4.getText();
        String age = jTextField5.getText();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String Date = dcn.format(jDateChooser1.getDate());
        String add = jTextField6.getText();
        String pname = jTextField7.getText();
        String ocptn = jTextField8.getText();
        String crim = jTextField9.getText();
        String arst = jTextField10.getText();
        String pr_name = jTextField11.getText();
        String sol = jTextField12.getText();
        String crt = jTextField13.getText();
        String hlt = jTextField14.getText();
        String job = null;
        Object Selectitem = jComboBox1.getSelectedItem();
        if(Selectitem == null || Selectitem == "Select"){
            job = "Null";
        } 
        else{
            job = Selectitem.toString();
        }
        String imgpath = pat;
        //connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            stm = con.createStatement();
            //stm.executeQuery("Use Test;");
            File file = new File(imgpath);
            FileInputStream fis = new FileInputStream(file);
            
            PreparedStatement ps  = con.prepareStatement("Update Prison_Record set "
                    +"fname = ?, lname =?, gender =?, religion = ?, age =?, dob =?, adrs =?, pname=?, ocptn =?, crm_comtd =?,"
                    +"arst =?, pr_name =?, sct_law =?, cort_haring =?, health =?, job = ?, image = ? Where cs_no= ?");
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, gen);
            ps.setString(4, rlgn);
            ps.setString(5, age);
            ps.setString(6, Date);
            ps.setString(7, add);
            ps.setString(8, pname);
            ps.setString(9, ocptn);
            ps.setString(10, crim);
            ps.setString(11, arst);
            ps.setString(12, pr_name);
            ps.setString(13, sol);
            ps.setString(14, crt);
            ps.setString(15, hlt);
            ps.setString(16, job);
            ps.setBinaryStream(17, fis,(int)file.length());
            ps.setString(18, pID);
            System.out.print(ps);
            ps.executeUpdate();
                    
            
            ps.close();
            fis.close();
            con.close();
            //stm.execute(sql);
            JOptionPane.showMessageDialog(null,"Record Inserted!!!");
                    
        }
         
        //error message
        catch(ClassNotFoundException | SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null,"Error!!!"+ex);
        } catch (FileNotFoundException ex) {
        Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String filename = null;
        byte[] img = null;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif", "gif", "bmp"));
        fileChooser.showOpenDialog(null);
        File f =fileChooser.getSelectedFile();
        filename =  f.getAbsolutePath();
        ImageIcon imageicone = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH));
        image.setIcon(imageicone);
        pat = filename;
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
