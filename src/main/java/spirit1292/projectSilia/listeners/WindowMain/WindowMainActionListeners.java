package main.java.spirit1292.projectSilia.listeners.WindowMain;

import main.java.spirit1292.projectSilia.procedures.Close;
import main.java.spirit1292.projectSilia.windows.WindowMain;

import java.awt.event.ActionListener;

public class WindowMainActionListeners extends WindowMain {
    public static ActionListener exit = e -> Close.main(null);
}
