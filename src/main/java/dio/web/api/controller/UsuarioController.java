package dio.web.api.controller;

//import dio.web.api.model.Usuario;
//import dio.web.api.repository.UsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class UsuarioController {
//    @Autowired
//    private UsuarioRepository repository;
//    @GetMapping("/users")
//    public List<Usuario> getUsers(){
//        return repository.findAll();
//    }
//    @GetMapping("/username")
//    public Usuario getOne(@PathVariable ("username") String username){
//        return repository.findByUsername(username);
//    }
//}

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }
    @GetMapping("/{username}")
    public Usuario find(@PathVariable("/username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("users")
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
