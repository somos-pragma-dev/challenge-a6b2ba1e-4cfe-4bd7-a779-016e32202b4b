# Diseño y Desarrollo de una API REST para Gestión de Productos y Pedidos

El sistema empresarial debe gestionar productos y pedidos en un e-commerce, incluyendo autenticación y autorización basada en JWT, documentación automática con OpenAPI, y pruebas unitarias y de integración. El sistema debe ser escalable, seguro y mantener un alto nivel de calidad de código.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Arquitectura y Modelado de Datos

**Objetivo:** Definir la arquitectura del sistema y modelar las entidades Product, Order y Customer.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Diseñar una arquitectura en capas con controladores REST, servicios de negocio y repositorios JPA.
- Modelar las entidades Product, Order y Customer usando relaciones OneToMany y ManyToMany.

**Entregable:** Diagrama de arquitectura y modelos de entidades.

<details>
<summary>Pistas de conocimiento</summary>

- Principios de arquitectura en capas.
- Relaciones entre entidades en Hibernate.

</details>

### Fase 2: Autenticación y Autorización

**Objetivo:** Implementar autenticación y autorización basada en JWT con Spring Security.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Configurar Spring Security para autenticación y autorización basada en JWT.
- Definir roles de ADMIN y USER con acceso diferenciado por endpoint.

**Entregable:** Configuración de Spring Security y endpoints protegidos.

<details>
<summary>Pistas de conocimiento</summary>

- Configuración de Spring Security.
- Uso de JWT para autenticación.

</details>

### Fase 3: Documentación y Manejo de Errores

**Objetivo:** Documentar la API usando OpenAPI y manejar errores de forma centralizada.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar OpenAPI 3.0 y Swagger UI para documentación automática.
- Implementar manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON.

**Entregable:** Documentación de la API y manejo de errores centralizado.

<details>
<summary>Pistas de conocimiento</summary>

- Configuración de OpenAPI y Swagger UI.
- Uso de @ControllerAdvice para manejo de errores.

</details>

### Fase 4: Validación de Entradas y Pruebas

**Objetivo:** Validar entradas y escribir pruebas unitarias y de integración.

**Tiempo estimado:** 10 horas

**Instrucciones:**

- Validar entradas usando Bean Validation con @Valid, @NotNull y @Size.
- Escribir pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%.
- Escribir pruebas de integración con @SpringBootTest verificando los flujos principales.

**Entregable:** Validación de entradas y pruebas unitarias e de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Uso de Bean Validation.
- Escribir pruebas unitarias y de integración.

</details>

### Fase 5: Containerización y Despliegue

**Objetivo:** Containerizar la aplicación con Docker y optimizar el Dockerfile para producción.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Crear un Dockerfile multi-stage optimizado para producción.
- Containerizar la aplicación y asegurar que esté lista para despliegue.

**Entregable:** Dockerfile y aplicación containerizada.

<details>
<summary>Pistas de conocimiento</summary>

- Creación de Dockerfiles multi-stage.
- Optimización de Dockerfiles para producción.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una arquitectura en capas y por qué es importante en un sistema empresarial?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización en un sistema y cómo se implementa con Spring Security?
- **comoSeUsa**: ¿Cómo se usa OpenAPI y Swagger UI para documentar una API y por qué es importante?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una autenticación y autorización y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una API REST y cómo se pueden tomar de manera efectiva?

## Criterios de Evaluacion

- Definición clara de la arquitectura en capas y modelado de datos.
- Implementación correcta de autenticación y autorización basada en JWT.
- Documentación completa de la API usando OpenAPI y Swagger UI.
- Manejo centralizado de errores con respuestas estandarizadas.
- Validación de entradas y pruebas unitarias y de integración.
- Containerización de la aplicación con Docker y optimización del Dockerfile para producción.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
