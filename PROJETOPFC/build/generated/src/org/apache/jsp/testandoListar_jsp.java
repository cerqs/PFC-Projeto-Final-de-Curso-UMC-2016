package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import modelos.Produto;

public final class testandoListar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!-- HTML5 Boilerplate -->\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\n");
      out.write("        <title>Virtual Book</title>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"cleartype\" content=\"on\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/favicon.ico\">\n");
      out.write("        <meta name=\"MobileOptimized\" content=\"320\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"js/jquery-1.7.2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\"type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/validacaoLogin.js\"type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Stylesheets -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ListarLivro.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/html5reset.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/col.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/2cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/3cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/4cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/5cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/6cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/7cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/8cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/9cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/10cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/11cols.css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/12cols.css\" media=\"all\">\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"scripts/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            table#t01 tr:nth-child(even) {\n");
      out.write("                background-color:#c5b8fc;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table#t01 tr:nth-child(odd) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body { padding:2em; font : 100%/1.4 'Helvetica Neue', arial, helvetica, helve, sans-serif;\n");
      out.write("            }\n");
      out.write("            h1 { font-size:2.2em; padding:0 0 .5em 0; }\n");
      out.write("            h2 { font-size:1.5em; }\n");
      out.write("            .header { padding:1em 0; }\n");
      out.write("            /*\n");
      out.write("            .col { background: #ccc; padding:1em 0; text-align:center;}\n");
      out.write("            */\n");
      out.write("            #background-layout{background:url(image/livros.jpg);\n");
      out.write("                               background-size:300%;}\n");
      out.write("            /*                            #formCadastrarLivro{\n");
      out.write("                                        background:url(image/textura-input.jpg);\n");
      out.write("                                        background-size:100%;\n");
      out.write("                                        opacity:0,9;\n");
      out.write("                                        border-radius:30px 30px 30px 30px;\n");
      out.write("                                    }*/\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"ControleProduto\" method=\"post\">\n");
      out.write("        <input type=\"text\" class=\"input2\" placeholder=\"Consultar Livro pelo isbn\" required=\"required\" name=\"txtIsbn\">\n");
      out.write("        <input type=\"submit\" class=\"submitCadastrarLivroPesquisar\" name=\"acao\" value=\"consultar\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"background-layout\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        String msgNaoExisteIsbn = (String) request.getAttribute("msgNaoExisteIsbn");
        if (msgNaoExisteIsbn != null) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <font id=\"MsgNaoExiste\" color=\"red\">  ");
      out.print(msgNaoExisteIsbn);
      out.write("</font>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        String msgPdfComSucesso = (String) request.getAttribute("msgPdfComSucesso");
        if (msgPdfComSucesso != null) {
    
      out.write("\n");
      out.write("\n");
      out.write("    <font id=\"MsgNaoExiste\" color=\"red\">  ");
      out.print(msgPdfComSucesso);
      out.write("</font>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        ArrayList<Produto> listaProduto = (ArrayList<Produto>) request.getAttribute("listaProduto");
        if (listaProduto == null) {

            request.getRequestDispatcher("/ControleProduto?acao=Listar").forward(request, response);
        }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav id=\"nav\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"current\"><form action=\"InserirPdf.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"submit\" class=\"submitCadastrarLivro\" name=\"acao\" value=\"Cadastrar\">\n");
      out.write("                </form></li>\n");
      out.write("            <li>\n");
      out.write("            <li><form action=\"testandoUmaTelaPrincipal.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"submit\" class=\"submitCadastrarLivro\" name=\"acao\" value=\"principal\">\n");
      out.write("                </form></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--- Sistema de Grid, não alterar --->\n");
      out.write("\n");
      out.write("    <div class=\"section group\">\n");
      out.write("        <div class=\"col span_1_of_2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col span_1_of_2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <span id=\"msg\"></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <form action=\"ControleProduto\" method=\"post\">\n");
      out.write("        <label>Ordenar por:</label>\n");
      out.write("        <select id=\"opcoes3\"  name=\"cars\">\n");
      out.write("            <option value=\"titulo\">Título</option>\n");
      out.write("            <option value=\"data\">Data</option>\n");
      out.write("            <option value=\"preco\">Preço</option>\n");
      out.write("        </select>\n");
      out.write("        <input id=\"opcoes3\" type=\"submit\" value=\"Listar\"  name=\"acao\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"section group\">\n");
      out.write("            <div class=\"col span_1_of_2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form id=\"formCadastrarLivro\" action=\"ControleProduto\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"box-inputs\">\n");
      out.write("                        <caption> <h1 id=\"cabecalho\">Livros cadastrados: </h1> </caption>\n");
      out.write("                        <table border=\"1\" width=\"1010px\" class=\"borda\" id=\"t01\">\n");
      out.write("\n");
      out.write("                            <thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th width=\"150px\">Isbn</th>\n");
      out.write("                                    <th width=\"280px\">Titulo</th>\n");
      out.write("                                    <th width=\"180px\">Autor</th>\n");
      out.write("                                    <th width=\"110px\">Preço</th>\n");
      out.write("                                    <th width=\"120px\">Lançamento</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
  
                                SimpleDateFormat formatoDesejado = new SimpleDateFormat("dd/MM/yyyy");
                                String dataFormatada = null;
                                DecimalFormat df = new DecimalFormat("###,##0.00");
                                
                                for (Produto p : listaProduto) {
                                    
                                dataFormatada = formatoDesejado.format(p.getLancamento());

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td> ");
      out.print( p.getIsbn());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( p.getTitulo());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print( p.getAutor());
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(df.format(p.getPreco()));
      out.write(" </td>\n");
      out.write("                                <td> ");
      out.print(dataFormatada);
      out.write(" </td>\n");
      out.write("\n");
      out.write("                                <td width=\"79px\"> <a\n");
      out.write("                                        href=\"ControleProduto?acao=AtualizarLivro&isbn=");
      out.print(p.getIsbn());
      out.write("\">\n");
      out.write("                                        <button type=\"button\" id=\"opcoes2\" onclick=\"alert('Altere somente os dados necessários')\" title=\"Editar item\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\" style=\"font-size:19px\"></i></button></td>\n");
      out.write("\n");
      out.write("                                <td width=\"79px\"> <a\n");
      out.write("                                        href=\"ControleProduto?acao=Deletar&isbn=");
      out.print(p.getIsbn());
      out.write("\">\n");
      out.write("                                        <button type=\"button\" id=\"opcoes\" onclick=\"alert('Certifique-se que este é o livro que deseja excluir')\" title=\"Excluir item\"><i class=\"fa fa-trash-o\" style=\"font-size:19px\"></i></button></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
