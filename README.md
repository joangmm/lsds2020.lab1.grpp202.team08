Abel Flores		U150282	 205927
Joan García		U149945	 205331
Ramon Vallès	U149943	 205419

#LAB 1


Nota: Nosotros hemos ejecutado nuestro código de la siguiente forma:
java -jar lab1.jar hu output-hu.txt lsds2019-lab1 Eurovision3.json Eurovision4.json Eurovision5.json Eurovision6.json Eurovision7.json Eurovision8.json Eurovision9.json Eurovision10.json
y no como se especificaba en la práctica.

##BENCHMARKING

Para hacer los tests de benchmarking, ejecutaremos nuestro código 3 veces. En la primera, filtraremos por el lenguaje húngaro los ficheros Eurovision3, Eurovision4, (…), Eurovision 10.
En la segunda iteración, haremos lo mismo pero para tweets que estén escritos en español. Y en la tercera ejecución, para el lenguaje portugués.

###Filtrado de tweets con lenguaje húngaro

Formato: (Nombre del Fichero) →  (Número de tweets que aparecen con lenguaje “hu”)

Fichero Eurovision3.json 	→  	Número total de tweets: 37
Fichero Eurovision4.json 	→  	Número total de tweets: 227
Fichero Eurovision5.json 	→  	Número total de tweets: 116
Fichero Eurovision6.json 	→  	Número total de tweets: 244
Fichero Eurovision7.json 	→  	Número total de tweets: 171
Fichero Eurovision8.json 	→  	Número total de tweets: 142
Fichero Eurovision9.json 	→  	Número total de tweets: 19
Fichero Eurovision10.json 	→ 	Número total de tweets: 101

Tiempo total de computación: 168135 ms → 168,1 segundos.

###Filtrado de tweets con lenguaje español

Formato: (Nombre del Fichero) →  (Número de tweets que aparecen con lenguaje “es”)

Fichero Eurovision3.json 	→  	Número total de tweets: 23848
Fichero Eurovision4.json 	→  	Número total de tweets: 78433
Fichero Eurovision5.json 	→  	Número total de tweets: 45800
Fichero Eurovision6.json 	→  	Número total de tweets: 71677
Fichero Eurovision7.json 	→  	Número total de tweets: 54969
Fichero Eurovision8.json 	→  	Número total de tweets: 38805
Fichero Eurovision9.json 	→  	Número total de tweets: 26244
Fichero Eurovision10.json 	→ 	Número total de tweets: 169659

Tiempo total de computación: 287508ms → 287,5 segundos.

###Filtrado de tweets con lenguaje portugués

Formato: (Nombre del Fichero) →  (Número de tweets que aparecen con lenguaje “pt”)

Fichero Eurovision3.json 	→  	Número total de tweets: 624
Fichero Eurovision4.json 	→  	Número total de tweets: 2663
Fichero Eurovision5.json 	→  	Número total de tweets: 1726
Fichero Eurovision6.json 	→  	Número total de tweets: 2370
Fichero Eurovision7.json 	→  	Número total de tweets: 4114
Fichero Eurovision8.json 	→  	Número total de tweets: 5999
Fichero Eurovision9.json 	→  	Número total de tweets: 3611
Fichero Eurovision10.json 	→ 	Número total de tweets: 16516

Tiempo total de computación: 197673ms →197,7 segundos.


Dificultades al computar el número de tweets? Computar el número de tweets ha sido sencillo, la dificultad ha estado en diseñar correctamente las clases.
