package locacar

class RedirectTagLib {

	def redirectMainPage = {
		if (session?.usuario) {
			response.sendRedirect("${request.contextPath}/index-grails.gsp")
		} else {
			response.sendRedirect("${request.contextPath}/login.gsp")
		}
	}

}
