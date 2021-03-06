import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tarefaindex_grails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index-grails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',52,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('meta','g',60,['name':("app.version")],-1)
printHtmlPart(6)
invokeTag('meta','g',61,['name':("app.grails.version")],-1)
printHtmlPart(7)
expressionOut.print(org.codehaus.groovy.runtime.InvokerHelper.getVersion())
printHtmlPart(8)
expressionOut.print(System.getProperty('java.version'))
printHtmlPart(9)
expressionOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(10)
expressionOut.print(grailsApplication.domainClasses.size())
printHtmlPart(11)
expressionOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(12)
expressionOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(13)
invokeTag('set','g',72,['var':("pluginManager"),'value':(applicationContext.getBean('pluginManager'))],-1)
printHtmlPart(14)
for( plugin in (pluginManager.allPlugins) ) {
printHtmlPart(15)
expressionOut.print(plugin.name)
printHtmlPart(16)
expressionOut.print(plugin.version)
printHtmlPart(17)
}
printHtmlPart(18)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(c.fullName)
})
invokeTag('link','g',94,['controller':(c.logicalPropertyName)],3)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1439137214688L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
