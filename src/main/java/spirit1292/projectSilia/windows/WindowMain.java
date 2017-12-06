package main.java.spirit1292.projectSilia.windows;

/*
    Этот класс предназначен для создания главного окна программы
 */

import main.java.spirit1292.projectSilia.Project_Silia;
import main.java.spirit1292.projectSilia.procedures.Message;
import main.java.spirit1292.projectSilia.procedures.ScreenResolution;
import main.java.spirit1292.projectSilia.procedures.StatusBar;
import main.java.spirit1292.projectSilia.settings.AppLang;
import javax.swing.*;
import java.awt.*;

//Импортирование отсылок из класса Reference.java
import static main.java.spirit1292.projectSilia.settings.Reference.*;

public class WindowMain extends JFrame
{
    public static StatusBar statusBar;
    public static JMenuBar menuBar;
    public static JMenu file, edit, tools;
    public static JMenuItem exit;

    //Ширину и высоту окна программы привязываем к разрешению экрана, делёному на три
    //Ширина окна программы
    public static int windowWidth = ScreenResolution.GetHorizontalRes()/3;
    //Высота окна программы
    public static int windowHeight = ScreenResolution.GetVerticalRes()/3;

    public WindowMain()
    {
        //Создаем скелет окна...
        try
        {
            //Заголовок окна
            setTitle(APP_NAME);
            //Действие при закрытии окна
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //Устанавливаем первоначальные размеры окна
            setPreferredSize(new Dimension(windowWidth, windowHeight));
            //Возможность изменять размер окна
            setResizable(true);
            //Добавляем значок приложению
            setIconImage(new ImageIcon(APP_ICON_LOCATION + APP_ICON_NAME).getImage());
            //Устанавливаем шрифт
            setFont(new Font(Project_Silia.fontName, Font.PLAIN, Project_Silia.fontSize));
            //Цвет фона окна
            getContentPane().setBackground(Color.DARK_GRAY);
        }
        catch (Exception ex1)
        {
            //Выводим сообщение об ошибке при создании скелета программы
            new Message().Show(AppLang.Lang("WIN_MAIN_ERROR"), ex1);
        }

        //Создаем компоненты окна и добавляем их в окно
        try
        {
            //Создаем статусбар
            statusBar = new StatusBar();
            //Создаем меню в программе
            menuBar = new JMenuBar();
            file = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_FILE_NAME"));
                exit = new JMenuItem(AppLang.Lang("WINDOW_MAIN_MENU_EXIT_NAME"));
            edit = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_EDIT_NAME"));
            tools = new JMenu(AppLang.Lang("WINDOW_MAIN_MENU_TOOLS_NAME"));

            //Собираем все части меню в одно
            menuBar.add(file);
            menuBar.add(edit);
            menuBar.add(tools);
            file.add(exit);

            //Добавляем меню в окно
            setJMenuBar(menuBar);
            //Добавляем статусбар в окно
            getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);
            //Собираем все компоненты окна в одну кучу :)
            pack();
            new Message().Show(AppLang.Lang("WIN_MAIN_ITEMS_ADDING_DONE"), null);
        }
        catch (Exception ex3)
        {
            new Message().Show(AppLang.Lang("WIN_MAIN_ITEMS_ADDING_ERROR"), ex3);
        }

        //Центрирование окна
        setLocationRelativeTo(null);
        //Скрываем окно
        setVisible(true);
        new Message().Show(AppLang.Lang("WIN_MAIN_READY"), null);
    }

    public static void main(String[] args)
    {
        new WindowMain();
    }
}
