import java.sql.Connection;

import br.com.sas.model.util.Conexao;

public class AppSAS {
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConnection();
	}

}
