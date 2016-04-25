package com.main;

import com.model.Mail;
import com.model.MailBox;

public class Main {
	public static void main(String[] args) {
		Mail mail1 = new Mail("exemplo", "02/04/2016", "02/04/2016", "teste", "teste assunto");
		Mail mail2 = new Mail("exemplo2", "02/04/2016", "02/04/2016", "teste", "teste assunto2");
		Mail mail3 = new Mail("exemplo3", "03/04/2016", "03/04/2016", "teste", "teste assunto3");
		Mail mail4 = new Mail("exemplo2", "05/04/2016", "05/04/2016", "hello", "how low");
		
		MailBox mailBox = new MailBox();
		mailBox.guardaEmailRecebido(mail1);
		mailBox.guardaEmailRecebido(mail2);
		mailBox.guardaEmailRecebido(mail3);
		mailBox.guardaEmailRecebido(mail4);
		
		
		for (Mail mail : mailBox.getEmailRecebido())
			if (mail != null)
				System.out.println(mail);
		
		System.out.println("\nEmail com determinado endereço: ");
		
		for (Mail mail : mailBox.getEmailComDeterminadoEndereco("exemplo"))
			if (mail != null)
				System.out.println(mail);
			
		System.out.println("\nTotal de emails recebidos: ");
		System.out.println(mailBox.getTotalEmail() + " email(s) recebidos.");
	}
}
