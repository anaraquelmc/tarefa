<%@ page import="tarefa.Categoria" %>
<div id= "divMensagem"></div>
<g:formRemote name="frmTarefa" url="[controller: 'tarefa', action: 'salvar']" update="divMensagem" onSuccess="carregarLista()">
<div> 
			<label>Tarefa</label> 
			<input type="text" required="required" name="nome" class="large" value="${tarefa.nome}" placeholder="Estudar e programar"
                 maxlength="100"/>
			</div>
			<div>
			<label>Finalizar até</label>
             <input type="date" required="required" name="deadline" class="large" value="${tarefa.deadline?.format('yyyy-MM-dd')}" />
			</div>
				<div>
				<label>Categoria</label> 			
			<g:select optionKey="id" optionValue="nome" name="categoria" from="${Categoria.list()}"  noSelection="${['null':'Selecione uma Categoria']}" value="${tarefa.categoria?.id}" />
	</div>	
	<div>	
	<br>	
  <input type="submit" class="button" name="btnSalvarTarefa" id="saveTask" value="Salvar" />
      <input type="reset" class="button" name="btnLimparTarefa" id="clearTask" value="Limpar" />
</div>
</g:formRemote>
