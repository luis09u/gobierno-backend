package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(20) // Secuencia de inicio en el dominio BAI
public class Seeder_22_BAI03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_22_BAI03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI03")) {
            System.out.println("Iniciando carga de datos oficiales: BAI03...");
            cargarBAI03();
            System.out.println("BAI03 (Gestionar la identificación y construcción de soluciones) cargado exitosamente.");
        }
    }

    private void cargarBAI03() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit bai03 = new ProcesoCobit();
        bai03.setIdProceso("BAI03");
        bai03.setDominio("Construir, Adquirir e Implementar");
        bai03.setAreaPrioritaria("Modelo Core de COBIT");
        bai03.setNombreProceso("Gestionar la identificación y construcción de soluciones");
        bai03.setDescripcionProceso("Establecer y mantener productos y servicios identificados alineados con los requisitos de la empresa que cubran el diseño, desarrollo, adquisición y pruebas. Gestionar la configuración y mantenimiento de procesos de negocio, aplicaciones, infraestructura y servicios.");
        bai03.setPropositoProceso("Garantizar una prestación ágil y escalable de productos y servicios digitales. Establecer soluciones oportunas y rentables capaces de soportar la arquitectura de vehículos conectados y garantizar el empaquetado seguro del firmware antes de su despliegue OTA.");

        bai03.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos del negocio en soluciones operativas.\nAG09: Ejecución de programas dentro del plazo, presupuesto y estándares de calidad.");
        bai03.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG12: Gestión de programas de transformación digital.");
        bai03.setMetricasModelo("Métrica 1: Plazo de comercialización promedio para nuevas actualizaciones de software vehicular (AG06).\nMétrica 2: Número de programas de despliegue OTA que necesitan revisión debido a defectos de calidad en el código (AG09).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1: Diseño de alto nivel
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI03.01");
        pract01.setNombrePractica("Diseño de soluciones de alto nivel");
        pract01.setDescripcionPractica("Desarrollar y documentar diseños de alto nivel para la arquitectura OTA en términos de tecnología y flujos de datos en la nube.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer una especificación de diseño de alto nivel que traslade la solución a la arquitectura de interconexión entre AWS y las redes vehiculares."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Involucrar a ingenieros automotrices y especialistas Cloud experimentados en el proceso de diseño para optimizar la telemetría."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Asegurar la aprobación formal del diseño de alto nivel por parte de las partes interesadas y dueños de proceso antes de avanzar."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2: Diseño detallado
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI03.02");
        pract02.setNombrePractica("Diseñar componentes detallados para la solución");
        pract02.setDescripcionPractica("Desarrollar diseños detallados abordando procesos de negocio, aplicaciones, redundancia en servidores y especificaciones criptográficas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Diseñar los pasos del procesamiento de la aplicación, incluyendo reglas para la validación de firmas digitales en los paquetes de firmware."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Diseñar la redundancia, recuperación y rutinas de reversión automatizada (rollback) en el vehículo en caso de interrupción de descarga."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Evaluar proactivamente las debilidades del diseño de seguridad (Threat Modeling) e identificar mejoras de protección de datos."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3: Desarrollar componentes
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI03.03");
        pract03.setNombrePractica("Desarrollar los componentes de la solución");
        pract03.setDescripcionPractica("Desarrollar progresivamente los componentes de software en un entorno independiente y seguro, manteniendo estricto control de versiones.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Dentro de un entorno separado, desarrollar el código fuente de las unidades de control electrónico (ECU) y la plataforma Cloud backend."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Documentar todos los componentes conforme a estándares automotrices (MISRA-C) y mantener el control de versiones en repositorios seguros."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Garantizar que las responsabilidades de uso de componentes criptográficos (Módulos de Seguridad de Hardware) estén definidas y monitorizadas."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4: Adquirir componentes
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("BAI03.04");
        pract04.setNombrePractica("Adquirir los componentes de la solución");
        pract04.setDescripcionPractica("Adquirir componentes basados en el plan de adquisiciones, como módulos 5G o librerías de terceros, asegurando cumplimiento de estándares.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Crear y mantener un plan para la adquisición de componentes de red y licencias en la nube, considerando costes de transición y riesgos."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Revisar y aprobar todos los planes de adquisiciones, garantizando la conformidad técnica con la arquitectura de vehículos conectados."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Registrar en un inventario corporativo la recepción de todas las adquisiciones de infraestructura de telecomunicación y software."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5: Construir soluciones
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("BAI03.05");
        pract05.setNombrePractica("Construir soluciones");
        pract05.setDescripcionPractica("Integrar hardware y software implementando medidas de seguridad y auditabilidad para asegurar la funcionalidad y disponibilidad.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Integrar y configurar los componentes de software embebido con los repositorios en la nube según las especificaciones de ingeniería."); a5_1.setNivelCapacidadEsperado(3); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Implementar pistas de auditoría seguras durante la compilación del firmware para garantizar la inalterabilidad e integridad del código."); a5_2.setNivelCapacidadEsperado(4); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Garantizar la interoperabilidad de los módulos electrónicos mediante pruebas automáticas continuas de integración (CI)."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6: QA
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("BAI03.06");
        pract06.setNombrePractica("Realizar el aseguramiento de calidad (QA)");
        pract06.setDescripcionPractica("Ejecutar un plan de QA alineado con estándares internacionales para validar que la actualización cumpla requisitos de seguridad crítica.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Definir un plan de QA especificando criterios de validación estrictos y cualificaciones requeridas para los revisores de código automotriz."); a6_1.setNivelCapacidadEsperado(3); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Emplear inspecciones de código automatizadas e integración continua. Informar resultados al equipo de ingeniería y dirección de TI."); a6_2.setNivelCapacidadEsperado(4); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Mantener un registro estricto de todas las excepciones de calidad y garantizar la repetición de pruebas tras la aplicación de correcciones."); a6_3.setNivelCapacidadEsperado(5); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        // Práctica 7: Preparar pruebas
        PracticaCobit pract07 = new PracticaCobit();
        pract07.setComponente(compA);
        pract07.setIdPractica("BAI03.07");
        pract07.setNombrePractica("Preparar las pruebas de la solución");
        pract07.setDescripcionPractica("Establecer planes de prueba y entornos realistas de simulación para asegurar que el despliegue a la calle no cause anomalías mecánicas.");
        Actividad a7_1 = new Actividad(); a7_1.setPractica(pract07); a7_1.setDescripcionActividad("Crear un plan integrado de prácticas que permita construir entornos de simulación de Hardware-in-the-Loop (HIL) para comprobar la solución."); a7_1.setNivelCapacidadEsperado(3); a7_1.setCalificacionActual("N");
        Actividad a7_2 = new Actividad(); a7_2.setPractica(pract07); a7_2.setDescripcionActividad("Crear un entorno de pruebas que refleje fielmente las condiciones del mundo real, transacciones de datos y limitaciones de la red celular."); a7_2.setNivelCapacidadEsperado(3); a7_2.setCalificacionActual("N");
        Actividad a7_3 = new Actividad(); a7_3.setPractica(pract07); a7_3.setDescripcionActividad("Documentar y guardar los casos de prueba y parámetros operacionales estrictos para futuras validaciones de la aplicación telemática."); a7_3.setNivelCapacidadEsperado(4); a7_3.setCalificacionActual("N");
        pract07.setActividades(Arrays.asList(a7_1, a7_2, a7_3));

        // Práctica 8: Ejecutar pruebas
        PracticaCobit pract08 = new PracticaCobit();
        pract08.setComponente(compA);
        pract08.setIdPractica("BAI03.08");
        pract08.setNombrePractica("Ejecutar las pruebas de la solución");
        pract08.setDescripcionPractica("Ejecutar pruebas continuas en entornos simulados, identificando, registrando y priorizando los errores antes del pase a producción masiva.");
        Actividad a8_1 = new Actividad(); a8_1.setPractica(pract08); a8_1.setDescripcionActividad("Llevar a cabo las pruebas de las ECUs con probadores independientes del equipo desarrollador. Asegurar aislamiento del entorno de desarrollo."); a8_1.setNivelCapacidadEsperado(3); a8_1.setCalificacionActual("N");
        Actividad a8_2 = new Actividad(); a8_2.setPractica(pract08); a8_2.setDescripcionActividad("Identificar, registrar y clasificar los errores (menores vs. de misión crítica para la seguridad vial) y repetir pruebas hasta resolverlos."); a8_2.setNivelCapacidadEsperado(4); a8_2.setCalificacionActual("N");
        Actividad a8_3 = new Actividad(); a8_3.setPractica(pract08); a8_3.setDescripcionActividad("Registrar oficialmente los resultados de las pistas de auditoría de pruebas y comunicarlos a los ejecutivos conforme al plan de gobierno."); a8_3.setNivelCapacidadEsperado(4); a8_3.setCalificacionActual("N");
        pract08.setActividades(Arrays.asList(a8_1, a8_2, a8_3));

        // Práctica 9: Cambios a los requisitos
        PracticaCobit pract09 = new PracticaCobit();
        pract09.setComponente(compA);
        pract09.setIdPractica("BAI03.09");
        pract09.setNombrePractica("Gestionar los cambios a los requisitos");
        pract09.setDescripcionPractica("Hacer seguimiento estricto a las modificaciones solicitadas durante el desarrollo, evaluando su impacto en el presupuesto y la viabilidad técnica.");
        Actividad a9_1 = new Actividad(); a9_1.setPractica(pract09); a9_1.setDescripcionActividad("Evaluar el impacto de todas las peticiones de cambio de funciones vehiculares sobre el presupuesto y el caso de negocio original."); a9_1.setNivelCapacidadEsperado(3); a9_1.setCalificacionActual("N");
        Actividad a9_2 = new Actividad(); a9_2.setPractica(pract09); a9_2.setDescripcionActividad("Hacer un seguimiento de las aprobaciones, asegurando que el equipo de seguridad y dueños de proceso comprendan los riesgos introducidos."); a9_2.setNivelCapacidadEsperado(4); a9_2.setCalificacionActual("N");
        Actividad a9_3 = new Actividad(); a9_3.setPractica(pract09); a9_3.setDescripcionActividad("Aplicar cambios manteniendo la integridad de la configuración base, evaluando el nivel de riesgo de seguridad introducido al sistema crítico."); a9_3.setNivelCapacidadEsperado(5); a9_3.setCalificacionActual("N");
        pract09.setActividades(Arrays.asList(a9_1, a9_2, a9_3));

        // Práctica 10: Mantener
        PracticaCobit pract10 = new PracticaCobit();
        pract10.setComponente(compA);
        pract10.setIdPractica("BAI03.10");
        pract10.setNombrePractica("Mantener las soluciones");
        pract10.setDescripcionPractica("Ejecutar mantenimientos correctivos y preventivos en la nube y los vehículos mediante gestión de parches inalámbricos continuos.");
        Actividad a10_1 = new Actividad(); a10_1.setPractica(pract10); a10_1.setDescripcionActividad("Desarrollar y ejecutar un plan para el envío y monitorización de parches y análisis de vulnerabilidades para la flota de vehículos."); a10_1.setNivelCapacidadEsperado(3); a10_1.setCalificacionActual("N");
        Actividad a10_2 = new Actividad(); a10_2.setPractica(pract10); a10_2.setDescripcionActividad("Evaluar el impacto de las actualizaciones de mantenimiento en la funcionalidad operativa, asegurando que el conductor perciba la mejora."); a10_2.setNivelCapacidadEsperado(3); a10_2.setCalificacionActual("N");
        Actividad a10_3 = new Actividad(); a10_3.setPractica(pract10); a10_3.setDescripcionActividad("Analizar periódicamente tendencias anormales en los reportes de mantenimiento que indiquen problemas subyacentes en el código matriz."); a10_3.setNivelCapacidadEsperado(4); a10_3.setCalificacionActual("N");
        pract10.setActividades(Arrays.asList(a10_1, a10_2, a10_3));

        // Práctica 11: Portafolio de Servicios
        PracticaCobit pract11 = new PracticaCobit();
        pract11.setComponente(compA);
        pract11.setIdPractica("BAI03.11");
        pract11.setNombrePractica("Definir productos y servicios de TI y mantener el portafolio");
        pract11.setDescripcionPractica("Definir y acordar nuevas opciones de servicios digitales y actualización en el portafolio (Ej. suscripciones de conducción autónoma).");
        Actividad a11_1 = new Actividad(); a11_1.setPractica(pract11); a11_1.setDescripcionActividad("Proponer definiciones de servicios OTA nuevos o modificados, documentándolos para el catálogo corporativo del Arene OS."); a11_1.setNivelCapacidadEsperado(3); a11_1.setCalificacionActual("N");
        Actividad a11_2 = new Actividad(); a11_2.setPractica(pract11); a11_2.setDescripcionActividad("Proponer opciones de nivel de servicio (tiempos de actualización, seguridad, disponibilidad) acordadas con proveedores de redes 5G."); a11_2.setNivelCapacidadEsperado(3); a11_2.setCalificacionActual("N");
        Actividad a11_3 = new Actividad(); a11_3.setPractica(pract11); a11_3.setDescripcionActividad("Si las nuevas suscripciones digitales requieren inversión pesada, escalar la solicitud a gestión de portafolios para aprobación de negocio."); a11_3.setNivelCapacidadEsperado(4); a11_3.setCalificacionActual("N");
        pract11.setActividades(Arrays.asList(a11_1, a11_2, a11_3));

        // Práctica 12: Metodología
        PracticaCobit pract12 = new PracticaCobit();
        pract12.setComponente(compA);
        pract12.setIdPractica("BAI03.12");
        pract12.setNombrePractica("Diseñar soluciones conforme a la metodología de desarrollo definida");
        pract12.setDescripcionPractica("Desarrollar soluciones con el modelo bimodal, utilizando Agile para servicios en la nube y V-Model estricto para las ECUs vehiculares críticas.");
        Actividad a12_1 = new Actividad(); a12_1.setPractica(pract12); a12_1.setDescripcionActividad("Analizar el impacto de elegir una metodología bimodal sobre los recursos, separando el software crítico del infotenimiento."); a12_1.setNivelCapacidadEsperado(3); a12_1.setCalificacionActual("N");
        Actividad a12_2 = new Actividad(); a12_2.setPractica(pract12); a12_2.setDescripcionActividad("Establecer la estrategia y equipos de proyecto capacitados (Scrum para Cloud, Waterfall certificado ISO para frenos/dirección)."); a12_2.setNivelCapacidadEsperado(4); a12_2.setCalificacionActual("N");
        Actividad a12_3 = new Actividad(); a12_3.setPractica(pract12); a12_3.setDescripcionActividad("Integrar fábricas digitales (Digital Hubs) para acelerar desarrollos no críticos y extender la cultura DevSecOps en la corporación."); a12_3.setNivelCapacidadEsperado(5); a12_3.setCalificacionActual("N");
        pract12.setActividades(Arrays.asList(a12_1, a12_2, a12_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06, pract07, pract08, pract09, pract10, pract11, pract12));
        bai03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai03); raci1.setPracticaGestion("BAI03.01"); raci1.setRolOrganizacional("Jefe de arquitectura"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai03); raci2.setPracticaGestion("BAI03.03"); raci2.setRolOrganizacional("Jefe de desarrollo"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai03); raci3.setPracticaGestion("BAI03.08"); raci3.setRolOrganizacional("Director de TI / Jefe de calidad"); raci3.setNivelResponsabilidad("A");
        bai03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai03); flujo1.setPracticaGestion("BAI03.03"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI02.02"); flujo1.setDescripcion("Aprobación por parte del patrocinador de los requisitos y especificaciones arquitectónicas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai03); flujo2.setPracticaGestion("BAI03.08"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.03"); flujo2.setDescripcion("Comunicación de los resultados y logs de auditoría de las pruebas HIL (Hardware-in-the-Loop).");
        bai03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai03); hab1.setNombreHabilidad("Desarrollo de aplicaciones e Integración de componentes"); hab1.setDocumentacionRelacionada("e-Competence Framework (e-CF) Part 1, 2016"); hab1.setReferenciaEspecifica("B. Build—B.1. Application Development / B.2 Component Integration.");
        bai03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai03); pol1.setTituloPolitica("Política de desarrollo de software automotriz"); pol1.setDescripcionPolitica("Estandarizar el desarrollo en la organización mediante una lista de todos los protocolos y estándares a seguir. Prioriza el aseguramiento de la integridad del código fuente antes de la distribución masiva."); pol1.setDocumentacionRelacionada("NIST Special Publication 800-53"); pol1.setReferenciaEspecifica("3.18 System and services acquisition (SA-1).");
        bai03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai03); cult1.setElementoCultural("Cultura Ágil y Bimodal"); cult1.setDocumentacionRelacionada("Políticas Internas de Innovación Tecnológica"); cult1.setReferenciaEspecifica("Asegurar una oferta ágil; establecer una estructura bimodal IT con fábricas digitales para sistemas de infoentretenimiento y un flujo estricto para componentes críticos. Evaluar alternativas de forma justa (construir vs comprar).");
        bai03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai03); serv1.setNombreServicioHerramienta("Servicios de fábrica digital (Digital Hubs para desarrollo ágil en nube)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai03); serv2.setNombreServicioHerramienta("Herramientas y simuladores de pruebas (HIL - Hardware in the loop)");
        bai03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai03);
    }
}