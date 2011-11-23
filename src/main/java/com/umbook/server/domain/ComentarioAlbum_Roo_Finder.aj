// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Album;
import com.umbook.server.domain.ComentarioAlbum;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect ComentarioAlbum_Roo_Finder {
    
    public static TypedQuery<ComentarioAlbum> ComentarioAlbum.findComentarioAlbumsByAlbum(Album album) {
        if (album == null) throw new IllegalArgumentException("The album argument is required");
        EntityManager em = ComentarioAlbum.entityManager();
        TypedQuery<ComentarioAlbum> q = em.createQuery("SELECT o FROM ComentarioAlbum AS o WHERE o.album = :album", ComentarioAlbum.class);
        q.setParameter("album", album);
        return q;
    }
    
}
