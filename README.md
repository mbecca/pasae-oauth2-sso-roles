* Se cuenta con 3 proyectos gradle:

	- sarha-oauth2-sso-prototype-authorization: Servidor de authorización. (8081)
	- sarha-oauth2-sso-prototype-resource: Recursos protegidos (repositorios jpa en este prototipo) (8082)
	- sarha-oauth2-sso-prototype-ui: Aplicación web con reactjs (8080)

* Para levantar el backend (Spring Boot Application):

	- Run -> AuthorizationApplication
	- Run -> ResourceApplication
	- Run -> UiApplication

* Para empaquetar el frontend (y copiarlo a src/main/webapp), parado en el proyecto 'sarha-oauth2-sso-prototype-ui' y en la carpeta 'frontend-react', ejecutar: 
	
	npm install
	npm start (ejecuta webpack-dev-server --open, lo cual permite realizar modificaciones en los js y que se 				publiquen automaticamente en el servidor).
	
* El frontend con npm (npm start) levanta en el puerto 8091 y tiene un proxy reverso para pegarle al backend.	
			
* user/passwd para login: mbecca/password
