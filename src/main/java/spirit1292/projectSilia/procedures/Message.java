package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.settings.AppLang;

import java.text.SimpleDateFormat;
import java.util.Date;

import static main.java.spirit1292.projectSilia.settings.Reference.MESSAGE_ERROR;

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
            else
            {
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
        catch (Exception ex1)
        {
            System.out.print(MESSAGE_ERROR + " (" + ErrorMessage + ")");
        }
    }
}
