package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(17) // Secuencia en el dominio APO
public class Seeder_17_APO12 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_17_APO12(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO12")) {
            System.out.println("Iniciando carga de datos oficiales: APO12...");
            cargarAPO12();
            System.out.println("APO12 (Gestionar el riesgo) cargado exitosamente.");
        }
    }

    private void cargarAPO12() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit apo12 = new ProcesoCobit();
        apo12.setIdProceso("APO12");
        apo12.setDominio("Alinear, Planificar y Organizar");
        apo12.setAreaPrioritaria("Modelo Core de COBIT");
        apo12.setNombreProceso("Gestionar el riesgo");
        apo12.setDescripcionProceso("Identificar, evaluar y reducir continuamente los riesgos relacionados con I&T dentro de los niveles de tolerancia establecidos por la gerencia ejecutiva de la empresa.");
        apo12.setPropositoProceso("Integrar la gestión del riesgo de I&T con el riesgo empresarial global (ERM), asegurando que las vulnerabilidades en la plataforma de vehículos conectados y actualizaciones OTA se identifiquen y mitiguen antes de impactar la seguridad de la flota y el prestigio de la marca.");

        apo12.setMetasAlineamiento("AG02: Gestión de riesgo relacionado con I&T.\nAG07: Seguridad de la información, infraestructura de procesamiento y aplicaciones, y privacidad.");
        apo12.setMetasEmpresariales("EG02: Gestión de riesgo de negocio.\nEG06: Continuidad y disponibilidad del servicio de negocio.");
        apo12.setMetricasModelo("Métrica 1: Porcentaje de los objetivos y servicios críticos del negocio cubiertos por la evaluación de riesgos (EG02).\nMétrica 2: Número de incidentes significativos relacionados con I&T que no se identificaron previamente en la evaluación de riesgos (AG02).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo12);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO12.01");
        pract01.setNombrePractica("Recopilar datos");
        pract01.setDescripcionPractica("Identificar y recopilar datos relevantes para habilitar una efectiva identificación, análisis y reporte de los riesgos relacionados con I&T en el entorno automotriz.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer y mantener un método para la recogida, clasificación y análisis de datos relacionados con el riesgo de I&T extraídos de los logs de telemetría vehicular."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Adoptar o definir una taxonomía de riesgo para las definiciones consistentes de escenarios de ciberataques, asignando categorías de impacto y probabilidad."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Estudiar los datos históricos de riesgo a partir de bases de datos de la industria sobre vulnerabilidades conocidas en redes vehiculares (CAN bus) y ECUs."); a1_3.setNivelCapacidadEsperado(4); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO12.02");
        pract02.setNombrePractica("Analizar el riesgo");
        pract02.setDescripcionPractica("Desarrollar una visión fundamentada del riesgo de I&T vigente, que soporte las decisiones de riesgo corporativo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Crear y actualizar regularmente escenarios de riesgo, incluyendo ataques de inyección de código durante actualizaciones OTA o fallos masivos en la infraestructura Cloud."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Validar el análisis de riesgo y los resultados del análisis de impacto del negocio (BIA) antes de usarlos en la toma de decisiones para desplegar parches."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Analizar el coste/beneficio de las posibles opciones de respuesta al riesgo (evitar, mitigar, transferir, aceptar) para confirmar la estrategia óptima de defensa."); a2_3.setNivelCapacidadEsperado(5); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO12.03");
        pract03.setNombrePractica("Mantener un perfil de riesgo");
        pract03.setDescripcionPractica("Mantener un inventario de los riesgos conocidos y los atributos de riesgo. Documentar los recursos y capacidades actuales relacionados con los elementos de riesgo.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Hacer un inventario de los procesos de negocio y documentar su dependencia con la plataforma de gestión de flotas y los recursos de AWS."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Capturar regularmente toda la información del perfil de riesgo y consolidarla en un perfil de riesgo agregado aplicable a todas las gamas de vehículos."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Definir un conjunto de indicadores de riesgo (KRI) que permitan una monitorización rápida del nivel de exposición de los puertos de diagnóstico vehicular."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("APO12.04");
        pract04.setNombrePractica("Articular el riesgo");
        pract04.setDescripcionPractica("Comunicar de manera oportuna información sobre el estado actual de las exposiciones relacionadas con I&T a todas las partes interesadas.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Informar sobre los resultados del análisis de riesgo a todas las partes interesadas en términos útiles, incluyendo rangos de pérdidas financieras y de seguridad."); a4_1.setNivelCapacidadEsperado(3); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Proporcionar a los responsables de la toma de decisiones la comprensión de los peores escenarios, como la paralización maliciosa de la flota en movimiento."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Revisar los resultados de evaluaciones objetivas de terceros (penetration testing automotriz) y reflejar las vulnerabilidades descubiertas en el perfil de riesgo."); a4_3.setNivelCapacidadEsperado(4); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        // Práctica 5
        PracticaCobit pract05 = new PracticaCobit();
        pract05.setComponente(compA);
        pract05.setIdPractica("APO12.05");
        pract05.setNombrePractica("Definir un portafolio con acciones de gestión de riesgos");
        pract05.setDescripcionPractica("Gestionar las oportunidades para reducir el riesgo a un nivel aceptable abordándolo como un portafolio de proyectos.");
        Actividad a5_1 = new Actividad(); a5_1.setPractica(pract05); a5_1.setDescripcionActividad("Mantener un inventario de las actividades de control que se han implantado para mitigar el riesgo, como el cifrado de extremo a extremo en la telemetría."); a5_1.setNivelCapacidadEsperado(2); a5_1.setCalificacionActual("N");
        Actividad a5_2 = new Actividad(); a5_2.setPractica(pract05); a5_2.setDescripcionActividad("Determinar si cada entidad organizativa monitoriza el riesgo y acepta la responsabilidad de actuar dentro de los niveles de tolerancia individuales."); a5_2.setNivelCapacidadEsperado(3); a5_2.setCalificacionActual("N");
        Actividad a5_3 = new Actividad(); a5_3.setPractica(pract05); a5_3.setDescripcionActividad("Definir un conjunto de propuestas diseñadas para reducir el riesgo, evaluando inversiones críticas como la integración de Módulos de Seguridad de Hardware (HSM) en las ECUs."); a5_3.setNivelCapacidadEsperado(3); a5_3.setCalificacionActual("N");
        pract05.setActividades(Arrays.asList(a5_1, a5_2, a5_3));

        // Práctica 6
        PracticaCobit pract06 = new PracticaCobit();
        pract06.setComponente(compA);
        pract06.setIdPractica("APO12.06");
        pract06.setNombrePractica("Responder al riesgo");
        pract06.setDescripcionPractica("Responder de manera oportuna a eventos de riesgo materializados con medidas eficaces para limitar la magnitud de las pérdidas.");
        Actividad a6_1 = new Actividad(); a6_1.setPractica(pract06); a6_1.setDescripcionActividad("Preparar y probar planes documentando los pasos específicos ante incidentes graves, como la activación de protocolos de reversión automática (rollback) de software."); a6_1.setNivelCapacidadEsperado(3); a6_1.setCalificacionActual("N");
        Actividad a6_2 = new Actividad(); a6_2.setPractica(pract06); a6_2.setDescripcionActividad("Clasificar los incidentes y comunicar los impactos operativos de forma transparente a los responsables de la toma de decisiones del directorio."); a6_2.setNivelCapacidadEsperado(4); a6_2.setCalificacionActual("N");
        Actividad a6_3 = new Actividad(); a6_3.setPractica(pract06); a6_3.setDescripcionActividad("Examinar eventos adversos del pasado, determinar las causas raíz del incidente cibernético y asegurar que las mejoras se inyecten en el gobierno del riesgo."); a6_3.setNivelCapacidadEsperado(5); a6_3.setCalificacionActual("N");
        pract06.setActividades(Arrays.asList(a6_1, a6_2, a6_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04, pract05, pract06));
        apo12.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo12); raci1.setPracticaGestion("APO12.01"); raci1.setRolOrganizacional("Director de riesgos"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo12); raci2.setPracticaGestion("APO12.02"); raci2.setRolOrganizacional("Director de riesgos"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo12); raci3.setPracticaGestion("APO12.06"); raci3.setRolOrganizacional("Director de TI / Director de seguridad de la información"); raci3.setNivelResponsabilidad("R");
        apo12.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo12); flujo1.setPracticaGestion("APO12.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.02 / EDM03.01"); flujo1.setDescripcion("Problemas y factores de riesgo emergentes en las capacidades de digitalización actuales.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo12); flujo2.setPracticaGestion("APO12.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO01.01 / APO02.02 / EDM03.03"); flujo2.setDescripcion("Resultados del análisis de riesgos y matriz de escenarios de riesgo de I&T.");
        apo12.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo12); hab1.setNombreHabilidad("Gestión de riesgos de negocio"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: BURM. Capacidades directivas para estructurar estrategias y mitigar vulnerabilidades críticas de negocio.");
        apo12.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo12); pol1.setTituloPolitica("Política de riesgo empresarial y riesgo de fraude"); pol1.setDescripcionPolitica("Define el gobierno y gestión del riesgo empresarial a nivel estratégico, táctico y operativo, buscando satisfacer los objetivos de seguridad y proteger la marca en caso de pérdida o daño por mala conducta o incidentes cibernéticos."); pol1.setDocumentacionRelacionada("NIST Special Publication 800-53"); pol1.setReferenciaEspecifica("3.17 Risk assessment (RA-1). Marco riguroso para la evaluación formal de riesgos.");
        apo12.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo12); cult1.setElementoCultural("Cultura de Riesgo Participativa y Transparente"); cult1.setDocumentacionRelacionada("ISF, The Standard of Good Practice for Information Security"); cult1.setReferenciaEspecifica("La alta dirección debe mostrar un apoyo visible a las prácticas de riesgo en toda la empresa. Los comportamientos deseables incluyen una comunicación abierta de tendencias de riesgo, fomento para reportar problemas de seguridad sin represalias y alineamiento operativo con el apetito de riesgo corporativo.");
        apo12.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo12); serv1.setNombreServicioHerramienta("Herramientas de Gobierno, Riesgo y Cumplimiento (GRC)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo12); serv2.setNombreServicioHerramienta("Servicios de inteligencia de amenazas cibernéticas y gestión de crisis");
        apo12.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo12);
    }
}