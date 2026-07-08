package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(8)
public class Seeder_08_APO03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_08_APO03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO03")) {
            System.out.println("Iniciando carga de datos 3FN: APO03...");
            cargarAPO03();
            System.out.println("APO03 (Arquitectura Empresarial) cargado exitosamente.");
        }
    }

    private void cargarAPO03() {
        ProcesoCobit apo03 = new ProcesoCobit();
        apo03.setIdProceso("APO03");
        apo03.setDominio("Alinear, Planificar y Organizar");
        apo03.setAreaPrioritaria("Modelo Core de COBIT");
        apo03.setNombreProceso("Gestionar la arquitectura empresarial");
        apo03.setDescripcionProceso("Establecer una arquitectura común, compuesta por procesos de negocio, información, datos, aplicación y capas de arquitectura tecnológica.");
        apo03.setPropositoProceso("Diseñar la topología de red en AWS (VPCs, Subnets), la estructura de la base de datos telemática y la arquitectura de microservicios para el Arene OS, garantizando la escalabilidad OTA.");

        apo03.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos de negocio en soluciones operativas.\nAG07: Seguridad de la información e infraestructura de procesamiento.");
        apo03.setMetasEmpresariales("EG08: Optimización de la funcionalidad de los procesos de negocio internos.\nEG11: Cumplimiento de políticas internas.");
        apo03.setMetricasModelo("Métrica 1: Porcentaje de microservicios del vehículo documentados en el repositorio central de arquitectura.\nMétrica 2: Número de excepciones o violaciones a la arquitectura de seguridad Zero Trust en los despliegues en la nube.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO03.01");
        pract01.setNombrePractica("Desarrollar la visión de la arquitectura empresarial");
        pract01.setDescripcionPractica("Definir el diseño conceptual y los bloques de construcción tecnológicos (Building Blocks) para el despliegue del Arene OS.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir el uso de contenedores (Docker/Kubernetes) en AWS EKS para aislar las funciones de telemetría."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Establecer el bus de integración de eventos (Kafka) para procesar los datos de los sensores de los vehículos en tiempo real."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO03.02");
        pract02.setNombrePractica("Definir la arquitectura de referencia");
        pract02.setDescripcionPractica("Crear un repositorio de modelos y estándares aprobados que todos los equipos de desarrollo (Scrum) deben usar.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Documentar las API RESTful estandarizadas que permitirán que la aplicación móvil de Toyota se comunique con el auto."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Crear plantillas de Infraestructura como Código (IaC) para desplegar entornos de prueba en la nube de forma idéntica."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        compA.setPracticas(Arrays.asList(pract01, pract02));
        apo03.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo03); raci1.setPracticaGestion("APO03.01"); raci1.setRolOrganizacional("Arquitecto Empresarial (Chief Architect)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo03); raci2.setPracticaGestion("APO03.02"); raci2.setRolOrganizacional("Líderes Técnicos (Tech Leads)"); raci2.setNivelResponsabilidad("R");
        apo03.setComponenteB_Raci(Arrays.asList(raci1, raci2));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo03); flujo1.setPracticaGestion("APO03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.05"); flujo1.setDescripcion("Plan estratégico multianual de transición hacia vehículos conectados.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo03); flujo2.setPracticaGestion("APO03.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI02.01"); flujo2.setDescripcion("Modelos de arquitectura de microservicios aprobados para desarrollo.");
        apo03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo03); hab1.setNombreHabilidad("Diseño de Arquitectura Cloud (Cloud Architecture)"); hab1.setDocumentacionRelacionada("AWS Certified Solutions Architect"); hab1.setReferenciaEspecifica("Diseño de topologías de alta disponibilidad (Multi-AZ) y escalado automático.");
        apo03.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(apo03); pol1.setTituloPolitica("Estándar de Microservicios Vehiculares"); pol1.setDescripcionPolitica("Prohíbe la creación de aplicaciones monolíticas. Cada subsistema del vehículo (ej. infoentretenimiento vs. control de frenos) debe operar como un microservicio independiente en el código."); pol1.setDocumentacionRelacionada("Directrices de Desarrollo Arene OS"); pol1.setReferenciaEspecifica("Capítulo de Aislamiento de Procesos");
        apo03.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(apo03); cult1.setElementoCultural("Cultura de Reutilización Técnica"); cult1.setDocumentacionRelacionada("Manual de Desarrollo Interno"); cult1.setReferenciaEspecifica("Fomentar la búsqueda de APIs y librerías existentes en el repositorio antes de programar soluciones desde cero.");
        apo03.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(apo03); serv1.setNombreServicioHerramienta("AWS Architecture Tooling / Draw.io Enterprise");
        apo03.setComponenteG_Servicios(Arrays.asList(serv1));

        procesoRepository.save(apo03);
    }
}