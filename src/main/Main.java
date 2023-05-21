package main;

import beans.Bicicleta;
import beans.Foto;
import beans.Problemas;
import beans.Usuario;
import beans.ValidadorFoto;
import beans.Vistoria;

public class Main {
	public static void main(String[] args) {
		var bicicleta = new Bicicleta("Caloi", "Bicicleta urbana", "2022", "Bicicleta Elétrica");
		var foto = new Foto("21/05/2023");
		var problemas = new Problemas(false, false, false, false);
		var usuario = new Usuario("Joao", "Pedro", "joaopedro@gmail.com", "joao123", "Rua Augusta - 130", "99999-9999", "29/03/1991", "Masculino");
		var validador = new ValidadorFoto(1600, 1300, true);
		var vistoria = new Vistoria("12345678911", "21/05/2023", "Bicicleta eletrica da marca caloi", "Aprovada");
		
		
		
		
		
		System.out.println(
			String.format("Usuario criado - Nome: %s, Email: %s, Telefone: %s", 
					usuario.getNome(), 
					usuario.getEmail(), 
					usuario.getTelefone())
		);
		
		System.out.println(
				String.format("Nova Bicicleta - Marca: %s, Modelo: %s, Ano fabricacao: %s, Tipo: %s", 
						bicicleta.getMarca(), 
						bicicleta.getModelo(), 
						bicicleta.getAnoFabricacao(), 
						bicicleta.getTipoBicicleta())
		);
		
		System.out.println(
				String.format("Problemas Detectados - Quadro: %s, Roda: %s, Mesa: %s, Cambio: %s", 
						problemas.isQuadroBicicleta(),
						problemas.isRodaBicicleta(),
						problemas.isMesaBicicleta(),
						problemas.isCambioBicicleta())
		);
		
		System.out.println(
				String.format("Foto enviada em - %s", foto.getDataFoto())
		);
		
		System.out.println(
				String.format("Verificacao da foto - %s", validador.validarFoto())
		);
		
		System.out.println(
				String.format("Detalhes da vistoria - Descricao gerada: %s, Data: %s, Resultado: %s", 
						vistoria.getDescricao(),
						vistoria.getDataVistoria(),
						vistoria.resultadoVistoria())
		);
		
		System.out.println(
				String.format(vistoria.relatorioVistoria())
		);
	}
}
