package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(4)
public class Seeder_04_EDM04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_04_EDM04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("EDM04")) {
            System.out.println("Iniciando carga de datos 3FN: EDM04...");
            cargarEDM04();
            System.out.println("EDM04 (Optimización de Recursos) cargado exitosamente.");
        }
    }

    private void cargarEDM04() {
        ProcesoCobit edm04 = new ProcesoCobit();
        edm04.setIdProceso("EDM04");
        edm04.setDominio("Evaluar, Dirigir y Monitorizar");
        edm04.setAreaPrioritaria("Modelo Core de COBIT");
        edm04.setNombreProceso("Asegurar la optimización de recursos");
        edm04.setDescripcionProceso("Asegurar que las capacidades relacionadas con la TI adecuadas y suficientes (personas, procesos y tecnología) estén disponibles para apoyar eficazmente los objetivos de la empresa a un coste óptimo.");
        edm04.setPropositoProceso("Garantizar que Toyota disponga de la capacidad de cómputo en AWS, el ancho de banda 5G y el talento en ingeniería de software necesario para soportar despliegues OTA globales sin cuellos de botella.");

        edm04.setMetasAlineamiento("AG02: Riesgo de seguridad de la TI gestionado (Asignación de talento a ciberseguridad).\nAG07: Seguridad de la información e infraestructura de TI (Optimización Cloud).");
        edm04.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG08: Optimización de la funcionalidad de los procesos de negocio internos.");
        edm04.setMetricasModelo("Métrica 1: Nivel de utilización de la infraestructura Cloud (AWS Auto Scaling) durante campañas masivas de actualización OTA.\nMétrica 2: Porcentaje de vacantes clave de ingeniería (DevSecOps) cubiertas a tiempo.");

        // ==========================================
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(edm04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("EDM04.01");
        pract01.setNombrePractica("Evaluar la gestión de recursos");
        pract01.setDescripcionPractica("Examinar continuamente las necesidades futuras de recursos tecnológicos y de talento para soportar el crecimiento de la flota conectada.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Evaluar la demanda proyectada de ancho de banda y capacidad de servidores AWS para los próximos lanzamientos de software."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Revisar las brechas de habilidades en la plantilla actual respecto a tecnologías emergentes (ej. Inteligencia Artificial en el Arene OS)."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("EDM04.02");
        pract02.setNombrePractica("Dirigir la gestión de recursos");
        pract02.setDescripcionPractica("Asegurar la adopción de principios de gestión de recursos para alinear las inversiones de TI con la estrategia OTA.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Priorizar la asignación de arquitectos Cloud y especialistas en ciberseguridad a los módulos críticos del motor y frenos."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Aprobar políticas de contratación de servicios de nube elástica (Pay-as-you-go) para evitar sobrecostos por capacidad inactiva."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("EDM04.03");
        pract03.setNombrePractica("Monitorizar la gestión de recursos");
        pract03.setDescripcionPractica("Supervisar la asignación de recursos y el rendimiento para garantizar un uso óptimo.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Monitorear tableros de FinOps para asegurar que el consumo de datos de los vehículos no exceda el presupuesto planificado."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Auditar las tasas de retención del talento técnico clave (desarrolladores de SO vehicular)."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        edm04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(edm04); raci1.setPracticaGestion("EDM04.01"); raci1.setRolOrganizacional("Director Ejecutivo (CEO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(edm04); raci2.setPracticaGestion("EDM04.02"); raci2.setRolOrganizacional("Director de Información (CIO)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(edm04); raci3.setPracticaGestion("EDM04.03"); raci3.setRolOrganizacional("Director de Recursos Humanos (CHRO)"); raci3.setNivelResponsabilidad("C");

        edm04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(edm04); flujo1.setPracticaGestion("EDM04.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO07.01"); flujo1.setDescripcion("Informes de escasez de habilidades tecnológicas (ej. falta de expertos en criptografía vehicular).");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(edm04); flujo2.setPracticaGestion("EDM04.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO07.02"); flujo2.setDescripcion("Principios rectores para la asignación de talento técnico a Sprints de desarrollo.");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(edm04); flujo3.setPracticaGestion("EDM04.03"); flujo3.setTipoFlujo("ENTRADA"); flujo3.setOrigenDestino("DE: APO09.05"); flujo3.setDescripcion("Métricas de uso de ancho de banda y latencia de infraestructura AWS.");

        edm04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(edm04); hab1.setNombreHabilidad("Gestión de Capacidad de TI"); hab1.setDocumentacionRelacionada("ITIL v4 - Prácticas de Gestión"); hab1.setReferenciaEspecifica("Planificación de la demanda y gestión de capacidad en entornos Cloud.");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(edm04); hab2.setNombreHabilidad("Planificación de Fuerza Laboral (Workforce Planning)"); hab2.setDocumentacionRelacionada("Marco SFIA v8"); hab2.setReferenciaEspecifica("Asignación y retención de talento digital (Nivel 5).");

        edm04.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(edm04); pol1.setTituloPolitica("Política de Elasticidad y Escalado Cloud"); pol1.setDescripcionPolitica("Define los umbrales automáticos mediante los cuales los servidores de AWS pueden crecer o reducirse dependiendo de la cantidad de vehículos conectados simultáneamente solicitando parches OTA."); pol1.setDocumentacionRelacionada("Directrices de Arquitectura Toyota"); pol1.setReferenciaEspecifica("Sección: Optimización de Infraestructura AWS");

        edm04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(edm04); cult1.setElementoCultural("Cultura de Eficiencia Sostenible (Green IT)"); cult1.setDocumentacionRelacionada("Objetivos ESG (Ambiental, Social y Gobernanza)"); cult1.setReferenciaEspecifica("Concienciar a los equipos técnicos sobre la reducción del consumo de cómputo redundante para minimizar la huella de carbono de los servidores.");

        edm04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(edm04); serv1.setNombreServicioHerramienta("AWS Auto Scaling y Amazon CloudWatch");
        Servicio serv2 = new Servicio(); serv2.setProceso(edm04); serv2.setNombreServicioHerramienta("Plataformas de Gestión de Talento (Ej. Workday, Jira Resource Management)");

        edm04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        // PERSISTENCIA
        procesoRepository.save(edm04);
    }
}