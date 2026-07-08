package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(6) // Sigue el orden secuencial
public class Seeder_06_APO01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_06_APO01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO01")) {
            System.out.println("Iniciando carga de datos 3FN: APO01...");
            cargarAPO01();
            System.out.println("APO01 (Marco de Gestión de I&T) cargado exitosamente.");
        }
    }

    private void cargarAPO01() {
        ProcesoCobit apo01 = new ProcesoCobit();
        apo01.setIdProceso("APO01");
        apo01.setDominio("Alinear, Planificar y Organizar");
        apo01.setAreaPrioritaria("Modelo Core de COBIT");
        apo01.setNombreProceso("Gestionar el marco de gestión de I&T");
        apo01.setDescripcionProceso("Aclarar y mantener la gobernanza y el marco de gestión de la TI de la empresa. Implementar un enfoque de gestión coherente para permitir que se alcancen los requisitos de gobierno.");
        apo01.setPropositoProceso("Diseñar e implementar el ecosistema de trabajo ágil combinando COBIT para el gobierno, ITIL v4 para la entrega del servicio OTA y Scrum para el desarrollo continuo del software Arene OS.");

        apo01.setMetasAlineamiento("AG08: Habilitar y dar soporte a los procesos de negocio mediante la integración de TI.\nAG11: Cumplimiento de las políticas internas por parte de TI.");
        apo01.setMetasEmpresariales("EG05: Cultura de innovación orientada al cliente.\nEG08: Optimización de la funcionalidad de los procesos internos.");
        apo01.setMetricasModelo("Métrica 1: Porcentaje de equipos de desarrollo de software vehicular trabajando bajo marcos ágiles (Scrum) formalizados.\nMétrica 2: Frecuencia de actualización de los manuales de procesos ITIL frente a nuevos despliegues en la nube.");

        // ==========================================
        // COMPONENTE A: PROCESOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO01.01");
        pract01.setNombrePractica("Diseñar el sistema de gestión");
        pract01.setDescripcionPractica("Definir cómo se estructurarán las metodologías de trabajo para soportar la agilidad que requiere el proyecto OTA.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer ciclos de Sprints de 2 a 3 semanas para el desarrollo de nuevas funciones vehiculares."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Integrar las prácticas de Gestión de Incidentes de ITIL v4 para canalizar fallos de firmware reportados por la telemetría del auto."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO01.02");
        pract02.setNombrePractica("Comunicar los objetivos y la dirección");
        pract02.setDescripcionPractica("Asegurar que toda la ingeniería y operaciones entiendan las reglas del nuevo ecosistema de trabajo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Realizar sesiones de inducción sobre el flujo de valor (Value Stream) del software desde AWS hasta el vehículo."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Publicar el repositorio central de metodologías (Wiki corporativa) accesible a todos los desarrolladores."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO01.03");
        pract03.setNombrePractica("Optimizar el sistema de gestión");
        pract03.setDescripcionPractica("Mejorar continuamente los marcos de trabajo para evitar cuellos de botella burocráticos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Realizar retrospectivas de Scrum al finalizar cada despliegue OTA para ajustar los tiempos de entrega."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Automatizar la documentación de cambios en AWS utilizando herramientas de Infraestructura como Código (Terraform)."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo01); raci1.setPracticaGestion("APO01.01"); raci1.setRolOrganizacional("Director de Información (CIO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo01); raci2.setPracticaGestion("APO01.01"); raci2.setRolOrganizacional("Arquitecto Empresarial"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo01); raci3.setPracticaGestion("APO01.02"); raci3.setRolOrganizacional("Oficina de Gestión de Proyectos (PMO)"); raci3.setNivelResponsabilidad("R");
        MatrizRaci raci4 = new MatrizRaci(); raci4.setProceso(apo01); raci4.setPracticaGestion("APO01.03"); raci4.setRolOrganizacional("Scrum Masters / Agile Coaches"); raci4.setNivelResponsabilidad("R");

        apo01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3, raci4));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo01); flujo1.setPracticaGestion("APO01.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM01.02"); flujo1.setDescripcion("Principios rectores de gobierno corporativo para la nueva división de software.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo01); flujo2.setPracticaGestion("APO01.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos de TI"); flujo2.setDescripcion("Manual del sistema de gestión integrado (Agile + ITIL).");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(apo01); flujo3.setPracticaGestion("APO01.03"); flujo3.setTipoFlujo("ENTRADA"); flujo3.setOrigenDestino("DE: MEA01.03"); flujo3.setDescripcion("Feedback sobre la fricción en los procesos actuales de desarrollo.");

        apo01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo01); hab1.setNombreHabilidad("Arquitectura Empresarial"); hab1.setDocumentacionRelacionada("Marco TOGAF / e-CF"); hab1.setReferenciaEspecifica("Diseño de ecosistemas operativos (Nivel 4).");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(apo01); hab2.setNombreHabilidad("Metodologías Ágiles"); hab2.setDocumentacionRelacionada("Guía Scrum / SAFe"); hab2.setReferenciaEspecifica("Facilitación de ceremonias ágiles y gestión del Backlog.");

        apo01.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo01); pol1.setTituloPolitica("Política de Marco de Trabajo de TI"); pol1.setDescripcionPolitica("Mandato corporativo que exige el uso de repositorios versionados (Git) y tableros Kanban/Scrum para cualquier modificación que impacte el código fuente de los vehículos Toyota."); pol1.setDocumentacionRelacionada("Directrices de Desarrollo Arene OS"); pol1.setReferenciaEspecifica("Sección 2: Estándares de Ingeniería de Software");

        apo01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo01); cult1.setElementoCultural("Cultura de Agilidad y Adaptabilidad"); cult1.setDocumentacionRelacionada("Manifiesto Ágil"); cult1.setReferenciaEspecifica("Fomentar la respuesta al cambio por encima del seguimiento estricto de un plan tradicional, vital para responder a vulnerabilidades zero-day.");

        apo01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS E INFRAESTRUCTURA
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo01); serv1.setNombreServicioHerramienta("Atlassian Jira Software (Gestión Ágil)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo01); serv2.setNombreServicioHerramienta("Confluence / Notion (Repositorio del conocimiento de gestión)");

        apo01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo01);
    }
}