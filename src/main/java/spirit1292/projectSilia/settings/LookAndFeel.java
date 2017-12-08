package main.java.spirit1292.projectSilia.settings;

import main.java.spirit1292.projectSilia.procedures.Message;

import javax.swing.*;

public class LookAndFeel {
    public static void main(String[] args) {
        try {
            if (Reference.LOOKANDFEEL_SHORT_JAVA.equals(UIManager.getLookAndFeel().getName())) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                new Message().Show(AppLang.Lang("MESSAGE_LOOKANDFEEL_INSTALL_DONE") + " " +
                        UIManager.getLookAndFeel().getName(), null);
            }
            else {
                new Message().Show(AppLang.Lang("MESSAGE_LOOKANDFEEL_INSTALL_CANCEL") + " " +
                        UIManager.getLookAndFeel().getName(), null);
            }
        }

        catch (UnsupportedLookAndFeelException ulafex) {
            new Message().Show(AppLang.Lang("MESSAGE_LOOKANDFEEL_ERROR_UNSUPPORTED"), null);
            new Message().Show(AppLang.Lang("MESSAGE_LOOKANDFEEL_CURRENT") + " " +
                    UIManager.getLookAndFeel().getDescription(), ulafex);
        }

        catch (IllegalAccessException iaex) {
            // handle exception
        }

        catch (Exception ex) {
            new Message().Show(AppLang.Lang("MESSAGE_LOOKANDFEEL_ERROR"), ex);
        }
    }
}
