// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import java.lang.String;

privileged aspect Album_Roo_ToString {
    
    public String Album.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comentarios: ").append(getComentarios() == null ? "null" : getComentarios().size()).append(", ");
        sb.append("Descripcion: ").append(getDescripcion()).append(", ");
        sb.append("Fotos: ").append(getFotos() == null ? "null" : getFotos().size()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Nombre: ").append(getNombre()).append(", ");
        sb.append("Usuario: ").append(getUsuario()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
