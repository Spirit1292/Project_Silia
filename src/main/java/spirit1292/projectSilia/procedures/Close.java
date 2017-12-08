package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.settings.AppLang;
import javax.swing.*;

import static main.java.spirit1292.projectSilia.settings.AppSettings.DEBUG_MODE_STANDART;

public class Close
{
    public static void main(String[] args) {
        if (DEBUG_MODE_STANDART) {
            new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_MESSAGE_CALLING"), null);
        }

        int i = JOptionPane.showConfirmDialog(
                null,
                AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_QUESTION_FIRST"),
                AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_QUESTION_NAME"),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        try {
            switch (i) {
                case JOptionPane.YES_OPTION: {
                    if (DEBUG_MODE_STANDART) {
                        new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_MESSAGE_YES"), null);
                    }
                    try {
                        Thread.sleep(1000);
                        System.exit(0);
                    }
                    catch (InterruptedException ie) {
                        new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_ERROR"), ie);
                    }
                }
                case JOptionPane.NO_OPTION: {
                    if (DEBUG_MODE_STANDART) {
                        new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_MESSAGE_NO"), null);
                    }
                    return;
                }
            }

        }
        catch (Exception ex) {
            new Message().Show(AppLang.Lang("MESSAGE_PROCEDURE_CLOSE_ERROR"), ex);
        }

    }
}
