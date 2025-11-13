## 1. Health EP
Se trabaja sobre el EP de /health y se genera el archivo global para las rutas.
Se considera la estructura para seguir escalando los servicios.

Date: Viernes 7 2025
Branch: feat/init-check-ep

## 2. CheckStyle y Spotbugs
Se agrega los plugins de checkstyle y spotbugs.

Checkstyle: mvn checkstyle:checkstyle
PMD: mvn pmd:check
SpotBugs: mvn spotbugs:check

Verificar de manera local: mvn verify

Date: Viernes 7 2025
Branch: ci/workflows

## 3. Comentarios en controladores
Se genera la documentacion a traves de el comendo: mvn javadoc:javadoc

Date: Jueves 13 Noviembre 2025
Branch: feat/javadoc-init

## 4. EP: Usuarios
Se genera el EP para los usuarios y su registro

Date: Jueves 13 Noviembre 2025
Branch: feat/users-ep
