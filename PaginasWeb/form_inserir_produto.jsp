<%-- 
    Document   : form_inserir_produto
    Created on : 21/09/2020, 03:13:17
    Author     : guest
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     
        <h1>Novo Produto</h1>
        <form name="inserir_produto" action="inserir_produto.do" method="post">
            Cnpj:<input type="text" name="cnpj" size="30" required /><br/>
            Razão Social:<input type="text" name="razao_social" size="30" required/><br/>
            Nome:<input type="text" name="nome_fantasia" size="30" required/><br/>
            Endereço:<input type="text" name="endereco" size="30" required/><br/>
            Telefone:<input type="text" name="telefone" size="30" required/><br/>
            Fax:<input type="text" name="fax" size="30" required/><br/>
            <input type="submit" value="Salvar"/>
        </form>        
        
        
        
    </body>
</html>
