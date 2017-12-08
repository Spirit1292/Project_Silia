package main.java.spirit1292.projectSilia.listeners.WindowMain;

import main.java.spirit1292.projectSilia.procedures.Close;
import main.java.spirit1292.projectSilia.procedures.Message;
import main.java.spirit1292.projectSilia.settings.AppLang;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowMainListeners implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_OPENED"), null);
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_CLOSING"), null);
        Close.main(null);
    }

    @Override
    public void windowClosed(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_CLOSED"), null);
    }

    @Override
    public void windowIconified(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_ICONFIED"), null);
    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_DEICONFIED"), null);
    }

    @Override
    public void windowActivated(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_ACTIVATED"), null);
    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {
            new Message().ShowDebugExtended(AppLang.Lang("WIN_MAIN_LISTENERS_DEACTIVATED"), null);
    }
}
