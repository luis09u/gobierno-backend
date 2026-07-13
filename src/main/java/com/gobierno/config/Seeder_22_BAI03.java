package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(22) // Sigue la secuencia del dominio BAI
public class Seeder_22_BAI03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_22_BAI03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI03")) {
            System.out.println("Iniciando carga de datos de construcción de sistemas: BAI03...");
            cargarBAI03();
            System.out.println("BAI03 (Construcción de Soluciones) cargado exitosamente.");
        }
    }

    private void cargarBAI03() {
        // ==========================================
        // INFORMACIÓN GENERAL (LENGUAJE GERENCIAL DE EJECUCIÓN)
        // ==========================================
        ProcesoCobit bai03 = new ProcesoCobit();
        bai03.setIdProceso("BAI03");
        bai03.setDominio("Construir, Adquirir e Implementar");
        bai03.setAreaPrioritaria("Modelo Core de COBIT");
        bai03.setNombreProceso("Gestionar la identificación y construcción de soluciones");
        bai03.setDescripcionProceso("Diseñar, desarrollar y configurar las soluciones tecnológicas basándose en los requerimientos aprobados, asegurando que los componentes informáticos se construyan con estándares de calidad y seguridad antes de pasar a las pruebas finales.");
        bai03.setPropositoProceso("Asegurar que la programación y configuración de los sistemas vehiculares se ejecute de manera estandarizada y segura, garantizando que el código final cumpla estrictamente con las necesidades del cliente y sea resistente a vulnerabilidades operativas.");

        bai03.setMetasAlineamiento("AG06: Agilidad para convertir los requisitos de negocio en soluciones operativas.\nAG07: Seguridad, confiabilidad e integridad de la infraestructura de procesamiento.");
        bai03.setMetasEmpresariales("EG01: Portafolio de productos comerciales competitivos y de alta fiabilidad.\nEG05: Cultura de innovación y mejora continua.");
        bai03.setMetricasModelo("Métrica 1: Porcentaje de los componentes de software construidos que superaron con éxito la primera ronda de auditoría de seguridad automatizada.\nMétrica 2: Número de defectos críticos detectados en el código durante la fase de desarrollo interno.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONSTRUCCIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI03.01");
        pract01.setNombrePractica("Diseñar la solución tecnológica");
        pract01.setDescripcionPractica("Elaborar los planos técnicos y la arquitectura detallada del software antes de comenzar el proceso de escritura de código.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Traducir el documento de requerimientos comerciales en diagramas de bases de datos y flujos de información técnica aprobados por la gerencia de arquitectura."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Asegurar que el diseño técnico incluya controles de privacidad de datos desde su concepción, respaldando las normativas legales vigentes."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI03.02");
        pract02.setNombrePractica("Desarrollar y configurar los componentes");
        pract02.setDescripcionPractica("Ejecutar la creación real de los programas y la configuración de los servidores, ciñéndose estrictamente a los diseños aprobados.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Programar los módulos del sistema operativo del vehículo utilizando repositorios centralizados y versionados para mantener el control sobre cada cambio realizado."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Aplicar configuraciones de endurecimiento de seguridad en los servidores de la nube corporativa durante la fase de ensamblaje del sistema."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI03.03");
        pract03.setNombrePractica("Realizar pruebas de control interno");
        pract03.setDescripcionPractica("Someter cada pieza de tecnología construida a validaciones técnicas rigurosas por parte de los propios desarrolladores para descartar fallos tempranos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Ejecutar revisiones de código cruzadas entre pares, asegurando que ningún programador autorice su propio trabajo sin una validación independiente."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Automatizar pruebas técnicas unitarias que verifiquen el funcionamiento aislado de cada nuevo componente antes de integrarlo al sistema principal del vehículo."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai03); raci1.setPracticaGestion("BAI03.01"); raci1.setRolOrganizacional("Arquitecto Jefe de Sistemas (Chief Architect)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai03); raci2.setPracticaGestion("BAI03.02"); raci2.setRolOrganizacional("Líderes de Ingeniería y Desarrollo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai03); raci3.setPracticaGestion("BAI03.03"); raci3.setRolOrganizacional("Área de Aseguramiento de Calidad Técnica"); raci3.setNivelResponsabilidad("R");

        bai03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai03); flujo1.setPracticaGestion("BAI03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI02.02"); flujo1.setDescripcion("Documentos formales de especificación de requerimientos de negocio y estudios de viabilidad.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai03); flujo2.setPracticaGestion("BAI03.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.01"); flujo2.setDescripcion("Componentes tecnológicos terminados, probados internamente y listos para las fases de validación con los usuarios finales.");

        bai03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai03); hab1.setNombreHabilidad("Ingeniería de Software y Diseño de Soluciones"); hab1.setDocumentacionRelacionada("Marcos de Desarrollo Estructurado y Seguro"); hab1.setReferenciaEspecifica("Capacidad técnica avanzada para el modelado de bases de datos, escritura de código seguro y estructuración de componentes escalables.");

        bai03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai03); pol1.setTituloPolitica("Estándares Obligatorios de Codificación y Desarrollo Seguro"); pol1.setDescripcionPolitica("Normativa corporativa que exige a todos los equipos técnicos programar siguiendo guías internacionales de seguridad, prohibiendo terminantemente la inserción de contraseñas visibles en el código y obligando a la documentación de todos los módulos creados."); pol1.setDocumentacionRelacionada("Manual de Gobernanza del Desarrollo"); pol1.setReferenciaEspecifica("Sección: Controles Previos a la Integración de Sistemas");

        bai03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai03); cult1.setElementoCultural("Cultura de Calidad desde el Origen (Construir con Excelencia)"); cult1.setDocumentacionRelacionada("Manifiesto de Ingeniería Corporativa"); cult1.setReferenciaEspecifica("Inculcar en los programadores el principio de que los errores son más costosos mientras más tarden en descubrirse, fomentando una mentalidad de rigor absoluto durante la etapa de construcción, antes de derivar la responsabilidad a las áreas de prueba.");

        bai03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai03); serv1.setNombreServicioHerramienta("Entornos Integrados de Desarrollo y Repositorios Corporativos de Código (Ej. GitLab, GitHub Enterprise)");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai03); serv2.setNombreServicioHerramienta("Plataformas Automáticas de Análisis Estático para la Detección de Fallas en la Construcción");

        bai03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai03);
    }
}