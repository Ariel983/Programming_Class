// ----> MAPAS
//     --> Tambien conocidos como diccionarios.
// se representan de la siguiente manera
//              Map[k,v]
// k --> claves --> es cadena
// v --> valor  --> es entero

Map(("apples",3),("orange",2), ("pears", 0))

Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)

// convertir una lista de tuplas la un Map.
List(("apples",3),("orange",2), ("pears", 0)).toMap
List("apples" -> 3, "oranges" -> 2, "pears" -> 0).toMap

// Map en Mapas
// Funciones

val Fruits = Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)
/*
Fruits.map(data => data match {
  case fruit, count => count * 2
})
*/

Fruits.map{case (fruit, count) => count * 2}

Fruits.map{case (fruit, count) => (fruit, count * 2)}

Fruits.map{case (fruit, count) => (fruit, count, count * 2)}.map{case (fruit,_, count2) => (fruit,count2 / 2)}.toMap


//filter en Mapas
Fruits.filter{case (fruit, count) => count > 0}

// group by
// reorganiza una secuencia de mapas

Seq("wombat", "xanthan", "yogurt", "zebra").
  groupBy(s => if(s startsWith "y") 1 else 2)


List(1, 2, 3, 4, 5).groupBy(k => k%3)













