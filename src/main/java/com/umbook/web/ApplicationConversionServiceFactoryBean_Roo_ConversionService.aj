// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.web;

import com.umbook.server.domain.Album;
import com.umbook.server.domain.ComentarioAlbum;
import com.umbook.server.domain.ComentarioFoto;
import com.umbook.server.domain.ComentarioPublicacion;
import com.umbook.server.domain.Foto;
import com.umbook.server.domain.Publicacion;
import com.umbook.server.domain.Usuario;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new AlbumConverter());
        registry.addConverter(new ComentarioAlbumConverter());
        registry.addConverter(new ComentarioFotoConverter());
        registry.addConverter(new ComentarioPublicacionConverter());
        registry.addConverter(new FotoConverter());
        registry.addConverter(new PublicacionConverter());
        registry.addConverter(new UsuarioConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.AlbumConverter implements Converter<Album, String> {
        public String convert(Album album) {
            return new StringBuilder().append(album.getNombre()).append(" ").append(album.getDescripcion()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.ComentarioAlbumConverter implements Converter<ComentarioAlbum, String> {
        public String convert(ComentarioAlbum comentarioAlbum) {
            return new StringBuilder().append(comentarioAlbum.getContenido()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.ComentarioFotoConverter implements Converter<ComentarioFoto, String> {
        public String convert(ComentarioFoto comentarioFoto) {
            return new StringBuilder().append(comentarioFoto.getContenido()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.ComentarioPublicacionConverter implements Converter<ComentarioPublicacion, String> {
        public String convert(ComentarioPublicacion comentarioPublicacion) {
            return new StringBuilder().append(comentarioPublicacion.getContenido()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.FotoConverter implements Converter<Foto, String> {
        public String convert(Foto foto) {
            return new StringBuilder().append(foto.getDescripcion()).append(" ").append(foto.getUbicacion()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.PublicacionConverter implements Converter<Publicacion, String> {
        public String convert(Publicacion publicacion) {
            return new StringBuilder().append(publicacion.getContenido()).toString();
        }
        
    }
    
    static class com.umbook.web.ApplicationConversionServiceFactoryBean.UsuarioConverter implements Converter<Usuario, String> {
        public String convert(Usuario usuario) {
            return new StringBuilder().append(usuario.getNombre()).append(" ").append(usuario.getApellido()).append(" ").append(usuario.getCorreo_electronico()).append(" ").append(usuario.getContrasena()).toString();
        }
        
    }
    
}
