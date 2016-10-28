/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcos.servico;


import com.marcos.entidade.Mensagem;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class ClienteServico {
    private Socket socket;
    private ObjectOutputStream output;
    
    //Metodo para conectar-se ao servidor
    public Socket conect(){
        try {
            this.socket = new Socket("localhost",5557); //IP e porta utilizada para conexao
            this.output = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ClienteServico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Servidor inacessível");
        }
        
        return socket;
    }
    
    //Metodo para enviar mensagem ao servidor.
    public void send(Mensagem message){
        try {
            output.writeObject(message);
        } catch (IOException ex) {
            Logger.getLogger(ClienteServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
