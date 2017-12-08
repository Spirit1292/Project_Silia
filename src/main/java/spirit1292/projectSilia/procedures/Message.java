package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.settings.AppLang;
import java.text.SimpleDateFormat;
import java.util.Date;

import static main.java.spirit1292.projectSilia.settings.AppSettings.DEBUG_MODE_EXTENDED;
import static main.java.spirit1292.projectSilia.settings.AppSettings.DEBUG_MODE_STANDART;

public class Message
{
    public static Date Date = new Date();
    public static SimpleDateFormat Time = new SimpleDateFormat("hh:mm:ss");
    public static String TerminalMessage;

    public void Show(String Message, Exception ErrorMessage)
    {
        try
        {
            if (ErrorMessage != null)
            {
                TerminalMessage = "("
                        + Time.format(Date)
                        + ")"
                        + " "
                        + AppLang.Lang("MESSAGE_TITLE")
                        + " "
                        + Message
                        + "\n"
                        + " ("
                        + ErrorMessage
                        + ")"
                        + "\n";
            }
            else {
                TerminalMessage = "("
                        + Time.format(Date)
                        + ")"
                        + " "
                        + AppLang.Lang("MESSAGE_TITLE")
                        + " "
                        + Message
                        + "\n";
            }

            System.out.print(TerminalMessage);
        }
        catch (Exception ex1) {
            System.out.print(AppLang.Lang("MESSAGE_ERROR") + " (" + ErrorMessage + ")");
        }
    }

    public void ShowDebugStandart (String Message, Exception ErrorMessage) {
        if (DEBUG_MODE_STANDART == true)
            Show(Message, ErrorMessage);
    }

    public void ShowDebugExtended (String Message, Exception ErrorMessage) {
        if (DEBUG_MODE_EXTENDED == true)
            Show(Message, ErrorMessage);
    }
}
