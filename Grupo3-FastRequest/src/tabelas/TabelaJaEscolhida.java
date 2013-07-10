package tabelas;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.fastrequest.model.Produto;

public class TabelaJaEscolhida extends AbstractTableModel {
	private static final int COL_NOME =0;
	private static final int COL_PRECO = 1;
	private List<Produto> valores; 

	public TabelaJaEscolhida(List<Produto> valores) {
		this.valores=valores;
		
	}
	
	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public int getRowCount() {
		return valores.size();
	}

	
	@Override
	public Object getValueAt(int rowIndex, int columIndex) {

		Produto produto = valores.get(rowIndex);
		
		 if (columIndex == COL_NOME){
			return produto.getNome();
		
		}else if (columIndex == COL_PRECO){
			return produto.getPreco();
		}
			return null;
	}

    @Override
    public String getColumnName(int i) {
        String nomeColuna = "";
       switch(i){
           
               case COL_NOME:
               nomeColuna="Nome";
               break;
               case COL_PRECO:
               nomeColuna="Preco";
               break;
               default: throw  new IllegalArgumentException("Coluna invalida");
            
       }
            return nomeColuna;
    }

    public Class<?> getColumnClass(int i) {
    		if (i==COL_NOME) {
            return String.class;
        }else if (i==COL_PRECO) {
            return double.class;
        }
        return null;
    }
	
        public Produto get(int row){
            return valores.get(row);
        }
}
