package application;

import java.util.*;
import entities.*;

public class PedidoCliente {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Loja loja = new Loja();
		Carrinho carrinho = new Carrinho();
		List<Produto> vitrine = new ArrayList<>();
		String y = "Grupo1";
		double somaValorTotal = 0.0;
		char formaDePagamento;

		// List<Carrinho> carrinho = new ArrayList<>();

		char op = 'S';

		vitrine.add(new Produto("DONNUT CHOCO", "G101", 13.0, 10));
		vitrine.add(new Produto("DONNUT KITKAT", "G102", 15.0, 10));
		vitrine.add(new Produto("DONNUT CREME", "G103", 14.0, 10));
		vitrine.add(new Produto("DONNUT LIMÃO", "G104", 12.0, 10));
		vitrine.add(new Produto("DONNUT NUTELLA", "G105", 16.0, 10));
		vitrine.add(new Produto("DONNUT PAÇOCA", "G106", 15.0, 10));
		vitrine.add(new Produto("DONNUT FRUTAS", "G107", 14.0, 10));
		vitrine.add(new Produto("DONNUT GELEIA", "G108", 13.0, 10));
		vitrine.add(new Produto("DONNUT NINHO", "G109", 15.0, 10));
		vitrine.add(new Produto("DONNUT CHURROS", "G110", 11.0, 10));

		do {
			loja.mostraCabecalhoNF();
			System.out.printf("Deseja Fazer compras?[S/N] ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'S') {
				do {
					loja.mostraCabecalhoLoja();
					for (Produto x : vitrine) {
						System.out.printf("%s \t %.2f \t %d \t\t %s\n", x.getCodigo(), x.getValor(), x.getEstoque(),
								x.getNome());
					}
					carrinho.mostraCarrinho();

					System.out.printf("\nInforme o codigo do produto que deseja comprar: ");
					String codCar = leia.next().toUpperCase();
					for (Produto x : vitrine) {
						if (codCar.equals(x.getCodigo())) {
							System.out.printf("Informe a quantidade desejada de %s: ", x.getNome());
							int qtdCar = leia.nextInt();
							if (qtdCar > 0 && qtdCar <= x.getEstoque()) {
								carrinho.entraCarrinho(x.getNome(), codCar, x.getValor(), qtdCar);
								somaValorTotal += (qtdCar * x.getValor());
								System.out.println("Total: R$ " + somaValorTotal);
								x.retiraEstoque(qtdCar);

							} else {
								System.out.println("Estoque indisponível, verifique a lista e tente novamente");
								System.out.println("Aperte qualquer tecla e enter para recomeçar.");
								y = leia.next();
							}

						}
					}
					System.out.print("\nDeseja continuar comprando? [S/N]");
					op = leia.next().toUpperCase().charAt(0);

				} while (op == 'S'); // FIM DO LAÇO DA VITRINE (DO PEDIDO DO CLIENTE), AGORA SEGUE PARA PAGAMENTO

				do {
				loja.menuPagamento();
				formaDePagamento = leia.next().charAt(0);
				} while (formaDePagamento != '1' && formaDePagamento != '2'  && formaDePagamento != '3');
				
				loja.mostraCabecalhoNF();
				carrinho.mostraCarrinho();
				loja.formaDePagamento(formaDePagamento, somaValorTotal);
				carrinho.limparCarrinho();
				
				System.out.printf("\nDeseja voltar ao início?[S/N] ");
				op = leia.next().toUpperCase().charAt(0);
				
			} else {
				System.out.println("~ ~ Ate Breve!");
			}
		} while (op == 'S');

	}

}