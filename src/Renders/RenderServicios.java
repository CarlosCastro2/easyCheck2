/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renders;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Carlos
 */
public class RenderServicios extends JLabel implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i,
            boolean isSelected, boolean cellHasFocus) {
        
        JLabel renderer = (JLabel) e;
        String valor = e.toString();
        setText(valor);
        if (isSelected){
            renderer.setBackground(jlist.getSelectionBackground());
            renderer.setForeground(jlist.getSelectionForeground());
        } else {
            renderer.setBackground(jlist.getBackground());
            renderer.setForeground(jlist.getForeground());
        }
        renderer.setOpaque(true);
        return renderer;

    }
}