/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco1;

/**
 *
 * @author arthur62977656
 */
public class Banco1 {

    public static void main(String[] args) {
       bancaria conta1 = new bancaria("arthur");
       
       
       conta1.depositar(100);
       conta1.sacar(10);
       conta1.extratoBancario();
       
       System.out.println(conta1.getTitular());
       System.out.println(conta1.getSaldo());
       
       conta1.setTitular("coelho");
       System.out.println(conta1.getTitular());
    }
}
    

