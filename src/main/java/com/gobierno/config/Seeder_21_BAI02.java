package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(21) // Continuidad en el dominio BAI
public class Seeder_21_BAI02 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_21_BAI02(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI02")) {
            System.out.println("Iniciando carga de datos de requisitos del negocio: BAI02...");
            cargarBAI02();
            System.out.println("BAI02 (Gestión de la Definición de Requisitos) cargado exitosamente.");
        }
    }

    private void cargarBAI02() {
        ProcesoCobit bai02 = new ProcesoCobit();
        bai02.setIdProceso("BAI02");
        bai02.setDominio("Construir, Adquirir e Implementar");
        bai02.setAreaPrioritaria("Modelo Core de COBIT");
        bai02.setNombreProceso("Gestionar la definición de requisitos");
        bai02.setDescripcionProceso("Identificar soluciones viables y analizar su viabilidad técnica y económica antes de proceder a su adquisición o creación, documentando de forma precisa las necesidades del negocio para evitar retrabajos.");
        bai02.setPropositoProceso("Asegurar que cada actualización de software del sistema Arene OS atienda una necesidad real y validada de la organización o del usuario, garantizando que el diseño técnico coincida exactamente con la expectativa comercial y operativa.");

        bai02.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos de negocio en soluciones operativas.\nAG08: Habilitación y soporte a los procesos comerciales mediante tecnología.");
        bai02.setMetasEmpresariales("EG01: Portafolio de productos competitivos.\nEG05: Cultura de innovación orientada al cliente.");
        bai02.setMetricasModelo("Métrica 1: Porcentaje de documentos de especificación técnica aprobados por las áreas comerciales sin requerir correcciones severas.\nMétrica 2: Número de proyectos tecnológicos que requirieron sobrecostos debido a la mala identificación inicial de las necesidades.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI02.01");
        pract01.setNombrePractica("Definir y mantener los requisitos del negocio");
        pract01.setDescripcionPractica("Traducir las expectativas de alto nivel de las gerencias en especificaciones funcionales que los ingenieros puedan programar.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Realizar talleres de levantamiento de información con las áreas de ventas y postventa para determinar qué nuevas funciones digitales demandan los conductores."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Documentar criterios de aceptación formales que determinen exactamente cuándo una funcionalidad de software se considerará terminada y exitosa."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI02.02");
        pract02.setNombrePractica("Realizar un estudio de viabilidad");
        pract02.setDescripcionPractica("Evaluar si las soluciones solicitadas son técnicamente posibles y financieramente rentables dentro de la arquitectura actual del vehículo.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Analizar si la capacidad de procesamiento del hardware interno del automóvil soporta la nueva carga de software solicitada por la gerencia comercial."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Elaborar un dictamen técnico de factibilidad antes de autorizar la escritura de código, mitigando inversiones en proyectos imposibles."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        compA.setPracticas(Arrays.asList(pract01, pract02));
        bai02.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai02); raci1.setPracticaGestion("BAI02.01"); raci1.setRolOrganizacional("Analista de Negocio Tecnológico (Business Analyst)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai02); raci2.setPracticaGestion("BAI02.02"); raci2.setRolOrganizacional("Arquitecto de Soluciones"); raci2.setNivelResponsabilidad("R");
        bai02.setComponenteB_Raci(Arrays.asList(raci1, raci2));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai02); flujo1.setPracticaGestion("BAI02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO08.02"); flujo1.setDescripcion("Acuerdos institucionales y expectativas recopiladas desde las áreas de negocio.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai02); flujo2.setPracticaGestion("BAI02.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI03.01"); flujo2.setDescripcion("Documento final de especificación de requisitos y estudio de viabilidad técnica aprobado.");
        bai02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai02); hab1.setNombreHabilidad("Análisis Funcional y Diseño de Requisitos"); hab1.setDocumentacionRelacionada("Cuerpo de Conocimiento de Análisis de Negocio (BABOK)"); hab1.setReferenciaEspecifica("Técnicas de elicitación, documentación de casos de uso y evaluación de viabilidad operativa.");
        bai02.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(bai02); pol1.setTituloPolitica("Política Corporativa de Validación de Requisitos"); pol1.setDescripcionPolitica("Normativa que prohíbe el inicio del desarrollo técnico o la compra de licencias de software sin contar con la firma de conformidad de los directores de las áreas operativas involucradas en el requerimiento."); pol1.setDocumentacionRelacionada("Manual de Desarrollo Institucional"); pol1.setReferenciaEspecifica("Sección: Aprobación de Especificaciones Formales");
        bai02.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(bai02); cult1.setElementoCultural("Cultura de Precisión y Comprensión del Cliente"); cult1.setDocumentacionRelacionada("Principios Directivos"); cult1.setReferenciaEspecifica("Fomentar la comunicación constante y el entendimiento profundo del problema de negocio antes de proponer soluciones tecnológicas, evitando el sesgo de construir tecnología por el simple hecho de innovar.");
        bai02.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(bai02); serv1.setNombreServicioHerramienta("Plataformas Centralizadas de Documentación y Seguimiento de Requisitos (Ej. Jira, Confluence)");
        bai02.setComponenteG_Servicios(Arrays.asList(serv1));

        procesoRepository.save(bai02);
    }
}