// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.ComentarioPublicacion;
import com.umbook.server.domain.Publicacion;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect ComentarioPublicacion_Roo_Finder {
    
    public static TypedQuery<ComentarioPublicacion> ComentarioPublicacion.findComentarioPublicacionsByPublicacion(Publicacion publicacion) {
        if (publicacion == null) throw new IllegalArgumentException("The publicacion argument is required");
        EntityManager em = ComentarioPublicacion.entityManager();
        TypedQuery<ComentarioPublicacion> q = em.createQuery("SELECT o FROM ComentarioPublicacion AS o WHERE o.publicacion = :publicacion", ComentarioPublicacion.class);
        q.setParameter("publicacion", publicacion);
        return q;
    }
    
}
