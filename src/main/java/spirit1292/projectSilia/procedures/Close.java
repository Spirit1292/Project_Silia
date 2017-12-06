package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.settings.AppLang;
import javax.swing.*;

public class Close
{
    public static void main(String[] args)
    {
        int i = JOptionPane.showConfirmDialog(
                null,
                AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_QUESTION_FIRST"),
                AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_QUESTION_NAME"),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        switch (i)
        {
            case JOptionPane.YES_OPTION:
            {
                new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_MESSAGE"), null);
                try
                {
                    Thread.sleep(1000);
                    System.exit(0);
                }
                catch (InterruptedException ie)
                {
                    new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_ERROR"), ie);
                }
            }
            case JOptionPane.NO_OPTION:
            {
                return;
            }
        }
    }
}
