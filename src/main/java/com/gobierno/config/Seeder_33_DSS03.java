package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(33) // Continuación del dominio de entrega y soporte (DSS)
public class Seeder_33_DSS03 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_33_DSS03(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS03")) {
            System.out.println("Iniciando carga de datos de gestión de problemas estructurales: DSS03...");
            cargarDSS03();
            System.out.println("DSS03 (Gestión de los Problemas) cargado exitosamente.");
        }
    }

    private void cargarDSS03() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE ERRADICACIÓN DE CAUSAS RAÍZ)
        // ==========================================
        ProcesoCobit dss03 = new ProcesoCobit();
        dss03.setIdProceso("DSS03");
        dss03.setDominio("Entregar, Dar Servicio y Soporte");
        dss03.setAreaPrioritaria("Modelo Core de COBIT");
        dss03.setNombreProceso("Gestionar los problemas");
        dss03.setDescripcionProceso("Investigar exhaustivamente las causas fundamentales detrás de las interrupciones operativas recurrentes, proponiendo e implementando soluciones estructurales definitivas para erradicar las fallas desde su origen y evitar su reaparición en el futuro.");
        dss03.setPropositoProceso("Garantizar que la organización no desperdicie recursos financieros y humanos reparando repetidamente los mismos errores en los sistemas telemáticos de los vehículos, logrando una estabilidad informática a largo plazo mediante la eliminación de las deficiencias de diseño o infraestructura.");

        dss03.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad permanente de los medios de procesamiento institucionales.\nAG04: Optimización del valor económico y de los costos logísticos de los servicios tecnológicos.");
        dss03.setMetasEmpresariales("EG08: Optimización absoluta y maximización de la eficiencia en los procesos internos corporativos.\nEG06: Continuidad operativa y disponibilidad ininterrumpida de los servicios comerciales.");
        dss03.setMetricasModelo("Métrica 1: Porcentaje de fallas recurrentes que fueron erradicadas definitivamente tras la implementación de una solución estructural avalada por la gerencia de arquitectura.\nMétrica 2: Tiempo promedio invertido por el equipo de ingeniería para identificar la causa raíz de una crisis sistémica desde su categorización formal.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE ANÁLISIS PROFUNDO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss03);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS03.01");
        pract01.setNombrePractica("Identificar y clasificar los problemas estructurales");
        pract01.setDescripcionPractica("Analizar los registros históricos de fallas diarias para descubrir patrones repetitivos que indiquen la existencia de un defecto subyacente en la plataforma tecnológica.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Revisar mensualmente los informes emitidos por el centro de soporte a clientes para consolidar eventos aislados en investigaciones de problemas mayores debidamente fundamentadas."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Categorizar las deficiencias identificadas según el nivel de afectación que ejercen sobre la rentabilidad de la marca, priorizando el análisis de aquellas que impactan directamente en la experiencia de manejo del usuario final."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS03.03");
        pract02.setNombrePractica("Investigar y diagnosticar el origen de las fallas");
        pract02.setDescripcionPractica("Someter la arquitectura de los sistemas a escrutinios intensivos por parte de ingenieros de alto nivel para localizar el fragmento de código o el servidor físico responsable de las interrupciones.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Reproducir las condiciones exactas de los errores reportados utilizando entornos de laboratorio virtualizados, aislando las variables hasta comprobar el origen matemático del defecto."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Documentar soluciones temporales avaladas técnicamente para que el equipo de soporte pueda mitigar el impacto en los concesionarios mientras se programa la reparación definitiva del sistema."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS03.04");
        pract03.setNombrePractica("Resolver los problemas y erradicar las causas fundamentales");
        pract03.setDescripcionPractica("Generar paquetes de modificación estructural y someterlos al comité de cambios organizacionales para aplicar la cura definitiva a los sistemas afectados.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Elaborar peticiones formales de alteración sistémica exigiendo la reconstrucción de los módulos defectuosos detectados durante las labores de diagnóstico avanzado."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Ejecutar auditorías retrospectivas meses después de haber aplicado las correcciones para certificar ante la junta directiva que el comportamiento errático ha sido neutralizado permanentemente."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss03.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss03); raci1.setPracticaGestion("DSS03.01"); raci1.setRolOrganizacional("Director de Arquitectura y Soluciones Corporativas"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss03); raci2.setPracticaGestion("DSS03.03"); raci2.setRolOrganizacional("Ingenieros Especialistas de Nivel Superior"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss03); raci3.setPracticaGestion("DSS03.04"); raci3.setRolOrganizacional("Comité Operativo Institucional"); raci3.setNivelResponsabilidad("C");

        dss03.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss03); flujo1.setPracticaGestion("DSS03.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: DSS02.05"); flujo1.setDescripcion("Catálogo acumulado de incidentes repetitivos y registros de soluciones temporales aplicadas previamente.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss03); flujo2.setPracticaGestion("DSS03.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI06.01"); flujo2.setDescripcion("Solicitudes de modificación estructural detalladas para eliminar el defecto de la base operativa de forma controlada.");

        dss03.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss03); hab1.setNombreHabilidad("Análisis Forense Tecnológico y Resolución Estructural de Fallas"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información orientada a la Gestión Analítica de Problemas"); hab1.setReferenciaEspecifica("De este marco operativo global se rescatan directamente las técnicas analíticas como el método de los cinco porqués o los diagramas de causa y efecto, proporcionando herramientas estandarizadas para separar los síntomas superficiales de las verdaderas carencias arquitectónicas.");

        dss03.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss03); pol1.setTituloPolitica("Directiva Corporativa de Erradicación Definitiva de Defectos Sistémicos"); pol1.setDescripcionPolitica("Normativa institucional irrevocable que prohíbe el uso continuo de soluciones temporales por periodos mayores a noventa días. Esta medida obliga a la gerencia técnica a destinar recursos de manera perentoria para reescribir el código defectuoso o reemplazar el equipo fallido, eliminando así la acumulación de deudas tecnológicas ocultas."); pol1.setDocumentacionRelacionada("Manual de Estabilidad y Gobernanza Operacional"); pol1.setReferenciaEspecifica("Sección: Procedimientos de Eliminación de Deuda Técnica");

        dss03.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss03); cult1.setElementoCultural("Cultura de Cuestionamiento Profundo y Cero Conformismo"); cult1.setDocumentacionRelacionada("Principios Fundamentales de Ingeniería Corporativa"); cult1.setReferenciaEspecifica("Inculcar en los líderes técnicos la obligación moral de no conformarse con restaurar el servicio, promoviendo en su lugar un nivel de curiosidad analítica que exija entender invariablemente por qué falló el sistema antes de dar el tema por cerrado.");

        dss03.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss03); serv1.setNombreServicioHerramienta("Plataformas de Análisis Masivo de Datos Estructurados para el Reconocimiento Automático de Patrones de Fallas");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss03); serv2.setNombreServicioHerramienta("Sistemas Integrados de Gestión Documental para el Resguardo Analítico de Errores Conocidos");

        dss03.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss03);
    }
}