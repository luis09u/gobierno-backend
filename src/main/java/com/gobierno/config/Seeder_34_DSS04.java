package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(34) // Desarrollo secuencial en el dominio DSS
public class Seeder_34_DSS04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_34_DSS04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS04")) {
            System.out.println("Iniciando carga de datos de continuidad operativa: DSS04...");
            cargarDSS04();
            System.out.println("DSS04 (Gestión de la Continuidad) cargado exitosamente.");
        }
    }

    private void cargarDSS04() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE SUPERVIVENCIA CORPORATIVA)
        // ==========================================
        ProcesoCobit dss04 = new ProcesoCobit();
        dss04.setIdProceso("DSS04");
        dss04.setDominio("Entregar, Dar Servicio y Soporte");
        dss04.setAreaPrioritaria("Modelo Core de COBIT");
        dss04.setNombreProceso("Gestionar la continuidad");
        dss04.setDescripcionProceso("Diseñar, establecer y probar planes de recuperación de alcance corporativo para permitir que la empresa reanude la operación de sus servicios tecnológicos críticos en el menor tiempo posible luego de enfrentar un desastre de gran magnitud.");
        dss04.setPropositoProceso("Asegurar la supervivencia comercial de la marca automotriz frente a contingencias extremas, garantizando que los servicios de telemetría, seguridad de los vehículos y atención en los concesionarios puedan migrar de inmediato hacia infraestructuras de respaldo sin ocasionar la interrupción total del negocio.");

        dss04.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad ininterrumpida de los medios de procesamiento institucionales bajo cualquier circunstancia.\nAG06: Agilidad y destreza para responder a las exigencias operativas en escenarios adversos.");
        dss04.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al mercado global.\nEG03: Cumplimiento irrestricto de leyes de protección al consumidor y normativas sectoriales de seguridad.");
        dss04.setMetricasModelo("Métrica 1: Porcentaje de los simulacros de recuperación ante desastres que lograron restaurar los sistemas críticos dentro de los tiempos máximos tolerados por la junta directiva.\nMétrica 2: Número de servicios comerciales vitales que carecen de un plan de contingencia documentado y avalado operativamente.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE PREPARACIÓN EXTREMA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS04.02");
        pract01.setNombrePractica("Desarrollar planes de continuidad y recuperación");
        pract01.setDescripcionPractica("Estructurar las estrategias paso a paso que dictaminarán cómo el personal debe reaccionar para salvar la infraestructura y levantar los servicios en ubicaciones alternas.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Establecer protocolos de conmutación automática para que, si el centro de datos primario se apaga, las comunicaciones de los automóviles se desvíen instantáneamente hacia servidores ubicados en otro continente."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Definir cadenas jerárquicas de mando en situación de crisis para que las decisiones de desconexión masiva se tomen con rapidez y sin vacilaciones burocráticas."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS04.04");
        pract02.setNombrePractica("Ejercitar y probar las estrategias de contingencia");
        pract02.setDescripcionPractica("Ejecutar simulacros realistas de forma periódica para confirmar que los planes escritos funcionan verdaderamente en el mundo real.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Apagar intencionalmente sistemas selectos durante la madrugada en entornos de prueba para evaluar la destreza del equipo técnico al intentar restaurarlos bajo presión."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Medir y documentar el tiempo exacto que tarda la base de datos de los clientes en reconstruirse desde las copias de seguridad, ajustando los recursos técnicos si este plazo excede los límites exigidos por la gerencia."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS04.08");
        pract03.setNombrePractica("Ejecutar la recuperación y reanudar las operaciones");
        pract03.setDescripcionPractica("Activar formalmente los protocolos de emergencia cuando un desastre real impacta a la empresa, coordinando el retorno gradual a la normalidad.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Desplegar al comité de crisis institucional para que supervise la reconexión progresiva de la red de concesionarios, priorizando primero los servicios de seguridad vehicular y luego los sistemas de ventas."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar un análisis exhaustivo posterior al desastre para identificar las lecciones aprendidas y fortalecer las vulnerabilidades detectadas en el diseño de la red."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss04.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss04); raci1.setPracticaGestion("DSS04.02"); raci1.setRolOrganizacional("Director de Continuidad y Resiliencia del Negocio"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss04); raci2.setPracticaGestion("DSS04.04"); raci2.setRolOrganizacional("Líderes de Operaciones de Red e Infraestructura"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss04); raci3.setPracticaGestion("DSS04.08"); raci3.setRolOrganizacional("Comité Ejecutivo de Crisis Institucional"); raci3.setNivelResponsabilidad("R");

        dss04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss04); flujo1.setPracticaGestion("DSS04.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02"); flujo1.setDescripcion("Mapas de calor institucionales y evaluaciones formales de los impactos financieros causados por interrupciones operativas prolongadas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss04); flujo2.setPracticaGestion("DSS04.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Informes de resultados emitidos tras los simulacros de desastres, incluyendo el registro exacto de las métricas de recuperación evaluadas.");

        dss04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss04); hab1.setNombreHabilidad("Estructuración de Resiliencia Operacional y Gestión Integral de Crisis"); hab1.setDocumentacionRelacionada("Norma Internacional de Gestión de la Continuidad del Negocio emitida bajo el código veintidós mil trescientos uno"); hab1.setReferenciaEspecifica("De este estándar normativo se extrae explícitamente el cálculo preciso de los tiempos máximos tolerables de interrupción y los objetivos de punto de recuperación, herramientas matemáticas fundamentales para dictaminar cuánta información puede perder la empresa sin entrar en quiebra.");

        dss04.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss04); pol1.setTituloPolitica("Directiva Estratégica de Simulacros Obligatorios y Garantía de Supervivencia"); pol1.setDescripcionPolitica("Reglamentación corporativa inflexible que prohíbe dar por válido cualquier plan de contingencia tecnológica si no ha sido ensayado físicamente en un simulacro integral durante los últimos doce meses. Esta medida dictamina que un plan no probado es una falsa ilusión de seguridad que pone en peligro a los inversionistas."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Riesgos y Desastres"); pol1.setReferenciaEspecifica("Sección: Condicionamientos para la Aprobación de Sistemas Críticos");

        dss04.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss04); cult1.setElementoCultural("Cultura de Preparación Constante y Cero Complacencia"); cult1.setDocumentacionRelacionada("Manifiesto de Resiliencia Institucional"); cult1.setReferenciaEspecifica("Inculcar en la mente de los directivos operativos la certidumbre absoluta de que los desastres informáticos son eventos inevitables, promoviendo una actitud vigilante que priorice las inversiones en sistemas redundantes por encima de las optimizaciones cosméticas.");

        dss04.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss04); serv1.setNombreServicioHerramienta("Instalaciones de Procesamiento de Datos Secundarias equipadas con Sistemas de Replicación Asíncrona");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss04); serv2.setNombreServicioHerramienta("Plataformas Corporativas de Notificación de Emergencias Masivas y Árboles de Llamadas Automatizadas");

        dss04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss04);
    }
}