/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mpss.SpringBoot3.recursoweb;

import br.com.mpss.SpringBoot3.entidades.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mpsss
 */
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioRecursoWeb {
    
    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        
        Usuario U = new Usuario(1l,"Marcos","Marcos@bol.com","33221144","123456");
        return ResponseEntity.ok(U);
    }
}
