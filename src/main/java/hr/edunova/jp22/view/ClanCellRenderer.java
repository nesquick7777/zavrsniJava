/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import hr.edunova.jp22.model.Clan;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

/**
 *
 * @author Bole
 */
public class ClanCellRenderer extends JLabel implements ListCellRenderer<Clan> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Clan> list, Clan value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme() + " " + value.getPrezime());
        Color customColor = new Color(0, 0, 102);
        if (isSelected) {
            setBorder(BorderFactory.createLineBorder(customColor));
            list.setSelectionBackground(customColor);
            setForeground(customColor);
        } else {
            setBorder(javax.swing.BorderFactory.createEmptyBorder());
            setForeground(customColor);
        }
        return this;
    }

}
