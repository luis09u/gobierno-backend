package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

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

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM01.01");
        pract01.setNombrePractica("Evaluar el sistema de gobierno");
        pract01.setDescripcionPractica("Identificar continuamente los cambios en el entorno normativo y tecnológico para ajustar el marco de gobierno de Toyota.");

        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Evaluar el alineamiento entre objetivos estratégicos y capacidades cloud."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Analizar regulaciones de ciberseguridad (CSMS) para integrarlas al gobierno interno."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

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
        // DEMÁS COMPONENTES (EDM01)
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm01); raci1.setPracticaGestion("EDM01.01"); raci1.setRolOrganizacional("Junta Directiva"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm01); raci2.setPracticaGestion("EDM01.01"); raci2.setRolOrganizacional("Comité Ejecutivo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm01); raci3.setPracticaGestion("EDM01.01"); raci3.setRolOrganizacional("Director de Riesgos (CRO)"); raci3.setNivelResponsabilidad("C");
        MatrizRaci raci4 = new MatrizRaci(); raci4.setProceso(edm01); raci4.setPracticaGestion("EDM01.02"); raci4.setRolOrganizacional("Junta Directiva"); raci4.setNivelResponsabilidad("A");
        MatrizRaci raci5 = new MatrizRaci(); raci5.setProceso(edm01); raci5.setPracticaGestion("EDM01.02"); raci5.setRolOrganizacional("Comité de Estrategia de TI"); raci5.setNivelResponsabilidad("R");
        MatrizRaci raci6 = new MatrizRaci(); raci6.setProceso(edm01); raci6.setPracticaGestion("EDM01.02"); raci6.setRolOrganizacional("Director de Información (CIO)"); raci6.setNivelResponsabilidad("I");
        edm01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3, raci4, raci5, raci6));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm01); flujo1.setPracticaGestion("EDM01.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Entorno externo"); flujo1.setDescripcion("Regulaciones de ciberseguridad automotriz (UNECE WP.29)");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm01); flujo2.setPracticaGestion("EDM01.01"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM01.02"); flujo2.setDescripcion("Modelo de toma de decisiones de TI evaluado");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(edm01); flujo3.setPracticaGestion("EDM01.02"); flujo3.setTipoFlujo("ENTRADA"); flujo3.setOrigenDestino("DE: APO01.02"); flujo3.setDescripcion("Evaluación del desempeño de TI e informes de métricas cloud");
        FlujoInformacion flujo4 = new FlujoInformacion(); flujo4.setProceso(edm01); flujo4.setPracticaGestion("EDM01.02"); flujo4.setTipoFlujo("SALIDA"); flujo4.setOrigenDestino("A: APO01.01"); flujo4.setDescripcion("Principios de gobierno corporativo para actualizaciones OTA");
        edm01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3, flujo4));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm01); hab1.setNombreHabilidad("Gobierno de TI corporativo"); hab1.setDocumentacionRelacionada("Marco de Competencias COBIT (e-Skills)"); hab1.setReferenciaEspecifica("Definición de competencia para liderazgo estratégico digital");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(edm01); hab2.setNombreHabilidad("Conocimiento Regulatorio y de Cumplimiento"); hab2.setDocumentacionRelacionada("Perfil del Arquitecto GRC"); hab2.setReferenciaEspecifica("Especialización en normativas de seguridad ISO/IEC 27001");
        edm01.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        Politica pol1 = new Politica(); pol1.setProceso(edm01); pol1.setTituloPolitica("Política General de Gobierno de TI"); pol1.setDescripcionPolitica("Establece los mandatos de alto nivel sobre cómo Toyota tomará decisiones tecnológicas, priorizando la seguridad e integridad del vehículo frente a innovaciones digitales."); pol1.setDocumentacionRelacionada("Manual de Gobierno Corporativo de Toyota"); pol1.setReferenciaEspecifica("Capítulo 3: Estructuras de Decisión Tecnológica");
        edm01.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(edm01); cult1.setElementoCultural("Liderazgo proactivo y cultura 'Tone at the Top'"); cult1.setDocumentacionRelacionada("Código de Ética Toyota Way"); cult1.setReferenciaEspecifica("Directrices de transparencia y responsabilidad ejecutiva en escalamiento de riesgos cibernéticos");
        edm01.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(edm01); serv1.setNombreServicioHerramienta("Plataforma GRC (Governance, Risk, and Compliance) corporativa");
        Servicio serv2 = new Servicio(); serv2.setProceso(edm01); serv2.setNombreServicioHerramienta("Tableros de control ejecutivos interactivos (Dashboard Cuadro de Mando en React)");
        edm01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(edm01);
    }

    private void cargarEDM02() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit edm02 = new ProcesoCobit();
        edm02.setIdProceso("EDM02");
        edm02.setDominio("Evaluar, Dirigir y Monitorizar");
        edm02.setAreaPrioritaria("Modelo Core de COBIT");
        edm02.setNombreProceso("Asegurar la obtención de beneficios");
        edm02.setDescripcionProceso("Optimizar el valor al negocio de las inversiones en procesos empresariales, servicios de I&T y activos de I&T.");
        edm02.setPropositoProceso("Asegurar un valor óptimo de las iniciativas, servicios y activos habilitados para I&T; la entrega rentable de soluciones y servicios; y una imagen confiable y precisa de los costes y beneficios probables para que las necesidades empresariales se satisfagan de forma eficaz y eficiente.");

        edm02.setMetasAlineamiento("AG03: Beneficios obtenidos del portafolio de inversiones y servicios habilitados por I&T.");
        edm02.setMetasEmpresariales("EG08: Optimización de la funcionalidad de procesos internos del negocio.\nEG12: Gestión de programas de transformación digital.");
        edm02.setMetricasModelo("Métrica 1: Niveles de satisfacción del consejo de administración y la dirección ejecutiva con las capacidades del proceso empresarial (EG08).\nMétrica 2: Porcentaje de inversiones posibilitadas por I&T en las que los beneficios previstos en el caso de negocio se cumplen o exceden (AG03).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (OFICIALES)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM02.01");
        pract01.setNombrePractica("Establecer el objetivo de la mezcla de inversión");
        pract01.setDescripcionPractica("Revisar y asegurarse que las estrategias y los servicios actuales de la empresa y de I&T sean claros. Definir una mezcla de inversión apropiada basada en el coste, la alineación con la estrategia y las medidas financieras.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Crear y mantener portafolios de programas de inversión habilitados por I&T, servicios y activos de TI, que forman la base para el presupuesto actual."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Definir una mezcla de inversión que logre el equilibrio adecuado entre distintas dimensiones, incluido un equilibrio de resultados a corto y largo plazo."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM02.02");
        pract02.setNombrePractica("Evaluar la optimización del valor");
        pract02.setDescripcionPractica("Evaluar continuamente el portafolio de inversiones, servicios y activos de I&T con el fin de determinar la probabilidad de alcanzar los objetivos de la empresa y proporcionar un valor.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Conocer los requisitos de las partes interesadas; los problemas estratégicos de I&T; así como la dependencia en I&T."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Conocer los elementos clave de gobierno para ofrecer de forma confiable, segura y económica un valor óptimo."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Evaluar la eficacia con la que las estrategias empresariales y de I&T se han integrado y alineado dentro de la empresa."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM02.03");
        pract03.setNombrePractica("Dirigir la optimización del valor");
        pract03.setDescripcionPractica("Dirigir los principios y las prácticas de gestión de valor para permitir la obtención óptima de valor de las inversiones de I&T durante todo su ciclo de vida económico.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Definir y comunicar los tipos, categorías, criterios y peso relativo al criterio de portafolio e inversiones que permitan puntajes de valor relativo total."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Definir los requisitos para los cambios de fase (stage-gate) y otras revisiones para ver el peso de la inversión para la empresa."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Definir y comunicar las metas y medidas de resultados de la entrega de valor a nivel de empresa para permitir una supervisión eficaz."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("EDM02.04");
        pract04.setNombrePractica("Monitorizar la optimización del valor");
        pract04.setDescripcionPractica("Supervisar las metas y métricas clave para determinar si el negocio está recibiendo el valor y los beneficios esperados a través de las inversiones de I&T.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Definir un conjunto equilibrado de objetivos, métricas, metas y benchmarks. Las métricas deberían cubrir mediciones de actividad y resultados."); a4_1.setNivelCapacidadEsperado(4); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Una vez revisados los informes, asegurar que se ha iniciado y controlado acciones correctivas al área de gestión pertinente."); a4_2.setNivelCapacidadEsperado(5); a4_2.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04));
        edm02.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm02); raci1.setPracticaGestion("EDM02.01"); raci1.setRolOrganizacional("Consejo de Administración"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm02); raci2.setPracticaGestion("EDM02.02"); raci2.setRolOrganizacional("Director general ejecutivo (CEO)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm02); raci3.setPracticaGestion("EDM02.04"); raci3.setRolOrganizacional("Consejo de gobierno de I&T"); raci3.setNivelResponsabilidad("R");
        edm02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm02); flujo1.setPracticaGestion("EDM02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.05"); flujo1.setDescripcion("Definición de iniciativas estratégicas, iniciativas de evaluación de riesgos y Hoja de ruta estratégica.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm02); flujo2.setPracticaGestion("EDM02.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO05.02 / APO05.03"); flujo2.setDescripcion("Evaluación de los portafolios de inversiones y servicios.");
        edm02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm02); hab1.setNombreHabilidad("Benefits management (Gestión de Beneficios)"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: BENM. Capacidades para administrar y asegurar el retorno de inversión.");
        edm02.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm02); pol1.setTituloPolitica("Política de elaboración y ejecución de presupuestos"); pol1.setDescripcionPolitica("Establece las directrices para identificar las necesidades y requisitos de las inversiones, monitorizar su cumplimiento y asegurar el máximo beneficio. Aborda la formulación de solicitudes presupuestarias."); pol1.setDocumentacionRelacionada("Gobierno Financiero Corporativo"); pol1.setReferenciaEspecifica("Supervisar la ejecución del rendimiento presupuestario y técnico conforme a lo estimado, y en relación a los acuerdos de nivel de servicio.");
        edm02.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm02); cult1.setElementoCultural("Cultura de Alineamiento Estratégico y Entrega de Valor"); cult1.setDocumentacionRelacionada("Manifiesto de Valor de I&T"); cult1.setReferenciaEspecifica("El valor que I&T proporciona depende del grado de alineamiento de I&T con el negocio. Optimizar el valor de I&T estableciendo una cultura en la que los servicios se proporcionen a tiempo, dentro del presupuesto y con la calidad adecuada.");
        edm02.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm02); serv1.setNombreServicioHerramienta("Sistema de contabilidad de costes");
        Servicio serv2 = new Servicio(); serv2.setProceso(edm02); serv2.setNombreServicioHerramienta("Herramienta de gestión de programas y portafolio");
        edm02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(edm02);
    }
}