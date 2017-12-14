package main.java.spirit1292.projectSilia.listeners.WindowMain;

import main.java.spirit1292.projectSilia.procedures.Close;
import main.java.spirit1292.projectSilia.windows.WindowMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowMainActionListeners extends WindowMain implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        return;
    }

    public static ActionListener exit = e -> Close.main();
}
