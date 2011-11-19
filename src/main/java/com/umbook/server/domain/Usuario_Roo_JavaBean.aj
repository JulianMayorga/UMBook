// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Amistad;
import com.umbook.server.domain.Comentario;
import com.umbook.server.domain.Publicacion;
import com.umbook.shared.domain.Generos;
import com.umbook.shared.domain.Roles;
import java.lang.Boolean;
import java.lang.String;
import java.util.Set;

privileged aspect Usuario_Roo_JavaBean {
    
    public String Usuario.getNombre() {
        return this.nombre;
    }
    
    public void Usuario.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String Usuario.getApellido() {
        return this.apellido;
    }
    
    public void Usuario.setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String Usuario.getCorreo_electronico() {
        return this.correo_electronico;
    }
    
    public void Usuario.setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
    public String Usuario.getContrasena() {
        return this.contrasena;
    }
    
    public void Usuario.setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public Generos Usuario.getSexo() {
        return this.sexo;
    }
    
    public void Usuario.setSexo(Generos sexo) {
        this.sexo = sexo;
    }
    
    public String Usuario.getPregunta_secreta() {
        return this.pregunta_secreta;
    }
    
    public void Usuario.setPregunta_secreta(String pregunta_secreta) {
        this.pregunta_secreta = pregunta_secreta;
    }
    
    public Roles Usuario.getRol() {
        return this.rol;
    }
    
    public void Usuario.setRol(Roles rol) {
        this.rol = rol;
    }
    
    public Boolean Usuario.getEstado() {
        return this.estado;
    }
    
    public void Usuario.setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    public String Usuario.getFoto_perfil() {
        return this.foto_perfil;
    }
    
    public void Usuario.setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }
    
    public Set<Comentario> Usuario.getComentarios() {
        return this.comentarios;
    }
    
    public void Usuario.setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public Set<Publicacion> Usuario.getPublicaciones() {
        return this.publicaciones;
    }
    
    public void Usuario.setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public Set<Amistad> Usuario.getAmistad() {
        return this.amistad;
    }
    
    public void Usuario.setAmistad(Set<Amistad> amistad) {
        this.amistad = amistad;
    }
    
}
