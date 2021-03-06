/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Documents extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs =null;
    PreparedStatement pst= null;
    

    /**
     * Creates new form Documents
     */
    public Documents() {
        initComponents();
        conn=javaconnect.ConnectDB();
        Update_table();
    }
    private void Update_table(){
    try{
    String sql ="select * from fitness247.`Document_table`";
    pst=conn.prepareStatement (sql);
    rs=pst.executeQuery();
    Document_table.setModel(DbUtils.resultSetToTableModel(rs));
}
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }finally{
        try{
            rs.close();
            pst.close();
            //conn.close();
               
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
               
        }
}   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Document_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txt_attach = new javax.swing.JTextField();
        cmd_openFile = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        cmd_saveDocument = new javax.swing.JButton();
        Comments = new javax.swing.JTextField();
        document_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmd_uploadCSV = new javax.swing.JButton();
        cmd_UploadCSV2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmd_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saved Documents", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        Document_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Document_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Document_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Document_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attach", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        cmd_openFile.setBackground(new java.awt.Color(255, 51, 51));
        cmd_openFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmd_openFile.setForeground(new java.awt.Color(0, 102, 153));
        cmd_openFile.setText("Attach File");
        cmd_openFile.setToolTipText("Attaches a File ");
        cmd_openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_openFileActionPerformed(evt);
            }
        });

        cmd_saveDocument.setBackground(new java.awt.Color(255, 51, 51));
        cmd_saveDocument.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmd_saveDocument.setForeground(new java.awt.Color(0, 102, 153));
        cmd_saveDocument.setText("Save Document");
        cmd_saveDocument.setToolTipText("Saves a Document to the Table");
        cmd_saveDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveDocumentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_saveDocument)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmd_saveDocument)
                .addContainerGap())
        );

        document_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                document_idKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Document ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Document Comments");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Path");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(document_id, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cmd_openFile)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(txt_attach, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_attach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd_openFile)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(document_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Administrator Only", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        cmd_uploadCSV.setBackground(new java.awt.Color(255, 51, 51));
        cmd_uploadCSV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmd_uploadCSV.setForeground(new java.awt.Color(0, 102, 153));
        cmd_uploadCSV.setText("LOAD INFILE");
        cmd_uploadCSV.setToolTipText("LOAD INFILE METHOD");
        cmd_uploadCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_uploadCSVActionPerformed(evt);
            }
        });

        cmd_UploadCSV2.setBackground(new java.awt.Color(255, 51, 51));
        cmd_UploadCSV2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmd_UploadCSV2.setForeground(new java.awt.Color(0, 102, 153));
        cmd_UploadCSV2.setText("Upload CSV");
        cmd_UploadCSV2.setToolTipText("Upload CSV METHOD");
        cmd_UploadCSV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_UploadCSV2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_uploadCSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(cmd_UploadCSV2)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_uploadCSV)
                    .addComponent(cmd_UploadCSV2))
                .addContainerGap())
        );

        cmd_close.setBackground(new java.awt.Color(255, 51, 51));
        cmd_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmd_close.setForeground(new java.awt.Color(0, 102, 153));
        cmd_close.setText("Close");
        cmd_close.setToolTipText("Closes the Screen");
        cmd_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_close)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_close)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1171, 719);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_closeActionPerformed
        dispose();
    }//GEN-LAST:event_cmd_closeActionPerformed

    private void cmd_uploadCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_uploadCSVActionPerformed
        int d= JOptionPane.showConfirmDialog(null, "Are you the DBA? Is the CSV Path correct?\n C:\\Database TEST EXCEL.csv","Confirm", JOptionPane.YES_NO_OPTION);
        if(d==0){  
        try{
            String sql="LOAD DATA LOCAL INFILE 'C:\\Database TEST EXCEL.csv' INTO TABLE `fitness247`.`club members` FIELDS TERMINATED BY ',' LINES TERMINATED BY "
                    + "'\r\n' IGNORE 1 LINES";
            pst=conn.prepareStatement(sql);
            pst.execute();
                JOptionPane.showMessageDialog(null, "File Uploaded");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        try{
            String sql="LOAD DATA LOCAL INFILE 'C:\\Database TEST EXCEL.csv' INTO TABLE `fitness247`.`prior members` FIELDS TERMINATED BY ',' LINES TERMINATED BY "
                    + "'\r\n' IGNORE 1 LINES";
            pst=conn.prepareStatement(sql);
            pst.execute();
                JOptionPane.showMessageDialog(null, "File Uploaded to Prior Member Archive");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }finally{
        try{
            rs.close();
            pst.close();
            //conn.close();
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
               
        }
        }
    }//GEN-LAST:event_cmd_uploadCSVActionPerformed

    private void cmd_openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_openFileActionPerformed
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_attach.setText(filename);

    }//GEN-LAST:event_cmd_openFileActionPerformed

    private void cmd_saveDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveDocumentActionPerformed
        try{
            String sql ="Insert into `fitness247`.`Document_table` (`Document ID`,\n" +
            "`Comments`,\n" +
            "`Path`) values (?,?,?)";
            pst=conn.prepareStatement (sql);
            pst.setString(3,txt_attach.getText());
            pst.setString(2,Comments.getText());
            pst.setString(1,document_id.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Document Saved");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }finally{
        try{
            rs.close();
            pst.close();
            //conn.close();
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
               
        }
        Update_table();
    }//GEN-LAST:event_cmd_saveDocumentActionPerformed

    private void Document_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Document_tableMouseClicked
        int row=Document_table.getSelectedRow();
        String value=(Document_table.getModel().getValueAt(row, 2).toString());
        
        
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+value);
            
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
      
        }
    }//GEN-LAST:event_Document_tableMouseClicked

    private void document_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_document_idKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        
        
        }
    }//GEN-LAST:event_document_idKeyTyped

    private void cmd_UploadCSV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_UploadCSV2ActionPerformed
        int d= JOptionPane.showConfirmDialog(null, "Are you the DBA? Is the CSV Path correct?\n C:\\CSV Load Tester.csv","Confirm", JOptionPane.YES_NO_OPTION);
        if(d==0){ 
        try{
            BufferedReader br= new BufferedReader(new FileReader("C:\\CSV LOAD TESTER.csv"));
            String line;
                while((line=br.readLine())!=null){
                String[]value=line.split(",");
                String sql="Insert into `fitness247`.`club members` (`Member ID`,\n" +
            "`Access Key Number`,\n" +
            "`First Name`,\n" +
            "`Last Name`,\n" +
            "`Street Address`,\n" +
            "`City`,\n" +
            "`State`,\n" +
            "`Postal Code`,\n" +
            "`Email`,\n" +
            "`Home Number`,\n" +
            "`Work Number`,\n" +
            "`Mobile Number`,\n"+
            "`Billing Type`,\n"+
            "`Date Joined`) values ('"+value[0]+"','"+value[1]+"','"+value[2]+"','"+value[3]+"','"+value[4]+"','"+value[5]+"','"+value[6]+"',"
                    + "'"+value[7]+"','"+value[8]+"','"+value[9]+"','"+value[10]+"','"+value[11]+"','"+value[12]+"','"+value[13]+"')";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                }
                br.close();
                
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
            
        }
        try{
            BufferedReader br= new BufferedReader(new FileReader("C:\\CSV LOAD TESTER.csv"));
            String line;
                while((line=br.readLine())!=null){
                String[]value=line.split(",");
                String sql="Insert into `fitness247`.`prior members` (`Member ID`,\n" +
            "`Access Key Number`,\n" +
            "`First Name`,\n" +
            "`Last Name`,\n" +
            "`Street Address`,\n" +
            "`City`,\n" +
            "`State`,\n" +
            "`Postal Code`,\n" +
            "`Email`,\n" +
            "`Home Number`,\n" +
            "`Work Number`,\n" +
            "`Mobile Number`,\n"+
            "`Billing Type`,\n"+
            "`Date Joined`) values ('"+value[0]+"','"+value[1]+"','"+value[2]+"','"+value[3]+"','"+value[4]+"','"+value[5]+"','"+value[6]+"',"
                    + "'"+value[7]+"','"+value[8]+"','"+value[9]+"','"+value[10]+"','"+value[11]+"','"+value[12]+"','"+value[13]+"')";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                }
                br.close();
                
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
        }finally{
        try{
            rs.close();
            pst.close();
            //conn.close();
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
               
        }    
        }
    }//GEN-LAST:event_cmd_UploadCSV2ActionPerformed

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
            java.util.logging.Logger.getLogger(Documents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documents().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Comments;
    private javax.swing.JTable Document_table;
    private javax.swing.JButton cmd_UploadCSV2;
    private javax.swing.JButton cmd_close;
    private javax.swing.JButton cmd_openFile;
    private javax.swing.JButton cmd_saveDocument;
    private javax.swing.JButton cmd_uploadCSV;
    private javax.swing.JTextField document_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_attach;
    // End of variables declaration//GEN-END:variables
}
