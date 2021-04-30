var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")

fun main() {

    println("Lista original = $l1")

    // Filtrado
    val r1  = l1.filter { true }
    println(r1)

    val r2  = l1.filter {
        if(it!="Sergio")
        it.contains("s")
        else
           false
    }
    println("Ejercicio 1: $r2")

    val r3=l1.filter {
        it.length%2==0
    }

    print("Ejercicio 2: $r3 \n")

    val l2 = mutableListOf('a','e','i','o','u')


    val r4=l1.filter {
        var booleano=false

        l2.forEach { c->

            if(it[0].toLowerCase().equals(c))
                booleano=true

        }
        if (booleano)
        it.length>6
        else
            false
    }

    print("Ejercicio 3: $r4 \n")

    val r5=l1.filter {

        var contador=0
        it.forEach { c->

            l2.forEach { v->

               if(c.toLowerCase() == v){
                   contador++
                   print("----------------------------")
               }
                print("El string ${c.toLowerCase()} y la vocal $v \n")


            }


        }

        contador>=3
        }

    print("Ejercicio 4: $r5 \n")

    }


    // Ej1: Busca a todas las personas que no se llaman Sergio pero que tienen una "s" en su nombre.
    // Ej2: Busca a todas las personas cuyo nombre tiene un número de letras par.
    // Ej3: Busca a todas las personas cuyo nombre tiene un número de letras superior a 6 y que su nombre empieza por vocal.
    // Ej4: Busca a todas las personas cuyo nombre tiene que tengan más de 3 vocales distintas.

    // Orden


//}