// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Album;
import com.umbook.server.domain.ComentarioFoto;
import java.lang.String;
import java.util.Set;

privileged aspect Foto_Roo_JavaBean {
    
    public String Foto.getDescripcion() {
        return this.descripcion;
    }
    
    public void Foto.setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String Foto.getUbicacion() {
        return this.ubicacion;
    }
    
    public void Foto.setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public Set<ComentarioFoto> Foto.getComentarios() {
        return this.comentarios;
    }
    
    public void Foto.setComentarios(Set<ComentarioFoto> comentarios) {
        this.comentarios = comentarios;
    }
    
    public Album Foto.getAlbum() {
        return this.album;
    }
    
    public void Foto.setAlbum(Album album) {
        this.album = album;
    }
    
}
