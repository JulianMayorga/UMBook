// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Usuario;
import java.lang.String;

privileged aspect Comentario_Roo_JavaBean {
    
    public String Comentario.getContenido() {
        return this.contenido;
    }
    
    public void Comentario.setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Usuario Comentario.getEmisor() {
        return this.emisor;
    }
    
    public void Comentario.setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }
    
}
