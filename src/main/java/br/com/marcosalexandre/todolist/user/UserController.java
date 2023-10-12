package br.com.marcosalexandre.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador:
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;
    
    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros 0.0000
     * Float (float) Numeros 0.000
     * char (A C)
     * Date (data)
     * void
     */
    /*
     * Body
     */
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        // System.out.println(userModel.getName());
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if(user != null){
            // System.out.println("Usuario ja existe");
            // mensagem de erro
            // status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario ja existe");
        }

        var userCreated  = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
