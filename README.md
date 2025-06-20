# mmontaldo-commons-jwt

**Biblioteca común para proyectos Spring Boot con soporte de autenticación mediante JWT.**

## ✨ Características

- Autenticación stateless con JWT (JSON Web Token)
- Filtro personalizado de seguridad JWT
- Integración con Spring Security
- Generación y validación de tokens
- Redirección automática de HTTP a HTTPS
- Preparado para su uso como dependencia compartida (GitHub Packages)

## 📦 Instalación desde GitHub Packages

Para utilizar esta librería en otro proyecto Maven:

1. Asegurate de tener configurado tu token personal de GitHub con permisos para `read:packages`.
2. Agregá el siguiente repositorio a tu `pom.xml`:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/m0nt4ld0/mmontaldo-commons</url>
  </repository>
</repositories>
```
Agregá la dependencia:

```xml
<dependency>
  <groupId>com.mmontaldo.commons</groupId>
  <artifactId>mmontaldo-commons</artifactId>
  <version>1.0.0</version>
</dependency>
```
Si usás autenticación en GitHub Packages, agregá estas credenciales en tu ~/.m2/settings.xml:

```xml
<servers>
  <server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_TOKEN</password>
  </server>
</servers>
```
💡 Recomendado: guardá tu token en variables de entorno o un gestor de secretos.

🚀 Cómo usar
Una vez incluida la dependencia, ya podés importar los filtros y configuraciones JWT en tu proyecto principal.

Ejemplo:

```java
import com.mmontaldo.commons.security.jwt.config.JwtAuthenticationFilter;
```

🛠️ Requisitos
Java 17 o superior

Spring Boot 3.x

📄 Licencia
Este proyecto está bajo licencia MIT. Libre para uso y modificación.
