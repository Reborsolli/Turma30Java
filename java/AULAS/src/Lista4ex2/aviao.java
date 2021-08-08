package Lista4ex2;

import java.util.Scanner;

import Lista4ex2.Classe2.Aviao;

public class aviao {

	public static void main(String[] args) 
	{
		//OBJETOS
		Aviao exemplo1 = new Aviao ();
		
		//ENTRADAS
		exemplo1.nome = "Airbus A380";
		exemplo1.cor = "Branca";
		exemplo1.numCadeiras = 250;
		exemplo1.numFuncionarios = 28;
		
		//SAÍDAS
		exemplo1.mostrarNome();
		exemplo1.mostrarCor();
		exemplo1.mostrarQuantasCadeiras();
		exemplo1.mostrarQuantosFuncionarios();
		exemplo1.ligar();
		exemplo1.aumentarVelo();
		exemplo1.decolar();
	}
}
	