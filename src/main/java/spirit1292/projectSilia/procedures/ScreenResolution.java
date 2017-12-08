package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.settings.AppLang;
import java.awt.*;

public class ScreenResolution
{
    public static int horizontalSizeString;
    public static int verticalSizeString;

    public static int GetHorizontalRes() {
        horizontalSizeString = Toolkit.getDefaultToolkit().getScreenSize().width;
        return horizontalSizeString;
    }

    public static int GetVerticalRes() {
        verticalSizeString = Toolkit.getDefaultToolkit().getScreenSize().height;
        return verticalSizeString;
    }

    public static String ScreenResString() {
            return AppLang.Lang("SCREEN_RES_TEXT") + " " + GetHorizontalRes() + ":" + GetVerticalRes();
    }
}
