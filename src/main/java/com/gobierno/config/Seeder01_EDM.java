package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
public class Seeder01_EDM implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder01_EDM(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("EDM01")) {
            System.out.println("Iniciando carga de datos 3FN: Dominio EDM...");
            cargarEDM01();
            System.out.println("EDM01 (Estructura Completa COBIT 2019) cargado exitosamente.");
        }
        if (!procesoRepository.existsById("EDM02")) {
            System.out.println("Iniciando carga de datos 3FN: EDM02...");
            cargarEDM02();
            System.out.println("EDM02 (Entrega de Beneficios) cargado exitosamente.");
        }
    }

    private void cargarEDM01() {
        // ==========================================
        // 1. INFORMACIÓN GENERAL Y CASCADA DE METAS
        // ==========================================
        ProcesoCobit edm01 = new ProcesoCobit();
        edm01.setIdProceso("EDM01");
        edm01.setDominio("Evaluar, Dirigir y Monitorizar");
        edm01.setAreaPrioritaria("Modelo Core de COBIT");
        edm01.setNombreProceso("Asegurar el establecimiento y mantenimiento del marco de gobierno");
        edm01.setDescripcionProceso("Analizar y articular los requerimientos para el gobierno de la TI de la empresa, estableciendo estructuras de liderazgo y procesos eficientes.");
        edm01.setPropositoProceso("Proporcionar un enfoque coherente e integrado que esté alineado con el enfoque de gobierno empresarial, garantizando la transición segura de Toyota hacia el ecosistema de vehículos definidos por software (OTA).");

        // Cascada de Metas
        edm01.setMetasAlineamiento("AG01: Cumplimiento de TI y soporte a la conformidad externa con leyes y regulaciones (WP.29).\nAG03: Realización de beneficios del portafolio de inversiones y servicios relacionados con TI.");
        edm01.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos (Arene OS).\nEG06: Continuidad y disponibilidad del servicio de negocio (AWS Uptime).");
        edm01.setMetricasModelo("Métrica 1: Nivel de satisfacción de la directiva con el marco de gobierno de TI.\nMétrica 2: Frecuencia de actualización del marco de gobierno respecto a nuevas regulaciones cibernéticas.");

        // ==========================================
        // COMPONENTE A: PROCESOS (Prácticas y Actividades)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 01.01
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM01.01");
        pract01.setNombrePractica("Evaluar el sistema de gobierno");
        pract01.setDescripcionPractica("Identificar continuamente los cambios en el entorno normativo y tecnológico para ajustar el marco de gobierno de Toyota.");

        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Evaluar el alineamiento entre objetivos estratégicos y capacidades cloud."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Analizar regulaciones de ciberseguridad (CSMS) para integrarlas al gobierno interno."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        // Práctica 01.02
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM01.02");
        pract02.setNombrePractica("Dirigir el sistema de gobierno");
        pract02.setDescripcionPractica("Establecer principios rectores y comunicar estructuras de toma de decisiones para Arene OS.");

        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Comunicar principios de gobierno priorizando la seguridad física (Customer-First)."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Establecer un Comité de Estrategia Digital con autoridad para aprobaciones TOGAF."); a2_2.setNivelCapacidadEsperado(2); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        compA.setPracticas(Arrays.asList(pract01, pract02));
        edm01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS (Matriz RACI)
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm01); raci1.setPracticaGestion("EDM01.01"); raci1.setRolOrganizacional("Junta Directiva"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm01); raci2.setPracticaGestion("EDM01.01"); raci2.setRolOrganizacional("Comité Ejecutivo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm01); raci3.setPracticaGestion("EDM01.01"); raci3.setRolOrganizacional("Director de Riesgos (CRO)"); raci3.setNivelResponsabilidad("C");

        MatrizRaci raci4 = new MatrizRaci(); raci4.setProceso(edm01); raci4.setPracticaGestion("EDM01.02"); raci4.setRolOrganizacional("Junta Directiva"); raci4.setNivelResponsabilidad("A");
        MatrizRaci raci5 = new MatrizRaci(); raci5.setProceso(edm01); raci5.setPracticaGestion("EDM01.02"); raci5.setRolOrganizacional("Comité de Estrategia de TI"); raci5.setNivelResponsabilidad("R");
        MatrizRaci raci6 = new MatrizRaci(); raci6.setProceso(edm01); raci6.setPracticaGestion("EDM01.02"); raci6.setRolOrganizacional("Director de Información (CIO)"); raci6.setNivelResponsabilidad("I");

        edm01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3, raci4, raci5, raci6));

        // ==========================================
        // COMPONENTE C: FLUJOS Y ELEMENTOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm01); flujo1.setPracticaGestion("EDM01.01"); flujo1.setTipoFlujo("ENTRADA");
        flujo1.setOrigenDestino("DE: Entorno externo"); flujo1.setDescripcion("Regulaciones de ciberseguridad automotriz (UNECE WP.29)");

        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm01); flujo2.setPracticaGestion("EDM01.01"); flujo2.setTipoFlujo("SALIDA");
        flujo2.setOrigenDestino("A: EDM01.02"); flujo2.setDescripcion("Modelo de toma de decisiones de TI evaluado");

        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(edm01); flujo3.setPracticaGestion("EDM01.02"); flujo3.setTipoFlujo("ENTRADA");
        flujo3.setOrigenDestino("DE: APO01.02"); flujo3.setDescripcion("Evaluación del desempeño de TI e informes de métricas cloud");

        FlujoInformacion flujo4 = new FlujoInformacion(); flujo4.setProceso(edm01); flujo4.setPracticaGestion("EDM01.02"); flujo4.setTipoFlujo("SALIDA");
        flujo4.setOrigenDestino("A: APO01.01"); flujo4.setDescripcion("Principios de gobierno corporativo para actualizaciones OTA");

        edm01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3, flujo4));

        // ==========================================
        // COMPONENTE D: PERSONAS, HABILIDADES Y COMPETENCIAS
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm01);
        hab1.setNombreHabilidad("Gobierno de TI corporativo");
        hab1.setDocumentacionRelacionada("Marco de Competencias COBIT (e-Skills)");
        hab1.setReferenciaEspecifica("Definición de competencia para liderazgo estratégico digital");

        Habilidad hab2 = new Habilidad(); hab2.setProceso(edm01);
        hab2.setNombreHabilidad("Conocimiento Regulatorio y de Cumplimiento");
        hab2.setDocumentacionRelacionada("Perfil del Arquitecto GRC");
        hab2.setReferenciaEspecifica("Especialización en normativas de seguridad ISO/IEC 27001");

        edm01.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS Y PROCEDIMIENTOS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm01);
        pol1.setTituloPolitica("Política General de Gobierno de TI");
        pol1.setDescripcionPolitica("Establece los mandatos de alto nivel sobre cómo Toyota tomará decisiones tecnológicas, priorizando la seguridad e integridad del vehículo frente a innovaciones digitales.");
        pol1.setDocumentacionRelacionada("Manual de Gobierno Corporativo de Toyota");
        pol1.setReferenciaEspecifica("Capítulo 3: Estructuras de Decisión Tecnológica");

        edm01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA, ÉTICA Y COMPORTAMIENTO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm01);
        cult1.setElementoCultural("Liderazgo proactivo y cultura 'Tone at the Top'");
        cult1.setDocumentacionRelacionada("Código de Ética Toyota Way");
        cult1.setReferenciaEspecifica("Directrices de transparencia y responsabilidad ejecutiva en escalamiento de riesgos cibernéticos");

        edm01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS, INFRAESTRUCTURA Y APLICACIONES
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm01);
        serv1.setNombreServicioHerramienta("Plataforma GRC (Governance, Risk, and Compliance) corporativa");

        Servicio serv2 = new Servicio(); serv2.setProceso(edm01);
        serv2.setNombreServicioHerramienta("Tableros de control ejecutivos interactivos (Dashboard Cuadro de Mando en React)");

        edm01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        // ==========================================
        // PERSISTENCIA FINAL
        // ==========================================
        procesoRepository.save(edm01);
    }
    private void cargarEDM02() {
        ProcesoCobit edm02 = new ProcesoCobit();
        edm02.setIdProceso("EDM02");
        edm02.setDominio("Evaluar, Dirigir y Monitorizar");
        edm02.setAreaPrioritaria("Modelo Core de COBIT");
        edm02.setNombreProceso("Asegurar la entrega de beneficios");
        edm02.setDescripcionProceso("Optimizar el valor que la TI aporta al negocio a partir de las inversiones y los servicios de TI a un costo aceptable.");
        edm02.setPropositoProceso("Asegurar que la millonaria inversión en infraestructura Cloud (AWS) y desarrollo del Arene OS genere un Retorno de Inversión (ROI) tangible para Toyota, habilitando nuevos modelos de monetización por software.");

        // Cascada de Metas
        edm02.setMetasAlineamiento("AG03: Realización de beneficios del portafolio de inversiones y servicios relacionados con la TI.\nAG05: Entrega de servicios de TI acorde a los requisitos del negocio (Disponibilidad OTA).");
        edm02.setMetasEmpresariales("EG05: Cultura de innovación orientada al cliente (Nuevas funcionalidades vehiculares por suscripción).\nEG12: Optimización de costos de procesos de negocio (Reducción de garantías físicas en talleres).");
        edm02.setMetricasModelo("Métrica 1: Porcentaje de actualizaciones OTA exitosas que evitaron el ingreso del vehículo al taller físico (Ahorro de costos).\nMétrica 2: Retorno de Inversión (ROI) anual de la plataforma de suscripción de software Arene OS.");

        // ==========================================
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM02.01");
        pract01.setNombrePractica("Evaluar la optimización del valor");
        pract01.setDescripcionPractica("Evaluar los casos de negocio de las nuevas funcionalidades vehiculares para asegurar que los ingresos por suscripción superen los costos de transferencia de datos en la nube.");
        Actividad a1_1 = new Actividad();
        a1_1.setPractica(pract01);
        a1_1.setDescripcionActividad("Evaluar financieramente el modelo de 'Software como Servicio' (SaaS) aplicado a los vehículos (Ej. Suscripción por mejoras de autonomía del motor).");
        a1_1.setNivelCapacidadEsperado(2);
        a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad();
        a1_2.setPractica(pract01);
        a1_2.setDescripcionActividad("Analizar los costos de transferencia de datos de AWS y telecomunicaciones 5G para proyectar el punto de equilibrio económico.");
        a1_2.setNivelCapacidadEsperado(3);
        a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM02.02");
        pract02.setNombrePractica("Dirigir la optimización del valor");
        pract02.setDescripcionPractica("Dirigir las prácticas de gestión de inversiones para asegurar que los recursos de TI (servidores, ancho de banda) se asignen a las actualizaciones más críticas.");
        Actividad a2_1 = new Actividad();
        a2_1.setPractica(pract02);
        a2_1.setDescripcionActividad("Aprobar los presupuestos de infraestructura Cloud (FinOps) basándose en el valor estratégico de la actualización (Seguridad vs. Infoentretenimiento).");
        a2_1.setNivelCapacidadEsperado(2);
        a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad();
        a2_2.setPractica(pract02);
        a2_2.setDescripcionActividad("Establecer prioridades de despliegue OTA, ordenando a los equipos técnicos que las actualizaciones críticas de frenos/motor tengan ancho de banda ilimitado.");
        a2_2.setNivelCapacidadEsperado(3);
        a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM02.03");
        pract03.setNombrePractica("Monitorizar la optimización del valor");
        pract03.setDescripcionPractica("Supervisar que los beneficios esperados por la gerencia se estén materializando en la contabilidad de Toyota.");
        Actividad a3_1 = new Actividad();
        a3_1.setPractica(pract03);
        a3_1.setDescripcionActividad("Revisar mensualmente los tableros de AWS Cost Explorer frente a los ingresos generados por la tienda digital de Toyota.");
        a3_1.setNivelCapacidadEsperado(2);
        a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad();
        a3_2.setPractica(pract03);
        a3_2.setDescripcionActividad("Auditar las métricas de 'llamadas a garantía evitadas', calculando el ahorro operativo en la red de concesionarios gracias a los parches remotos.");
        a3_2.setNivelCapacidadEsperado(4);
        a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        edm02.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci();
        raci1.setProceso(edm02);
        raci1.setPracticaGestion("EDM02.01");
        raci1.setRolOrganizacional("Director Financiero (CFO)");
        raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci();
        raci2.setProceso(edm02);
        raci2.setPracticaGestion("EDM02.01");
        raci2.setRolOrganizacional("Gerente de Estrategia Digital");
        raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci();
        raci3.setProceso(edm02);
        raci3.setPracticaGestion("EDM02.02");
        raci3.setRolOrganizacional("Comité de Inversiones");
        raci3.setNivelResponsabilidad("A");
        MatrizRaci raci4 = new MatrizRaci();
        raci4.setProceso(edm02);
        raci4.setPracticaGestion("EDM02.03");
        raci4.setRolOrganizacional("Especialista FinOps (Cloud)");
        raci4.setNivelResponsabilidad("R");

        edm02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3, raci4));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion();
        flujo1.setProceso(edm02);
        flujo1.setPracticaGestion("EDM02.01");
        flujo1.setTipoFlujo("ENTRADA");
        flujo1.setOrigenDestino("DE: APO05.02");
        flujo1.setDescripcion("Casos de negocio y estudios de viabilidad de nuevos servicios OTA");
        FlujoInformacion flujo2 = new FlujoInformacion();
        flujo2.setProceso(edm02);
        flujo2.setPracticaGestion("EDM02.02");
        flujo2.setTipoFlujo("SALIDA");
        flujo2.setOrigenDestino("A: APO05.03");
        flujo2.setDescripcion("Directrices de presupuestación aprobadas para infraestructura AWS");
        FlujoInformacion flujo3 = new FlujoInformacion();
        flujo3.setProceso(edm02);
        flujo3.setPracticaGestion("EDM02.03");
        flujo3.setTipoFlujo("ENTRADA");
        flujo3.setOrigenDestino("DE: MEA01.03");
        flujo3.setDescripcion("Informes de rendimiento y consumo de recursos Cloud");

        edm02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad();
        hab1.setProceso(edm02);
        hab1.setNombreHabilidad("Gestión Financiera de TI (Cloud FinOps)");
        hab1.setDocumentacionRelacionada("Marco de Competencias SFIA v8");
        hab1.setReferenciaEspecifica("Gestión Financiera (FING) - Nivel 5");
        Habilidad hab2 = new Habilidad();
        hab2.setProceso(edm02);
        hab2.setNombreHabilidad("Gestión de Beneficios / Valor");
        hab2.setDocumentacionRelacionada("PMBOK / ITIL v4");
        hab2.setReferenciaEspecifica("Práctica de Gestión de Portafolios");

        edm02.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica();
        pol1.setProceso(edm02);
        pol1.setTituloPolitica("Política de Optimización de Costos Cloud (FinOps)");
        pol1.setDescripcionPolitica("Obliga a justificar financieramente el tamaño de los paquetes de actualización OTA enviados a la flota para minimizar el costo por GigaByte en AWS.");
        pol1.setDocumentacionRelacionada("Manual de Operaciones IT de Toyota");
        pol1.setReferenciaEspecifica("Capítulo: Gestión de Inversiones Digitales");

        edm02.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura();
        cult1.setProceso(edm02);
        cult1.setElementoCultural("Cultura de Conciencia de Costos (Cost-Awareness)");
        cult1.setDocumentacionRelacionada("Manifiesto FinOps Corporativo");
        cult1.setReferenciaEspecifica("Inculcar en los desarrolladores que código ineficiente se traduce en facturas de nube más altas.");

        edm02.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio();
        serv1.setProceso(edm02);
        serv1.setNombreServicioHerramienta("AWS Cost Explorer y AWS Budgets");
        Servicio serv2 = new Servicio();
        serv2.setProceso(edm02);
        serv2.setNombreServicioHerramienta("Software de Gestión de Portafolio y Proyectos (PPM)");

        edm02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        // PERSISTENCIA
        procesoRepository.save(edm02);
    }
}