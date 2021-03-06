// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Grupo;
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

privileged aspect Grupo_Roo_Entity {
    
    declare @type: Grupo: @Entity;
    
    @PersistenceContext
    transient EntityManager Grupo.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Grupo.id;
    
    @Version
    @Column(name = "version")
    private Integer Grupo.version;
    
    public Long Grupo.getId() {
        return this.id;
    }
    
    public void Grupo.setId(Long id) {
        this.id = id;
    }
    
    public Integer Grupo.getVersion() {
        return this.version;
    }
    
    public void Grupo.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Grupo.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Grupo.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Grupo attached = Grupo.findGrupo(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Grupo.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Grupo.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Grupo Grupo.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Grupo merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Grupo.entityManager() {
        EntityManager em = new Grupo().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Grupo.countGrupoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Grupo o", Long.class).getSingleResult();
    }
    
    public static List<Grupo> Grupo.findAllGrupoes() {
        return entityManager().createQuery("SELECT o FROM Grupo o", Grupo.class).getResultList();
    }
    
    public static Grupo Grupo.findGrupo(Long id) {
        if (id == null) return null;
        return entityManager().find(Grupo.class, id);
    }
    
    public static List<Grupo> Grupo.findGrupoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Grupo o", Grupo.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
