/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Bole
 */
public class DemoJTextFieldWithLimit extends JApplet {

    JTextField textfield1;
    JLabel label1;

    public void init() {
        getContentPane().setLayout(new FlowLayout());
        //
        label1 = new JLabel("max 10 chars");
        textfield1 = new JTextField(15);
        getContentPane().add(label1);
        getContentPane().add(textfield1);
        textfield1.setDocument(new JTextFieldLimit(10));
    }
}
