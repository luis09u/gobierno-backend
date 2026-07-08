package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(10) // Ejecución secuencial después del APO04
public class Seeder_10_APO05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_10_APO05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO05")) {
            System.out.println("Iniciando carga de datos de gestión ejecutiva: APO05...");
            cargarAPO05();
            System.out.println("APO05 (Gestión del Portafolio) cargado exitosamente.");
        }
    }

    private void cargarAPO05() {
        // ==========================================
        // INFORMACIÓN GENERAL (LENGUAJE OPERATIVO Y EMPRESARIAL)
        // ==========================================
        ProcesoCobit apo05 = new ProcesoCobit();
        apo05.setIdProceso("APO05");
        apo05.setDominio("Alinear, Planificar y Organizar");
        apo05.setAreaPrioritaria("Modelo Core de COBIT");
        apo05.setNombreProceso("Gestionar el portafolio");
        apo05.setDescripcionProceso("Ejecutar la dirección estratégica para las inversiones en tecnología, alineada con la visión de la empresa. Evaluar, priorizar y equilibrar de manera continua el conjunto de programas, servicios y activos tecnológicos para optimizar el rendimiento del negocio.");
        apo05.setPropositoProceso("Asegurar que el conjunto de inversiones destinadas a la actualización inalámbrica de software y al desarrollo de la plataforma vehicular maximice el rendimiento económico, garantizando un equilibrio óptimo entre los costos de los servidores en la nube y los beneficios comerciales.");

        apo05.setMetasAlineamiento("AG04: Satisfacción de las áreas de negocio con los resultados de las inversiones tecnológicas.\nAG09: Entrega de proyectos y programas de inversión dentro de los plazos y presupuestos aprobados.");
        apo05.setMetasEmpresariales("EG01: Portafolio de productos y servicios comerciales competitivos en el mercado.\nEG04: Alta calidad en la información de gestión financiera para la toma de decisiones.");
        apo05.setMetricasModelo("Métrica 1: Porcentaje de desviación presupuestaria en los proyectos de actualización de software respecto al plan financiero anual.\nMétrica 2: Índice de retorno financiero obtenido por la introducción de nuevas funciones de software pagadas en los vehículos.");

        // ==========================================
        // COMPONENTE A: PROCESOS Y ACTIVIDADES DE NEGOCIO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO05.01");
        pract01.setNombrePractica("Establecer la dirección de las inversiones");
        pract01.setDescripcionPractica("Definir los criterios financieros y las reglas de negocio indispensables para aprobar nuevas iniciativas de software y servicios en la nube.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Formular las pautas de inversión que equilibren el gasto entre el mantenimiento de los sistemas actuales y la creación de nuevas tecnologías de movilidad."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Establecer los niveles mínimos de rentabilidad y los criterios de mitigación de pérdidas que deben cumplir los proyectos antes de recibir financiamiento."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO05.02");
        pract02.setNombrePractica("Evaluar y seleccionar programas de inversión");
        pract02.setDescripcionPractica("Analizar de manera constante las propuestas de desarrollo tecnológico y seleccionar aquellas que demuestren mayor alineamiento con los objetivos de la empresa.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Evaluar los casos de negocio de cada módulo de software propuesto, verificando la disponibilidad de presupuesto corporativo."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Priorizar los proyectos de actualización inalámbrica que resuelvan fallos de seguridad críticos o normativas legales urgentes sobre los de simple mejora estética."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO05.03");
        pract03.setNombrePractica("Monitorear y controlar el rendimiento del portafolio");
        pract03.setDescripcionPractica("Supervisar que el dinero invertido en infraestructura digital y desarrollo de software esté rindiendo los frutos proyectados.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Revisar periódicamente los informes de consumo de los servidores en la nube para identificar sobrecostos ineficientes en la transmisión de datos a los vehículos."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Suspender o reestructurar aquellas iniciativas de software que no cumplan con los hitos de entrega o que superen los límites de gasto permitidos."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo05.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS (ROLES DE ALTA DIRECCIÓN)
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo05); raci1.setPracticaGestion("APO05.01"); raci1.setRolOrganizacional("Comité de Inversiones y Finanzas"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo05); raci2.setPracticaGestion("APO05.02"); raci2.setRolOrganizacional("Director de Finanzas (CFO)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo05); raci3.setPracticaGestion("APO05.03"); raci3.setRolOrganizacional("Director de Información y Tecnología (CIO)"); raci3.setNivelResponsabilidad("R");

        apo05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo05); flujo1.setPracticaGestion("APO05.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO02.05"); flujo1.setDescripcion("Estrategia institucional e indicaciones del rumbo de la organización.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo05); flujo2.setPracticaGestion("APO05.02"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO06.01"); flujo2.setDescripcion("Asignaciones de presupuesto aprobadas para los proyectos seleccionados.");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(apo05); flujo3.setPracticaGestion("APO05.03"); flujo3.setTipoFlujo("SALIDA"); flujo3.setOrigenDestino("A: EDM02.03"); flujo3.setDescripcion("Informes de rendimiento financiero y desviaciones de costos presentados a la junta directiva.");

        apo05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo05); hab1.setNombreHabilidad("Evaluación Financiera de Proyectos"); hab1.setDocumentacionRelacionada("Estándares de Gestión de Portafolios (PMI / MoP)"); hab1.setReferenciaEspecifica("Análisis de rentabilidad, cálculo del valor actual neto y control presupuestario corporativo.");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(apo05); hab2.setNombreHabilidad("Gobierno de Inversiones en Tecnología"); hab2.setDocumentacionRelacionada("Manual de Gestión de Portafolios de I&T"); hab2.setReferenciaEspecifica("Equilibrio de portafolio de tecnología y priorización competitiva.");

        apo05.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        // ==========================================
        // COMPONENTE E: POLÍTICAS Y DIRECTRICES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo05); pol1.setTituloPolitica("Directiva General para la Aprobación Financiera de Proyectos Tecnológicos"); pol1.setDescripcionPolitica("Normativa institucional que prohíbe el inicio de cualquier desarrollo de software o contratación de servidores que no cuente con un estudio de viabilidad económica aprobado por el área de finanzas."); pol1.setDocumentacionRelacionada("Manual de Políticas Financieras de Toyota"); pol1.setReferenciaEspecifica("Sección 4: Control de Activos Digitales e Inversiones");

        apo05.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA INSTITUCIONAL
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo05); cult1.setElementoCultural("Responsabilidad y Eficiencia en el Gasto Corporativo"); cult1.setDocumentacionRelacionada("Código de Ética y Conducta Empresarial"); cult1.setReferenciaEspecifica("Concienciar a todos los líderes de proyectos sobre el uso responsable de los fondos públicos y privados, evitando el desperdicio de recursos en infraestructura tecnológica innecesaria.");

        apo05.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS DE CONTROL
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo05); serv1.setNombreServicioHerramienta("Sistemas Integrados de Planificación de Recursos Empresariales (Módulos de Finanzas y Control de Proyectos)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo05); serv2.setNombreServicioHerramienta("Tableros de Control Corporativo para el Monitoreo de Costos en la Nube");

        apo05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo05);
    }
}