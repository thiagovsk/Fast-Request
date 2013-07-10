package tabelas;

import br.com.fastrequest.model.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PedidoTableModel extends AbstractTableModel{
	
	
	
	private static final int COL_ID = 0;
	private static final int COL_NOME =1;
	private static final int COL_DESC = 2;
	private static final int COL_PRECO = 3;
	private List<Produto> valores; 

	public PedidoTableModel(List<Produto> valores) {
		this.valores=valores;
		
	}
	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		return valores.size();
	}

	
	@Override
	public Object getValueAt(int rowIndex, int columIndex) {

		Produto produto = valores.get(rowIndex);
		
		if (columIndex == COL_ID) {
			return produto.getIdProduto();
			
		}else if (columIndex == COL_NOME){
			return produto.getNome();
		}else if (columIndex == COL_DESC){
			return produto.getDescricao();
		}else if (columIndex == COL_PRECO){
			return produto.getPreco();
		}
			return null;
	}

    @Override
    public String getColumnName(int i) {
        String nomeColuna = "";
       switch(i){
           case COL_ID:
               nomeColuna="Codigo";
               break;
               case COL_NOME:
               nomeColuna="Nome";
               break;
                   case COL_DESC:
               nomeColuna="Descricao";
               break;
               case COL_PRECO:
               nomeColuna="Preco";
               break;
               default: throw  new IllegalArgumentException("Coluna invalida");
            
       }
            return nomeColuna;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        if (i==COL_ID) {
            return int.class;
            
        } else if (i==COL_NOME) {
            return String.class;
        }else if (i==COL_DESC) {
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