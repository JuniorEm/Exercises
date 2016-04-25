package com.model;

public interface Operacao {
    public int getTotalEmail();
    public void guardaEmailRecebido(Mail mail);
    public Mail[] getEmailComDeterminadoEndereco(String endereco);
    public Mail[] getEmailRecebido();
}
