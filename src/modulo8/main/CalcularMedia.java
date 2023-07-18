package modulo8.main;

import javax.swing.JOptionPane;

public class CalcularMedia {
	
	
	public static void main(String[] args) {
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		String n1 = JOptionPane.showInputDialog("Favor inserir o valor da Primeira nota:");
		
		String n2 = JOptionPane.showInputDialog("Favor inserir o valor da Segunda nota:");

		String n3 = JOptionPane.showInputDialog("Favor inserir o valor da Terceira nota:");
	
		String n4 =JOptionPane.showInputDialog("Favor inserir o valor da Quarta nota:");
		
		nota1 = Double.parseDouble(n1);
		nota2 = Double.parseDouble(n2);
		nota3 = Double.parseDouble(n3);
		nota4 = Double.parseDouble(n4);
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media <= 5 ) {
			JOptionPane.showMessageDialog(null, "Aluno foi reporvado com média: " + media);
		} else if (media > 5 && media < 7) {
			JOptionPane.showMessageDialog(null, "Aluno está em recuperação com média: " + media);
		} else if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno APROVADO com média: " + media);
		}
		
		
	}

}
