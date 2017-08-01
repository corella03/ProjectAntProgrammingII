/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Logic.Globals;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate
 ** @date 2017-08-01
 ** 
 **/
public class StartGameView extends javax.swing.JFrame {
    /**
     * Creates new form StartGameView
     */ 
    public StartGameView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //Load view for start game
    public static void starGameWindow()
    {
        GameView game = new GameView();
        game.setVisible(true);
    }
    //Method to select stars icons
    public void selectAint() {
        switch (starsSlider.getValue()) {
            case 1:
                String pathOneStar = "/Icons/oneStar.png";
                URL urlOneStar = this.getClass().getResource(pathOneStar);
                ImageIcon oneStarIcon = new ImageIcon(urlOneStar);
                showStarsLabel.setIcon(oneStarIcon);
                break;
            case 2:
                String pathTwo = "/Icons/twoStars.jpg";
                URL twoUrl = this.getClass().getResource(pathTwo);
                ImageIcon iconNumberTwo = new ImageIcon(twoUrl);
                showStarsLabel.setIcon(iconNumberTwo);
                break;
            case 3:
                String pathThreeStar = "/Icons/threeStars.jpg";
                URL ThreeStar = this.getClass().getResource(pathThreeStar);
                ImageIcon threeStarIcon = new ImageIcon(ThreeStar);
                showStarsLabel.setIcon(threeStarIcon);
                break;
            case 4:
                String pathFourtStar = "/Icons/fourtStars.jpg";
                URL urlFourtStar = this.getClass().getResource(pathFourtStar);
                ImageIcon fourtStarIcon = new ImageIcon(urlFourtStar);
                showStarsLabel.setIcon(fourtStarIcon);
                break;
            case 5:
                String pathFiveStar = "/Icons/fiveStars.jpg";
                URL urlFiveStar = this.getClass().getResource(pathFiveStar);
                ImageIcon fiveStarIcon = new ImageIcon(urlFiveStar);
                showStarsLabel.setIcon(fiveStarIcon);
                break;
            default:
                break;
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

        principalPanel = new javax.swing.JPanel();
        starsSlider = new javax.swing.JSlider();
        showStarsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nickNameTextField = new javax.swing.JTextField();
        startGameButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rowsComboBox = new javax.swing.JComboBox<>();
        columnsComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));

        starsSlider.setBackground(new java.awt.Color(0, 153, 153));
        starsSlider.setForeground(new java.awt.Color(255, 255, 255));
        starsSlider.setMajorTickSpacing(1);
        starsSlider.setMaximum(5);
        starsSlider.setMinimum(1);
        starsSlider.setPaintLabels(true);
        starsSlider.setPaintTicks(true);
        starsSlider.setValue(1);
        starsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                starsSliderStateChanged(evt);
            }
        });

        showStarsLabel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("NickName:");

        startGameButton.setBackground(new java.awt.Color(0, 153, 153));
        startGameButton.setForeground(new java.awt.Color(255, 255, 255));
        startGameButton.setText("GOO");
        startGameButton.setFocusable(false);
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Rows");

        jLabel3.setText("Columns");

        rowsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        columnsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nickNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rowsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(columnsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(starsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(showStarsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rowsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nickNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(columnsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(showStarsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(starsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startGameButton)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void starsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_starsSliderStateChanged
       
    }//GEN-LAST:event_starsSliderStateChanged
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        Globals.amountRows = Integer.parseInt((String)this.rowsComboBox.getSelectedItem());
        Globals.amountColumns = Integer.parseInt((String) this.columnsComboBox.getSelectedItem());
        starGameWindow();
        this.setVisible(false);
    }//GEN-LAST:event_startGameButtonActionPerformed
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
            java.util.logging.Logger.getLogger(StartGameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGameView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> columnsComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nickNameTextField;
    public static javax.swing.JPanel principalPanel;
    private javax.swing.JComboBox<String> rowsComboBox;
    private javax.swing.JLabel showStarsLabel;
    private javax.swing.JSlider starsSlider;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
}