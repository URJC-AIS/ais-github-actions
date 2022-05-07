# AIS-Practica-3-2022

Autor(es): Guillermo Fernández-Pablo Herrezuelo

Repositorio : https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022

Aplicación Heroku : https://app-guillermofpabloh.herokuapp.com/

## Desarrollo con GitFlow

Una vez creados los workflows y funcionando estos, pasamos a crear la nueva funcionalidad utilizando GitFlow:
```
$ git flow init -d
```
Ahora, una vez creada la rama develop y situados en ella, pasaremos a crear una rama feature para añadir en esta la nueva funcionalidad:
```
$ git checkout -b feature/agregarCampoDirector
```
A continuación, en local,  añadimos un campo nuevo a la clase Film en el código java. Hacemos un pull_request a la rama feature.
```
$ git add .
```
$ git commit -m "Se ha agregado el campo director"
```
$ git push
```
Al hacer un pull request hacia develop, se ejecuta el Workflow que comprende al 1 al 4 de la propia práctica (correspondería al Workflow1)
https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2286976675

Después, realizamos un merge con la rama de integración (develop)
```
$ git merge develop
```
Se ejecuta el segundo Workflow, ya que se están realizando cambios en develop.
https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2286979237

Ahora creamos una rama release en la que se comprueba el correcto funcionamiento y nos movemos a ella.
```
$ git checkout -b release/0.1
```
https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2286987483

Situados en release/0.1, creamos un fichero .txt en el que especificamos la versión. Esto hace que salte el workflow 4 (comprendido en el 1y4), debido a
un commit en una release.
https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2286992179

Procedemos después a mergear los cambios en release con la rama master. Esto hace que se ejecute el Workflow5; desplegando así la app actualizada en Heroku
(su link está al comienzo del Markdown).
https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2286995602
Este workflow también publica la imagen en DockerHub cuyo enlace es este:
https://hub.docker.com/layers/209355714/pahezo/nitflex/0.1.0/images/sha256-77ee964d66f299cca999702243ad9d9ddcbfdd5157957afcecacc41bdcf9ca85?context=repo

Por último, pasamos los cambios a develop para tener la rama al día. Esto desencadena tanto el Workflow2 como el 1y4, ya que se está haciendo un commit en develop 
y se está haciendo hacia esta misma rama un pull request.

https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2287005058

https://github.com/pahezo/ais-g.fernandezj-p.herrezuelo-urjc-2022/actions/runs/2287005399

