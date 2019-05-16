package com.fatec.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UC01CadastrarFuncionario {
	@Test
	public void CT01CadastrarFuncionarioDadosValidos() {
		try {
			// cenario
			Funcionario umFuncionario;
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 25.00);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT01CadastrarFuncionarioCom_nome_invalido() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("", "111111", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT01CadastrarFuncionarioCom_nome_invalidoNull() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario(null, "111111", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}

	@Test
	public void CT02CadastrarFuncionarioCom_rg_invalidoBranco() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("RG invalido", e.getMessage());
		}
	}

	@Test
	public void CT02CadastrarFuncionarioCom_rg_invalidoNull() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", null, 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("RG invalido", e.getMessage());
		}
	}

	@Test
	public void CT03CadastrarFuncionarioCom_vlHora_invalido_Menor0() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111111", -1);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Valor hora invalido", e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarFuncionarioCom_vlHora_invalido_Igual0() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111111", 0);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Valor hora invalido", e.getMessage());
		}
	}

	@Test
	public void CT05ObtemNome() {
		// cenario
		Funcionario umFuncionario = null;
		try {
			// acao
			umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("Jose", umFuncionario.getNome());
	}
	@Test
	public void CT05ObtemRG() {
		// cenario
		Funcionario umFuncionario = null;
		try {
			// acao
			umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("11111111", umFuncionario.getRg());
	}
	@Test
	public void CT05ObtemValorHora() {
		// cenario
		Funcionario umFuncionario = null;
		try {
			// acao
			umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(25.00, umFuncionario.getValorHora());
	}
	@Test
	public void CT06SalarioLiquido1() {
		// cenario
		Funcionario umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		try {
			// acao
			umFuncionario.salarioLiquido(2001);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(1.500,75, umFuncionario.salarioLiquido(2001));
	}
	@Test
	public void CT06SalarioLiquido2() {
		// cenario
		Funcionario umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		try {
			// acao
			umFuncionario.salarioLiquido(4999);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(3.749,25, umFuncionario.salarioLiquido(4999));
	}
	@Test
	public void CT06SalarioLiquido3() {
		// cenario
		Funcionario umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		try {
			// acao
			umFuncionario.salarioLiquido(5000);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(3.125,00, umFuncionario.salarioLiquido(5000));
	}
	@Test
	public void CT06SalarioLiquido4() {
		// cenario
		Funcionario umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		try {
			// acao
			umFuncionario.salarioLiquido(1999);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(1.799,10, umFuncionario.salarioLiquido(1999));
	}
	@Test
	public void CT06SalarioBruto() {
		// cenario
		Funcionario umFuncionario = new Funcionario("Jose", "11111111", 25.00);
		try {
			// acao
			umFuncionario.salarioBruto(5);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals(125, umFuncionario.salarioBruto(5));
	}
	
}