// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.server.domain;

import com.umbook.server.domain.Notificacion;
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

privileged aspect Notificacion_Roo_Entity {
    
    declare @type: Notificacion: @Entity;
    
    @PersistenceContext
    transient EntityManager Notificacion.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Notificacion.id;
    
    @Version
    @Column(name = "version")
    private Integer Notificacion.version;
    
    public Long Notificacion.getId() {
        return this.id;
    }
    
    public void Notificacion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Notificacion.getVersion() {
        return this.version;
    }
    
    public void Notificacion.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Notificacion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Notificacion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Notificacion attached = Notificacion.findNotificacion(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Notificacion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Notificacion.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Notificacion Notificacion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Notificacion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Notificacion.entityManager() {
        EntityManager em = new Notificacion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Notificacion.countNotificacions() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Notificacion o", Long.class).getSingleResult();
    }
    
    public static List<Notificacion> Notificacion.findAllNotificacions() {
        return entityManager().createQuery("SELECT o FROM Notificacion o", Notificacion.class).getResultList();
    }
    
    public static Notificacion Notificacion.findNotificacion(Long id) {
        if (id == null) return null;
        return entityManager().find(Notificacion.class, id);
    }
    
    public static List<Notificacion> Notificacion.findNotificacionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Notificacion o", Notificacion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
