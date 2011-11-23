// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.ComentarioFoto;
import com.umbook.server.domain.Foto;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect ComentarioFoto_Roo_Finder {
    
    public static TypedQuery<ComentarioFoto> ComentarioFoto.findComentarioFotoesByFoto(Foto foto) {
        if (foto == null) throw new IllegalArgumentException("The foto argument is required");
        EntityManager em = ComentarioFoto.entityManager();
        TypedQuery<ComentarioFoto> q = em.createQuery("SELECT o FROM ComentarioFoto AS o WHERE o.foto = :foto", ComentarioFoto.class);
        q.setParameter("foto", foto);
        return q;
    }
    
}
