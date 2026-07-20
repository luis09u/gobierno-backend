package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(34)
public class Seeder_34_DSS04 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_34_DSS04(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS04")) {
            cargarDSS04();
        }
    }

    private void cargarDSS04() {
        ProcesoCobit dss04 = new ProcesoCobit();
        dss04.setIdProceso("DSS04");
        dss04.setDominio("Entregar, Dar Servicio y Soporte");
        dss04.setAreaPrioritaria("Modelo Core de COBIT");
        dss04.setNombreProceso("Gestionar la continuidad");
        dss04.setDescripcionProceso("Establecer y mantener un plan para permitir que el negocio y las TI respondan a incidentes y disrupciones con el fin de continuar con la operación de los procesos críticos del negocio y los servicios de TI requeridos, y mantener la disponibilidad de la información en un nivel aceptable para la empresa.");
        dss04.setPropositoProceso("Asegurar la supervivencia comercial de la marca automotriz frente a contingencias extremas, garantizando que los servicios de telemetría, seguridad de los vehículos y atención en los concesionarios puedan migrar de inmediato hacia infraestructuras de respaldo sin ocasionar la interrupción total del negocio.");

        dss04.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.\nAG06: Agilidad para convertir los requisitos del negocio en soluciones operativas.");
        dss04.setMetasEmpresariales("EG06: Continuidad y disponibilidad del servicio de negocio.\nEG03: Cumplimiento de leyes y regulaciones externas.");
        dss04.setMetricasModelo("Métrica 1: Número de interrupciones prolongadas que exceden los límites de tiempo de recuperación acordados.\nMétrica 2: Frecuencia de las pruebas a los planes de continuidad.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss04);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS04.02");
        pract01.setNombrePractica("Mantener una estrategia de continuidad");
        pract01.setDescripcionPractica("Evaluar las opciones de gestión de continuidad y elegir una estrategia de continuidad que sea viable y eficiente frente a costes para garantizar la recuperación y continuidad corporativas ante un desastre.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir la estrategia y las alternativas para la continuidad basadas en el análisis de impacto en el negocio y la evaluación de riesgos."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Asegurar que la estrategia de continuidad defina adecuadamente los recursos necesarios (por ejemplo, personas, instalaciones, TI, información, proveedores y comunicaciones)."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Obtener la aprobación de la estrategia por parte del nivel gerencial apropiado de la empresa."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS04.04");
        pract02.setNombrePractica("Probar y ejercitar el plan de continuidad y respuesta");
        pract02.setDescripcionPractica("Someter a prueba los planes de continuidad periódicamente para ejercitar los planes de recuperación ante desastres de TI (DR) y de continuidad de negocio (BC) con la finalidad de confirmar que funcionen tal como fue planeado.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir, documentar y agendar la realización de las pruebas de los planes de continuidad del negocio y recuperación de TI."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Realizar las pruebas del plan de continuidad conforme a la programación establecida."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Evaluar los resultados de las pruebas y elaborar planes de acción para corregir cualquier deficiencia descubierta en los planes de continuidad."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS04.08");
        pract03.setNombrePractica("Llevar a cabo una revisión tras la reanudación del negocio");
        pract03.setDescripcionPractica("Evaluar si la preparación de la continuidad de negocio y la de recuperación frente a desastres y TI ha sido la adecuada para gestionar cualquier incidente grave después de la reanudación del negocio y normalización de las operaciones.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Asegurar el registro completo y riguroso de todos los eventos ocurridos durante y después de cualquier incidente mayor."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Analizar las causas fundamentales de los problemas de continuidad y recuperación y las lecciones aprendidas."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Crear e implementar un plan de acción para subsanar debilidades de los planes de recuperación de negocio y TI."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss04.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss04); raci1.setPracticaGestion("DSS04.02"); raci1.setRolOrganizacional("Director de Continuidad y Resiliencia del Negocio"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss04); raci2.setPracticaGestion("DSS04.04"); raci2.setRolOrganizacional("Líderes de Operaciones de Red e Infraestructura"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss04); raci3.setPracticaGestion("DSS04.08"); raci3.setRolOrganizacional("Comité Ejecutivo de Crisis Institucional"); raci3.setNivelResponsabilidad("R");
        dss04.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss04); flujo1.setPracticaGestion("DSS04.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO12.02"); flujo1.setDescripcion("Mapas de calor institucionales y evaluaciones formales de los impactos financieros causados por interrupciones operativas prolongadas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss04); flujo2.setPracticaGestion("DSS04.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Informes de resultados emitidos tras los simulacros de desastres, incluyendo el registro exacto de las métricas de recuperación evaluadas.");
        dss04.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss04); hab1.setNombreHabilidad("Estructuración de Resiliencia Operacional y Gestión Integral de Crisis"); hab1.setDocumentacionRelacionada("Norma Internacional de Gestión de la Continuidad del Negocio (ISO 22301)"); hab1.setReferenciaEspecifica("De este estándar normativo se extrae explícitamente el cálculo preciso de los tiempos máximos tolerables de interrupción y los objetivos de punto de recuperación, herramientas matemáticas fundamentales para dictaminar cuánta información puede perder la empresa sin entrar en quiebra.");
        dss04.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(dss04); pol1.setTituloPolitica("Directiva Estratégica de Simulacros Obligatorios y Garantía de Supervivencia"); pol1.setDescripcionPolitica("Reglamentación corporativa inflexible que prohíbe dar por válido cualquier plan de contingencia tecnológica si no ha sido ensayado físicamente en un simulacro integral durante los últimos doce meses. Esta medida dictamina que un plan no probado es una falsa ilusión de seguridad que pone en peligro a los inversionistas."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Riesgos y Desastres"); pol1.setReferenciaEspecifica("Sección: Condicionamientos para la Aprobación de Sistemas Críticos");
        dss04.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(dss04); cult1.setElementoCultural("Cultura de Preparación Constante y Cero Complacencia"); cult1.setDocumentacionRelacionada("Manifiesto de Resiliencia Institucional"); cult1.setReferenciaEspecifica("Inculcar en la mente de los directivos operativos la certidumbre absoluta de que los desastres informáticos son eventos inevitables, promoviendo una actitud vigilante que priorice las inversiones en sistemas redundantes por encima de las optimizaciones cosméticas.");
        dss04.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(dss04); serv1.setNombreServicioHerramienta("Instalaciones de Procesamiento de Datos Secundarias equipadas con Sistemas de Replicación Asíncrona");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss04); serv2.setNombreServicioHerramienta("Plataformas Corporativas de Notificación de Emergencias Masivas y Árboles de Llamadas Automatizadas");
        dss04.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss04);
    }
}