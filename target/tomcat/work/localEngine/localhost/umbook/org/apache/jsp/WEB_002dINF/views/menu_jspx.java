package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_005fmenu_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_menu_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_005fmenu_005f0 = new org.apache.jsp.tag.web.menu.menu_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fmenu_005f0);
    _jspx_th_menu_005fmenu_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/menu.jspx(5,60) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu_005f0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    // /WEB-INF/views/menu.jspx(5,60) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu_005f0.setId("_menu");
    _jspx_th_menu_005fmenu_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_menu_005fmenu_005f0, null));
    _jspx_th_menu_005fmenu_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f0 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f0);
    _jspx_th_menu_005fcategory_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(6,86) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f0.setZ("4yCtmkBjN+9BEbAlLAfkOlEB4j4=");
    // /WEB-INF/views/menu.jspx(6,86) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f0.setId("c_comentariopublicacion");
    _jspx_th_menu_005fcategory_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_menu_005fcategory_005f0, null));
    _jspx_th_menu_005fcategory_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f0 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f0);
    _jspx_th_menu_005fitem_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(7,156) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setZ("gW4LpVa8EBu1M8THEaAoJejwwDQ=");
    // /WEB-INF/views/menu.jspx(7,156) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setUrl("/comentariopublicacions?form");
    // /WEB-INF/views/menu.jspx(7,156) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(7,156) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setId("i_comentariopublicacion_new");
    _jspx_th_menu_005fitem_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f1 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f1);
    _jspx_th_menu_005fitem_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(8,207) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setZ("tDTMrEmoE8nsG41oW1v49wpdoU4=");
    // /WEB-INF/views/menu.jspx(8,207) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/comentariopublicacions?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(8,207) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(8,207) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setId("i_comentariopublicacion_list");
    _jspx_th_menu_005fitem_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f1 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f1);
    _jspx_th_menu_005fcategory_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(10,76) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f1.setZ("qAqJ7U0pUSMU/iq1gPpJci9TeKQ=");
    // /WEB-INF/views/menu.jspx(10,76) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f1.setId("c_publicacion");
    _jspx_th_menu_005fcategory_005f1.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_menu_005fcategory_005f1, null));
    _jspx_th_menu_005fcategory_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f2 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f2);
    _jspx_th_menu_005fitem_005f2.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(11,136) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setZ("f5/4xuDvCPHh8hX1VW2Renec/9A=");
    // /WEB-INF/views/menu.jspx(11,136) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setUrl("/publicacions?form");
    // /WEB-INF/views/menu.jspx(11,136) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(11,136) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setId("i_publicacion_new");
    _jspx_th_menu_005fitem_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f3 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f3);
    _jspx_th_menu_005fitem_005f3.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(12,187) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setZ("d1LOYL+nY7tilQHeUujz+Th2DbE=");
    // /WEB-INF/views/menu.jspx(12,187) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/publicacions?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(12,187) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(12,187) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setId("i_publicacion_list");
    _jspx_th_menu_005fitem_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f3);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.AuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.AuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.AuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(14,50) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f0.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_menu_005fcategory_005f2(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_menu_005fcategory_005f3(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_sec_005fauthorize_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f2 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f2);
    _jspx_th_menu_005fcategory_005f2.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f2.setParent(_jspx_th_sec_005fauthorize_005f0);
    // /WEB-INF/views/menu.jspx(15,72) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f2.setZ("9gs84phbGTI5fNMpd5R5OCyVVNo=");
    // /WEB-INF/views/menu.jspx(15,72) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f2.setId("c_amistad");
    _jspx_th_menu_005fcategory_005f2.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_menu_005fcategory_005f2, null));
    _jspx_th_menu_005fcategory_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f4 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f4);
    _jspx_th_menu_005fitem_005f4.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f4.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(16,128) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setZ("VS0fMH3284HEZy2NPW92p5lpMkQ=");
    // /WEB-INF/views/menu.jspx(16,128) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setUrl("/amistads?form");
    // /WEB-INF/views/menu.jspx(16,128) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(16,128) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setId("i_amistad_new");
    _jspx_th_menu_005fitem_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f4);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f5 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f5);
    _jspx_th_menu_005fitem_005f5.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(17,179) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setZ("KFipL/Pm8+naVS9nsTvfUIURPXA=");
    // /WEB-INF/views/menu.jspx(17,179) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/amistads?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(17,179) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(17,179) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setId("i_amistad_list");
    _jspx_th_menu_005fitem_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f5);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f3 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f3);
    _jspx_th_menu_005fcategory_005f3.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f3.setParent(_jspx_th_sec_005fauthorize_005f0);
    // /WEB-INF/views/menu.jspx(19,72) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f3.setZ("g6oG0656PcsmmvUYeBtpgiQROck=");
    // /WEB-INF/views/menu.jspx(19,72) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f3.setId("c_usuario");
    _jspx_th_menu_005fcategory_005f3.setJspBody(new Helper( 4, _jspx_page_context, _jspx_th_menu_005fcategory_005f3, null));
    _jspx_th_menu_005fcategory_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f3);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f6 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f6);
    _jspx_th_menu_005fitem_005f6.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f6.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(20,128) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setZ("RG1gCsiZQjg1HLDzXbHKht6yDkw=");
    // /WEB-INF/views/menu.jspx(20,128) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setUrl("/usuarios?form");
    // /WEB-INF/views/menu.jspx(20,128) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(20,128) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setId("i_usuario_new");
    _jspx_th_menu_005fitem_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f6);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f7 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f7);
    _jspx_th_menu_005fitem_005f7.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f7.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(21,179) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setZ("P7ZIPrcTTBR41JYD0QldbYgsZrM=");
    // /WEB-INF/views/menu.jspx(21,179) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/usuarios?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(21,179) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(21,179) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setId("i_usuario_list");
    _jspx_th_menu_005fitem_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f7);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f4 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f4);
    _jspx_th_menu_005fcategory_005f4.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f4.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(24,79) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f4.setZ("PKQtAz0JEzC6jvpRS9z2QHbe+O0=");
    // /WEB-INF/views/menu.jspx(24,79) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f4.setId("c_comentariofoto");
    _jspx_th_menu_005fcategory_005f4.setJspBody(new Helper( 5, _jspx_page_context, _jspx_th_menu_005fcategory_005f4, null));
    _jspx_th_menu_005fcategory_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f4);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f8 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f8);
    _jspx_th_menu_005fitem_005f8.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f8.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(25,143) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setZ("PPbJ/l5VG/2ax/24hj/yDNIG2Kk=");
    // /WEB-INF/views/menu.jspx(25,143) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setUrl("/comentariofotoes?form");
    // /WEB-INF/views/menu.jspx(25,143) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(25,143) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setId("i_comentariofoto_new");
    _jspx_th_menu_005fitem_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f8);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f9 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f9);
    _jspx_th_menu_005fitem_005f9.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f9.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(26,194) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setZ("eqrUgrmuAM+NwWAtPEf2WOXpgDg=");
    // /WEB-INF/views/menu.jspx(26,194) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/comentariofotoes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(26,194) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(26,194) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setId("i_comentariofoto_list");
    _jspx_th_menu_005fitem_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f9);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f5 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f5);
    _jspx_th_menu_005fcategory_005f5.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(28,80) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f5.setZ("5aZ/PRxfLR8dqUExt+idTZqI+D0=");
    // /WEB-INF/views/menu.jspx(28,80) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f5.setId("c_comentarioalbum");
    _jspx_th_menu_005fcategory_005f5.setJspBody(new Helper( 6, _jspx_page_context, _jspx_th_menu_005fcategory_005f5, null));
    _jspx_th_menu_005fcategory_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f5);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f10 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f10);
    _jspx_th_menu_005fitem_005f10.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f10.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(29,144) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setZ("ZD9n31dyfI/J1ZSc7wunf6kaids=");
    // /WEB-INF/views/menu.jspx(29,144) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setUrl("/comentarioalbums?form");
    // /WEB-INF/views/menu.jspx(29,144) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(29,144) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setId("i_comentarioalbum_new");
    _jspx_th_menu_005fitem_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f10);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f11 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f11);
    _jspx_th_menu_005fitem_005f11.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f11.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(30,195) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setZ("v7BXp0s6RSeQpNJYLfUyjrFMl+A=");
    // /WEB-INF/views/menu.jspx(30,195) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/comentarioalbums?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(30,195) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(30,195) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setId("i_comentarioalbum_list");
    _jspx_th_menu_005fitem_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f11);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f6 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f6);
    _jspx_th_menu_005fcategory_005f6.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f6.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(32,70) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f6.setZ("xdbKFwZl252vF+vnwh2Ggid2uoM=");
    // /WEB-INF/views/menu.jspx(32,70) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f6.setId("c_album");
    _jspx_th_menu_005fcategory_005f6.setJspBody(new Helper( 7, _jspx_page_context, _jspx_th_menu_005fcategory_005f6, null));
    _jspx_th_menu_005fcategory_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f6);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f12 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f12);
    _jspx_th_menu_005fitem_005f12.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f12.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(33,124) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setZ("I7xVZsEZPxoS6HbPrVhfjUkSKoI=");
    // /WEB-INF/views/menu.jspx(33,124) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setUrl("/albums?form");
    // /WEB-INF/views/menu.jspx(33,124) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(33,124) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setId("i_album_new");
    _jspx_th_menu_005fitem_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f12);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f13 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f13);
    _jspx_th_menu_005fitem_005f13.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f13.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(34,175) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setZ("uoWP93BbsZYmmEc2xtJNRTa7k0E=");
    // /WEB-INF/views/menu.jspx(34,175) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/albums?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(34,175) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(34,175) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setId("i_album_list");
    _jspx_th_menu_005fitem_005f13.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f13);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f7 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f7);
    _jspx_th_menu_005fcategory_005f7.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f7.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(36,69) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f7.setZ("aTANWuwwmMUf+aRknraLR6EdNbw=");
    // /WEB-INF/views/menu.jspx(36,69) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f7.setId("c_foto");
    _jspx_th_menu_005fcategory_005f7.setJspBody(new Helper( 8, _jspx_page_context, _jspx_th_menu_005fcategory_005f7, null));
    _jspx_th_menu_005fcategory_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f7);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f14 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f14);
    _jspx_th_menu_005fitem_005f14.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f14.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(37,123) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setZ("nUbniQGReiz7/MChbwwT05guYTY=");
    // /WEB-INF/views/menu.jspx(37,123) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setUrl("/fotoes?form");
    // /WEB-INF/views/menu.jspx(37,123) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(37,123) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setId("i_foto_new");
    _jspx_th_menu_005fitem_005f14.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f14);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f15 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f15);
    _jspx_th_menu_005fitem_005f15.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f15.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(38,174) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setZ("qowM48aI+tWyVL3RyRVoA5kUvs8=");
    // /WEB-INF/views/menu.jspx(38,174) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/fotoes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(38,174) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(38,174) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setId("i_foto_list");
    _jspx_th_menu_005fitem_005f15.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f15);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fcategory_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f5(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f6(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f7(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f1(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f3(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f5(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f6(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f7(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f8(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f9(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f10(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f11(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f12(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f13(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f14(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f15(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
            break;
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}