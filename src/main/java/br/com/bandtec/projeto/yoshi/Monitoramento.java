package br.com.bandtec.projeto.yoshi;

/**
 *
 * @author Murilo-Note
 */
public class Monitoramento extends javax.swing.JFrame {

    Data cpu = new Data();
    Data disco = new Data();
    Double valorBarDisco = 0.0;
    Data memoria = new Data();
    Double num = 0.0;
    Integer click = 0;

    void numClick() {
        click++;
    }

    public Monitoramento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        barCpu = new javax.swing.JProgressBar();
        barDisco = new javax.swing.JProgressBar();
        barMemoria = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMinimoCpu = new javax.swing.JLabel();
        lblMediaCpu = new javax.swing.JLabel();
        lblMaximoCpu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMinimoDisco = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMaximoDisco = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMinimoMem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMediaMem = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMaximoMem = new javax.swing.JLabel();
        btnGerador = new javax.swing.JButton();
        lblCpu = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl1.setText("Monitoramento - Máquina");

        barCpu.setMaximum(40);
        barCpu.setPreferredSize(new java.awt.Dimension(146, 25));

        barDisco.setPreferredSize(new java.awt.Dimension(146, 25));

        barMemoria.setMaximum(80);
        barMemoria.setPreferredSize(new java.awt.Dimension(146, 25));

        jLabel2.setText("Max:");

        jLabel3.setText("Min:");

        jLabel4.setText("Media: ");

        lblMinimoCpu.setText("0");

        lblMediaCpu.setText("0");

        lblMaximoCpu.setText("0");

        jLabel5.setText("Min:");

        lblMinimoDisco.setText("0");

        jLabel6.setText("Media: ");

        lblMediaDisco.setText("0");

        jLabel7.setText("Max:");

        lblMaximoDisco.setText("0");

        jLabel8.setText("Min:");

        lblMinimoMem.setText("0");

        jLabel9.setText("Media: ");

        lblMediaMem.setText("0");

        jLabel10.setText("Max:");

        lblMaximoMem.setText("0");

        btnGerador.setText("Gerar Dados");
        btnGerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeradorActionPerformed(evt);
            }
        });

        lblCpu.setText("CPU");

        lblDisco.setText("Disco");

        lblMemoria.setText("Memória Ram");

        jLabel1.setText("Frequência Máxima: 4Ghz");

        jLabel11.setText("Uso Máximo: 100%");

        jLabel12.setText("Uso Máximo: 8GB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(lblMinimoMem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(lblMinimoDisco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinimoCpu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(3, 3, 3)
                            .addComponent(lblMaximoMem))
                        .addComponent(barMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6)
                            .addComponent(lblMediaCpu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCpu))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(3, 3, 3)
                            .addComponent(lblMaximoCpu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(barCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(lblMediaDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDisco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(lblMediaMem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMemoria))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3)
                                .addComponent(lblMaximoDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addComponent(barDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1)
                .addGap(66, 66, 66))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(152, 179, Short.MAX_VALUE)
                    .addComponent(btnGerador)
                    .addGap(0, 170, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblMinimoCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMediaCpu)
                        .addComponent(lblCpu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lblMaximoCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblMinimoDisco))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMediaDisco)
                        .addComponent(lblDisco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lblMaximoDisco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblMinimoMem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMediaMem)
                                .addComponent(lblMemoria)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaximoMem)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(343, Short.MAX_VALUE)
                    .addComponent(btnGerador)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeradorActionPerformed
        numClick();
        barCpu.setStringPainted(true);
        barDisco.setStringPainted(true);
        barMemoria.setStringPainted(true);

        barDisco.setString("Disco");
        barMemoria.setString("Memoria");

        cpu.gerador(4, click);
        barCpu.setValue(cpu.valor.intValue());
        lblMinimoCpu.setText(String.format("%.2fGhz", cpu.minimo));
        lblMediaCpu.setText(String.format("%.2fGhz", cpu.media));
        lblMaximoCpu.setText(String.format("%.2fGhz", cpu.maximo));
        barCpu.setString(String.format("CPU: %.2fGhz", cpu.valor / 10));

        disco.gerador(100, click);
        valorBarDisco = disco.valor / 10;
        barDisco.setValue(valorBarDisco.intValue());
        lblMinimoDisco.setText(String.format("%.2f%%", disco.minimo));
        lblMediaDisco.setText(String.format("%.2f%%", disco.media));
        lblMaximoDisco.setText(String.format("%.2f%%", disco.maximo));
        barDisco.setString(String.format("Disco: %.0f%%", disco.valor / 10));

        memoria.gerador(8, click);
        barMemoria.setValue(memoria.valor.intValue());
        lblMinimoMem.setText(String.format("%.2fGB", memoria.minimo));
        lblMediaMem.setText(String.format("%.2fGB", memoria.media));
        lblMaximoMem.setText(String.format("%.2fGB", memoria.maximo));
        barMemoria.setString(String.format("Memória: %.2fGB", memoria.valor / 10));
    }//GEN-LAST:event_btnGeradorActionPerformed

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
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barCpu;
    private javax.swing.JProgressBar barDisco;
    private javax.swing.JProgressBar barMemoria;
    private javax.swing.JButton btnGerador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMaximoCpu;
    private javax.swing.JLabel lblMaximoDisco;
    private javax.swing.JLabel lblMaximoMem;
    private javax.swing.JLabel lblMediaCpu;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMem;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMinimoCpu;
    private javax.swing.JLabel lblMinimoDisco;
    private javax.swing.JLabel lblMinimoMem;
    // End of variables declaration//GEN-END:variables
}
