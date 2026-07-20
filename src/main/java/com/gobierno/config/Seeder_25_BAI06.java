package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(24) // Secuencia en el dominio BAI
public class Seeder_25_BAI06 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_25_BAI06(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI06")) {
            System.out.println("Iniciando carga de datos oficiales: BAI06...");
            cargarBAI06();
            System.out.println("BAI06 (Gestionar los cambios de TI) cargado exitosamente.");
        }
    }

    private void cargarBAI06() {
        // ==========================================
        // INFORMACIÓN GENERAL (COBIT 2019 OFICIAL)
        // ==========================================
        ProcesoCobit bai06 = new ProcesoCobit();
        bai06.setIdProceso("BAI06");
        bai06.setDominio("Construir, Adquirir e Implementar");
        bai06.setAreaPrioritaria("Modelo Core de COBIT");
        bai06.setNombreProceso("Gestionar los cambios de TI");
        bai06.setDescripcionProceso("Gestionar todos los cambios de una manera controlada, incluidos los cambios estándar y los mantenimientos de emergencia en relación con los procesos de negocio, las aplicaciones y la infraestructura.");
        bai06.setPropositoProceso("Facilitar una ejecución de cambios rápida y confiable para el negocio. Mitigar el riesgo de afectar negativamente la estabilidad o integridad de la flota vehicular durante la transmisión de actualizaciones de software por aire (OTA).");

        bai06.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos del negocio en soluciones operativas.");
        bai06.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.");
        bai06.setMetricasModelo("Métrica 1: Plazo de comercialización promedio para servicios y aplicaciones nuevos relacionados con I&T (AG06).\nMétrica 2: Porcentaje de productos y servicios que cumplen o exceden los objetivos de satisfacción del cliente post-actualización (EG01).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES (Enfoque OTA)
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai06);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        // Práctica 1
        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI06.01");
        pract01.setNombrePractica("Evaluar, priorizar y autorizar solicitudes de cambio");
        pract01.setDescripcionPractica("Evaluar todas las solicitudes de cambio para determinar el impacto en los vehículos conectados y asegurar que no introduzcan riesgos inaceptables de seguridad o funcionamiento.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Usar solicitudes de cambio formales para cualquier modificación del firmware vehicular o backend, categorizándolas por criticidad y riesgo técnico."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Aprobar formalmente cada cambio a través de un Consejo Asesor de Cambios (CAB), exigiendo revisión de seguridad vial y de datos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Planificar y evaluar el análisis de impacto estructurado sobre las ECUs, la red celular y los planes de recuperación ante fallos de despliegue."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        // Práctica 2
        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI06.02");
        pract02.setNombrePractica("Gestionar cambios de emergencia");
        pract02.setDescripcionPractica("Gestionar cuidadosamente los parches críticos (ej. vulnerabilidades Zero-Day) para asegurar que se apliquen rápidamente en la flota de forma segura y controlada.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir los criterios estrictos que constituyen un cambio de emergencia en el contexto de ciberseguridad automotriz."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Verificar que los acuerdos de acceso de emergencia a los servidores de despliegue se documenten y revoquen inmediatamente tras aplicar el parche."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Monitorizar los cambios de emergencia y realizar revisiones post-implementación para identificar la causa raíz de la falla de seguridad original."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        // Práctica 3
        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI06.03");
        pract03.setNombrePractica("Hacer seguimiento e informar sobre cambios de estado");
        pract03.setDescripcionPractica("Mantener un sistema de seguimiento para comunicar el estado de las actualizaciones aprobadas, en despliegue inalámbrico y completadas.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Categorizar las solicitudes de actualización en el sistema de seguimiento ITSM (ej. aprobado, empaquetado, en despliegue OTA, finalizado)."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Implementar informes de estado con métricas de rendimiento que formen una pista de auditoría inmutable desde el inicio hasta la confirmación de instalación en el auto."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Monitorizar los despliegues abiertos para asegurarse de que todas las instalaciones vehiculares se cierren de manera oportuna según su prioridad."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        // Práctica 4
        PracticaCobit pract04 = new PracticaCobit();
        pract04.setComponente(compA);
        pract04.setIdPractica("BAI06.04");
        pract04.setNombrePractica("Cerrar y documentar los cambios");
        pract04.setDescripcionPractica("Siempre que se apliquen actualizaciones en la flota, actualizar la base de datos de configuración (CMDB) y los manuales del usuario del vehículo.");
        Actividad a4_1 = new Actividad(); a4_1.setPractica(pract04); a4_1.setDescripcionActividad("Incluir los cambios técnicos en la documentación de continuidad del negocio, manuales del usuario del vehículo y pantallas de ayuda del infoentretenimiento."); a4_1.setNivelCapacidadEsperado(2); a4_1.setCalificacionActual("N");
        Actividad a4_2 = new Actividad(); a4_2.setPractica(pract04); a4_2.setDescripcionActividad("Definir un período de retención adecuado para la documentación y los logs de la telemetría generada antes y después de aplicar el parche OTA."); a4_2.setNivelCapacidadEsperado(3); a4_2.setCalificacionActual("N");
        Actividad a4_3 = new Actividad(); a4_3.setPractica(pract04); a4_3.setDescripcionActividad("Someter la actualización de los manuales y registros de configuración al mismo nivel estricto de revisión de calidad que el código del parche."); a4_3.setNivelCapacidadEsperado(3); a4_3.setCalificacionActual("N");
        pract04.setActividades(Arrays.asList(a4_1, a4_2, a4_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03, pract04));
        bai06.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai06); raci1.setPracticaGestion("BAI06.01"); raci1.setRolOrganizacional("Director de TI"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai06); raci2.setPracticaGestion("BAI06.02"); raci2.setRolOrganizacional("Director de TI / Jefe de operaciones de TI"); raci2.setNivelResponsabilidad("A");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai06); raci3.setPracticaGestion("BAI06.04"); raci3.setRolOrganizacional("Jefe de operaciones de TI"); raci3.setNivelResponsabilidad("R");
        bai06.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai06); flujo1.setPracticaGestion("BAI06.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI03.05 / DSS02.03"); flujo1.setDescripcion("Componentes de la solución integrados y configurados; Solicitudes de servicio (correcciones) aprobadas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai06); flujo2.setPracticaGestion("BAI06.01"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.01"); flujo2.setDescripcion("Plan y cronograma de despliegue de cambios; Solicitudes de cambio aprobadas por el CAB.");
        bai06.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai06); hab1.setNombreHabilidad("Gestión de cambios informáticos"); hab1.setDocumentacionRelacionada("Skills Framework for the Information Age V6, 2015"); hab1.setReferenciaEspecifica("Identificador: CHMG. Capacidad técnica y de gestión para orquestar transiciones seguras.");
        bai06.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai06); pol1.setTituloPolitica("Política de gestión de cambios de TI"); pol1.setDescripcionPolitica("Comunica a la dirección la intención de que todos los cambios (especialmente de firmware vehicular) se gestionen e implementen minimizando el riesgo de operación y el impacto en la seguridad del conductor. Cubre los activos afectados y el proceso de aprobación estricta."); pol1.setDocumentacionRelacionada("ITIL V3, 2011 Service Transition"); pol1.setReferenciaEspecifica("4.2 Change Management.");
        bai06.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai06); cult1.setElementoCultural("Cultura de Agilidad con Seguridad Técnica"); cult1.setDocumentacionRelacionada("Marco Operativo de Gobierno de TI"); cult1.setReferenciaEspecifica("Los directivos deben balancear el impacto del cambio tecnológico contra su riesgo inherente. Establecer una cultura que apoye el despliegue rápido, pero que penalice severamente la evasión de los controles formales de cambio en sistemas críticos.");
        bai06.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai06); serv1.setNombreServicioHerramienta("Herramientas de gestión de cambios de TI (ITSM / Jira Service Management)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai06); serv2.setNombreServicioHerramienta("Herramientas de gestión de la configuración y gemelos digitales (Digital Twins)");
        bai06.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai06);
    }
}