package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(13) // Continuidad secuencial en la arquitectura de carga
public class Seeder_13_APO08 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_13_APO08(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO08")) {
            System.out.println("Iniciando carga de datos de alineamiento institucional: APO08...");
            cargarAPO08();
            System.out.println("APO08 (Gestión de las Relaciones) cargado exitosamente.");
        }
    }

    private void cargarAPO08() {
        // ==========================================
        // INFORMACIÓN GENERAL (LENGUAJE DIRECTIVO Y DE COORDINACIÓN)
        // ==========================================
        ProcesoCobit apo08 = new ProcesoCobit();
        apo08.setIdProceso("APO08");
        apo08.setDominio("Alinear, Planificar y Organizar");
        apo08.setAreaPrioritaria("Modelo Core de COBIT");
        apo08.setNombreProceso("Gestionar las relaciones");
        apo08.setDescripcionProceso("Gestionar las relaciones con las partes interesadas del negocio de manera formal y coordinada para asegurar que las capacidades tecnológicas respondan directamente a las expectativas comerciales, operativas y de cumplimiento legal de la empresa.");
        apo08.setPropositoProceso("Establecer un entendimiento mutuo y una estrecha colaboración entre los líderes de tecnología y las distintas gerencias de la organización, garantizando que las actualizaciones de software en los vehículos aporten valor real al cliente y respalden la estrategia corporativa.");

        apo08.setMetasAlineamiento("AG04: Optimización del valor y los costos de los servicios y soluciones tecnológicas.\nAG08: Habilitación y soporte a los procesos de negocio mediante la integración de la tecnología.");
        apo08.setMetasEmpresariales("EG01: Portafolio de productos y servicios comerciales competitivos en el mercado.\nEG05: Cultura de innovación orientada al cliente final.");
        apo08.setMetricasModelo("Métrica 1: Índice de satisfacción de las gerencias de negocio respecto a la velocidad de respuesta y el entendimiento del departamento de tecnología.\nMétrica 2: Porcentaje de iniciativas de mejora de software vehicular diseñadas de forma conjunta entre ingeniería y las áreas comerciales.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE COOPERACIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo08);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO08.01");
        pract01.setNombrePractica("Comprender las expectativas del negocio");
        pract01.setDescripcionPractica("Recopilar y analizar de forma estructurada las demandas, dolores y requisitos de las gerencias comerciales, legales y operativas de la empresa.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Realizar mesas de trabajo bimestrales con la gerencia comercial para identificar las funciones de software que los clientes demandan con mayor frecuencia en el mercado."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Analizar de forma conjunta con la gerencia legal las nuevas normativas de tránsito y protección de datos que deban reflejarse en el sistema del vehículo."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO08.02");
        pract02.setNombrePractica("Coordinar y alinear las relaciones institucionales");
        pract02.setDescripcionPractica("Establecer un canal único y formal de comunicación entre los ingenieros de desarrollo técnico y los líderes de las unidades de negocio.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Designar gestores de cuenta internos de tecnología para que actúen como enlace directo con cada una de las gerencias operativas."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Formalizar un comité conjunto de priorización donde se evalúe la viabilidad y el impacto de los cambios de software antes de enviarlos a producción."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO08.03");
        pract03.setNombrePractica("Medir y mejorar la efectividad de la colaboración");
        pract03.setDescripcionPractica("Evaluar periódicamente si la comunicación interdepartamental está dando los resultados esperados o si existen conflictos que retrasen los proyectos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Implementar encuestas anuales de satisfacción interna para calificar la sinergia y el entendimiento entre el negocio y el área técnica."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Definir planes de acción inmediatos para resolver discrepancias de criterios entre la gerencia de operaciones y los líderes de infraestructura tecnológica."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo08.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS (ROLES EJECUTIVOS)
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo08); raci1.setPracticaGestion("APO08.01"); raci1.setRolOrganizacional("Director de Información y Tecnología (CIO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo08); raci2.setPracticaGestion("APO08.02"); raci2.setRolOrganizacional("Gestores de Relación y Enlace de Tecnología"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo08); raci3.setPracticaGestion("APO08.03"); raci3.setRolOrganizacional("Directores de Unidades de Negocio (Comercial, Legal, Operaciones)"); raci3.setNivelResponsabilidad("C");

        apo08.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo08); flujo1.setPracticaGestion("APO08.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Gerencias Comerciales"); flujo1.setDescripcion("Requisitos de experiencia del consumidor y demandas detectadas en el mercado automotriz.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo08); flujo2.setPracticaGestion("APO08.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Todos los procesos de ingeniería"); flujo2.setDescripcion("Acuerdos institucionales de colaboración y mapa de prioridades de negocio validadas.");

        apo08.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo08); hab1.setNombreHabilidad("Mediación y Gestión de Relaciones de Negocio"); hab1.setDocumentacionRelacionada("Modelos de Gobernanza e Integración Corporativa"); hab1.setReferenciaEspecifica("Capacidad de alinear las expectativas comerciales con las capacidades de infraestructura técnica de la empresa.");

        apo08.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS Y DIRECTRICES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo08); pol1.setTituloPolitica("Directiva General de Coordinación Interdepartamental y Relaciones con el Negocio"); pol1.setDescripcionPolitica("Normativa que prohíbe de manera estricta al departamento de tecnología realizar modificaciones sustanciales en las funciones operativas del vehículo sin la validación por escrito y el consentimiento previo de las gerencias comerciales y legales afectadas."); pol1.setDocumentacionRelacionada("Manual de Gobierno y Control de Procesos"); pol1.setReferenciaEspecifica("Sección 5: Sinergia y Aprobación de Cambios Operativos");

        apo08.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE COLABORACIÓN
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo08); cult1.setElementoCultural("Filosofía de Trabajo Unificado e Integración"); cult1.setDocumentacionRelacionada("Principios de Convivencia Corporativa"); cult1.setReferenciaEspecifica("Fomentar de forma permanente que los ingenieros de sistemas y los administradores comerciales compartan la misma visión de servicio, eliminando la percepción de que tecnología es un área aislada de la rentabilidad del negocio.");

        apo08.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo08); serv1.setNombreServicioHerramienta("Plataformas Centralizadas para la Gestión de Solicitudes y Requerimientos Internos");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo08); serv2.setNombreServicioHerramienta("Canales Institucionales de Comunicación y Repositorios Compartidos de Proyectos");

        apo08.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo08);
    }
}