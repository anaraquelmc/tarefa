<footer id="footer">

<g:if test="${tarefas.size() > 0}">

<h3>Você tem ${tarefas.size()} tarefa.</h3>
</g:if>
<g:else>
  <h3> </h3>Você não possui tarefas inseridas!</h3>
</g:else>

 </footer>
  