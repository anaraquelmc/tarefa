import tarefa.Categoria
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tarefa_tarefa_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tarefa/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(tarefa.nome)
printHtmlPart(2)
expressionOut.print(tarefa.deadline?.format('yyyy-MM-dd'))
printHtmlPart(3)
invokeTag('select','g',15,['optionKey':("id"),'optionValue':("nome"),'name':("categoria"),'from':(Categoria.list()),'noSelection':(['null':'Selecione uma Categoria']),'value':(tarefa.categoria?.id)],-1)
printHtmlPart(4)
})
invokeTag('formRemote','g',22,['name':("frmTarefa"),'url':([controller: 'tarefa', action: 'salvar']),'update':("divMensagem"),'onSuccess':("carregarLista()")],1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1439137209494L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
