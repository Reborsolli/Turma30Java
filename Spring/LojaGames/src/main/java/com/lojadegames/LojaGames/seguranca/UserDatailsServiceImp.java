package com.lojadegames.LojaGames.seguranca;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lojadegames.LojaGames.model.Usuario;
import com.lojadegames.LojaGames.repository.UsuarioRepository;


	@Service
	public class UserDatailsServiceImp  implements UserDetailsService {

	@Autowired
	public UsuarioRepository userRepository;

	@Override
	public UserDatails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> user = userRepository.findByUsuario (userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));

		return user.map(UserDatails::new).get();

	}
}
