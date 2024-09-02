package Controller;

import javax.swing.JFrame;
import javax.swing.JTable;

public abstract class Manipulador {
	
	protected Manipulador proximo;
	
	public void definirProximo(Manipulador proximo) {
		this.proximo=proximo;
	}
	
	public abstract void tratarRequisicao(String cmd, int id, JFrame telaEstoque, JTable tbEstoque);
}
