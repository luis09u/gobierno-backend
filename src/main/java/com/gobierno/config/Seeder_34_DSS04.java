package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(34) // Secuencia en el dominio DSS
public class Seeder_34_DSS04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_34_DSS04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS04")) {
            System.out.println("Iniciando carga de datos oficiales: DSS04...");
            cargarDSS04();
            System.out.println("DSS04 (Gestionar la continuidad) cargado exitosamente.");
        }
    }

    private void cargarDSS04() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit dss04 = new ProcesoCobit();
        dss04.setIdProceso("DSS04");
        dss04.setDominio("Entregar, Dar Servicio y Soporte");
        dss04.setAreaPrioritaria("Modelo Core de COBIT");
        dss04.setNombreProceso("Gestionar la continuidad");
        dss04.setDescripcionProceso("Establecer y mantener un plan que permita a las organizaciones empresariales y a TI responder a los incidentes y adaptarse rápidamente a las interrupciones, permitiendo la operación continua de los procesos críticos.");
        dss04.setPropositoProceso("Adaptarse rápidamente y mantener la disponibilidad de la plataforma Arene OS y los canales de actualización (OTA) en caso de una caída de los servidores, asegurando que la flota vehicular no sufra disrupciones.");

        dss04.setMetasAlineamiento("AG05: Prestación de servicios de I&T conforme a los requisitos de negocio.\nAG07: Seguridad de la información, infraestructura y privacidad.");
        dss04.setMetasEmpresariales("EG02: Gestión de riesgo de negocio.\nEG06: Continuidad y disponibilidad del servicio del negocio.");
        dss04.setMetricasModelo("Métrica 1: Número de horas de procesamiento o conexión de la flota perdidas debido a interrupciones inesperadas del servicio en la nube (EG06).\nMétrica 2: Número de disrupciones de vehículos conectados debido a incidentes de telecomunicación o fallos de actualización (AG05).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS04.01");
        pract01.setNombrePractica("Definir la política de continuidad del negocio");
        pract01.setDescripcionPractica("Definir la política y alcance de la continuidad del negocio, estableciendo los umbrales de caída máxima aceptable para la plataforma telemática.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Identificar procesos de soporte en AWS y servicios de conectividad 5G que son críticos para las operaciones del ecosistema automotriz."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Identificar a las partes interesadas (proveedores de red, ingenieros) y acordar los alcances mínimos de continuidad de servicio."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Definir y documentar los objetivos de política mínimos exigidos por la legislación de transporte para mantener activa la red de emergencia vehicular."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS04.02");
        pract02.setNombrePractica("Mantener la resiliencia del negocio");
        pract02.setDescripcionPractica("Evaluar las opciones de resiliencia y elegir una estrategia viable (como clusters espejo) para asegurar la recuperación inmediata del servicio a los automóviles.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Identificar escenarios que causarían disrupciones, como caídas regionales en la infraestructura Cloud o bloqueos de red celular masivos."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Conducir un Análisis de Impacto del Negocio (BIA) para establecer el tiempo máximo tolerable sin conexión de la flota (RTO/RPO)."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Obtener aprobación ejecutiva para implementar estrategias técnicas como redundancia multi-región en la nube pública."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS04.03");
        pract03.setNombrePractica("Desarrollar e implementar una respuesta de continuidad");
        pract03.setDescripcionPractica("Desarrollar un Plan de Continuidad (BCP) y Recuperación (DRP) que estipulen los protocolos de conmutación automática si el Data Center falla.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Definir comunicaciones de emergencia hacia los conductores (pantallas del vehículo) si ocurre una interrupción del sistema telemático."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Desarrollar un DRP que estipule la sincronización de bases de datos maestras para evitar la pérdida de metadatos del chasis (VIN)."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Distribuir los planes de forma segura al equipo del Network Operations Center (NOC) garantizando acceso durante apagones generales."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("DSS04.04");
        pract04.setNombrePractica("Realizar ejercicios y pruebas del BCP y DRP");
        pract04.setDescripcionPractica("Simular catástrofes controladas (Chaos Engineering) para validar que el ecosistema vehicular conmute a servidores secundarios sin intervención humana.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Definir objetivos para probar los sistemas técnicos simulando caídas de la red durante despliegues masivos OTA."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Llevar a cabo simulacros realistas (Red Team / Chaos Monkey) asignando roles operativos que causen mínima disrupción a la producción."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Realizar análisis tras el ejercicio y desarrollar recomendaciones arquitectónicas para mejorar la resiliencia Cloud del DRP."); a4_3.setNivelCapacidadEsperado(5); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("DSS04.05");
        pract05.setNombrePractica("Revisar, mantener y mejorar los planes de continuidad");
        pract05.setDescripcionPractica("Revisar la capacidad de continuidad para asegurar su efectividad, actualizando los planes conforme se incorporen nuevos modelos vehiculares.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Revisar regularmente los planes de continuidad contra los objetivos estratégicos a medida que la flota conectada se expande globalmente."); a5_1.setNivelCapacidadEsperado(3); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Revisar los planes tras añadir acuerdos con nuevos proveedores de redes 5G o modificaciones drásticas en la arquitectura Cloud."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Recomendar cambios de resiliencia y procesarlos a través de la junta de control de cambios de TI (CAB)."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("DSS04.06");
        pract06.setNombrePractica("Realizar formación sobre el plan de continuidad");
        pract06.setDescripcionPractica("Proporcionar formación al equipo operativo (NOC/SOC) sobre cómo ejecutar comandos de estabilización rápida si el servicio a los vehículos falla.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Realizar programas de concienciación sobre el DRP a todos los ingenieros involucrados en el desarrollo del Arene OS."); a6_1.setNivelCapacidadEsperado(2); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Mantener requisitos de capacitación específicos para los responsables de respuesta a incidentes y comunicación con prensa (PR)."); a6_2.setNivelCapacidadEsperado(3); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Desarrollar competencias basadas en ejercicios prácticos de recuperación de bases de datos, midiendo las habilidades operativas."); a6_3.setNivelCapacidadEsperado(4); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        // Práctica 7
        PracticaCobit pract07 = new PracticaCobit();
        pract07.setComponente(compA);
        pract07.setIdPractica("DSS04.07");
        pract07.setNombrePractica("Administrar los acuerdos de respaldo");
        pract07.setDescripcionPractica("Mantener la disponibilidad asegurando que todas las configuraciones vehiculares (CMDB) y los paquetes de firmware tengan copias de seguridad.");
        Actividad a7_1 = new Actividad(); a7_1.setPractica(pract07); a7_1.setDescripcionActividad("Hacer copias de seguridad de datos telemáticos críticos usando almacenamiento inmutable en la nube para prevenir su destrucción por Ransomware."); a7_1.setNivelCapacidadEsperado(2); a7_1.setCalificacionActual("N");
        Actividad a7_2 = new Actividad(); a7_2.setPractica(pract07); a7_2.setDescripcionActividad("Definir políticas estrictas de almacenamiento distribuido (multi-zona en AWS) con cifrado en reposo para los datos de los conductores."); a7_2.setNivelCapacidadEsperado(3); a7_2.setCalificacionActual("N");
        Actividad a7_3 = new Actividad(); a7_3.setPractica(pract07); a7_3.setDescripcionActividad("Probar periódicamente la extracción y recuperación de datos archivados para validar el tiempo de reconstrucción de servidores."); a7_3.setNivelCapacidadEsperado(3); a7_3.setCalificacionActual("N");
        pract07.setActividades(Arrays.asList(a7_1, a7_2, a7_3));

        // Práctica 8
        PracticaCobit pract08 = new PracticaCobit();
        pract08.setComponente(compA);
        pract08.setIdPractica("DSS04.08");
        pract08.setNombrePractica("Realizar revisiones post-reanudación");
        pract08.setDescripcionPractica("Evaluar la idoneidad de las acciones tomadas tras la reanudación del servicio de actualización OTA después de un apagón informático real.");
        Actividad a8_1 = new Actividad(); a8_1.setPractica(pract08); a8_1.setDescripcionActividad("Evaluar formalmente el nivel de cumplimiento y efectividad que tuvo el DRP durante la restauración del servicio a los vehículos."); a8_1.setNivelCapacidadEsperado(4); a8_1.setCalificacionActual("N");
        Actividad a8_2 = new Actividad(); a8_2.setPractica(pract08); a8_2.setDescripcionActividad("Determinar la resiliencia de la infraestructura técnica e identificar omisiones graves en la sincronización de las bases de datos de clientes."); a8_2.setNivelCapacidadEsperado(4); a8_2.setCalificacionActual("N");
        Actividad a8_3 = new Actividad(); a8_3.setPractica(pract08); a8_3.setDescripcionActividad("Obtener la aprobación directiva para ejecutar cambios de arquitectura inmediata que resuelvan las debilidades descubiertas en la caída."); a8_3.setNivelCapacidadEsperado(5); a8_3.setCalificacionActual("N");
        pract08.setActividades(Arrays.asList(a8_1, a8_2, a8_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06, pract07, pract08));
        dss04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss04); raci1.setPracticaGestion("DSS04.02"); raci1.setRolOrganizacional("Director de operaciones / Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss04); raci2.setPracticaGestion("DSS04.03"); raci2.setRolOrganizacional("Gestor de continuidad del negocio"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss04); raci3.setPracticaGestion("DSS04.07"); raci3.setRolOrganizacional("Jefe de operaciones de TI / Director de TI"); raci3.setNivelResponsabilidad("A");
        dss04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss04); flujo1.setPracticaGestion("DSS04.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.06"); flujo1.setDescripcion("Comunicación del impacto de los riesgos y Análisis de Impacto de Negocio (BIA).");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss04); flujo2.setPracticaGestion("DSS04.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.01"); flujo2.setDescripcion("Plan de Continuidad (BCP) y Acciones de comunicación de respuesta a incidentes.");
        dss04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss04); hab1.setNombreHabilidad("Gestión de la continuidad tecnológica"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: COPL. Capacidad de diseñar, implementar y probar resiliencia arquitectónica en servicios críticos de la empresa.");
        dss04.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss04); pol1.setTituloPolitica("Política de continuidad del negocio y Gestión de Crisis"); pol1.setDescripcionPolitica("Señala el compromiso de la dirección con los requisitos de recuperación para sistemas críticos (evaluación BIA). Establece disparadores de contingencia automatizados en los servidores para evitar pérdidas masivas de telemetría."); pol1.setDocumentacionRelacionada("Directrices Internas de Riesgo Automotriz"); pol1.setReferenciaEspecifica("Incluye planes de escalamiento al Comité de Riesgos ante bloqueos vehiculares.");
        dss04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss04); cult1.setElementoCultural("Cultura de Resiliencia Ante Desastres"); cult1.setDocumentacionRelacionada("Principios de Confiabilidad Site Reliability Engineering (SRE)"); cult1.setReferenciaEspecifica("Integrar la necesidad de resiliencia en la mentalidad de desarrollo. Informar regularmente a los empleados sobre los comportamientos para mantener la compostura operativa, asumiendo que los servidores siempre pueden fallar (Design for failure).");
        dss04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss04); serv1.setNombreServicioHerramienta("Servicios externos de alojamiento redundante (Clusters Multi-AZ en AWS)");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss04); serv2.setNombreServicioHerramienta("Herramientas de simulación de caos (Chaos Engineering / Fault Injection)");
        dss04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss04);
    }
}