/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Componente;
import aplicacion.Empleado;
import aplicacion.PCReparar;

/**
 *
 * @author alumnogreibd
 */
public class VReparador extends javax.swing.JFrame {
    private aplicacion.FachadaAplicacion fa;
    private Empleado reparador;
    /**
     * Creates new form VReparador
     */
    public VReparador(aplicacion.FachadaAplicacion fa, java.util.List<PCReparar> reparaciones) {
        this.fa = fa;
        reparador = new Empleado("45362789W", "David Soler", "ds", "david.soler@rai.usc.es", "Rua da Rosa", 2000, "673 45 67 98", true, true, false);
        initComponents();
        
        ModeloTablaReparadores mTablaR = new ModeloTablaReparadores();
        tablaReparadores.setModel(mTablaR);
        mTablaR.setFilas(reparaciones);
        
        ModeloListaStrings mListaC=new ModeloListaStrings();
        listaComponentes.setModel(mListaC);
        
    }
    
    public VReparador(aplicacion.FachadaAplicacion fa, java.util.List<PCReparar> reparaciones, Empleado rep) {
        this.fa = fa;
        this.reparador = rep;
        initComponents();
        
        ModeloTablaReparadores mTablaR = new ModeloTablaReparadores();
        tablaReparadores.setModel(mTablaR);
        mTablaR.setFilas(reparaciones);
        
        ModeloListaStrings mListaC=new ModeloListaStrings();
        listaComponentes.setModel(mListaC);
        
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
        tablaReparadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboComponente = new javax.swing.JComboBox();
        textoPrecio = new javax.swing.JTextField();
        botonElegir = new javax.swing.JButton();
        botonReparar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaComponentes = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Reparaciones");

        tablaReparadores.setModel(new ModeloTablaReparadores());
        tablaReparadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReparadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReparadores);

        jLabel1.setText("Precio:");

        jLabel2.setText("Componente:");

        comboComponente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alimentación", "CPU", "Disco duro", "GPU", "Periférico", "Placa base", "RAM", "Refrigeración" }));
        comboComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComponenteActionPerformed(evt);
            }
        });

        textoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPrecioActionPerformed(evt);
            }
        });

        botonElegir.setText("Elegir componente");
        botonElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElegirActionPerformed(evt);
            }
        });

        botonReparar.setText("Reparar");
        botonReparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRepararActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listaComponentes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonElegir)
                        .addGap(44, 44, 44)
                        .addComponent(botonReparar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonReparar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonElegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPrecioActionPerformed

    private void botonElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElegirActionPerformed
        if((listaComponentes.getSelectedIndex() != -1) && (tablaReparadores.getSelectedRow() != -1)) {
            PCReparar pc = ((ModeloTablaReparadores)tablaReparadores.getModel()).obtenerReparacion(tablaReparadores.getSelectedRow());
            String nombre = ((ModeloListaStrings)listaComponentes.getModel()).getElementos().get(listaComponentes.getSelectedIndex());
            Componente comp = new Componente(nombre);
            pc.setComponente(comp);
            double precio = fa.obtenerPrecio(nombre) * 0.5;
            pc.setPrecio(precio);
            textoPrecio.setText(Double.toString(precio));
            ((ModeloTablaReparadores)tablaReparadores.getModel()).fireTableDataChanged();
            
        }
        else fa.muestraExcepcion("Seleccione un PC a reparar y un componente.");
    }//GEN-LAST:event_botonElegirActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void comboComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComponenteActionPerformed
        String comp = (String)comboComponente.getSelectedItem();
        if(comp.equals("Alimentación")) comp = "alimentacion";
        else if(comp.equals("Disco duro")) comp = "discosduros";
        else if(comp.equals("CPU")) comp = "cpus";
        else if(comp.equals("Placa base")) comp = "placasbase";
        else if(comp.equals("GPU")) comp = "gpus";
        else if(comp.equals("Periférico")) comp = "perifericos";
        else if(comp.equals("RAM")) comp = "rams";
        else if(comp.equals("Refrigeración")) comp = "refrigeracion";
        
        java.util.ArrayList<String> comps = fa.consultarComponentes(comp);
        ModeloListaStrings mListaC = (ModeloListaStrings)listaComponentes.getModel();
        mListaC.setElementos(comps);
    }//GEN-LAST:event_comboComponenteActionPerformed

    private void tablaReparadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReparadoresMouseClicked

      
    }//GEN-LAST:event_tablaReparadoresMouseClicked

    private void botonRepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRepararActionPerformed
        if(tablaReparadores.getSelectedRow() == -1) {
            fa.muestraExcepcion("Debe seleccionarse un PC a reparar.");
            return;
        }
        PCReparar pc = ((ModeloTablaReparadores)tablaReparadores.getModel()).obtenerReparacion(tablaReparadores.getSelectedRow());
        
        if(pc.getComponente() == null) {
            fa.muestraExcepcion("El PC no tiene seleccionado el componente a reparar.");
            return;
        }
        fa.repararPC(pc, reparador);
        
        ModeloTablaReparadores mTablaR = new ModeloTablaReparadores();
        tablaReparadores.setModel(mTablaR);
        mTablaR.setFilas(fa.obtenerReparaciones());
    }//GEN-LAST:event_botonRepararActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonElegir;
    private javax.swing.JButton botonReparar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox comboComponente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaComponentes;
    private javax.swing.JTable tablaReparadores;
    private javax.swing.JTextField textoPrecio;
    // End of variables declaration//GEN-END:variables
}