package spring.demo;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.demo.entity.Usuario;
import spring.demo.repository.UsuarioRepository;

@SpringBootTest
class DemoApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
	@Test
	public void findByUsercorreo(String user_correo) {
            
		String NAME = "luis.gastelu@tecsup.edu.pe";
		
                
                
                Usuario usuario=null;
                
		try {
			usuario = (Usuario) usuarioRepository.findByUsercorreo(user_correo);
		} catch (Exception e) {
			e.getMessage();
		}
		logger.info("" + usuario);

		assertEquals(NAME, usuario.getUser_correo());
	}

}
