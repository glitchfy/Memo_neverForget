/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professionalpractise;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author prathibha
 */
public class Memo extends javax.swing.JFrame {

    /**
     * Creates new form Memo
     */
    
    public static String Q1 = null;
    public static String Q2 = null;
    public static String Q3 = null;
    public static String Q4 = null;
    public static String Q5 = null;
    
   
    String s1= "<html>&nbsp;&nbsp;How old are you?</html>";
    String s2= "<html>&nbsp;&nbsp;What is your birth month?</html>";
    String s3= "<html>&nbsp;&nbsp;What is your birth day?</html>";
    String s4= "<html>&nbsp;&nbsp;What is your favourite number?</html>";
    String s5= "<html>&nbsp;&nbsp;How many members are there <br> &nbsp;&nbsp;in your family?</html>";
    
    int counter = 0;
    
    public Memo() {
        initComponents();
        lblLComplete.setVisible(false);
        lblQuestion.setText(s1);
        HideLabel(jLabel1,1000,"33");
        HideLabel(jLabel1,2000,"");
        
    }
    
    public void HideLabel(JLabel label,int Time,String string){
        Timer t = new Timer(Time, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(string);
            }
        });
        t.setRepeats(false);
        t.start();
        
    }
    
    public void HideTextFiled(JTextField txt,int Time,String string){
        Timer t = new Timer(Time, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(string);
            }
        });
        t.setRepeats(false);
        t.start();
        
    }
    
    
    public String addZero(String s){
        String number="";
        
        switch(s){
            case "1":
                number="01";
                break;
            case "2":
                number="02";
                break;
            case "3":
                number="03";
                break;
            case "4":
                number="04";
                break;
            case "5":
                number="05";
                break;
            case "6":
                number="06"; 
                break;
            case "7":
                number="07"; 
                break;
            case "8":
                number="08";
                break;
            case "9":
                number="09";
                break;
            case "0":
                number="00";
                break;
            default:
                number=s;
                break;
            
                
        }
            
        return number;
    }
    public void change(){
       counter ++;
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblShowNumbertoM = new javax.swing.JLabel();
        lblLComplete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        lblQuestion = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 667));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 667));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 667));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShowNumbertoM.setFont(new java.awt.Font("Luckiest Guy", 0, 60)); // NOI18N
        lblShowNumbertoM.setForeground(new java.awt.Color(255, 255, 255));
        lblShowNumbertoM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblShowNumbertoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 470, 140));

        lblLComplete.setFont(new java.awt.Font("BadaBoom BB", 0, 40)); // NOI18N
        lblLComplete.setForeground(new java.awt.Color(255, 255, 255));
        lblLComplete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLComplete.setText("<html>Ok.. Now i’ll show you<br>\nsome number patters..<br>\ntry to remember those..</html>");
        getContentPane().add(lblLComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 410, 170));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 220, -1));

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-NORMAL.png"))); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNextMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNextMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNextMouseEntered(evt);
            }
        });
        getContentPane().add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 180, 80));

        lblClose.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 40));

        txtAnswer.setBackground(new java.awt.Color(235, 235, 235));
        txtAnswer.setFont(new java.awt.Font("Avenir Next", 1, 60)); // NOI18N
        txtAnswer.setForeground(new java.awt.Color(47, 47, 47));
        txtAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswer.setBorder(null);
        txtAnswer.setSelectionColor(new java.awt.Color(0, 204, 255));
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 150, 70));

        lblQuestion.setFont(new java.awt.Font("Luckiest Guy", 1, 40)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuestion.setText(" How many members are there in your family? ");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 730, 110));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/professionalpractise/images/background4-P.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 667));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.DEFAULT_CURSOR);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.HAND_CURSOR);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMousePressed
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-PRESSED.png"));
        lblNext.setIcon(II);
    }//GEN-LAST:event_lblNextMousePressed

    private void lblNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseReleased
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-ENTER.png"));
        lblNext.setIcon(II);

    }//GEN-LAST:event_lblNextMouseReleased

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-PRESSED.png"));

        lblNext.setIcon(II);
        
        
        System.out.println("c" +counter);
        //
        //txtAnswer.setText("");
        if(counter==0){
            ImageIcon i2=new ImageIcon(getClass().getResource("/professionalpractise/images/background2-P.png"));
            lblBackground.setIcon(i2);
            
            Q1=addZero(txtAnswer.getText());
            lblQuestion.setText(s2);
            
        }
        else if(counter==1){
            ImageIcon i2=new ImageIcon(getClass().getResource("/professionalpractise/images/background4-P.png"));
            lblBackground.setIcon(i2);
            lblQuestion.setText(s3);
            Q2=addZero(txtAnswer.getText());
            //txtAnswer.setText("");
        }
        else if(counter==2){
            ImageIcon i2=new ImageIcon(getClass().getResource("/professionalpractise/images/background2-P.png"));
            lblBackground.setIcon(i2);
            lblQuestion.setText(s4);
            Q3=addZero(txtAnswer.getText());
            //txtAnswer.setText("");
        }
        else if(counter==3){
            ImageIcon i2=new ImageIcon(getClass().getResource("/professionalpractise/images/background4-P.png"));
            lblBackground.setIcon(i2);
            lblQuestion.setText(s5);
            Q4=addZero(txtAnswer.getText());
            //this.dispose();
            //Memo1 m1= new Memo1();
            //m1.setVisible(true);
            //txtAnswer.setText("");
        }
        
        else if(counter==4){
            ImageIcon i2=new ImageIcon(getClass().getResource("/professionalpractise/images/background2-P.png"));
            lblBackground.setIcon(i2);
            //lblQuestion.setText(s5);
            Q5=addZero(txtAnswer.getText());
            this.dispose();
            patternS ps=new patternS();
            
            //Memo1 m1= new Memo1();
            ps.setVisible(true);
            //txtAnswer.setText("");
        }
       
        
        
       
        change();
        txtAnswer.setText("");
        System.out.println("Q1-"+Q1);
        System.out.println("Q2-"+Q2);
        System.out.println("Q3-"+Q3);
        System.out.println("Q3-"+Q4);
        System.out.println("Q3-"+Q5);
        
        
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseExited
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-NORMAL.png"));
        lblNext.setIcon(II);
    }//GEN-LAST:event_lblNextMouseExited

    private void lblNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseEntered
        // TODO add your handling code here:
        ImageIcon II=new ImageIcon(getClass().getResource("/professionalpractise/images/NEXT-ENTER.png"));
        lblNext.setIcon(II);
    }//GEN-LAST:event_lblNextMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLComplete;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblShowNumbertoM;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}