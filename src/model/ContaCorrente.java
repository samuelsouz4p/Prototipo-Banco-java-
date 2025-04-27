package model;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public boolean depositar(float valor){
        if(valor > 10000 || valor < 0){
            System.out.println("Valor Indisponível!");
            return false;
        }
        saldo += valor;
        System.out.println("Valor depositado!");
        return true;
    }

    public boolean sacar(float valor){
        if(valor>saldo || valor <= 0){
            System.out.println("Saldo Insuficiente!");
            return false;
        }
        saldo -= valor;
        return true;
    }

    public boolean transferir(ContaCorrente destino, float valor){
        if(valor>10000) return false;
        if(valor<=0) return false;
        if(valor > saldo) return false;
        saldo -= valor;
        destino.saldo += valor;
        return true;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
}
