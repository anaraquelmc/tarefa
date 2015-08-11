import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tarefa_tarefa_lista_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tarefa/_lista.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (tarefas.size() > 0)) {
printHtmlPart(1)
loop:{
int i = 0
for( tarefa in (tarefas) ) {
printHtmlPart(2)
expressionOut.print(((i % 2) == 0 ? 'even' : 'odd'))
printHtmlPart(3)
expressionOut.print((tarefa.deadline < new Date() - 1 ? 'overdue' : 'null'))
printHtmlPart(3)
expressionOut.print(((((tarefa.deadline.time - (new Date()-1).time) / (24 * 60 * 60 * 1000)) <= 5) &&
							(((tarefa.deadline.time - (new Date()-1).time) / (24 * 60 * 60 * 1000)) >= 0) ? 'warning': 'null'))
printHtmlPart(4)
expressionOut.print(tarefa.completada ? 'taskCompleted': '')
printHtmlPart(5)
expressionOut.print(tarefa.nome)
printHtmlPart(6)
expressionOut.print(tarefa.completada ? 'taskCompleted': '')
printHtmlPart(5)
expressionOut.print(tarefa.deadline.format('dd/MM/yyyy'))
printHtmlPart(6)
expressionOut.print(tarefa.completada ? 'taskCompleted': '')
printHtmlPart(5)
expressionOut.print(tarefa.categoria?.nome)
printHtmlPart(7)
if(true && (!tarefa.completada)) {
printHtmlPart(8)
createClosureForHtmlPart(9, 4)
invokeTag('remoteLink','g',33,['controller':("tarefa"),'action':("alterar"),'update':("frmTarefas"),'id':(tarefa.id),'class':("editRow")],4)
printHtmlPart(10)
createClosureForHtmlPart(11, 4)
invokeTag('remoteLink','g',35,['controller':("tarefa"),'action':("completar"),'update':("completa"),'id':(tarefa.id),'class':("completeRow"),'onSuccess':("carregarLista()")],4)
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(tarefa.id)
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
}
else {
printHtmlPart(16)
}
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1439137208011L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
