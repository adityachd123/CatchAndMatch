/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catchamatch;

import javax.swing.JOptionPane;

/**
 *
 * @author Avishek
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public static int count = 0 , prev , curr , score = 0 , done = 0 ;
    int a[] = { 1 , 2 , 4 , 5 , 1 , 4 , 5 , 6 , 7 , 6 , 7 , 8 , 3 , 2 , 3 , 8 };
    public javax.swing.JButton b;
    public Game() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel1.setText("SCORE : ");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[3] ;
            jButton4.setText(""+prev+"");
            b = jButton4 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[3] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton4.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[1] ;
            jButton2.setText(""+prev+"");
            b = jButton2 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[1] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton2.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
             JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[2] ;
            jButton3.setText(""+prev+"");
            b = jButton3 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[2] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton3.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[4] ;
            jButton5.setText(""+prev+"");
            b = jButton5 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[4] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton5.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[5] ;
            jButton6.setText(""+prev+"");
            b = jButton6 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[5] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton6.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[6] ;
            jButton7.setText(""+prev+"");
            b = jButton7 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[6] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton7.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[7] ;
            jButton8.setText(""+prev+"");
            b = jButton8 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[7] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton8.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[8] ;
            jButton9.setText(""+prev+"");
            b = jButton9 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[8] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton9.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[9] ;
            jButton10.setText(""+prev+"");
            b = jButton10 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[9] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton10.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[10] ;
            jButton11.setText(""+prev+"");
            b = jButton11 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[10] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton11.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[11] ;
            jButton12.setText(""+prev+"");
            b = jButton12 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[11] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton12.setText(""+prev+"");
                done++;
                // update scores
            }
            else
            {
                
                score-=1 ;
                b.setText("");
                // update penalty
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[12] ;
            jButton13.setText(""+prev+"");
            b = jButton13 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[12] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton13.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
            // Showing scores 
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[13] ;
            jButton14.setText(""+prev+"");
            b = jButton14 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[13] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton14.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[14] ;
            jButton15.setText(""+prev+"");
            b = jButton15 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[14] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton15.setText(""+prev+"");
                done++;
                // Updating scores 
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[15] ;
            jButton16.setText(""+prev+"");
            b = jButton16 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[15] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton16.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( count == 0 )
        {
            count++;
            prev = a[0] ;
            jButton1.setText(""+prev+"");
            b = jButton1 ;
        }
        else if( count == 1 )
        {
            count = 0 ;
            curr = a[0] ;
            if( prev == curr )
            {
                score+=2 ;
                jButton1.setText(""+prev+"");
                done++;
            }
            else
            {
                
                score-=1 ;
                b.setText("");
            }
            jTextField1.setText(""+score+"");
        }
        if( done == 8 )
        {
            JOptionPane.showMessageDialog(rootPane, "YOU WINNNNNN \n YOUR SCORE IS : "+score+"");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().jTextField1.setText("0");
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
