/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightfingersandaspacebar;

/**
 *
 * @author shirdav18
 */
public class TypingScreen extends javax.swing.JPanel {

    private AppScreen PARENT;
    
    public TypingScreen(AppScreen jf) {
        initComponents();
        this.setSize(960, 768);
        restartBtn.setVisible(true);
        returnBtn.setVisible(true);
        PARENT = jf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restartBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();

        restartBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        restartBtn.setText("RESTART");

        returnBtn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        returnBtn.setText("RETURN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restartBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(692, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restartBtn)
                    .addComponent(returnBtn))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton restartBtn;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
}
