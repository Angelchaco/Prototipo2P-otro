/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Chacon
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistros = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuDepartamento = new javax.swing.JMenuItem();
        jMenuPuesto = new javax.swing.JMenuItem();
        jMenuConceptos = new javax.swing.JMenuItem();
        jMenuEmpleados = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuExtras = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuFinal = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuCalculos = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuinfor = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jMenuRegistros.setText("Abrir");

        jMenuItem1.setText("Todos los registros");
        jMenuRegistros.add(jMenuItem1);

        jMenuBar1.add(jMenuRegistros);

        jMenu2.setText("Catalogos");

        jMenuDepartamento.setText("Departamento");
        jMenu2.add(jMenuDepartamento);

        jMenuPuesto.setText("Puesto");
        jMenu2.add(jMenuPuesto);

        jMenuConceptos.setText("Conceptos");
        jMenu2.add(jMenuConceptos);

        jMenuEmpleados.setText("Empleados");
        jMenu2.add(jMenuEmpleados);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Procesos");

        jMenuExtras.setText("Nomina Extras");
        jMenu5.add(jMenuExtras);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Informes");

        jMenuFinal.setText("Nomina Final");
        jMenu6.add(jMenuFinal);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Herramientas");

        jMenuCalculos.setText("Calculos");
        jMenu7.add(jMenuCalculos);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Ayuda");

        jMenuinfor.setText("Informacion");
        jMenu8.add(jMenuinfor);

        jMenuSalir.setText("Salir");
        jMenu8.add(jMenuSalir);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCalculos;
    private javax.swing.JMenuItem jMenuConceptos;
    private javax.swing.JMenuItem jMenuDepartamento;
    private javax.swing.JMenuItem jMenuEmpleados;
    private javax.swing.JMenuItem jMenuExtras;
    private javax.swing.JMenuItem jMenuFinal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuPuesto;
    private javax.swing.JMenu jMenuRegistros;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JMenuItem jMenuinfor;
    // End of variables declaration//GEN-END:variables
}
