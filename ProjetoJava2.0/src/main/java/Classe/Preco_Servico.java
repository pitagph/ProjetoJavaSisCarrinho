/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author PhillipeSilva
 */
public class Preco_Servico {
       // Variaveis de Preço
    private double Preco_Impressao;
    private double Preco_Impressao_foto;
    private double Preco_Scanner;
    private double Preco_Xerox;
    private double Preco_Cartao_visita;
    private double Preco_Curriculun;
    
       // Variaveis para o Carrinho
    private String Item_carrinho;
    private double valor_do_item;
    private int qntd_do_item;
    
    private double total_valor_carrinho;
    
    private double dinheiro_caixa;
    private int id;
    
    
      public Preco_Servico() {
    }
        
    public Preco_Servico(String Item_carrinho, double valor_do_item, int qntd_do_item){
        this.Item_carrinho = Item_carrinho;
        this.valor_do_item = valor_do_item;
        this.qntd_do_item = qntd_do_item;
    }
    
      @Override
    public String toString() {
        return "\n Produto [Nome do Serviço: " + Item_carrinho + ", Preço: R$"
        + valor_do_item + ", Quantidade do Serviço: "+ qntd_do_item + "]";
    }

       public void mostra() {
        System.out.println("Nome do Serviço: " + this.Item_carrinho);
        System.out.println("Valor do Serviço: "+ this.valor_do_item);
        System.out.println("Quantidade do Serviço: " + this.qntd_do_item);
    }

    /**
     * @return the Preco_Impressao
     */
    public double getPreco_Impressao() {
        return Preco_Impressao;
    }

    /**
     * @param Preco_Impressao the Preco_Impressao to set
     */
    public void setPreco_Impressao(double Preco_Impressao) {
        this.Preco_Impressao = Preco_Impressao;
    }

    /**
     * @return the Preco_Impressao_foto
     */
    public double getPreco_Impressao_foto() {
        return Preco_Impressao_foto;
    }

    /**
     * @param Preco_Impressao_foto the Preco_Impressao_foto to set
     */
    public void setPreco_Impressao_foto(double Preco_Impressao_foto) {
        this.Preco_Impressao_foto = Preco_Impressao_foto;
    }

    /**
     * @return the Preco_Scanner
     */
    public double getPreco_Scanner() {
        return Preco_Scanner;
    }

    /**
     * @param Preco_Scanner the Preco_Scanner to set
     */
    public void setPreco_Scanner(double Preco_Scanner) {
        this.Preco_Scanner = Preco_Scanner;
    }

    /**
     * @return the Preco_Xerox
     */
    public double getPreco_Xerox() {
        return Preco_Xerox;
    }

    /**
     * @param Preco_Xerox the Preco_Xerox to set
     */
    public void setPreco_Xerox(double Preco_Xerox) {
        this.Preco_Xerox = Preco_Xerox;
    }

    /**
     * @return the Preco_Cartao_visita
     */
    public double getPreco_Cartao_visita() {
        return Preco_Cartao_visita;
    }

    /**
     * @param Preco_Cartao_visita the Preco_Cartao_visita to set
     */
    public void setPreco_Cartao_visita(double Preco_Cartao_visita) {
        this.Preco_Cartao_visita = Preco_Cartao_visita;
    }

    /**
     * @return the Preco_Curriculun
     */
    public double getPreco_Curriculun() {
        return Preco_Curriculun;
    }

    /**
     * @param Preco_Curriculun the Preco_Curriculun to set
     */
    public void setPreco_Curriculun(double Preco_Curriculun) {
        this.Preco_Curriculun = Preco_Curriculun;
    }

    /**
     * @return the Item_carrinho
     */
    public String getItem_carrinho() {
        return Item_carrinho;
    }

    /**
     * @param Item_carrinho the Item_carrinho to set
     */
    public void setItem_carrinho(String Item_carrinho) {
        this.Item_carrinho = Item_carrinho;
    }

    /**
     * @return the valor_do_item
     */
    public double getValor_do_item() {
        return valor_do_item;
    }

    /**
     * @param valor_do_item the valor_do_item to set
     */
    public void setValor_do_item(double valor_do_item) {
        this.valor_do_item = valor_do_item;
    }

    /**
     * @return the qntd_do_item
     */
    public int getQntd_do_item() {
        return qntd_do_item;
    }

    /**
     * @param qntd_do_item the qntd_do_item to set
     */
    public void setQntd_do_item(int qntd_do_item) {
        this.qntd_do_item = qntd_do_item;
    }

    /**
     * @return the total_valor_carrinho
     */
    public double getTotal_valor_carrinho() {
        return total_valor_carrinho;
    }

    /**
     * @param total_valor_carrinho the total_valor_carrinho to set
     */
    public void setTotal_valor_carrinho(double total_valor_carrinho) {
        this.total_valor_carrinho = total_valor_carrinho;
    }

    /**
     * @return the dinheiro_caixa
     */
    public double getDinheiro_caixa() {
        return dinheiro_caixa;
    }

    /**
     * @param dinheiro_caixa the dinheiro_caixa to set
     */
    public void setDinheiro_caixa(double dinheiro_caixa) {
        this.dinheiro_caixa = dinheiro_caixa;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
