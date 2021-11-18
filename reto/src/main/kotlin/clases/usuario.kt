import clases.curso

open class usuario (val Nombre: String, val Apellido: String, var Email: String) {



    open fun login() {
            println("Te has logeado en el campus virtual, ${Nombre}")

    }

    open fun acceder (Curso: curso){

        println("Has accedido a ${Curso.nombreCurso}")

    }
}

