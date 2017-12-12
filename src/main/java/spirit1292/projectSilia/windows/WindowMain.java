package main.java.spirit1292.projectSilia.windows;

import main.java.spirit1292.projectSilia.Project_Silia;
import main.java.spirit1292.projectSilia.listeners.WindowMain.WindowMainActionListeners;
import main.java.spirit1292.projectSilia.listeners.WindowMain.WindowMainListeners;
import main.java.spirit1292.projectSilia.procedures.Message;
import main.java.spirit1292.projectSilia.procedures.ScreenResolution;
import main.java.spirit1292.projectSilia.procedures.StatusBar;
import main.java.spirit1292.projectSilia.settings.AppLang;

import javax.swing.*;
import java.awt.*;

import static main.java.spirit1292.projectSilia.settings.Reference.*;
import static main.java.spirit1292.projectSilia.settings.SystemMessages.*;

public class WindowMain extends JFrame {
    public static StatusBar statusBar;
    public static JMenuBar menuBar;
    public static JMenu file, edit, tools;
    public static JMenuItem exit;
    public static int windowWidth = ScreenResolution.GetHorizontalRes()/3;
    public static int windowHeight = ScreenResolution.GetVerticalRes()/3;

    public WindowMain() {
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
        try {
            setTitle(APP_NAME);
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            setPreferredSize(new Dimension(windowWidth, windowHeight));
            setResizable(true);
            setIconImage(new ImageIcon(APP_ICON_LOCATION + APP_ICON_NAME).getImage());
            setFont(new Font(Project_Silia.fontName, Font.PLAIN, Project_Silia.fontSize));
            getContentPane().setBackground(Color.DARK_GRAY);
            new Message().ShowDebugStandart(WIN_MAIN_BASE_CREATED, null);
        }
        catch (Exception ex1) {
            new Message().Show(WIN_MAIN_BASE_ERROR, ex1);
        }
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
        try {
            statusBar = new StatusBar();
            menuBar = new JMenuBar();
            file = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_FILE_NAME"));
                exit = new JMenuItem(AppLang.Lang("WINDOW_MAIN_MENU_EXIT_NAME"));
            edit = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_EDIT_NAME"));
            tools = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_TOOLS_NAME"));

            menuBar.add(file);
            menuBar.add(edit);
            menuBar.add(tools);
            file.add(exit);

            setJMenuBar(menuBar);

            ActionListeners();
            WindowListeners();
            MouseListeners();

            getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);
            pack();
                new Message().ShowDebugStandart(WIN_MAIN_ITEMS_ADDING_DONE, null);
        }
        catch (Exception ex3) {
            new Message().Show(WIN_MAIN_ITEMS_ADDING_ERROR, ex3);
        }
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
        setLocationRelativeTo(null);
        setVisible(true);
            new Message().ShowDebugStandart(WIN_MAIN_CREATED, null);
    }

    public void ActionListeners()
    {
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
        try
        {
            exit.addActionListener(WindowMainActionListeners.exit);
                new Message().ShowDebugStandart(WIN_MAIN_ADD_ACTION_LISTENERS_DONE, null);
        }
        catch (Exception ex)
        {
            new Message().Show(WIN_MAIN_ADD_ACTION_LISTENERS_ERROR, ex);
        }
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
    }

    public void WindowListeners()
    {
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
        try
        {
            super.addWindowListener(new WindowMainListeners());
                new Message().ShowDebugStandart(WIN_MAIN_ADD_WINDOW_LISTENERS_DONE, null);
        }
        catch (Exception ex)
        {
            new Message().Show(WIN_MAIN_ADD_WINDOW_LISTENERS_ERROR, ex);
        }
        //~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~
    }

    public void MouseListeners()
    {
        return;
    }
}
