// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.web;

import com.umbook.server.domain.Amistad;
import com.umbook.server.domain.Comentario;
import com.umbook.server.domain.Publicacion;
import com.umbook.server.domain.Usuario;
import com.umbook.shared.domain.Generos;
import com.umbook.shared.domain.Roles;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect UsuarioController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String UsuarioController.create(@Valid Usuario usuario, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("usuario", usuario);
            return "usuarios/create";
        }
        uiModel.asMap().clear();
        usuario.persist();
        return "redirect:/usuarios/" + encodeUrlPathSegment(usuario.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String UsuarioController.createForm(Model uiModel) {
        uiModel.addAttribute("usuario", new Usuario());
        return "usuarios/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String UsuarioController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("usuario", Usuario.findUsuario(id));
        uiModel.addAttribute("itemId", id);
        return "usuarios/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String UsuarioController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("usuarios", Usuario.findUsuarioEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Usuario.countUsuarios() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("usuarios", Usuario.findAllUsuarios());
        }
        return "usuarios/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String UsuarioController.update(@Valid Usuario usuario, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("usuario", usuario);
            return "usuarios/update";
        }
        uiModel.asMap().clear();
        usuario.merge();
        return "redirect:/usuarios/" + encodeUrlPathSegment(usuario.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String UsuarioController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("usuario", Usuario.findUsuario(id));
        return "usuarios/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String UsuarioController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Usuario.findUsuario(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/usuarios";
    }
    
    @ModelAttribute("amistads")
    public Collection<Amistad> UsuarioController.populateAmistads() {
        return Amistad.findAllAmistads();
    }
    
    @ModelAttribute("comentarios")
    public Collection<Comentario> UsuarioController.populateComentarios() {
        return Comentario.findAllComentarios();
    }
    
    @ModelAttribute("publicacions")
    public Collection<Publicacion> UsuarioController.populatePublicacions() {
        return Publicacion.findAllPublicacions();
    }
    
    @ModelAttribute("usuarios")
    public Collection<Usuario> UsuarioController.populateUsuarios() {
        return Usuario.findAllUsuarios();
    }
    
    @ModelAttribute("generoses")
    public Collection<Generos> UsuarioController.populateGeneroses() {
        return Arrays.asList(Generos.class.getEnumConstants());
    }
    
    @ModelAttribute("roleses")
    public Collection<Roles> UsuarioController.populateRoleses() {
        return Arrays.asList(Roles.class.getEnumConstants());
    }
    
    String UsuarioController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
