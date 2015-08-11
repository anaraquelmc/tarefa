import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tarefa_categoriaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/categoria/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',7,['library':("jquery")],-1)
printHtmlPart(3)
invokeTag('remoteFunction','g',11,['controller':("categoria"),'action':("lista"),'update':("listaCategorias")],-1)
printHtmlPart(4)
invokeTag('remoteFunction','g',15,['controller':("categoria"),'action':("excluir"),'update':("listaCategorias"),'id':("'+id+'")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('render','g',30,['template':("lista"),'model':([categorias: categorias])],2)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('remoteLink','g',35,['controller':("categoria"),'action':("adicionar"),'update':("formCategorias")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',37,['controller':("tarefa"),'action':("index")],2)
printHtmlPart(13)
expressionOut.print(categorias.size())
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1439137207280L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
