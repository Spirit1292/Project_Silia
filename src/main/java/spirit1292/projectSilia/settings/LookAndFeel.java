package main.java.spirit1292.projectSilia.settings;

import main.java.spirit1292.projectSilia.procedures.Message;
import javax.swing.*;
import static main.java.spirit1292.projectSilia.settings.AppSettings.DEBUG_MODE_EXTENDED;
import static main.java.spirit1292.projectSilia.settings.SystemMessages.*;

public class LookAndFeel {
    public static void main(String[] args) {
        try {
            if (Reference.LOOKANDFEEL_SHORT_JAVA.equals(UIManager.getLookAndFeel().getName())) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                if (DEBUG_MODE_EXTENDED == true) {
                    new Message().Show(MESSAGE_LOOKANDFEEL_INSTALL_DONE + " " +
                            UIManager.getLookAndFeel().getName(), null);
                }

            }
            else {
                if (DEBUG_MODE_EXTENDED == true) {
                    new Message().Show(MESSAGE_LOOKANDFEEL_INSTALL_CANCEL + " " +
                            UIManager.getLookAndFeel().getName(), null);
                }
            }
        }

        catch (UnsupportedLookAndFeelException ulafex) {
            new Message().Show(MESSAGE_LOOKANDFEEL_ERROR_UNSUPPORTED, null);
            new Message().Show(MESSAGE_LOOKANDFEEL_CURRENT + " " +
                    UIManager.getLookAndFeel().getDescription(), ulafex);
        }

        catch (IllegalAccessException iaex) {
            // handle exception
        }

        catch (Exception ex) {
            new Message().Show(MESSAGE_LOOKANDFEEL_ERROR, ex);
        }
    }
}
