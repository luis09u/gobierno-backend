package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(31) // Inicio del dominio DSS (Deliver, Service and Support)
public class Seeder_31_DSS01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_31_DSS01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS01")) {
            System.out.println("Iniciando carga de datos oficiales: DSS01...");
            cargarDSS01();
            System.out.println("DSS01 (Gestionar las operaciones) cargado exitosamente.");
        }
    }

    private void cargarDSS01() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit dss01 = new ProcesoCobit();
        dss01.setIdProceso("DSS01");
        dss01.setDominio("Entregar, Dar Servicio y Soporte");
        dss01.setAreaPrioritaria("Modelo Core de COBIT");
        dss01.setNombreProceso("Gestionar las operaciones");
        dss01.setDescripcionProceso("Coordinar y ejecutar las actividades y los procedimientos operativos requeridos para entregar los servicios de I&T, internos y externalizados. Incluye la ejecución de procedimientos operativos estándar predefinidos.");
        dss01.setPropositoProceso("Proporcionar los resultados operativos de I&T según lo planeado, garantizando que el núcleo de los vehículos definidos por software (SDV) y la plataforma backend procesen la telemetría masiva sin colapsos.");

        dss01.setMetasAlineamiento("AG05: Prestación de servicios de I&T conforme a los requisitos del negocio.");
        dss01.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG08: Optimización de la funcionalidad de procesos del negocio internos.");
        dss01.setMetricasModelo("Métrica 1: Número de interrupciones del negocio o de la telemetría vehicular debido a incidentes de servicios de I&T (AG05).\nMétrica 2: Porcentaje de partes interesadas del negocio satisfechas con la prestación de servicios en la nube (AG05).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS01.01");
        pract01.setNombrePractica("Ejecutar procedimientos operativos");
        pract01.setDescripcionPractica("Mantener y ejecutar procedimientos operativos en el backend para procesar la telemetría vehicular masiva de forma continua y escalable.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desarrollar y mantener los procedimientos operativos documentados (runbooks) para respaldar todos los servicios de nube de la flota conectada."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Comprobar que todos los datos de sensores esperados se reciban y procesen. Soportar las necesidades de reprocesamiento ante pérdidas de señal 5G."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Gestionar el rendimiento, escalado automático (auto-scaling) y throughput de los servidores durante los picos de descargas de firmware OTA."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS01.02");
        pract02.setNombrePractica("Gestionar servicios tercerizados de I&T");
        pract02.setDescripcionPractica("Gestionar la operación de proveedores externos (AWS, Telecomunicaciones) para mantener la confiabilidad del ecosistema del vehículo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Asegurar que los requisitos de seguridad perimetral de la empresa se cumplan estrictamente en los SLAs de los proveedores de nube pública."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Integrar los procesos de monitorización de rendimiento de los proveedores de telecomunicaciones con el Centro de Operaciones de Red (NOC) interno."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Planificar auditorías independientes de los entornos operacionales de los proveedores Cloud para confirmar el aislamiento de datos (Data Tenancy)."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS01.03");
        pract03.setNombrePractica("Monitorizar la infraestructura de I&T");
        pract03.setDescripcionPractica("Monitorizar en tiempo real el ecosistema de servidores y flujos de red para detectar anomalías en la comunicación con los automóviles.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Registrar eventos de conectividad vehicular identificando qué nivel de información debe conservarse según las normativas de tráfico."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Definir reglas que registren incumplimientos de umbrales en el ancho de banda, encontrando un equilibrio para no saturar los registros (logs)."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Establecer procedimientos automatizados para que se creen tickets de incidentes en el momento exacto en que caiga un servidor primario."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("DSS01.04");
        pract04.setNombrePractica("Gestionar el medioambiente");
        pract04.setDescripcionPractica("Proteger los Centros de Datos físicos privados y las infraestructuras Edge locales frente a desastres y amenazas medioambientales.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Identificar cómo el equipo de I&T móvil (como los laboratorios de pruebas en concesionarios) se protege frente a amenazas físicas y medioambientales."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Situar las instalaciones de control telemático en zonas mitigadas y separar lógicamente los servidores de producción de los de desarrollo."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Monitorizar y mantener regularmente dispositivos que detecten proactivamente amenazas (fuego, agua, humedad) en los nodos de telecomunicaciones."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("DSS01.05");
        pract05.setNombrePractica("Gestionar las instalaciones");
        pract05.setDescripcionPractica("Asegurar el suministro eléctrico continuo (alta disponibilidad) para los centros de comando que gestionan las flotas de vehículos en tiempo real.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Procurar equipos de suministro ininterrumpido (UPS, generadores) para respaldar la continuidad de los servidores locales y nodos de control."); a5_1.setNivelCapacidadEsperado(2); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Probar regularmente los mecanismos ininterrumpidos para asegurar que el cambio de fuente de energía no afecte la base de datos de los vehículos."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Analizar los sistemas de alojamiento para comprobar redundancia y asegurar el cumplimiento estricto de las directrices de seguridad física."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05));
        dss01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss01); raci1.setPracticaGestion("DSS01.01"); raci1.setRolOrganizacional("Director de TI / Jefe de operaciones de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss01); raci2.setPracticaGestion("DSS01.02"); raci2.setRolOrganizacional("Director de TI"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss01); raci3.setPracticaGestion("DSS01.03"); raci3.setRolOrganizacional("Jefe de operaciones de TI"); raci3.setNivelResponsabilidad("A");
        dss01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss01); flujo1.setPracticaGestion("DSS01.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI05.05"); flujo1.setDescripcion("Plan de operación, uso de recursos y arquitectura de despliegues.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss01); flujo2.setPracticaGestion("DSS01.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.02"); flujo2.setDescripcion("Reglas de monitorización, tickets de incidentes técnicos automáticos y logs de eventos de telemetría.");
        dss01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss01); hab1.setNombreHabilidad("Prestación de servicios y Administración de infraestructura de TI"); hab1.setDocumentacionRelacionada("e-Competence Framework (e-CF) / SFIA V6, 2015"); hab1.setReferenciaEspecifica("Identificador: ITOP / C. Run—C.3. Service Delivery. Capacidad para gobernar las operaciones continuas 24/7 en alta disponibilidad.");
        dss01.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss01); pol1.setTituloPolitica("Política de gestión de servicios (ITSM)"); pol1.setDescripcionPolitica("Proporciona dirección para garantizar la implementación efectiva de operaciones continuas y el manejo óptimo de los servicios de alojamiento en nube que sostienen el procesamiento en tiempo real de la flota automotriz."); pol1.setDocumentacionRelacionada("ISO/IEC 20000-1:2011(E)"); pol1.setReferenciaEspecifica("4.1.2 Service management policy.");
        dss01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss01); cult1.setElementoCultural("Cultura de Excelencia Operativa 24/7"); cult1.setDocumentacionRelacionada("Marco Organizacional ITIL"); cult1.setReferenciaEspecifica("Crear una cultura habitual de excelencia. Mantener un entorno en el que los ingenieros de operaciones NOC cuestionen las caídas de sistema, buscando el 99.99% de disponibilidad (uptime) como único estándar aceptable.");
        dss01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss01); serv1.setNombreServicioHerramienta("Servicios de alojamiento escalable en la nube (AWS / Azure)");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss01); serv2.setNombreServicioHerramienta("Herramientas de monitorización de infraestructura perimetral (Datadog, Dynatrace)");
        dss01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss01);
    }
}