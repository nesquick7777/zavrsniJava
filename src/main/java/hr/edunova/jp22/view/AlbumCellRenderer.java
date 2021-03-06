/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import hr.edunova.jp22.model.Album;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

/**
 *
 * @author Bole
 */
public class AlbumCellRenderer extends JLabel implements ListCellRenderer<Album> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Album> list, Album value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme());
        Color customColor = new Color(0, 0, 102);
        // Font font = new Font("Tahoma", Font.BOLD,10);
        if (isSelected) {
            setBorder(BorderFactory.createLineBorder(customColor));
            list.setSelectionBackground(customColor);
            setForeground(customColor);

            //setFont(font);
        } else {
            setBorder(javax.swing.BorderFactory.createEmptyBorder());
            setForeground(customColor);
            //setFont(font);
        }
        return this;
    }

}
