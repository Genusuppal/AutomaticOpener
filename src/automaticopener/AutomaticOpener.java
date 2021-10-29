/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automaticopener;

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
        new MainFrame().setVisible(true);
    }

    public static void openLiveClassFrame() {
        LiveClassFrame frame = new LiveClassFrame();
        frame.setVisible(true);
    }
}
