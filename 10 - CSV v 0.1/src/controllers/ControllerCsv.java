package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelCsv;
import views.ViewCsv;

/**
 *
 * @author Norberto
 */
public class ControllerCsv implements ActionListener {

    ModelCsv modelCsv;
    ViewCsv viewCsv;

    public ControllerCsv(ModelCsv modelCsv, ViewCsv viewCsv) {
        this.modelCsv = modelCsv;
        this.viewCsv = viewCsv;
        this.viewCsv.jbSave.addActionListener(this);
        this.viewCsv.jbClean.addActionListener(this);
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewCsv.jbSave) {
            jbnSave();
        } else if (e.getSource() == viewCsv.jbClean) {
            jbnClean();
        }
    }

    private void jbnSave() {
        modelCsv.setPath("C:\\Users\\Norberto\\Documents\\Netbeans\\base.csv");
        modelCsv.setBase(modelCsv.text(viewCsv.jtfName.getText(), viewCsv.jtfEmail.getText()));
        modelCsv.openBase(modelCsv.getBase(), modelCsv.getPath());
        JOptionPane.showMessageDialog(null, "Nuevo registro guardado");
    }

    private void jbnClean() {
        viewCsv.jtfName.setText("");
        viewCsv.jtfEmail.setText("");
    }

    private void initComponents() {
        viewCsv.setTitle("CSV v 0.1");
        viewCsv.setLocationRelativeTo(null);
        viewCsv.setResizable(false);
        viewCsv.setVisible(true);
    }

}
