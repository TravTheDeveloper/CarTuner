/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TPS5215
 */
public class VehiclePanel extends javax.swing.JPanel {

    /**
     * Creates new form VehiclePanel
     * @param name
     * @param make
     * @param style
     * @param year
     */
    public VehiclePanel(String name, String make, String style, int year) {
        initComponents();
        nameLabel.setText("User: " + name);
        makeLabel.setText("Make: " + make);
        styleLabel.setText("Style: " + style);
        yearLabel.setText("Year: " + year);
        this.setSize(742, 710);
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        styleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        makeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 255));
        setMaximumSize(new java.awt.Dimension(742, 710));
        setMinimumSize(new java.awt.Dimension(742, 710));
        setPreferredSize(new java.awt.Dimension(742, 710));

        styleLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        styleLabel.setForeground(new java.awt.Color(255, 255, 255));
        styleLabel.setText("Style");

        nameLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        yearLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year");

        makeLabel.setFont(new java.awt.Font("BankGothic Lt BT", 0, 24)); // NOI18N
        makeLabel.setForeground(new java.awt.Color(255, 255, 255));
        makeLabel.setText("Make");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(styleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 629, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(makeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(styleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 562, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel makeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel styleLabel;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
