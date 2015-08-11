package tarefa

class Tarefa {
	String nome
	Date deadline
	static belongsTo = [categoria: Categoria]
	Boolean completada
    static constraints = {
    }
	static mapping={
    sort deadline: "desc"
}
	
}
