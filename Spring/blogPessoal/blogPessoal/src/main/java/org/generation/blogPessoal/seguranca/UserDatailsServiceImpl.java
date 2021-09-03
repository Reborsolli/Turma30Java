package org.generation.blogPessoal.seguranca;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDatailsServiceImpl  implements UserDetailsService{
	
	@Autowired
	public UsuarioReository userReository ; 	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<Usuario> user = userReository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException (userName  +  "not found."));
				
				return user.map(UserDetailsImpl:: new).get();
				
}
}