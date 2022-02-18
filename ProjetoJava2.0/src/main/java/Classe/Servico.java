/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhillipeSilva
 */
public class Servico extends Preco_Servico{
    Usuario user = new Usuario();
    
    public static final String Nome_Impressao = "Impressão";
    public static final String Nome_Xerox = "Xerox Preto e Branco";
    public static final String Nome_XeroxColorido = "Xerox Colorido";
    public static final String Nome_Impressao_foto = "Impressão de Foto";
    public static final String Nome_Scanner = "Scanner";
    public static final String Nome_Cartao_visita = "Cartão de Visita";
    public static final String Nome_Curriculun = "Curriculun";
    public static final String Nome_Cliente = "Cliente";
   
        public String getDateTime() { 
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
            }
    
    
     protected void Impressao(){
        System.out.println(Nome_Impressao);
        getPreco_Impressao();
        user.setNome(Nome_Cliente);
              
    }
    
   protected void Impressao_Foto(){
       System.out.println(Nome_Impressao_foto);
       getPreco_Impressao_foto();
       user.setNome(Nome_Cliente);
        
    }
    
   protected void Scanner(){
        System.out.println(Nome_Scanner);
        getPreco_Scanner();
        user.setNome(Nome_Scanner);
    }
    
   protected void Xerox(){
        System.out.println(Nome_Xerox);
        getPreco_Xerox();
        user.setNome(Nome_Cliente);
    }
   
   protected void Xerox_colorida(){
       System.out.println(Nome_XeroxColorido);
       getPreco_Xerox();
       user.setNome(Nome_Cliente);
   }
    
   protected void Curriculun(){
        System.out.println(Nome_Curriculun);
        getPreco_Curriculun();
        user.setNome(Nome_Cliente);
        
    }
    
   protected void Cartao_de_visita(){
        System.out.println(Nome_Cartao_visita);
        getPreco_Cartao_visita();
        user.setNome(Nome_Cliente);
    }
    
       
    
    
    
    
}
