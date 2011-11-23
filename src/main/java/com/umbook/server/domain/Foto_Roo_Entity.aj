// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Foto;
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

privileged aspect Foto_Roo_Entity {
    
    declare @type: Foto: @Entity;
    
    @PersistenceContext
    transient EntityManager Foto.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Foto.id;
    
    @Version
    @Column(name = "version")
    private Integer Foto.version;
    
    public Long Foto.getId() {
        return this.id;
    }
    
    public void Foto.setId(Long id) {
        this.id = id;
    }
    
    public Integer Foto.getVersion() {
        return this.version;
    }
    
    public void Foto.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Foto.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Foto.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Foto attached = Foto.findFoto(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Foto.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Foto.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Foto Foto.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Foto merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Foto.entityManager() {
        EntityManager em = new Foto().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Foto.countFotoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Foto o", Long.class).getSingleResult();
    }
    
    public static List<Foto> Foto.findAllFotoes() {
        return entityManager().createQuery("SELECT o FROM Foto o", Foto.class).getResultList();
    }
    
    public static Foto Foto.findFoto(Long id) {
        if (id == null) return null;
        return entityManager().find(Foto.class, id);
    }
    
    public static List<Foto> Foto.findFotoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Foto o", Foto.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
