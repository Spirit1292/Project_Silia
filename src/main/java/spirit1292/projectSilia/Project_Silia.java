package main.java.spirit1292.projectSilia;

import main.java.spirit1292.projectSilia.procedures.Message;
import main.java.spirit1292.projectSilia.procedures.ScreenResolution;
import main.java.spirit1292.projectSilia.settings.AppSettings;
import main.java.spirit1292.projectSilia.settings.LookAndFeel;
import main.java.spirit1292.projectSilia.windows.WindowMain;

import javax.swing.*;

import static main.java.spirit1292.projectSilia.settings.SystemMessages.PROJECT_ERROR;
import static main.java.spirit1292.projectSilia.settings.SystemMessages.PROJECT_READY;

public class Project_Silia {
    public static JFrame WindowMain;
    public static String fontName;
    public static Integer fontSize;

    public static void main(String[] args) {
        new Message().Show(ScreenResolution.ScreenResString(), null);
        fontName = AppSettings.SETTING_FONT_NAME;
        fontSize = AppSettings.SETTING_FONT_SIZE;
        LookAndFeel.main(null);
        try {
            WindowMain = new WindowMain();
            new Message().Show(PROJECT_READY, null);
        }
        catch (Exception ex1) {
            new Message().Show(PROJECT_ERROR, ex1);
        }
    }
}
