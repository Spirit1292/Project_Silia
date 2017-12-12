package main.java.spirit1292.projectSilia.procedures;

import javax.swing.*;
import java.awt.*;

public class StatusBar extends JLabel {
    public StatusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 16));
    }

    public void setMessage(String message) {
        setText(" " + message);
    }
}