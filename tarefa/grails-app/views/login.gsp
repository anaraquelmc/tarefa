<%@ page import="locacar.Usuario" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Login</title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
    </head>
    <body>
        <div class="body">
            <h1>Login</h1>
            <g:if test="${flash.message}">
            	<div class="message">${flash.message}</div>
            </g:if>
            <g:form controller="usuario" action="logon" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label>Login</label>
                                </td>
                                <td valign="top">
                                    <g:textField name="login" value="${params.login}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label>Senha</label>
                                </td>
                                <td valign="top">
                                    <g:passwordField name="senha" value="" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:submitButton class="save" name="ok" value="OK" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
