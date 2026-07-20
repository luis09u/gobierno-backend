package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(22)
public class Seeder_22_BAI03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_22_BAI03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI03")) {
            cargarBAI03();
        }
    }

    private void cargarBAI03() {
        ProcesoCobit bai03 = new ProcesoCobit();
        bai03.setIdProceso("BAI03");
        bai03.setDominio("Construir, Adquirir e Implementar");
        bai03.setAreaPrioritaria("Modelo Core de COBIT");
        bai03.setNombreProceso("Gestionar la identificación y construcción de soluciones");
        bai03.setDescripcionProceso("Establecer y mantener en la I&T las soluciones identificadas de acuerdo con los requerimientos de la empresa. Las soluciones pueden ser sistemas, servicios o infraestructura internos o de terceros.");
        bai03.setPropositoProceso("Asegurar que la programación y configuración de los sistemas vehiculares se ejecute de manera estandarizada y segura, garantizando que el código final cumpla estrictamente con las necesidades del cliente y sea resistente a vulnerabilidades operativas.");

        bai03.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos de negocio en soluciones operativas.\nAG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.");
        bai03.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG05: Cultura de innovación orientada al cliente.");
        bai03.setMetricasModelo("Métrica 1: Porcentaje de soluciones que cumplen o exceden los criterios de calidad.\nMétrica 2: Número de defectos encontrados durante las pruebas.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI03.01");
        pract01.setNombrePractica("Diseñar soluciones de alto nivel");
        pract01.setDescripcionPractica("Desarrollar y documentar diseños de alto nivel para las soluciones de I&T basándose en los requerimientos del negocio.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desarrollar diseños de alto nivel que estén alineados con la arquitectura de la I&T."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Asegurar que los diseños consideren todos los aspectos de la solución: componentes tecnológicos, humanos y de procesos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Obtener la aprobación del diseño de alto nivel por parte de las partes interesadas."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI03.02");
        pract02.setNombrePractica("Diseñar componentes detallados de la solución");
        pract02.setDescripcionPractica("Desarrollar y documentar diseños detallados para todos los componentes técnicos y no técnicos de la solución.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Desarrollar diseños detallados para los componentes de las aplicaciones y la infraestructura técnica."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Desarrollar diseños detallados para los procedimientos operacionales de la TI y el material de formación de los usuarios."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Revisar todos los diseños detallados en relación con el diseño de alto nivel aprobado, de modo que asegure la continuidad."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI03.03");
        pract03.setNombrePractica("Desarrollar componentes de la solución");
        pract03.setDescripcionPractica("Desarrollar los componentes de la solución de acuerdo con los diseños detallados y las directrices y estándares correspondientes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Adquirir o construir los componentes requeridos."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Desarrollar o adecuar procedimientos operacionales."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Realizar y documentar pruebas unitarias para confirmar que los componentes individuales cumplen con las especificaciones del diseño."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai03.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai03); raci1.setPracticaGestion("BAI03.01"); raci1.setRolOrganizacional("Arquitecto Jefe de Sistemas (Chief Architect)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai03); raci2.setPracticaGestion("BAI03.02"); raci2.setRolOrganizacional("Líderes de Ingeniería y Desarrollo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai03); raci3.setPracticaGestion("BAI03.03"); raci3.setRolOrganizacional("Área de Aseguramiento de Calidad Técnica"); raci3.setNivelResponsabilidad("R");
        bai03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai03); flujo1.setPracticaGestion("BAI03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI02.02"); flujo1.setDescripcion("Documentos formales de especificación de requerimientos de negocio y estudios de viabilidad.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai03); flujo2.setPracticaGestion("BAI03.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.01"); flujo2.setDescripcion("Componentes tecnológicos terminados, probados internamente y listos para las fases de validación con los usuarios finales.");
        bai03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai03); hab1.setNombreHabilidad("Ingeniería de Software y Diseño de Soluciones"); hab1.setDocumentacionRelacionada("Marcos de Desarrollo Estructurado y Seguro"); hab1.setReferenciaEspecifica("Capacidad técnica avanzada para el modelado de bases de datos, escritura de código seguro y estructuración de componentes escalables.");
        bai03.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(bai03); pol1.setTituloPolitica("Estándares Obligatorios de Codificación y Desarrollo Seguro"); pol1.setDescripcionPolitica("Normativa corporativa que exige a todos los equipos técnicos programar siguiendo guías internacionales de seguridad, prohibiendo terminantemente la inserción de contraseñas visibles en el código y obligando a la documentación de todos los módulos creados."); pol1.setDocumentacionRelacionada("Manual de Gobernanza del Desarrollo"); pol1.setReferenciaEspecifica("Sección: Controles Previos a la Integración de Sistemas");
        bai03.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(bai03); cult1.setElementoCultural("Cultura de Calidad desde el Origen (Construir con Excelencia)"); cult1.setDocumentacionRelacionada("Manifiesto de Ingeniería Corporativa"); cult1.setReferenciaEspecifica("Inculcar en los programadores el principio de que los errores son más costosos mientras más tarden en descubrirse, fomentando una mentalidad de rigor absoluto durante la etapa de construcción, antes de derivar la responsabilidad a las áreas de prueba.");
        bai03.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(bai03); serv1.setNombreServicioHerramienta("Entornos Integrados de Desarrollo y Repositorios Corporativos de Código (GitLab, GitHub Enterprise)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai03); serv2.setNombreServicioHerramienta("Plataformas Automáticas de Análisis Estático para la Detección de Fallas en la Construcción");
        bai03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai03);
    }
}