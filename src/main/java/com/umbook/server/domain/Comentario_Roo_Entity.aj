// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Comentario;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Comentario_Roo_Entity {
    
    declare @type: Comentario: @Entity;
    
    @PersistenceContext
    transient EntityManager Comentario.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Comentario.id;
    
    @Version
    @Column(name = "version")
    private Integer Comentario.version;
    
    public Long Comentario.getId() {
        return this.id;
    }
    
    public void Comentario.setId(Long id) {
        this.id = id;
    }
    
    public Integer Comentario.getVersion() {
        return this.version;
    }
    
    public void Comentario.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Comentario.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Comentario.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Comentario attached = Comentario.findComentario(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Comentario.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Comentario.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Comentario Comentario.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Comentario merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Comentario.entityManager() {
        EntityManager em = new Comentario() {
        }.entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Comentario.countComentarios() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Comentario o", Long.class).getSingleResult();
    }
    
    public static List<Comentario> Comentario.findAllComentarios() {
        return entityManager().createQuery("SELECT o FROM Comentario o", Comentario.class).getResultList();
    }
    
    public static Comentario Comentario.findComentario(Long id) {
        if (id == null) return null;
        return entityManager().find(Comentario.class, id);
    }
    
    public static List<Comentario> Comentario.findComentarioEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Comentario o", Comentario.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
