package main.java.spirit1292.projectSilia.listeners.WindowMain;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowMainMouseListeners extends MouseAdapter {
    public static JPopupMenu popupMenu;

    public void mousePressed(MouseEvent me) {
       return;
    }

    public static void PopupMenu(MouseEvent me) {
        popupMenu = new JPopupMenu();
    }

    public static void MouseRightClick(MouseEvent mouseEvent) {
        PopupMenu(mouseEvent);
    }
}

