// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.umbook.web;

import com.umbook.server.domain.Solicitud;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

privileged aspect SolicitudController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String SolicitudController.create(@Valid Solicitud solicitud, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("solicitud", solicitud);
            return "solicituds/create";
        }
        uiModel.asMap().clear();
        solicitud.persist();
        return "redirect:/solicituds/" + encodeUrlPathSegment(solicitud.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String SolicitudController.createForm(Model uiModel) {
        uiModel.addAttribute("solicitud", new Solicitud());
        return "solicituds/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String SolicitudController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("solicitud", Solicitud.findSolicitud(id));
        uiModel.addAttribute("itemId", id);
        return "solicituds/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String SolicitudController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("solicituds", Solicitud.findSolicitudEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Solicitud.countSolicituds() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("solicituds", Solicitud.findAllSolicituds());
        }
        return "solicituds/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String SolicitudController.update(@Valid Solicitud solicitud, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("solicitud", solicitud);
            return "solicituds/update";
        }
        uiModel.asMap().clear();
        solicitud.merge();
        return "redirect:/solicituds/" + encodeUrlPathSegment(solicitud.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String SolicitudController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("solicitud", Solicitud.findSolicitud(id));
        return "solicituds/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String SolicitudController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Solicitud.findSolicitud(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/solicituds";
    }
    
    @ModelAttribute("solicituds")
    public Collection<Solicitud> SolicitudController.populateSolicituds() {
        return Solicitud.findAllSolicituds();
    }
    
    String SolicitudController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
