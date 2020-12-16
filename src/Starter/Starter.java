package Starter;

import Acquaintance.IData;
import Acquaintance.IGUI;
import Acquaintance.ILogik;

import Datalag.datamanagement;
import GUI.GUIFacade;
import LogikLag.LogikFacade;

public class Starter {

    public static void main(String[] args) {
        ILogik logik = new LogikFacade();
        IGUI gui = new GUIFacade();
        IData data = new datamanagement();
        gui.injectLogik(logik);
        logik.injectData(data);
        data.
        gui.start2();
    }
}

