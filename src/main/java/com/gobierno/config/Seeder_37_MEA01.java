package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(37) // Inicio del dominio de evaluación directiva (MEA)
public class Seeder_37_MEA01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_37_MEA01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA01")) {
            System.out.println("Iniciando carga de datos de monitorización de rendimiento: MEA01...");
            cargarMEA01();
            System.out.println("MEA01 (Monitorización del Rendimiento) cargado exitosamente.");
        }
    }

    private void cargarMEA01() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE TRANSPARENCIA EJECUTIVA)
        // ==========================================
        ProcesoCobit mea01 = new ProcesoCobit();
        mea01.setIdProceso("MEA01");
        mea01.setDominio("Monitorizar, Evaluar y Valorar");
        mea01.setAreaPrioritaria("Modelo Core de COBIT");
        mea01.setNombreProceso("Gestionar la monitorización del rendimiento y la conformidad");
        mea01.setDescripcionProceso("Recopilar, validar y evaluar continuamente los datos operativos y financieros de los servicios tecnológicos para comprobar si están cumpliendo con los objetivos estratégicos trazados por la alta dirección, garantizando una visibilidad gerencial libre de manipulaciones.");
        mea01.setPropositoProceso("Proporcionar a la junta directiva un panorama claro y fundamentado sobre el verdadero valor que la tecnología aporta a la empresa, permitiendo identificar desviaciones de presupuesto o fallas de rendimiento antes de que impacten los estados financieros corporativos.");

        mea01.setMetasAlineamiento("AG01: Transparencia absoluta sobre los costos informáticos y los beneficios económicos entregados al negocio.\nAG05: Prestación de servicios corporativos en total concordancia con los requisitos documentados.");
        mea01.setMetasEmpresariales("EG08: Optimización rigurosa y maximización de la eficiencia en los costos de los procesos institucionales.\nEG04: Alta calidad, oportunidad y precisión en la información gerencial generada.");
        mea01.setMetricasModelo("Métrica 1: Nivel de satisfacción de la junta directiva respecto a la claridad, exactitud y puntualidad de los informes de rendimiento tecnológico.\nMétrica 2: Porcentaje de indicadores estratégicos que son recopilados directamente desde los sistemas de forma automatizada sin requerir intervención humana.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE MEDICIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA01.01");
        pract01.setNombrePractica("Establecer el enfoque de monitorización corporativa");
        pract01.setDescripcionPractica("Definir exactamente qué indicadores matemáticos importan realmente para la rentabilidad de la organización, descartando métricas técnicas irrelevantes que solo saturan los reportes.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Trabajar junto a la gerencia financiera para vincular los tiempos de respuesta de los servidores con el impacto directo en las ventas de los concesionarios."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Documentar umbrales de tolerancia formales que determinen en qué momento preciso una caída de rendimiento debe ser reportada como una crisis a la junta directiva."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA01.02");
        pract02.setNombrePractica("Recopilar y procesar los datos de rendimiento");
        pract02.setDescripcionPractica("Extraer la información operativa de las bases de datos asegurando su total inalterabilidad frente a posibles manipulaciones por parte de los supervisores de área.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Implementar rutinas informáticas que extraigan las estadísticas de fallas automotrices directamente desde los sensores de red, eliminando el envío manual de reportes en hojas de cálculo."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Verificar trimestralmente la calibración de las herramientas de medición para certificar que los datos presentados a la gerencia reflejan la realidad absoluta de las operaciones."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA01.03");
        pract03.setNombrePractica("Analizar y reportar el desempeño institucional");
        pract03.setDescripcionPractica("Transformar la vasta cantidad de datos técnicos en conclusiones gerenciales claras que faciliten la toma de decisiones inmediatas.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Consolidar los hallazgos en un cuadro de mando integral que resuma el estado de las inversiones tecnológicas utilizando un sistema intuitivo de colores tipo semáforo."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Convocar sesiones de rendición de cuentas donde los líderes tecnológicos deban explicar las desviaciones negativas e instruir planes de corrección vinculantes."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea01.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea01); raci1.setPracticaGestion("MEA01.01"); raci1.setRolOrganizacional("Director de Gobierno y Estrategia Tecnológica"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea01); raci2.setPracticaGestion("MEA01.02"); raci2.setRolOrganizacional("Analistas de Rendimiento Corporativo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea01); raci3.setPracticaGestion("MEA01.03"); raci3.setRolOrganizacional("Junta Directiva Institucional"); raci3.setNivelResponsabilidad("I");

        mea01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea01); flujo1.setPracticaGestion("MEA01.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Todos los procesos operativos"); flujo1.setDescripcion("Registros continuos de transacciones, mediciones de tiempo de inactividad y consumos financieros.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea01); flujo2.setPracticaGestion("MEA01.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM01.02"); flujo2.setDescripcion("Informes consolidados de desempeño gerencial que justifican la continuidad o cancelación de las inversiones tecnológicas.");

        mea01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea01); hab1.setNombreHabilidad("Medición del Rendimiento y Análisis de Datos Corporativos"); hab1.setDocumentacionRelacionada("Marco Internacional de Gestión de la Calidad regulado bajo la normativa nueve mil uno"); hab1.setReferenciaEspecifica("De este marco de estandarización mundial se adopta directamente el principio de auditoría basada en evidencias objetivas, estableciendo que ninguna evaluación de desempeño puede sustentarse en percepciones subjetivas, exigiendo en su lugar trazabilidad numérica y demostrable para cada conclusión gerencial.");

        mea01.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea01); pol1.setTituloPolitica("Directiva de Transparencia Absoluta y Reporte Obligatorio"); pol1.setDescripcionPolitica("Normativa institucional que sanciona como falta ética grave la alteración intencional, el ocultamiento o la retención de métricas de desempeño operativo. Esta política garantiza que la alta dirección reciba los datos exactos sobre los retrasos o fallas de los proyectos, eliminando el filtro de complacencia que suelen imponer los mandos medios."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Ética y Rendición de Cuentas"); pol1.setReferenciaEspecifica("Sección: Deber de Informar y Protección de la Verdad Operativa");

        mea01.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea01); cult1.setElementoCultural("Cultura de Medición Objetiva y Mejora Basada en Datos"); cult1.setDocumentacionRelacionada("Código de Excelencia Directiva"); cult1.setReferenciaEspecifica("Forjar en la organización una mentalidad analítica donde las decisiones de despido, promoción o inversión se basen exclusivamente en el rendimiento cuantificable histórico, desterrando las opiniones no fundamentadas de las mesas de toma de decisiones.");

        mea01.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea01); serv1.setNombreServicioHerramienta("Plataformas Institucionales de Inteligencia de Negocios y Minería de Datos");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea01); serv2.setNombreServicioHerramienta("Sistemas Automatizados de Visualización Gerencial y Cuadros de Mando Corporativos en Tiempo Real");

        mea01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea01);
    }
}