package com.marcos.controle;

import com.marcos.ui.ChatPainel;

/**
 *
 * @author Marcos
 */
public class Chat {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatPainel().setVisible(true);
            }
        });
    }
    
}
