package org.generation.blogPessoal.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {
	@Autowired
	private TestRestTemplate testRestTemplate;

	private Usuario usuario;
	private Usuario usuarioUpdate;
	private Usuario usuarioAdmin;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@BeforeAll
	public void start() throws ParseException {

		usuarioAdmin = new Usuario(0L, "Administrador", "admin@email.com.br", "admin123");

		if (!usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()) {

			HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);

		}

		usuario = new Usuario(0L, "Paulo Antunes", "paulo@email.com.br", "13465278");

		usuarioUpdate = new Usuario(2L, "Paulo Antunes de Souza", "paulo_souza@email.com.br", "souza123");
	}

	@Test
	@Order(1)
	@DisplayName("✔ Cadastrar Usuário!")
	public void deveRealizarPostUsuario() {

		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario);

		ResponseEntity<Usuario> resposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);

		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());

	}

	@Test
	@Order(2)
	@DisplayName("👍 Listar todos os Usuários!")
	public void deveMostrarTodosUsuarios() {

		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("admin@email.com.br", "admin123")
				.exchange("/usuarios/all", HttpMethod.GET, null, String.class);

		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}

	@Test
	@Order(3)
	@DisplayName("😳 Alterar Usuário!")
	public void deveRealizarPutUsuario() {

		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioUpdate);

		ResponseEntity<Usuario> resposta = testRestTemplate.withBasicAuth("admin@email.com.br", "admin123")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, request, Usuario.class);

		assertEquals(HttpStatus.OK, resposta.getStatusCode());

	}
}
