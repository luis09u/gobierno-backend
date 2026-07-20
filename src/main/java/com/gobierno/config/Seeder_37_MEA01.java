package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(37)
public class Seeder_37_MEA01 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_37_MEA01(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA01")) {
            cargarMEA01();
        }
    }

    private void cargarMEA01() {
        ProcesoCobit mea01 = new ProcesoCobit();
        mea01.setIdProceso("MEA01");
        mea01.setDominio("Monitorizar, Evaluar y Valorar");
        mea01.setAreaPrioritaria("Modelo Core de COBIT");
        mea01.setNombreProceso("Gestionar la monitorización del rendimiento y la conformidad");
        mea01.setDescripcionProceso("Recopilar, validar y evaluar las metas y métricas del negocio, I&T y los procesos. Monitorizar que los procesos funcionan conforme a las métricas de rendimiento y conformidad acordadas y aprobadas. Informar sobre las actividades, rendimiento e incidencias a todas las partes interesadas.");
        mea01.setPropositoProceso("Proporcionar a la junta directiva un panorama claro y fundamentado sobre el verdadero valor que la tecnología aporta a la empresa, permitiendo identificar desviaciones de presupuesto o fallas de rendimiento antes de que impacten los estados financieros corporativos.");

        mea01.setMetasAlineamiento("AG01: Cumplimiento y soporte de la I&T a la conformidad externa de leyes y regulaciones.\nAG05: Entrega de servicios de I&T acorde a los requisitos del negocio.");
        mea01.setMetasEmpresariales("EG08: Optimización de la funcionalidad de procesos internos de negocio.\nEG04: Calidad de la información financiera.");
        mea01.setMetricasModelo("Métrica 1: Nivel de satisfacción del comité ejecutivo con la información de rendimiento.\nMétrica 2: Número de fallos de procesos de TI para los cuales no se identificó la causa raíz.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea01);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA01.01");
        pract01.setNombrePractica("Establecer el enfoque de monitorización");
        pract01.setDescripcionPractica("Interactuar con las partes interesadas para establecer y mantener el enfoque de monitorización para definir los objetivos, la recogida de información y los métodos de información que den soporte a sus necesidades y mantengan el foco.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Identificar a las partes interesadas clave y documentar sus requisitos para el informe de rendimiento y conformidad."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Establecer y aprobar las metas de rendimiento, tolerancia, criterios de medición y procedimientos para la recogida de datos."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Definir una línea base y comparadores (benchmarks) de la industria para facilitar la evaluación del rendimiento."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA01.02");
        pract02.setNombrePractica("Recopilar y procesar el rendimiento y la conformidad de la I&T");
        pract02.setDescripcionPractica("Recopilar y procesar de manera oportuna y precisa los datos que cumplan el enfoque de monitorización establecido. Consolidar los resultados sobre procesos, servicios y demás iniciativas evaluadas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Recopilar datos de forma regular conforme a las métricas e indicadores de rendimiento acordados."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Verificar la calidad y exactitud de los datos recogidos sobre la gestión del rendimiento de I&T."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Consolidar y procesar los datos para transformarlos en información relevante, identificando desviaciones frente a las metas fijadas."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA01.03");
        pract03.setNombrePractica("Analizar e informar del rendimiento");
        pract03.setDescripcionPractica("Revisar y proporcionar sistemáticamente informes del rendimiento en la I&T a todas las partes interesadas mediante el uso del enfoque de monitorización establecido. Determinar acciones correctoras cuando corresponda.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Revisar regularmente los informes y cuadros de mando (dashboards) junto con las partes interesadas."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Analizar las causas fundamentales subyacentes de las desviaciones de rendimiento documentadas."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Recomendar acciones correctivas o iniciativas de mejora basadas en las conclusiones de rendimiento obtenidas."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea01.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea01); raci1.setPracticaGestion("MEA01.01"); raci1.setRolOrganizacional("Director de Gobierno y Estrategia Tecnológica"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea01); raci2.setPracticaGestion("MEA01.02"); raci2.setRolOrganizacional("Analistas de Rendimiento Corporativo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea01); raci3.setPracticaGestion("MEA01.03"); raci3.setRolOrganizacional("Junta Directiva Institucional"); raci3.setNivelResponsabilidad("I");
        mea01.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea01); flujo1.setPracticaGestion("MEA01.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Todos los procesos operativos"); flujo1.setDescripcion("Registros continuos de transacciones, mediciones de tiempo de inactividad y consumos financieros.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea01); flujo2.setPracticaGestion("MEA01.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: EDM01.02"); flujo2.setDescripcion("Informes consolidados de desempeño gerencial que justifican la continuidad o cancelación de las inversiones tecnológicas.");
        mea01.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea01); hab1.setNombreHabilidad("Medición del Rendimiento y Análisis de Datos Corporativos"); hab1.setDocumentacionRelacionada("Marco Internacional de Gestión de la Calidad regulado bajo la normativa ISO 9001"); hab1.setReferenciaEspecifica("De este marco de estandarización mundial se adopta directamente el principio de auditoría basada en evidencias objetivas, estableciendo que ninguna evaluación de desempeño puede sustentarse en percepciones subjetivas, exigiendo en su lugar trazabilidad numérica y demostrable para cada conclusión gerencial.");
        mea01.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(mea01); pol1.setTituloPolitica("Directiva de Transparencia Absoluta y Reporte Obligatorio"); pol1.setDescripcionPolitica("Normativa institucional que sanciona como falta ética grave la alteración intencional, el ocultamiento o la retención de métricas de desempeño operativo. Esta política garantiza que la alta dirección reciba los datos exactos sobre los retrasos o fallas de los proyectos, eliminando el filtro de complacencia que suelen imponer los mandos medios."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Ética y Rendición de Cuentas"); pol1.setReferenciaEspecifica("Sección: Deber de Informar y Protección de la Verdad Operativa");
        mea01.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(mea01); cult1.setElementoCultural("Cultura de Medición Objetiva y Mejora Basada en Datos"); cult1.setDocumentacionRelacionada("Código de Excelencia Directiva"); cult1.setReferenciaEspecifica("Forjar en la organización una mentalidad analítica donde las decisiones de despido, promoción o inversión se basen exclusivamente en el rendimiento cuantificable histórico, desterrando las opiniones no fundamentadas de las mesas de toma de decisiones.");
        mea01.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(mea01); serv1.setNombreServicioHerramienta("Plataformas Institucionales de Inteligencia de Negocios y Minería de Datos");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea01); serv2.setNombreServicioHerramienta("Sistemas Automatizados de Visualización Gerencial y Cuadros de Mando Corporativos en Tiempo Real");
        mea01.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea01);
    }
}