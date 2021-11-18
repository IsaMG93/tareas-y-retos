
import clases.Instructor
import clases.curso
import clases.estudiante
import clases.adm

fun main(args: Array<String>) {


    val estudiante1 = estudiante(1,"Federico","Fellini","feli@hotmail.com")
    val estudiante2 = estudiante(2,"Jane","Campion", "jani@hotmail.com")
    val estudiante3 = estudiante (5,"Steven", "Spielberg", "sti@hotmail.com")
    val instructor1 = Instructor ("Geografia", "John", "Ford", "joni@hotmail.com")
    val instructor2 = Instructor("Matemáticas", "Jennifer", "Kent", "jeni@hotmail.com")

    val Geografia = curso("Geografia",1,2,estudiante1,estudiante2)
    val Matemáticas = curso("Matemáticas",1,3,estudiante1,estudiante3)
    val administrador1 = adm(1234,"Luis","Lais", "le")

    administrador1.añadirUsuario(estudiante1)
    println("----------")
    administrador1.añadirUsuario(estudiante2)
    println("----------")
    administrador1.añadirUsuario(estudiante3)
    println("----------")
    administrador1.añadirUsuario(instructor1)
    println("----------")
    administrador1.añadirUsuario(instructor2)
    println("----------")
    administrador1.imprimirBaseDatos()
    println("")
    println("/////////")
    println("")
    estudiante1.login()
    println("----------")
    estudiante1.acceder(Geografia)
    println("----------")
    val tarea : String = estudiante1.entregarTarea()
    //INPUT!!!
    println("----------")
    instructor1.acceder(Geografia)
    println("----------")
    instructor1.corregirTarea(tarea)
    //INPUT!!!
    println("----------")
    Geografia.listaEstudiantes()
    println("/////////")



    estudiante3.login()
    println("----------")
    estudiante3.acceder(Matemáticas)
    println("----------")
    val tarea2 : String = estudiante3.entregarTarea()
    //INPUT!!!
    println("----------")
    instructor2.acceder(Matemáticas)
    println("----------")
    instructor2.corregirTarea(tarea2)
    //INPUT!!!
    println("----------")
    Matemáticas.listaEstudiantes()

}


