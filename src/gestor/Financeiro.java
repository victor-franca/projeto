/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

/**
 *
 * @author Victor
 */
public class Financeiro implements Despesas,Receita,Lucro {
    public static double somaDespesas;
    public static double somaReceita;
    public static double lucro;
    public static double acumulador;
    
    
     @Override
    public Double totalReceita(double valorDoacao) {
        return somaReceita += valorDoacao;
    }

    
    @Override
    public double somaDespesas(double total){
            return somaDespesas += total;
                 
    }

    @Override
    public double lucro() {
        return somaReceita - somaDespesas;
        /*lucro -= recebido - gasto;
        return acumulador += lucro;*/
        
    }

   

   
    

   

   

    
    
    
    
}
