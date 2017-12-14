package main.java.spirit1292.projectSilia.procedures;

import java.awt.*;
import static main.java.spirit1292.projectSilia.references.SystemMessages.SCREEN_RES_TEXT;

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
            return SCREEN_RES_TEXT + " " + GetHorizontalRes() + ":" + GetVerticalRes();
    }
}
