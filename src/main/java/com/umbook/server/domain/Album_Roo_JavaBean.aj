// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.ComentarioAlbum;
import com.umbook.server.domain.Foto;
import com.umbook.server.domain.Usuario;
import java.lang.String;
import java.util.Set;

privileged aspect Album_Roo_JavaBean {
    
    public String Album.getNombre() {
        return this.nombre;
    }
    
    public void Album.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String Album.getDescripcion() {
        return this.descripcion;
    }
    
    public void Album.setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Set<Foto> Album.getFotos() {
        return this.fotos;
    }
    
    public void Album.setFotos(Set<Foto> fotos) {
        this.fotos = fotos;
    }
    
    public Set<ComentarioAlbum> Album.getComentarios() {
        return this.comentarios;
    }
    
    public void Album.setComentarios(Set<ComentarioAlbum> comentarios) {
        this.comentarios = comentarios;
    }
    
    public Usuario Album.getUsuario() {
        return this.usuario;
    }
    
    public void Album.setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
