/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficies;
import java.awt.event.ItemEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import clases.Treballador;
import clases.Reserva;
import clases.Servei;
import java.awt.Color;
/**
 *
 * @author Carlos
 */
public class llistaServeis extends javax.swing.JFrame {
    HashMap<String, String> serviciosMap = new HashMap<String, String>();
    ArrayList <String> serviciosList = new ArrayList();
    DefaultListModel modeloLista;
    /**
     * Creates new form NewJFrame
     */
    public llistaServeis() {
        initComponents();
        añadirObjetosAClases();
        
        modeloLista = new DefaultListModel();
        jlista.setModel(modeloLista);
        jlista.setSelectionBackground(Color.ORANGE);
        jlista.addListSelectionListener(new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent arg0) {
                    String servei = ((JList)arg0.getSource()).getSelectedValue().toString();
                    String[] splited = servei.split("\\s+");
                    int idServei = Integer.parseInt(splited[0]);
                    System.out.println(servei);
                    llistaReserves llistaReserves = new llistaReserves(idServei);
                    llistaReserves.setVisible(true);
                    setLocationRelativeTo(null);
                    JOptionPane.showMessageDialog(null,"Servicio seleccionado: "+servei);
		}	
	});

        choiceTrabajador.addItemListener(new java.awt.event.ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {     
                ArrayList<Servei> listaServeis = new ArrayList();
                listaServeis = Servei.getLlistaServeis();
                Iterator it = listaServeis.iterator();
                //  choiceTrabajador.getItem(choiceTrabajador.getSelectedIndex());
                //  JOptionPane.showMessageDialog(null,"Trabajador seleccionado: "+choiceTrabajador.getItem(choiceTrabajador.getSelectedIndex()));
                modeloLista.clear();
                while(it.hasNext()){
                    Servei servei = (Servei) it.next();
                    if (choiceTrabajador.getSelectedIndex()== servei.getId_Treballador()){
                        modeloLista.addElement(servei.toString());
                    } else if (choiceTrabajador.getSelectedItem().equalsIgnoreCase("Tots")) {
                        modeloLista.addElement(servei.toString());
                    }   
                } 
            }
        });
    }
    public void añadirObjetosAClases(){
        Treballador t1= new Treballador (1,"Carlos","Castro","Cañabate","user","password","0","47169530A");
        Treballador t2= new Treballador (2,"Toni","Torres","Marí","user","password","0","47169530B");
        Treballador t3= new Treballador (3,"Maria","Ortega","Cobos","user","password","0","47169530C");
        Treballador.setTreballadors(t1);Treballador.setTreballadors(t2);Treballador.setTreballadors(t3);

        choiceTrabajador.add("Tots");
        choiceTrabajador.add(t1.getNom());
        choiceTrabajador.add(t2.getNom());
        choiceTrabajador.add(t3.getNom());
        Servei s1 = new Servei (1,"Sabadell - Sevilla",t1.getId(),"20/10/2018","20:00","22:00");
        Servei s2 = new Servei (2,"Formentera - Ibiza",t2.getId(),"20/10/2018","20:00","22:00");
        Servei s3 = new Servei (3,"Ibiza - Formentera",t2.getId(),"20/10/2018","20:00","22:00");
        Servei s4 = new Servei (4,"Barcelona - Paris",t3.getId(),"20/10/2018","20:00","22:00");
        Servei s5 = new Servei (5,"Sabadell - Sevilla",t3.getId(),"20/10/2018","20:00","22:00");
        Servei s6 = new Servei (6,"Paris - Barcelona",t1.getId(),"22/10/2018","20:00","22:00");

        Servei.setLlistaServeis(s1); Servei.setLlistaServeis(s2);Servei.setLlistaServeis(s3);Servei.setLlistaServeis(s4);Servei.setLlistaServeis(s5);Servei.setLlistaServeis(s6);
        
        Reserva r1 = new Reserva (1,1,"LOC12345","13/02/2018","Alberto","Garcia","Cortes","alberto@gmail.com","QR12345","47169530D","0");
        Reserva r2 = new Reserva (2,1,"LOC12345","13/02/2018","Juan","Jimenez","Canos","juan@gmail.com","QR12345","47169530H","0");
        Reserva r3 = new Reserva (3,2,"LOC12345","13/02/2018","Diego","Ruiz","Mateos","diego@gmail.com","QR12345","47169530I","0");
        Reserva.setReservas(r1);Reserva.setReservas(r2);Reserva.setReservas(r3);
    }

    public void agregarValores() {
        String valor = textoCampo.getText();
        modeloLista.addElement(valor);
    }
    
    public void quitarValores(){
        int respuesta = JOptionPane.showConfirmDialog(null,"Realmente desea eliminar este registro?");
        if (respuesta==0){
            int pos = jlista.getSelectedIndex();
            modeloLista.remove(pos);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jlista = new javax.swing.JList<>();
        botonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textoCampo = new javax.swing.JTextField();
        botonQuitar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        choiceTrabajador = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jlista);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor");

        textoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCampoActionPerformed(evt);
            }
        });

        botonQuitar.setText("Quitar");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });

        jLabel2.setText("Treballador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Consulta serveis de tots els treballadors:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(choiceTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textoCampo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonAgregar)
                            .addGap(26, 26, 26)
                            .addComponent(botonQuitar))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar)
                    .addComponent(botonQuitar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(choiceTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        agregarValores();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void textoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCampoActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        // TODO add your handling code here:
        quitarValores();
    }//GEN-LAST:event_botonQuitarActionPerformed

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
            java.util.logging.Logger.getLogger(llistaServeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(llistaServeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(llistaServeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(llistaServeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new llistaServeis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonQuitar;
    private java.awt.Choice choiceTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlista;
    private javax.swing.JTextField textoCampo;
    // End of variables declaration//GEN-END:variables
}
