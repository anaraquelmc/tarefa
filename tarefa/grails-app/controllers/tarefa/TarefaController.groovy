package tarefa

import java.awt.List;
import java.text.SimpleDateFormat
class TarefaController {

   def index() {	
	
	def lista = Tarefa.list()		
		render(view:"/tarefa/index", model: [tarefas: lista])
				
		Integer tarefasCompletadas = 0
			Tarefa.getAll().each { tarefa ->
				if (tarefa.completada == true)
					tarefasCompletadas++
					respond Tarefa.list(params), model:[tarefaCount: Tarefa.count(), tarefasCompletadasCount: tarefasCompletadas]
				
    }	
		
    }
   
   def atualizaContagem(){
	   
	   
   }
	
	def adicionar(){
		Tarefa novaTarefa = new Tarefa()
	
		
		render(template:"/tarefa/form", model:[tarefa: novaTarefa])
	
		
		
	}		
	
	def alterar (){
		Tarefa tarefa = Tarefa.get(params.id)
		  render(template:"/tarefa/form", model: [tarefa: tarefa])
	  }
	
	def excluir (){
		Tarefa excluirTarefa = Tarefa.get(params.id)
		  excluirTarefa.delete(flush:true)
	
			def lista = Tarefa.list()
			  render(template:"/tarefa/lista", model: [tarefas: lista])
			 
			  
	  }
	
	def lista (){
		def lista = Tarefa.list()
		  render(template:"/tarefa/lista", model: [tarefas: lista])
	  }
	def salvar (){
		Tarefa tarefa = null
		String formato = "yyyy-MM-dd"
		
		
			if (params.id){
			  tarefa = Tarefa.get(params.id)
			}else{
			  tarefa = new Tarefa()
			  tarefa.categoria = new Categoria()
			}
		
			if (params.deadline){
			  tarefa.deadline = new SimpleDateFormat(formato).parse(params.deadline)
			}
		
			tarefa.nome = params.nome
		
			tarefa.categoria.id = params.categoria.toInteger()
		
			tarefa.completada = false
		
		
			tarefa.validate()
			  if (!tarefa.hasErrors()){
				tarefa.save(flush:true)
				
						render("Gravado")
						
						
					
		}else{
		render(tarefa.errors)
			  }
		  }
	
	
	 def completar (){
		
			Tarefa tarefa = null
			  if (params.id){
				tarefa = Tarefa.get(params.id)
				tarefa.completada = true
				tarefa.save(flush:true)
				render("Tarefa Completa!")
				 }else{
				render(tarefa.errors)	
			  }
		
		  }
}
