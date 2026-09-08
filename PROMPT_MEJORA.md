# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Desarrollar una API REST empresarial con Spring Boot 3 para la gestión de productos y pedidos en un e-commerce. El sistema debe incluir: arquitectura en capas con controladores REST, servicios de negocio y repositorios JPA; modelado de datos con entidades Product, Order y Customer usando relaciones OneToMany y ManyToMany con Hibernate; autenticación y autorización basada en JWT con Spring Security, incluyendo roles de ADMIN y USER con acceso diferenciado por endpoint; documentación automática con OpenAPI 3.0 y Swagger UI accesible en /api-docs; manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON; validación de entradas con Bean Validation usando @Valid, @NotNull y @Size; paginación y ordenamiento de resultados en los endpoints de listado usando Pageable; pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%; pruebas de integración con @SpringBootTest verificando los flujos principales; y containerización con Docker usando Dockerfile multi-stage optimizado para producción. El desarrollador debe implementar el módulo completo desde la capa de persistencia hasta los controladores REST, aplicando principios SOLID y clean code en cada capa.

### Reto
- Tema: Arquitectura Empresarial con Spring Boot
- Seniority: advanced-l2
- Tipo: practical
- Título: Diseño y Desarrollo de una API REST para Gestión de Productos y Pedidos
- Tiempo estimado: 40 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Arquitectura y Modelado de Datos — objetivo: Definir la arquitectura del sistema y modelar las entidades Product, Order y Customer. — entregable (NO resolver): Diagrama de arquitectura y modelos de entidades.
- Fase 2: Autenticación y Autorización — objetivo: Implementar autenticación y autorización basada en JWT con Spring Security. — entregable (NO resolver): Configuración de Spring Security y endpoints protegidos.
- Fase 3: Documentación y Manejo de Errores — objetivo: Documentar la API usando OpenAPI y manejar errores de forma centralizada. — entregable (NO resolver): Documentación de la API y manejo de errores centralizado.
- Fase 4: Validación de Entradas y Pruebas — objetivo: Validar entradas y escribir pruebas unitarias y de integración. — entregable (NO resolver): Validación de entradas y pruebas unitarias e de integración.
- Fase 5: Containerización y Despliegue — objetivo: Containerizar la aplicación con Docker y optimizar el Dockerfile para producción. — entregable (NO resolver): Dockerfile y aplicación containerizada.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/ecommerce/EcommerceApplication.java ===
package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
server:
  port: 8080
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driverClassName: org.h2.Driver
    username: sa
    password: 
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

// === ARCHIVO: src/main/java/com/ecommerce/controller/ProductController.java ===
package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@Valid @RequestBody Product product) {
        return ResponseEntity.ok(productService.createProduct(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @Valid @RequestBody Product product) {
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/service/ProductService.java ===
package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/repository/ProductRepository.java ===
package com.ecommerce.repository;

import com.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

// === ARCHIVO: src/main/java/com/ecommerce/model/Product.java ===
package com.ecommerce.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    private Double price;

    // Getters and setters
}

// === ARCHIVO: src/main/java/com/ecommerce/security/SecurityConfig.java ===
package com.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
               .antMatchers("/api/products").hasRole("ADMIN")
               .anyRequest().authenticated()
               .and().httpBasic();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetailsService userDetailsService = new InMemoryUserDetailsManager(
                User.withDefaultPasswordEncoder()
                       .username("admin")
                       .password("admin")
                       .roles("ADMIN")
                       .build()
        );
        return userDetailsService;
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/security/JwtTokenUtil.java ===
package com.ecommerce.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtTokenUtil {
    private String secret = "secret";
    private long validityInMilliseconds = 3600000; // 1hr

    public String generateToken(String subject) {
        return Jwts.builder().setSubject(subject).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + validityInMilliseconds))
               .signWith(SignatureAlgorithm.HS256, secret).compact();
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/exception/GlobalExceptionHandler.java ===
package com.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + ex.getMessage());
    }
}

// === ARCHIVO: src/main/java/com/ecommerce/openapi/OpenApiConfig.java ===
package com.ecommerce.openapi;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
               .group("ecommerce")
               .pathsToMatch("/api/**")
               .build();
    }
}

// === ARCHIVO: src/test/java/com/ecommerce/service/ProductServiceTest.java ===
package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void getAllProducts() {
        when(productRepository.findAll()).thenReturn(List.of(new Product()));
        assertEquals(1, productService.getAllProducts().size());
    }

    @Test
    void createProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        assertNotNull(productService.createProduct(product));
    }

    @Test
    void updateProduct() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        when(productRepository.save(product)).thenReturn(product);
        assertNotNull(productService.updateProduct(1L, product));
    }

    @Test
    void deleteProduct() {
        doNothing().when(productRepository).deleteById(1L);
        productService.deleteProduct(1L);
        verify(productRepository, times(1)).deleteById(1L);
    }
}

// === ARCHIVO: src/test/java/com/ecommerce/controller/ProductControllerTest.java ===
package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllProducts() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products")
               .accept(MediaType.APPLICATION_JSON))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void createProduct() throws Exception {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(100.0);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"name\":\"Test Product\",\"price\":100.0}"))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void updateProduct() throws Exception {
        Product product = new Product();
        product.setName("Updated Product");
        product.setPrice(200.0);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/products/1")
               .contentType(MediaType.APPLICATION_JSON)
               .content("{\"name\":\"Updated Product\",\"price\":200.0}"))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void deleteProduct() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/products/1")
               .accept(MediaType.APPLICATION_JSON))
               .andDo(print())
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

// === ARCHIVO: Dockerfile ===
FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY..
RUN./gradlew build

FROM openjdk:21-jdk-slim AS runtime
WORKDIR /app
COPY --from=build /app/build/libs/ecommerce-0.0.1-SNAPSHOT.jar ecommerce.jar
ENTRYPOINT ["java", "-jar", "ecommerce.jar"]

// === ARCHIVO:.dockerignore ===
*.iml
.gradle
/build
/out


```
