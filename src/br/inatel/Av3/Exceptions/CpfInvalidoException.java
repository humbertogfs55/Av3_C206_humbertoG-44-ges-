/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.Av3.Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class CpfInvalidoException extends RuntimeException{

    public CpfInvalidoException() {
        JOptionPane.showMessageDialog(null,"O CPF inserido é invalido");
    }
    
}
