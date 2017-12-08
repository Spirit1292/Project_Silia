package main.java.spirit1292.projectSilia.settings;

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
            String Text2 = new String(Text.getBytes("ISO-8859-1"), "UTF-8");
            return Text2;
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
            return unlocalizedName;
        }
    }
}
