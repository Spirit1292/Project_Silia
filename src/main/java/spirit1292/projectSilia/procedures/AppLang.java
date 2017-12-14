package main.java.spirit1292.projectSilia.procedures;

import main.java.spirit1292.projectSilia.references.Reference;
import main.java.spirit1292.projectSilia.settings.AppSettings;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppLang {
    public static StringBuilder langPath = new StringBuilder(Reference.APP_LOCALIZATION_FOLDER_LOCATION);
    public static Locale currentLocale;
    public static ResourceBundle currentResourceBundle;
    public static String language = AppSettings.SETTING_LANGUAGE;

    public static String Lang(String unlocalizedName) {
        try {
            currentLocale = new Locale(language);
            currentResourceBundle = ResourceBundle.getBundle(langPath.toString(), currentLocale);
            String Text = currentResourceBundle.getString(unlocalizedName);
            return Text;
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
            return unlocalizedName;
        }
    }
}
