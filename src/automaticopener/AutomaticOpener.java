/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automaticopener;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Genus
 */
public class AutomaticOpener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://www.vedantu.com/v/mycalendar"));
            }
            Runtime.getRuntime().exec("explorer.exe shell:appsFolder\\Microsoft.Whiteboard_8wekyb3d8bbwe!Whiteboard");
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void openLiveClassFrame() {
        LiveClassFrame frame = new LiveClassFrame();
        frame.setVisible(true);
    }
}
