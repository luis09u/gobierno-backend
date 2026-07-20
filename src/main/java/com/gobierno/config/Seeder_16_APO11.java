package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(16) // Ubicación secuencial en el dominio APO
public class Seeder_16_APO11 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_16_APO11(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO11")) {
            System.out.println("Iniciando carga de datos oficiales: APO11...");
            cargarAPO11();
            System.out.println("APO11 (Gestionar la calidad) cargado exitosamente.");
        }
    }

    private void cargarAPO11() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit apo11 = new ProcesoCobit();
        apo11.setIdProceso("APO11");
        apo11.setDominio("Alinear, Planificar y Organizar");
        apo11.setAreaPrioritaria("Modelo Core de COBIT");
        apo11.setNombreProceso("Gestionar la calidad");
        apo11.setDescripcionProceso("Definir y comunicar los requisitos de calidad en todos los procesos, procedimientos y resultados empresariales relacionados. Habilitar los controles, monitorización continua y uso de prácticas y estándares probados en esfuerzos de mejora y eficiencia continuos.");
        apo11.setPropositoProceso("Asegurar la prestación consistente de soluciones y servicios tecnológicos para satisfacer los requisitos de calidad de la empresa y las necesidades de las partes interesadas, garantizando que el software transmitido a los vehículos sea 100% libre de defectos críticos.");

        apo11.setMetasAlineamiento("AG09: Ejecución de programas dentro del plazo, sin exceder el presupuesto, y que cumplan con los requisitos y estándares de calidad.");
        apo11.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG05: Cultura de servicio orientada al cliente.");
        apo11.setMetricasModelo("Métrica 1: Número de programas que necesitan una revisión significativa debido a defectos de calidad antes de su transmisión (AG09).\nMétrica 2: Número de interrupciones del servicio al cliente o fallas vehiculares post-actualización (EG05).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo11);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO11.01");
        pract01.setNombrePractica("Establecer un sistema de gestión de calidad (SGC)");
        pract01.setDescripcionPractica("Establecer y mantener un sistema de gestión de calidad que proporciona un enfoque estándar, formal y continuo para la gestión de calidad de la información y el software vehicular.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Asegurar que el marco de control incluye una estrategia formal alineada con los requisitos de la empresa. Identificar los requisitos de calidad legal y seguridad vial (ISO 26262)."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Gestionar y revisar regularmente el SGC frente a los criterios de aceptación acordados. Incluir retroalimentación de las pruebas de estrés en laboratorios automotrices."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Responder a las discrepancias de los resultados de la revisión para mejorar continuamente el SGC de las plataformas en la nube."); a1_3.setNivelCapacidadEsperado(5); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO11.02");
        pract02.setNombrePractica("Enfocar la gestión de la calidad en los clientes");
        pract02.setDescripcionPractica("Enfocar la gestión de la calidad en los conductores y concesionarios para determinar sus requisitos y asegurar su integración en las prácticas de desarrollo OTA.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Enfocar la gestión de la calidad en los clientes para determinar los requisitos internos y externos y asegurar el alineamiento con la experiencia de usuario (UX) en la cabina."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Obtener las opiniones de clientes de forma periódica sobre los procesos de negocio y la prestación de servicios telemáticos para garantizar su satisfacción."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Capturar los criterios de aceptación de calidad para su inclusión en los Acuerdos de Nivel de Servicio (SLA) con los proveedores de telecomunicaciones."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO11.03");
        pract03.setNombrePractica("Gestionar los estándares y procedimientos de calidad");
        pract03.setDescripcionPractica("Identificar y mantener los requisitos, estándares y prácticas para los procesos clave con el fin de guiar a la empresa hacia el logro de certificaciones de calidad (ISO 25010).");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Definir los estándares, prácticas y procedimientos de gestión de la calidad en línea con los requisitos del marco de control de I&T para desarrollo de código fuente."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Integrar las prácticas de gestión de la calidad requeridas en procesos de integración continua (CI/CD) en toda la organización."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Revisar regularmente la relevancia y eficacia continua de los procesos específicos de gestión de calidad. Monitorizar el logro de cero defectos críticos."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("APO11.04");
        pract04.setNombrePractica("Llevar a cabo monitorización, control y revisiones de calidad");
        pract04.setDescripcionPractica("Monitorizar la calidad de los procesos y servicios de forma continua. Definir, planificar e implementar medidas para evaluar cada actualización de software enviada a la flota.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Preparar y realizar las revisiones de calidad exhaustivas para el paquete de firmware antes de autorizar su paso a los servidores de producción."); a4_1.setNivelCapacidadEsperado(3); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Monitorizar las métricas de calidad basadas en metas alineadas con la estabilidad del sistema y el consumo de batería del vehículo."); a4_2.setNivelCapacidadEsperado(4); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Informar sobre los resultados de revisión de rendimiento y gestión de la calidad e iniciar las correcciones inmediatas ante cualquier anomalía detectada en los simuladores."); a4_3.setNivelCapacidadEsperado(5); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("APO11.05");
        pract05.setNombrePractica("Mantener la mejora continua");
        pract05.setDescripcionPractica("Mantener y comunicar periódicamente un plan de calidad general que promueva la mejora continua. Obtener y analizar datos sobre el SGC y corregir no conformidades.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Establecer una plataforma centralizada para captar información sobre los defectos y errores telemáticos para permitir el aprendizaje y evitar su recurrencia."); a5_1.setNivelCapacidadEsperado(2); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Identificar ejemplos recurrentes de defectos de calidad en el software vehicular. Determinar su causa raíz y evaluar su impacto en la seguridad del conductor."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Hacer un análisis comparativo de los resultados de benchmarks de calidad con los datos históricos internos y los estándares de la industria automotriz."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05));
        apo11.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo11); raci1.setPracticaGestion("APO11.01"); raci1.setRolOrganizacional("Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo11); raci2.setPracticaGestion("APO11.03"); raci2.setRolOrganizacional("Jefe de desarrollo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo11); raci3.setPracticaGestion("APO11.04"); raci3.setRolOrganizacional("Gestor de seguridad de la información"); raci3.setNivelResponsabilidad("R");
        apo11.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo11); flujo1.setPracticaGestion("APO11.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Entorno externo"); flujo1.setDescripcion("Requisitos de calidad del negocio y los clientes, expectativas de experiencia de usuario en el vehículo.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo11); flujo2.setPracticaGestion("APO11.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos APO, BAI y DSS"); flujo2.setDescripcion("Metas y métricas del proceso de calidad del servicio. Resultados de revisiones de firmware.");
        apo11.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo11); hab1.setNombreHabilidad("Aseguramiento de calidad y Estándares"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: QUAS / QUST. Capacidad de diseñar e implementar pruebas rigurosas para validar la integridad funcional.");
        apo11.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo11); pol1.setTituloPolitica("Política de gestión de la calidad"); pol1.setDescripcionPolitica("Captar la visión de la gestión de los objetivos de calidad de la empresa, el nivel de calidad aceptable y las labores de equipos específicos para garantizar cero defectos críticos en plataformas conectadas."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Calidad de Software"); pol1.setReferenciaEspecifica("Implementación obligatoria de certificaciones ISO 25010 para todo el portafolio tecnológico.");
        apo11.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo11); cult1.setElementoCultural("Cultura de Cero Defectos y Mejora Continua"); cult1.setDocumentacionRelacionada("Manifiesto de Calidad Técnica"); cult1.setReferenciaEspecifica("Promover una cultura organizacional donde la calidad del código es innegociable. Mantener y comunicar periódicamente que la seguridad del conductor depende directamente de la revisión exhaustiva de cada línea de código.");
        apo11.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo11); serv1.setNombreServicioHerramienta("Sistema de Gestión de Calidad (SGC) centralizado");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo11); serv2.setNombreServicioHerramienta("Plataformas automatizadas de pruebas de estrés para unidades de control (ECUs)");
        apo11.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo11);
    }
}