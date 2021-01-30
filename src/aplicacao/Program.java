package aplicacao;

import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {

		PartidaXadrez partida_xadrez = new PartidaXadrez();
		UI.printTabuleiro(partida_xadrez.getPecas());
	}

}
