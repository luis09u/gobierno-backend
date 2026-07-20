package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(36) // Inicio del dominio MEA (Monitor, Evaluate and Assess)
public class Seeder_37_MEA01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_37_MEA01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA01")) {
            System.out.println("Iniciando carga de datos oficiales: MEA01...");
            cargarMEA01();
            System.out.println("MEA01 (Gestionar la supervisión del rendimiento y la conformidad) cargado exitosamente.");
        }
    }

    private void cargarMEA01() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit mea01 = new ProcesoCobit();
        mea01.setIdProceso("MEA01");
        mea01.setDominio("Monitorizar, Evaluar y Valorar");
        mea01.setAreaPrioritaria("Modelo Core de COBIT");
        mea01.setNombreProceso("Gestionar la supervisión del rendimiento y la conformidad");
        mea01.setDescripcionProceso("Recopilar, validar y evaluar las metas y métricas de alineamiento de la empresa. Supervisar que los procesos y las prácticas se desempeñen según las metas y métricas de rendimiento y conformidad acordadas. Proporcionar informes sistemáticos y oportunos.");
        mea01.setPropositoProceso("Proporcionar transparencia en el rendimiento de la plataforma de vehículos conectados e impulsar la consecución de las metas operativas, asegurando que los servicios OTA cumplan con los niveles de servicio exigidos.");

        mea01.setMetasAlineamiento("AG05: Prestación de servicios de I&T conforme a los requisitos del negocio.\nAG10: Calidad de la información de gestión de I&T.");
        mea01.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG08: Optimización de la funcionalidad de procesos internos del negocio.");
        mea01.setMetricasModelo("Métrica 1: Porcentaje de partes interesadas satisfechas con que la prestación del servicio OTA y Cloud cumpla con los SLA acordados (AG05).\nMétrica 2: Tiempo que se tarda en proporcionar métricas de telemetría que respalden decisiones eficaces ante fallos vehiculares (EG07).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA01.01");
        pract01.setNombrePractica("Establecer un enfoque de supervisión");
        pract01.setDescripcionPractica("Involucrar a las partes interesadas para establecer un enfoque con el que medir la entrega de servicios vehiculares y su contribución a la empresa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Identificar a las partes interesadas y comunicar los requisitos de supervisión del rendimiento de los canales 5G y de la infraestructura Cloud."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Acordar los tipos de métricas (rendimiento, latencia, éxito de descarga OTA) y configurar las herramientas de inteligencia de negocio (BI) a utilizar."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Validar periódicamente el enfoque de supervisión identificando nuevos requisitos de rendimiento a medida que evolucionan las funciones del vehículo."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA01.02");
        pract02.setNombrePractica("Establecer objetivos de rendimiento y conformidad");
        pract02.setDescripcionPractica("Trabajar con las partes interesadas para definir, revisar y actualizar los objetivos de rendimiento dentro del sistema de medición de la flota.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir metas y métricas SMART para la latencia y disponibilidad del servicio, revisándolas periódicamente con las partes interesadas."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Comunicar los cambios propuestos en los objetivos de desempeño y márgenes de tolerancia a los equipos de desarrollo y de cumplimiento normativo."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Publicar formalmente los objetivos y tolerancias modificados a los equipos de ingeniería responsables de la infraestructura de backend."); a2_3.setNivelCapacidadEsperado(3); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA01.03");
        pract03.setNombrePractica("Recopilar y procesar los datos de rendimiento y conformidad");
        pract03.setDescripcionPractica("Recopilar y procesar datos telemáticos de la flota de manera oportuna y precisa, garantizando su integridad para la toma de decisiones.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Recopilar de forma automatizada los datos de rendimiento emitidos por los sensores del vehículo y los registros de los servidores Cloud."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Evaluar la eficiencia y validar la integridad (precisión y completitud) de los datos masivos recopilados antes de procesarlos."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Usar herramientas de Big Data para procesar, agregar y analizar los registros telemáticos en tiempo real y alinearlos a los objetivos del reporte."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("MEA01.04");
        pract04.setNombrePractica("Analizar e informar sobre el rendimiento");
        pract04.setDescripcionPractica("Revisar e informar periódicamente sobre el rendimiento del ecosistema automotriz en comparación con los acuerdos de nivel de servicio (SLA).");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Diseñar cuadros de mando (dashboards) concisos sobre el estado de la red y despliegues OTA, personalizados para las distintas necesidades gerenciales."); a4_1.setNivelCapacidadEsperado(3); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Analizar la causa raíz de las desviaciones de rendimiento (ej. fallas de conectividad masivas), iniciando las medidas correctivas correspondientes."); a4_2.setNivelCapacidadEsperado(4); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Analizar tendencias históricas de desempeño de la flota y recomendar cambios estructurales a la arquitectura cuando los benchmarks internos no se cumplan."); a4_3.setNivelCapacidadEsperado(5); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("MEA01.05");
        pract05.setNombrePractica("Asegurar la implementación de acciones correctivas");
        pract05.setDescripcionPractica("Rastrear las acciones correctivas para abordar las anomalías de rendimiento en los servidores y asegurar que los problemas no reincidan.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Revisar las opciones y recomendaciones de ingeniería para abordar los cuellos de botella identificados en los servidores de actualización."); a5_1.setNivelCapacidadEsperado(2); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Asegurar que se asigne y mantenga la responsabilidad directa para la implementación de las acciones correctivas estructurales."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Hacer un seguimiento continuo a los resultados de las acciones comprometidas y comunicar las métricas de mejora a las partes interesadas."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05));
        mea01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea01); raci1.setPracticaGestion("MEA01.01"); raci1.setRolOrganizacional("Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea01); raci2.setPracticaGestion("MEA01.04"); raci2.setRolOrganizacional("Director de TI / Jefe de operaciones de TI"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea01); raci3.setPracticaGestion("MEA01.05"); raci3.setRolOrganizacional("Director de TI"); raci3.setNivelResponsabilidad("A");
        mea01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea01); flujo1.setPracticaGestion("MEA01.03"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: DSS02.07 / BAI04.04"); flujo1.setDescripcion("Estado de incidentes, informes de tendencias e informes de disponibilidad de infraestructura.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea01); flujo2.setPracticaGestion("MEA01.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los APO, BAI, DSS, MEA"); flujo2.setDescripcion("Informes consolidados de desempeño de la plataforma y Cuadros de Mando.");
        mea01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea01); hab1.setNombreHabilidad("Revisión de conformidad y Gestión de Calidad (ICT)"); hab1.setDocumentacionRelacionada("e-Competence Framework (e-CF) / SFIA V6, 2015"); hab1.setReferenciaEspecifica("Identificador: CORE / E.6. ICT Quality Management. Capacidad para auditar métricas de operaciones distribuidas.");
        mea01.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea01); pol1.setTituloPolitica("Política de autoevaluación y supervisión"); pol1.setDescripcionPolitica("Proporciona directrices a los responsables para evaluar las operaciones como parte de la mejora continua. Utilizada para informar objetivamente al consejo de administración sobre las capacidades y progresos de la infraestructura de conectividad automotriz."); pol1.setDocumentacionRelacionada("Gobierno de Datos y Reportes de TI"); pol1.setReferenciaEspecifica("Establece la obligatoriedad de dashboards ejecutivos actualizados en tiempo real.");
        mea01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea01); cult1.setElementoCultural("Cultura de Mejora Continua y Transparencia Radical"); cult1.setDocumentacionRelacionada("Manifiesto de Ingeniería Basada en Datos"); cult1.setReferenciaEspecifica("Fomentar una cultura donde las métricas no se oculten. Los reportes de rendimiento de la red y fallos de despliegue deben ser visibilizados inmediatamente para lograr las metas de la organización y optimizar el rendimiento sin penalizar la transparencia.");
        mea01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea01); serv1.setNombreServicioHerramienta("Sistema de medición del desempeño corporativo (Datadog, Grafana)");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea01); serv2.setNombreServicioHerramienta("Herramientas de agregación de Big Data e Inteligencia de Negocio (BI)");
        mea01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea01);
    }
}