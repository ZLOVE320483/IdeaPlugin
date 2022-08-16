package com.github.study.plugin.toolwindow;

import javax.swing.*;
import java.io.File;

public class SettingUI {
    private JPanel mainPanel;
    private JPanel settingPanel;
    private JLabel urlLabel;
    private JTextField urlTextField;
    private JButton urlBtn;

    public SettingUI() {
        urlBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.showOpenDialog(settingPanel);
            File file = fileChooser.getSelectedFile();
            if (file != null && file.exists()) {
                urlTextField.setText(file.getPath());
            }
        });
    }

    public JComponent getComponent() {
        return mainPanel;
    }

    public JTextField getUrlTextField() {
        return urlTextField;
    }
}
