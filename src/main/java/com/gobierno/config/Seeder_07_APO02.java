package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(7) // Orden lógico al inicio del dominio APO
public class Seeder_07_APO02 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_07_APO02(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO02")) {
            System.out.println("Iniciando carga de datos oficiales: APO02...");
            cargarAPO02();
            System.out.println("APO02 (Gestionar la estrategia) cargado exitosamente.");
        }
    }

    private void cargarAPO02() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit apo02 = new ProcesoCobit();
        apo02.setIdProceso("APO02");
        apo02.setDominio("Alinear, Planificar y Organizar");
        apo02.setAreaPrioritaria("Modelo Core de COBIT");
        apo02.setNombreProceso("Gestionar la estrategia");
        apo02.setDescripcionProceso("Proporcionar una visión holística del entorno empresarial y de I&T actual, la dirección futura y las iniciativas necesarias para migrar al entorno futuro deseado. Garantizar que el nivel de digitalización deseado sea integral en la dirección de I&T.");
        apo02.setPropositoProceso("Apoyar la estrategia de transformación digital de la organización y proporcionar el valor deseado a través de una hoja de ruta con cambios incrementales. Usar un enfoque holístico en cuanto a I&T, asegurando que cada iniciativa esté conectada con una estrategia global (ej. migración a Vehículos Definidos por Software).");

        apo02.setMetasAlineamiento("AG08: Habilitar y dar soporte a procesos de negocio mediante la integración de aplicaciones y tecnología.");
        apo02.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG12: Gestión de programas de transformación digital.");
        apo02.setMetricasModelo("Métrica 1: Plazo de comercialización para nuevos productos y servicios telemáticos (EG01).\nMétrica 2: Número de programas empresariales habilitados por I&T retrasados o que incurren en costes adicionales debido a problemas de integración tecnológica (AG08).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO02.01");
        pract01.setNombrePractica("Comprender el contexto y la dirección de la empresa");
        pract01.setDescripcionPractica("Entender el contexto de la empresa (impulsores de la industria automotriz, regulaciones, competencia), su forma actual de funcionar y su nivel de ambición en cuanto a la digitalización.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desarrollar y mantener un conocimiento de la forma actual de trabajo y la arquitectura empresarial heredada (ECUs tradicionales sin conexión a la nube)."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Conocer el nivel de ambición de la empresa en términos de digitalización para crear nuevos flujos de ingresos procedentes de nuevos modelos de negocio (suscripciones OTA)."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Identificar a partes interesadas clave (ingeniería mecánica, telecomunicaciones, ventas) y obtener información sobre sus requisitos para la plataforma conectada."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO02.02");
        pract02.setNombrePractica("Evaluar las capacidades, rendimiento y madurez digital actual de la empresa");
        pract02.setDescripcionPractica("Evaluar el rendimiento de los servicios de I&T actuales, evaluar la madurez digital actual de la empresa y su apetito de cambio tecnológico.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Desarrollar una línea base de las capacidades empresariales actuales, incluyendo las limitaciones de transmisión de datos en los modelos de vehículos existentes."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Evaluar la madurez digital en distintas dimensiones (cultura, riesgo tecnológico aceptado) y el apetito por el cambio hacia un ecosistema de nube pura."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2)); // COBIT solo lista 2 actividades clave aquí

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO02.03");
        pract03.setNombrePractica("Definir las capacidades digitales objetivo");
        pract03.setDescripcionPractica("A partir del conocimiento del contexto y dirección, definir los productos y servicios objetivo de I&T y las capacidades requeridas, considerando tecnologías emergentes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Resumir el contexto e identificar aspectos específicos de la estrategia (ej. soporte de la arquitectura legacy vs implementación del nuevo sistema operativo vehicular)."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Detallar los servicios y productos de I&T requeridos para lograr los objetivos empresariales, considerando tecnologías emergentes (5G, Edge Computing en vehículos)."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Determinar las estrategias metodológicas (Agile, DevSecOps) requeridas para lograr el portafolio de servicios de software distribuido."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("APO02.04");
        pract04.setNombrePractica("Llevar a cabo un análisis de brecha");
        pract04.setDescripcionPractica("Identificar las brechas entre los entornos actual y objetivo y describir los cambios de alto nivel en la arquitectura empresarial.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Identificar todas las brechas estructurales de red y de seguridad requeridas para lograr el entorno objetivo de actualizaciones en el aire (OTA)."); a4_1.setNivelCapacidadEsperado(3); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Evaluar el impacto de los posibles cambios en los modelos operativos de la empresa y en las capacidades de investigación y desarrollo de software."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Perfeccionar la definición del entorno objetivo y preparar una declaración de valor que destaque los beneficios de la migración tecnológica para los accionistas."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("APO02.05");
        pract05.setNombrePractica("Definir el plan estratégico y el mapa de ruta");
        pract05.setDescripcionPractica("Desarrollar una estrategia digital holística y detallar una hoja de ruta que define los pasos incrementales requeridos para lograr los objetivos de digitalización.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Definir las iniciativas requeridas para eliminar las brechas entre los entornos. Integrar las iniciativas en una estrategia de conectividad vehicular coherente."); a5_1.setNivelCapacidadEsperado(3); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Detallar una hoja de ruta con dependencias e impactos entre proyectos. Garantizar la inclusión de acciones para formar al personal en nuevas habilidades en la nube."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Designar a un campeón de transformación digital (CDO) y trasladar los objetivos a resultados medibles representados por métricas estrictas."); a5_3.setNivelCapacidadEsperado(4); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("APO02.06");
        pract06.setNombrePractica("Comunicar la dirección y estrategia de I&T");
        pract06.setDescripcionPractica("Crear concienciación y comprensión de los objetivos de digitalización mediante la comunicación a las partes interesadas en toda la empresa.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Desarrollar un plan de comunicación que cubra los mensajes clave de la transición hacia los vehículos definidos por software para el público interno."); a6_1.setNivelCapacidadEsperado(3); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Preparar un paquete de comunicación que presente la hoja de ruta de forma eficaz a los ejecutivos usando tecnologías disponibles."); a6_2.setNivelCapacidadEsperado(3); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Obtener retroalimentación de las gerencias operativas y actualizar el plan de comunicación de la estrategia tecnológica como corresponda."); a6_3.setNivelCapacidadEsperado(4); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06));
        apo02.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo02); raci1.setPracticaGestion("APO02.01"); raci1.setRolOrganizacional("Director general ejecutivo (CEO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo02); raci2.setPracticaGestion("APO02.04"); raci2.setRolOrganizacional("Director de tecnologías digitales (CDO)"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo02); raci3.setPracticaGestion("APO02.06"); raci3.setRolOrganizacional("Gestor de relaciones"); raci3.setNivelResponsabilidad("A");
        apo02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo02); flujo1.setPracticaGestion("APO02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Análisis corporativo externo"); flujo1.setDescripcion("Estrategia empresarial y análisis de fortalezas, oportunidades, debilidades y amenazas (FODA).");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo02); flujo2.setPracticaGestion("APO02.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO01.01 / APO03.01"); flujo2.setDescripcion("Hoja de ruta estratégica y Definición de iniciativas estratégicas de transformación digital.");
        apo02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo02); hab1.setNombreHabilidad("Alineamiento estratégico de sistemas de información"); hab1.setDocumentacionRelacionada("e-Competence Framework (e-CF) Part 1, 2016"); hab1.setReferenciaEspecifica("A. Plan—A.1. IS and Business Strategy Alignment. Capacidad de fusionar los objetivos comerciales con la arquitectura tecnológica.");
        apo02.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo02); pol1.setTituloPolitica("Política y principios estratégicos de I&T"); pol1.setDescripcionPolitica("Proporcionar una visión holística del entorno empresarial y de I&T actual, la dirección futura y las iniciativas necesarias para migrar al entorno futuro deseado. Garantizar que la estrategia empresarial refleje el nivel de digitalización objetivo."); pol1.setDocumentacionRelacionada("ITIL V3, Service Strategy"); pol1.setReferenciaEspecifica("3. Service strategy principles. Regulación de la planificación a largo plazo de las inversiones en sistemas.");
        apo02.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo02); cult1.setElementoCultural("Cultura de Innovación y Transformación Digital"); cult1.setDocumentacionRelacionada("Scaled Agile Framework for Lean Enterprises (SAFe)"); cult1.setReferenciaEspecifica("En el contexto actual de modelos de negocio y disrupción digital, crear una cultura que desafíe el status quo y explore nuevos métodos de trabajo, invirtiendo en automatización para responder rápidamente a los usuarios vehiculares.");
        apo02.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo02); serv1.setNombreServicioHerramienta("Servicios y herramientas de vigilancia tecnológica (Tech Scouting)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo02); serv2.setNombreServicioHerramienta("Sistema de medición del desempeño (Cuadro de mando integral corporativo)");
        apo02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo02);
    }
}